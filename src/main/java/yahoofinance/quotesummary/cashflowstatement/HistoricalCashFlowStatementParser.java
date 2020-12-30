package yahoofinance.quotesummary.cashflowstatement;

import com.fasterxml.jackson.databind.JsonNode;
import yahoofinance.Utils;
import yahoofinance.quotesummary.query2v11.QuoteSummaryDataParser;

/**
 * @author Andras Svigruha
 */
public class HistoricalCashFlowStatementParser extends QuoteSummaryDataParser<HistoricalCashFlowStatement> {

    private static final String MODULE_NODE_NAME = "cashflowStatements";
    private static final String END_DATE_NODE_NAME = "endDate";
    private static final String NET_INCOME = "netIncome";
    private static final String DEPRECATION = "deprecation";
    private static final String CHANGE_TO_NET_INCOME = "changeToNetIncome";
    private static final String CHANGE_TO_ACCOUNT_RECEIVABLES = "changeToAccountReceivables";
    private static final String CHANGE_TO_LIABILITIES = "changeToLiabilities";
    private static final String CHANGE_TO_INVENTORY = "changeToInventory";
    private static final String CHANGE_TO_OPERATING_ACTIVITIES = "changeToOperatingActivities";
    private static final String TOTAL_CASH_FROM_OPERATING_ACTIVITIES = "totalCashFromOperatingActivities";
    private static final String CAPITAL_EXPENDITURES = "capitalExpenditures";
    private static final String INVESTMENTS = "investments";
    private static final String OTHER_CASHFLOWS_FROM_INVESTING_ACTIVITIES = "otherCashflowsFromInvestingActivities";
    private static final String TOTAL_CASHFLOWS_FROM_INVESTING_ACTIVITIES = "totalCashflowsFromInvestingActivities";
    private static final String DIVIDENDS_PAID = "dividendsPaid";
    private static final String NET_BORROWINGS = "netBorrowings";
    private static final String OTHER_CASHFLOWS_FROM_FINANCING_ACTIVITIES = "otherCashflowsFromFinancingActivities";
    private static final String TOTAL_CASHFLOWS_FROM_FINANCING_ACTIVITIES = "totalCashflowsFromFinancingActivities";
    private static final String CHANGE_IN_CASH = "changeInCash";
    private static final String REPURCHASE_OF_STOCK = "repurchaseOfStock";
    private static final String ISSUANCE_OF_STOCK = "issuanceOfStock";

    public HistoricalCashFlowStatementParser(String moduleName) {
        super(moduleName, MODULE_NODE_NAME);
    }

    @Override
    protected HistoricalCashFlowStatement parseElementNode(JsonNode node) {
        HistoricalCashFlowStatement cashFlowStatement = new HistoricalCashFlowStatement();
        cashFlowStatement.setDate(Utils.unixToCalendar(getLong(node, END_DATE_NODE_NAME)));
        cashFlowStatement.setNetIncome(Utils.getBigDecimal(getString(node, NET_INCOME)));
        cashFlowStatement.setDeprecation(Utils.getBigDecimal(getString(node, DEPRECATION)));
        cashFlowStatement.setChangeToNetIncome(Utils.getBigDecimal(getString(node, CHANGE_TO_NET_INCOME)));
        cashFlowStatement.setChangeToAccountReceivables(Utils.getBigDecimal(getString(node, CHANGE_TO_ACCOUNT_RECEIVABLES)));
        cashFlowStatement.setChangeToLiabilities(Utils.getBigDecimal(getString(node, CHANGE_TO_LIABILITIES)));
        cashFlowStatement.setChangeToInventory(Utils.getBigDecimal(getString(node, CHANGE_TO_INVENTORY)));
        cashFlowStatement.setChangeToOperatingActivities(Utils.getBigDecimal(getString(node, CHANGE_TO_OPERATING_ACTIVITIES)));
        cashFlowStatement.setTotalCashFromOperatingActivities(Utils.getBigDecimal(getString(node, TOTAL_CASH_FROM_OPERATING_ACTIVITIES)));
        cashFlowStatement.setCapitalExpenditures(Utils.getBigDecimal(getString(node, CAPITAL_EXPENDITURES)));
        cashFlowStatement.setInvestments(Utils.getBigDecimal(getString(node, INVESTMENTS)));
        cashFlowStatement.setOtherCashflowsFromInvestingActivities(Utils.getBigDecimal(getString(node, OTHER_CASHFLOWS_FROM_INVESTING_ACTIVITIES)));
        cashFlowStatement.setTotalCashflowsFromInvestingActivities(Utils.getBigDecimal(getString(node, TOTAL_CASHFLOWS_FROM_INVESTING_ACTIVITIES)));
        cashFlowStatement.setDividendsPaid(Utils.getBigDecimal(getString(node, DIVIDENDS_PAID)));
        cashFlowStatement.setNetBorrowings(Utils.getBigDecimal(getString(node, NET_BORROWINGS)));
        cashFlowStatement.setOtherCashflowsFromFinancingActivities(Utils.getBigDecimal(getString(node, OTHER_CASHFLOWS_FROM_FINANCING_ACTIVITIES)));
        cashFlowStatement.setTotalCashflowsFromFinancingActivities(Utils.getBigDecimal(getString(node, TOTAL_CASHFLOWS_FROM_FINANCING_ACTIVITIES)));
        cashFlowStatement.setChangeInCash(Utils.getBigDecimal(getString(node, CHANGE_IN_CASH)));
        cashFlowStatement.setRepurchaseOfStock(Utils.getBigDecimal(getString(node, REPURCHASE_OF_STOCK)));
        cashFlowStatement.setIssuanceOfStock(Utils.getBigDecimal(getString(node, ISSUANCE_OF_STOCK)));
        return cashFlowStatement;
    }
}
