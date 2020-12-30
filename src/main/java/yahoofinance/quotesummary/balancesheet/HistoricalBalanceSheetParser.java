package yahoofinance.quotesummary.balancesheet;

import com.fasterxml.jackson.databind.JsonNode;
import yahoofinance.Utils;
import yahoofinance.quotesummary.query2v11.QuoteSummaryDataParser;

/**
 * @author Andras Svigruha
 */
public class HistoricalBalanceSheetParser extends QuoteSummaryDataParser<HistoricalBalanceSheet> {

    private static final String MODULE_NODE_NAME = "balanceSheetStatements";
    private static final String END_DATE_NODE_NAME = "endDate";
    private static final String CASH = "cash";
    private static final String SHORT_TERM_INVESTMENTS = "shortTermInvestments";
    private static final String NET_RECEIVABLES = "netReceivables";
    private static final String INVENTORY = "inventory";
    private static final String OTHER_CURRENT_ASSETS = "otherCurrentAssets";
    private static final String TOTAL_CURRENT_ASSETS = "totalCurrentAssets";
    private static final String LONG_TERM_INVESTMENTS = "longTermInvestments";
    private static final String PROPERTY_PLANT_EQUIPMENT = "propertyPlantEquipment";
    private static final String OTHER_ASSETS = "otherAssets";
    private static final String TOTAL_ASSETS = "totalAssets";
    private static final String ACCOUNTS_PAYABLE = "accountsPayable";
    private static final String SHORT_LONG_TERM_DEBT = "shortLongTermDebt";
    private static final String OTHER_CURRENT_LIAB = "otherCurrentLiab";
    private static final String LONG_TERM_DEBT = "longTermDebt";
    private static final String OTHER_LIAB = "otherLiab";
    private static final String TOTAL_CURRENT_LIABILITIES = "totalCurrentLiabilities";
    private static final String TOTAL_LIAB = "totalLiab";
    private static final String COMMON_STOCK = "commonStock";
    private static final String RETAINED_EARNINGS = "retainedEarnings";
    private static final String TREASURY_STOCK = "treasuryStock";
    private static final String OTHER_STOCKHOLDER_EQUITY = "otherStockholderEquity";
    private static final String TOTAL_STOCKHOLDER_EQUITY = "totalStockholderEquity";
    private static final String NET_TANGIBLE_ASSETS = "netTangibleAssets";

    public HistoricalBalanceSheetParser(String moduleName) {
        super(moduleName, MODULE_NODE_NAME);
    }

    @Override
    protected HistoricalBalanceSheet parseElementNode(JsonNode node) {
        HistoricalBalanceSheet balanceSheet = new HistoricalBalanceSheet();
        balanceSheet.setDate(Utils.unixToCalendar(getLong(node, END_DATE_NODE_NAME)));
        balanceSheet.setCash(Utils.getBigDecimal(getString(node, CASH)));
        balanceSheet.setShortTermInvestments(Utils.getBigDecimal(getString(node, SHORT_TERM_INVESTMENTS)));
        balanceSheet.setNetReceivables(Utils.getBigDecimal(getString(node, NET_RECEIVABLES)));
        balanceSheet.setInventory(Utils.getBigDecimal(getString(node, INVENTORY)));
        balanceSheet.setOtherCurrentAssets(Utils.getBigDecimal(getString(node, OTHER_CURRENT_ASSETS)));
        balanceSheet.setTotalCurrentAssets(Utils.getBigDecimal(getString(node, TOTAL_CURRENT_ASSETS)));
        balanceSheet.setLongTermInvestments(Utils.getBigDecimal(getString(node, LONG_TERM_INVESTMENTS)));
        balanceSheet.setPropertyPlantEquipment(Utils.getBigDecimal(getString(node, PROPERTY_PLANT_EQUIPMENT)));
        balanceSheet.setOtherAssets(Utils.getBigDecimal(getString(node, OTHER_ASSETS)));
        balanceSheet.setTotalAssets(Utils.getBigDecimal(getString(node, TOTAL_ASSETS)));
        balanceSheet.setAccountsPayable(Utils.getBigDecimal(getString(node, ACCOUNTS_PAYABLE)));
        balanceSheet.setShortLongTermDebt(Utils.getBigDecimal(getString(node, SHORT_LONG_TERM_DEBT)));
        balanceSheet.setOtherCurrentLiab(Utils.getBigDecimal(getString(node, OTHER_CURRENT_LIAB)));
        balanceSheet.setLongTermDebt(Utils.getBigDecimal(getString(node, LONG_TERM_DEBT)));
        balanceSheet.setOtherLiab(Utils.getBigDecimal(getString(node, OTHER_LIAB)));
        balanceSheet.setTotalCurrentLiabilities(Utils.getBigDecimal(getString(node, TOTAL_CURRENT_LIABILITIES)));
        balanceSheet.setTotalLiab(Utils.getBigDecimal(getString(node, TOTAL_LIAB)));
        balanceSheet.setCommonStock(Utils.getBigDecimal(getString(node, COMMON_STOCK)));
        balanceSheet.setRetainedEarnings(Utils.getBigDecimal(getString(node, RETAINED_EARNINGS)));
        balanceSheet.setTreasuryStock(Utils.getBigDecimal(getString(node, TREASURY_STOCK)));
        balanceSheet.setOtherStockholderEquity(Utils.getBigDecimal(getString(node, OTHER_STOCKHOLDER_EQUITY)));
        balanceSheet.setTotalStockholderEquity(Utils.getBigDecimal(getString(node, TOTAL_STOCKHOLDER_EQUITY)));
        balanceSheet.setNetTangibleAssets(Utils.getBigDecimal(getString(node, NET_TANGIBLE_ASSETS)));
        return balanceSheet;
    }
}
