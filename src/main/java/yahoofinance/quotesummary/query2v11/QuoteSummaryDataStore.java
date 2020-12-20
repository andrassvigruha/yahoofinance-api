package yahoofinance.quotesummary.query2v11;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Andras Svigruha
 */
public class QuoteSummaryDataStore {

    private final QuoteSummaryData<?> NULL_DATA = new QuoteSummaryData<>("", Collections.emptyList());

    private final Map<QuoteSummaryModule, QuoteSummaryData<?>> dataMap = new HashMap<>();

    public <T> QuoteSummaryData<T> getData(QuoteSummaryModule module) {
        return (QuoteSummaryData<T>)dataMap.getOrDefault(module, NULL_DATA);
    }

    public Map<QuoteSummaryModule, QuoteSummaryData<?>> getData(QuoteSummaryModule... modules) {
        List<QuoteSummaryModule> modulesList = Arrays.asList(modules);
        return dataMap.entrySet().stream().
            filter(entry -> modulesList.contains(entry.getKey())).
            collect(Collectors.
                toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1,
                    HashMap::new
                ));
    }

    public void addData(Map<QuoteSummaryModule, QuoteSummaryData<?>> dataMap) {
        dataMap.entrySet().stream().
            forEach(entry -> {
                QuoteSummaryModule module = entry.getKey();
                QuoteSummaryData<?> data = entry.getValue();
                this.dataMap.merge(module, data, QuoteSummaryDataStore::remap);
            });
    }

    private static QuoteSummaryData<?> remap(QuoteSummaryData<?> oldData, QuoteSummaryData<?> newData) {
        return newData.isEmpty()
            ? oldData
            : newData;
    }

    public boolean hasData(QuoteSummaryModule module) {
        return !dataMap.getOrDefault(module, NULL_DATA).isEmpty();
    }
}
