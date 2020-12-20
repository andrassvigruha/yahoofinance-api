package yahoofinance.quotesummary.query2v11;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yahoofinance.Utils;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.query1v7.QuotesRequest;
import yahoofinance.util.RedirectableRequest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.stream.Collectors;

import static yahoofinance.quotesummary.query2v11.QuoteSummaryDataParser.QUOTE_SUMMARY_NODE_NAME;
import static yahoofinance.quotesummary.query2v11.QuoteSummaryDataParser.RESULT_NODE_NAME;

/**
 * @author Andras Svigruha
 */
public class QuoteSummaryQuery2V11Request {

    private static String MODULES_PARAM_KEY = "modules";

    private static final Logger log = LoggerFactory.getLogger(QuotesRequest.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    protected final String symbol;
    protected final List<QuoteSummaryModule> modules;

    public QuoteSummaryQuery2V11Request(String symbols, List<QuoteSummaryModule> modules) {
        this.symbol = symbols;
        this.modules = modules;
    }

    public Map<QuoteSummaryModule, QuoteSummaryData<?>> getResult() throws IOException {
        String url = createRequestUrl();

        log.info("Sending request: " + url);

        RedirectableRequest redirectableRequest = createRedirectableRequest(url);
        URLConnection connection = redirectableRequest.openConnection();
        InputStreamReader streamReader = new InputStreamReader(connection.getInputStream());
        JsonNode node = objectMapper.readTree(streamReader);

        return parseResponseNode(node);
    }

    private String createRequestUrl() {
        Map<String, String> params = new LinkedHashMap<>();
        params.put(MODULES_PARAM_KEY, modules.stream().
            map(QuoteSummaryModule::getModuleName).
            collect(Collectors.
                joining(",")));
        return YahooFinance.QUOTE_SUMMARY_QUERY1V11_BASE_URL + "/" + symbol + "?" + Utils.getURLParameters(params);
    }

    private RedirectableRequest createRedirectableRequest(String url) throws IOException {
        URL requestUrl = new URL(url);
        RedirectableRequest redirectableRequest = new RedirectableRequest(requestUrl, 5);
        redirectableRequest.setConnectTimeout(YahooFinance.CONNECTION_TIMEOUT);
        redirectableRequest.setReadTimeout(YahooFinance.CONNECTION_TIMEOUT);
        return redirectableRequest;
    }

    private Map<QuoteSummaryModule, QuoteSummaryData<?>> parseResponseNode(JsonNode node) {
        Map<QuoteSummaryModule, QuoteSummaryData<?>> result = new HashMap<>();
        node = QuoteSummaryDataParser.getSubNode(node, QUOTE_SUMMARY_NODE_NAME);
        if (node != null) {
            node = QuoteSummaryDataParser.getSubNode(node, RESULT_NODE_NAME);
            if (node != null) {
                result = parseModuleNodes(node);
            }
        }
        return result;
    }

    private Map<QuoteSummaryModule, QuoteSummaryData<?>> parseModuleNodes(JsonNode node) {
        Map<QuoteSummaryModule, QuoteSummaryData<?>> result = new HashMap<>();
        if (node.isArray()) {
            for (JsonNode childNode : node) {
                QuoteSummaryModule module = getModuleForNode(childNode);
                if (module != null) {
                    QuoteSummaryData<?> data = parseModuleNode(module, childNode);
                    result.put(module, data);
                }
            }
        }
        return result;
    }

    private QuoteSummaryModule getModuleForNode(JsonNode node) {
        return modules.stream().
            filter(module -> node.has(module.getModuleName())).
            findFirst().
            orElse(null);
    }

    private QuoteSummaryData<?> parseModuleNode(QuoteSummaryModule module, JsonNode node) {
        QuoteSummaryDataParser<?> dataParser = module.getDataParser();
        return dataParser.parseModuleNode(node);
    }
}
