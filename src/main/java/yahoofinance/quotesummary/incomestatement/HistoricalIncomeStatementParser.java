package yahoofinance.quotesummary.incomestatement;

import com.fasterxml.jackson.databind.JsonNode;
import yahoofinance.Utils;
import yahoofinance.quotesummary.query2v11.QuoteSummaryDataParser;

/**
 * @author Andras Svigruha
 */
public class HistoricalIncomeStatementParser extends QuoteSummaryDataParser<HistoricalIncomeStatement> {

    private static final String MODULE_NODE_NAME = "incomeStatementHistory";
    private static final String END_DATE_NODE_NAME = "endDate";
    private static final String TOTAL_REVENUE_NODE_NAME = "totalRevenue";
    private static final String COST_OF_REVENUE_NODE_NAME = "costOfRevenue";
    private static final String GROSS_PROFIT_NODE_NAME = "grossProfit";
    private static final String RESEARCH_DEVELOPMENT_NODE_NAME = "researchDevelopment";
    private static final String SELLING_GENERAL_ADMINISTRATIVE_NODE_NAME = "sellingGeneralAdministrative";
    private static final String NON_RECURRING_NAME = "nonRecurring";
    private static final String OTHER_OPERATING_EXPENSES_NODE_NAME = "otherOperatingExpenses";
    private static final String TOTAL_OPERATING_EXPENSES_NODE_NAME = "totalOperatingExpenses";
    private static final String OPERATING_INCOME_NODE_NAME = "operatingIncome";
    private static final String TOTAL_OTHER_INCOME_EXPENSE_NET_NODE_NAME = "totalOtherIncomeExpenseNet";
    private static final String EBIT_NODE_NAME = "ebit";
    private static final String INTEREST_EXPENSE_NODE_NAME = "interestExpense";
    private static final String INCOME_BEFORE_TAX_NODE_NAME = "incomeBeforeTax";
    private static final String INCOME_TAX_EXPENSE_NODE_NAME = "incomeTaxExpense";
    private static final String MINORITY_INTEREST_NODE_NAME = "minorityInterest";
    private static final String NET_INCOME_FROM_CONTINUING_OPS_NODE_NAME = "netIncomeFromContinuingOps";
    private static final String DISCONTINUED_OPERATIONS_NODE_NAME = "discontinuedOperations";
    private static final String EXTRAORDINARY_ITEMS_NODE_NAME = "extraordinaryItems";
    private static final String EFFECT_OF_ACCOUNTING_CHARGES_NODE_NAME = "effectOfAccountingCharges";
    private static final String OTHER_ITEMS_NODE_NAME = "otherItems";
    private static final String NET_INCOME_NODE_NAME = "netIncome";
    private static final String NET_INCOME_APPLICABLE_TO_COMMON_SHARES_NODE_NAME = "netIncomeApplicableToCommonShares";

    public HistoricalIncomeStatementParser(String moduleName) {
        super(moduleName, MODULE_NODE_NAME);
    }

    @Override
    protected HistoricalIncomeStatement parseElementNode(JsonNode node) {
        HistoricalIncomeStatement incomeStatement = new HistoricalIncomeStatement();
        incomeStatement.setDate(Utils.unixToCalendar(getLong(node, END_DATE_NODE_NAME)));
        incomeStatement.setTotalRevenue(Utils.getBigDecimal(getString(node, TOTAL_REVENUE_NODE_NAME)));
        incomeStatement.setCostOfRevenue(Utils.getBigDecimal(getString(node, COST_OF_REVENUE_NODE_NAME)));
        incomeStatement.setGrossProfit(Utils.getBigDecimal(getString(node, GROSS_PROFIT_NODE_NAME)));
        incomeStatement.setResearchAndDevelopment(Utils.getBigDecimal(getString(node, RESEARCH_DEVELOPMENT_NODE_NAME)));
        incomeStatement.setSellingGeneralAdministrative(Utils.getBigDecimal(getString(node, SELLING_GENERAL_ADMINISTRATIVE_NODE_NAME)));
        incomeStatement.setNonRecurring(Utils.getBigDecimal(getString(node, NON_RECURRING_NAME)));
        incomeStatement.setOtherOperatingExpenses(Utils.getBigDecimal(getString(node, OTHER_OPERATING_EXPENSES_NODE_NAME)));
        incomeStatement.setTotalOperatingExpenses(Utils.getBigDecimal(getString(node, TOTAL_OPERATING_EXPENSES_NODE_NAME)));
        incomeStatement.setOperatingIncome(Utils.getBigDecimal(getString(node, OPERATING_INCOME_NODE_NAME)));
        incomeStatement.setTotalOtherIncomeExpenseNet(Utils.getBigDecimal(getString(node, TOTAL_OTHER_INCOME_EXPENSE_NET_NODE_NAME)));
        incomeStatement.setEbit(Utils.getBigDecimal(getString(node, EBIT_NODE_NAME)));
        incomeStatement.setInterestExpense(Utils.getBigDecimal(getString(node, INTEREST_EXPENSE_NODE_NAME)));
        incomeStatement.setIncomeBeforeTax(Utils.getBigDecimal(getString(node, INCOME_BEFORE_TAX_NODE_NAME)));
        incomeStatement.setIncomeTaxExpense(Utils.getBigDecimal(getString(node, INCOME_TAX_EXPENSE_NODE_NAME)));
        incomeStatement.setMinorityInterest(Utils.getBigDecimal(getString(node, MINORITY_INTEREST_NODE_NAME)));
        incomeStatement.setNetIncomeFromContinuingOps(Utils.getBigDecimal(getString(node, NET_INCOME_FROM_CONTINUING_OPS_NODE_NAME)));
        incomeStatement.setDiscontinuedOperations(Utils.getBigDecimal(getString(node, DISCONTINUED_OPERATIONS_NODE_NAME)));
        incomeStatement.setExtraordinaryItems(Utils.getBigDecimal(getString(node, EXTRAORDINARY_ITEMS_NODE_NAME)));
        incomeStatement.setEffectOfAccountingCharges(Utils.getBigDecimal(getString(node, EFFECT_OF_ACCOUNTING_CHARGES_NODE_NAME)));
        incomeStatement.setOtherItems(Utils.getBigDecimal(getString(node, OTHER_ITEMS_NODE_NAME)));
        incomeStatement.setNetIncome(Utils.getBigDecimal(getString(node, NET_INCOME_NODE_NAME)));
        incomeStatement.setNetIncomeApplicableToCommonShares(Utils.getBigDecimal(getString(node, NET_INCOME_APPLICABLE_TO_COMMON_SHARES_NODE_NAME)));
        return incomeStatement;
    }
}
