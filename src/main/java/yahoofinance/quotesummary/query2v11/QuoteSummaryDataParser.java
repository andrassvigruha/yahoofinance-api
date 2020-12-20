package yahoofinance.quotesummary.query2v11;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andras Svigruha
 */
public abstract class QuoteSummaryDataParser<T> {

    static String QUOTE_SUMMARY_NODE_NAME = "quoteSummary";
    static String RESULT_NODE_NAME = "result";
    static String RAW_NODE_NAME = "raw";

    private final String moduleName;
    private final String moduleNodeName;

    protected QuoteSummaryDataParser(String moduleName, String moduleNodeName) {
        this.moduleName = moduleName;
        this.moduleNodeName = moduleNodeName;
    }

    protected abstract T parseElementNode(JsonNode node);

    protected QuoteSummaryData<T> parseModuleNode(JsonNode node) {
        List<T> result = new ArrayList<T>();
        node = getSubNode(node, moduleName);
        if (node != null) {
            node = getSubNode(node, moduleNodeName);
            if (node != null && node.isArray()) {
                for (JsonNode elementNode : node) {
                    result.add(parseElementNode(elementNode));
                }
            }
        }
        return new QuoteSummaryData<>(moduleName, result);
    }

    protected Long getLong(JsonNode node, String name) {
        JsonNode rawDataNode = getRawDataNode(node, name);
        if (rawDataNode != null) {
            return rawDataNode.asLong();
        }
        return null;
    }

    protected String getString(JsonNode node, String name) {
        JsonNode rawDataNode = getRawDataNode(node, name);
        if (rawDataNode != null) {
            return rawDataNode.asText();
        }
        return null;
    }

    private static JsonNode getRawDataNode(JsonNode node, String name) {
        JsonNode dataNode = getSubNode(node, name);
        if (dataNode != null) {
            return getSubNode(dataNode, RAW_NODE_NAME);
        }
        return null;
    }

    static JsonNode getSubNode(JsonNode node, String name) {
        if (node.has(name)) {
            return node.get(name);
        }
        return null;
    }
}
