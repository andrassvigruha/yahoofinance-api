package yahoofinance.quotesummary.incomestatement;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Andras Svigruha
 */
public class HistoricalIncomeStatement {

    private String symbol;
    private Calendar date;

    private BigDecimal totalRevenue;
    private BigDecimal costOfRevenue;
    private BigDecimal grossProfit;
    private BigDecimal researchAndDevelopment;
    private BigDecimal sellingGeneralAdministrative;
    private BigDecimal nonRecurring;
    private BigDecimal otherOperatingExpenses;
    private BigDecimal totalOperatingExpenses;
    private BigDecimal operatingIncome;
    private BigDecimal totalOtherIncomeExpenseNet;
    private BigDecimal ebit;
    private BigDecimal interestExpense;
    private BigDecimal incomeBeforeTax;
    private BigDecimal incomeTaxExpense;
    private BigDecimal minorityInterest;
    private BigDecimal netIncomeFromContinuingOps;
    private BigDecimal discontinuedOperations;
    private BigDecimal extraordinaryItems;
    private BigDecimal effectOfAccountingCharges;
    private BigDecimal otherItems;
    private BigDecimal netIncome;
    private BigDecimal netIncomeApplicableToCommonShares;

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

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getCostOfRevenue() {
        return costOfRevenue;
    }

    public void setCostOfRevenue(BigDecimal costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getResearchAndDevelopment() {
        return researchAndDevelopment;
    }

    public void setResearchAndDevelopment(BigDecimal researchAndDevelopment) {
        this.researchAndDevelopment = researchAndDevelopment;
    }

    public BigDecimal getSellingGeneralAdministrative() {
        return sellingGeneralAdministrative;
    }

    public void setSellingGeneralAdministrative(BigDecimal sellingGeneralAdministrative) {
        this.sellingGeneralAdministrative = sellingGeneralAdministrative;
    }

    public BigDecimal getNonRecurring() {
        return nonRecurring;
    }

    public void setNonRecurring(BigDecimal nonRecurring) {
        this.nonRecurring = nonRecurring;
    }

    public BigDecimal getOtherOperatingExpenses() {
        return otherOperatingExpenses;
    }

    public void setOtherOperatingExpenses(BigDecimal otherOperatingExpenses) {
        this.otherOperatingExpenses = otherOperatingExpenses;
    }

    public BigDecimal getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    public void setTotalOperatingExpenses(BigDecimal totalOperatingExpenses) {
        this.totalOperatingExpenses = totalOperatingExpenses;
    }

    public BigDecimal getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(BigDecimal operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public BigDecimal getTotalOtherIncomeExpenseNet() {
        return totalOtherIncomeExpenseNet;
    }

    public void setTotalOtherIncomeExpenseNet(BigDecimal totalOtherIncomeExpenseNet) {
        this.totalOtherIncomeExpenseNet = totalOtherIncomeExpenseNet;
    }

    public BigDecimal getEbit() {
        return ebit;
    }

    public void setEbit(BigDecimal ebit) {
        this.ebit = ebit;
    }

    public BigDecimal getInterestExpense() {
        return interestExpense;
    }

    public void setInterestExpense(BigDecimal interestExpense) {
        this.interestExpense = interestExpense;
    }

    public BigDecimal getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    public void setIncomeBeforeTax(BigDecimal incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
    }

    public BigDecimal getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public void setIncomeTaxExpense(BigDecimal incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    public BigDecimal getMinorityInterest() {
        return minorityInterest;
    }

    public void setMinorityInterest(BigDecimal minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    public BigDecimal getNetIncomeFromContinuingOps() {
        return netIncomeFromContinuingOps;
    }

    public void setNetIncomeFromContinuingOps(BigDecimal netIncomeFromContinuingOps) {
        this.netIncomeFromContinuingOps = netIncomeFromContinuingOps;
    }

    public BigDecimal getDiscontinuedOperations() {
        return discontinuedOperations;
    }

    public void setDiscontinuedOperations(BigDecimal discontinuedOperations) {
        this.discontinuedOperations = discontinuedOperations;
    }

    public BigDecimal getExtraordinaryItems() {
        return extraordinaryItems;
    }

    public void setExtraordinaryItems(BigDecimal extraordinaryItems) {
        this.extraordinaryItems = extraordinaryItems;
    }

    public BigDecimal getEffectOfAccountingCharges() {
        return effectOfAccountingCharges;
    }

    public void setEffectOfAccountingCharges(BigDecimal effectOfAccountingCharges) {
        this.effectOfAccountingCharges = effectOfAccountingCharges;
    }

    public BigDecimal getOtherItems() {
        return otherItems;
    }

    public void setOtherItems(BigDecimal otherItems) {
        this.otherItems = otherItems;
    }

    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
    }

    public BigDecimal getNetIncomeApplicableToCommonShares() {
        return netIncomeApplicableToCommonShares;
    }

    public void setNetIncomeApplicableToCommonShares(BigDecimal netIncomeApplicableToCommonShares) {
        this.netIncomeApplicableToCommonShares = netIncomeApplicableToCommonShares;
    }
}
