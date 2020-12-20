package yahoofinance.quotesummary.earnings;

import com.fasterxml.jackson.databind.JsonNode;
import yahoofinance.Utils;
import yahoofinance.quotesummary.query2v11.QuoteSummaryDataParser;

/**
 * @author Andras Svigruha
 */
public class HistoricalEarningsParser extends QuoteSummaryDataParser<HistoricalEarnings> {

    private static final String MODULE_NODE_NAME = "history";
    private static final String QUARTER_NODE_NAME = "quarter";
    private static final String EPS_ACTUAL_NODE_NAME = "epsActual";
    private static final String EPS_ESTIMATE_NODE_NAME = "epsEstimate";

    public HistoricalEarningsParser(String moduleName) {
        super(moduleName, MODULE_NODE_NAME);
    }

    @Override
    protected HistoricalEarnings parseElementNode(JsonNode node) {
        HistoricalEarnings historicalEarnings = new HistoricalEarnings();
        historicalEarnings.setDate(Utils.unixToCalendar(getLong(node, QUARTER_NODE_NAME)));
        historicalEarnings.setEpsActual(Utils.getBigDecimal(getString(node, EPS_ACTUAL_NODE_NAME)));
        historicalEarnings.setEpsEstimate(Utils.getBigDecimal(getString(node, EPS_ESTIMATE_NODE_NAME)));
        return historicalEarnings;
    }
}
