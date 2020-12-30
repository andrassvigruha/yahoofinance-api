package yahoofinance.quotesummary.cashflowstatement;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Andras Svigruha
 */
public class HistoricalCashFlowStatement {

    private String symbol;
    private Calendar date;

    private BigDecimal netIncome;
    private BigDecimal deprecation;
    private BigDecimal changeToNetIncome;
    private BigDecimal changeToAccountReceivables;
    private BigDecimal changeToLiabilities;
    private BigDecimal changeToInventory;
    private BigDecimal changeToOperatingActivities;
    private BigDecimal totalCashFromOperatingActivities;
    private BigDecimal capitalExpenditures;
    private BigDecimal investments;
    private BigDecimal otherCashflowsFromInvestingActivities;
    private BigDecimal totalCashflowsFromInvestingActivities;
    private BigDecimal dividendsPaid;
    private BigDecimal netBorrowings;
    private BigDecimal otherCashflowsFromFinancingActivities;
    private BigDecimal totalCashflowsFromFinancingActivities;
    private BigDecimal changeInCash;
    private BigDecimal repurchaseOfStock;
    private BigDecimal issuanceOfStock;

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

    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
    }

    public BigDecimal getDeprecation() {
        return deprecation;
    }

    public void setDeprecation(BigDecimal deprecation) {
        this.deprecation = deprecation;
    }

    public BigDecimal getChangeToNetIncome() {
        return changeToNetIncome;
    }

    public void setChangeToNetIncome(BigDecimal changeToNetIncome) {
        this.changeToNetIncome = changeToNetIncome;
    }

    public BigDecimal getChangeToAccountReceivables() {
        return changeToAccountReceivables;
    }

    public void setChangeToAccountReceivables(BigDecimal changeToAccountReceivables) {
        this.changeToAccountReceivables = changeToAccountReceivables;
    }

    public BigDecimal getChangeToLiabilities() {
        return changeToLiabilities;
    }

    public void setChangeToLiabilities(BigDecimal changeToLiabilities) {
        this.changeToLiabilities = changeToLiabilities;
    }

    public BigDecimal getChangeToInventory() {
        return changeToInventory;
    }

    public void setChangeToInventory(BigDecimal changeToInventory) {
        this.changeToInventory = changeToInventory;
    }

    public BigDecimal getChangeToOperatingActivities() {
        return changeToOperatingActivities;
    }

    public void setChangeToOperatingActivities(BigDecimal changeToOperatingActivities) {
        this.changeToOperatingActivities = changeToOperatingActivities;
    }

    public BigDecimal getTotalCashFromOperatingActivities() {
        return totalCashFromOperatingActivities;
    }

    public void setTotalCashFromOperatingActivities(BigDecimal totalCashFromOperatingActivities) {
        this.totalCashFromOperatingActivities = totalCashFromOperatingActivities;
    }

    public BigDecimal getCapitalExpenditures() {
        return capitalExpenditures;
    }

    public void setCapitalExpenditures(BigDecimal capitalExpenditures) {
        this.capitalExpenditures = capitalExpenditures;
    }

    public BigDecimal getInvestments() {
        return investments;
    }

    public void setInvestments(BigDecimal investments) {
        this.investments = investments;
    }

    public BigDecimal getOtherCashflowsFromInvestingActivities() {
        return otherCashflowsFromInvestingActivities;
    }

    public void setOtherCashflowsFromInvestingActivities(BigDecimal otherCashflowsFromInvestingActivities) {
        this.otherCashflowsFromInvestingActivities = otherCashflowsFromInvestingActivities;
    }

    public BigDecimal getTotalCashflowsFromInvestingActivities() {
        return totalCashflowsFromInvestingActivities;
    }

    public void setTotalCashflowsFromInvestingActivities(BigDecimal totalCashflowsFromInvestingActivities) {
        this.totalCashflowsFromInvestingActivities = totalCashflowsFromInvestingActivities;
    }

    public BigDecimal getDividendsPaid() {
        return dividendsPaid;
    }

    public void setDividendsPaid(BigDecimal dividendsPaid) {
        this.dividendsPaid = dividendsPaid;
    }

    public BigDecimal getNetBorrowings() {
        return netBorrowings;
    }

    public void setNetBorrowings(BigDecimal netBorrowings) {
        this.netBorrowings = netBorrowings;
    }

    public BigDecimal getOtherCashflowsFromFinancingActivities() {
        return otherCashflowsFromFinancingActivities;
    }

    public void setOtherCashflowsFromFinancingActivities(BigDecimal otherCashflowsFromFinancingActivities) {
        this.otherCashflowsFromFinancingActivities = otherCashflowsFromFinancingActivities;
    }

    public BigDecimal getTotalCashflowsFromFinancingActivities() {
        return totalCashflowsFromFinancingActivities;
    }

    public void setTotalCashflowsFromFinancingActivities(BigDecimal totalCashflowsFromFinancingActivities) {
        this.totalCashflowsFromFinancingActivities = totalCashflowsFromFinancingActivities;
    }

    public BigDecimal getChangeInCash() {
        return changeInCash;
    }

    public void setChangeInCash(BigDecimal changeInCash) {
        this.changeInCash = changeInCash;
    }

    public BigDecimal getRepurchaseOfStock() {
        return repurchaseOfStock;
    }

    public void setRepurchaseOfStock(BigDecimal repurchaseOfStock) {
        this.repurchaseOfStock = repurchaseOfStock;
    }

    public BigDecimal getIssuanceOfStock() {
        return issuanceOfStock;
    }

    public void setIssuanceOfStock(BigDecimal issuanceOfStock) {
        this.issuanceOfStock = issuanceOfStock;
    }
}
