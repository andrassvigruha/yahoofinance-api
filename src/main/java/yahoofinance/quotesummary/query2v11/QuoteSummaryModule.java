package yahoofinance.quotesummary.query2v11;

import yahoofinance.quotesummary.balancesheet.HistoricalBalanceSheetParser;
import yahoofinance.quotesummary.cashflowstatement.HistoricalCashFlowStatementParser;
import yahoofinance.quotesummary.earnings.HistoricalEarningsParser;
import yahoofinance.quotesummary.incomestatement.HistoricalIncomeStatementParser;

/**
 * @author Andras Svigruha
 */
public enum QuoteSummaryModule {
    EARNINGS_HISTORY("earningsHistory") {
        @Override
        protected HistoricalEarningsParser createDataParser() {
            return new HistoricalEarningsParser(getModuleName());
        }
    },
    INCOME_STATEMENT_HISTORY("incomeStatementHistory") {
        @Override
        protected HistoricalIncomeStatementParser createDataParser() {
            return new HistoricalIncomeStatementParser(getModuleName());
        }
    },
    BALANCE_SHEET_HISTORY("balanceSheetHistory") {
        @Override
        protected HistoricalBalanceSheetParser createDataParser() {
            return new HistoricalBalanceSheetParser(getModuleName());
        }
    },
    CASHFLOW_STATEMENT_HISTORY("cashflowStatementHistory") {
        @Override
        protected HistoricalCashFlowStatementParser createDataParser() {
            return new HistoricalCashFlowStatementParser(getModuleName());
        }
    };

    QuoteSummaryModule(String moduleName) {
        this.moduleName = moduleName;
    }

    private final String moduleName;
    private volatile QuoteSummaryDataParser<?> dataParser;

    protected abstract QuoteSummaryDataParser<?> createDataParser();

    public String getModuleName() {
        return moduleName;
    }

    public QuoteSummaryDataParser<?> getDataParser() {
        QuoteSummaryDataParser<?> dataParserLocal = dataParser;
        if (dataParserLocal == null) {
            synchronized (this) {
                dataParserLocal = dataParser;
                if (dataParserLocal == null) {
                    dataParser = dataParserLocal = createDataParser();
                }
            }
        }
        return dataParserLocal;
    }
}
