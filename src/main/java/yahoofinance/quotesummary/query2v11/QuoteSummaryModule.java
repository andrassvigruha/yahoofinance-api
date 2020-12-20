package yahoofinance.quotesummary.query2v11;

import yahoofinance.quotesummary.earnings.HistoricalEarningsParser;
import yahoofinance.quotesummary.incomestatement.HistoricalIncomeStatementParser;

import java.util.Arrays;

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
    };

    QuoteSummaryModule(String moduleName) {
        this.moduleName = moduleName;
    }

    private final String moduleName;
    private volatile QuoteSummaryDataParser<?> dataParser;
    private volatile QuoteSummaryData<?> dataStore;

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

    public static QuoteSummaryModule getModuleByName(String name) {
        return Arrays.stream(values()).
            filter(module -> module.getModuleName().equals(name)).
            findFirst().
            orElse(null);
    }
}
