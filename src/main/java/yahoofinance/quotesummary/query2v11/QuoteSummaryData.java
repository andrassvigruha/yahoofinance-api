package yahoofinance.quotesummary.query2v11;

import java.util.Collections;
import java.util.List;

/**
 * @author Andras Svigruha
 */
public class QuoteSummaryData<T> {

    private final String moduleName;
    private List<T> data;

    public QuoteSummaryData(String moduleName, List<T> data) {
        this.moduleName = moduleName;
        this.data = data;
    }

    public String getModuleName() {
        return moduleName;
    }

    public List<T> getData() {
        return data != null
            ? Collections.unmodifiableList(data)
            : Collections.emptyList();
    }

    public boolean isEmpty() {
        return data == null || data.isEmpty();
    }
}
