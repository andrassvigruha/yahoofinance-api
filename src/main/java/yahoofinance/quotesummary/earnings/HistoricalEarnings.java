package yahoofinance.quotesummary.earnings;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Andras Svigruha
 */
public class HistoricalEarnings {

    private String symbol;
    private Calendar date;

    private BigDecimal epsActual;
    private BigDecimal epsEstimate;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public BigDecimal getEpsActual() {
        return epsActual;
    }

    public void setEpsActual(BigDecimal epsActual) {
        this.epsActual = epsActual;
    }

    public BigDecimal getEpsEstimate() {
        return epsEstimate;
    }

    public void setEpsEstimate(BigDecimal epsEstimate) {
        this.epsEstimate = epsEstimate;
    }
}
