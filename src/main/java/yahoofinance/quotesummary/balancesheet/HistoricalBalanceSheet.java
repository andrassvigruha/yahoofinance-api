package yahoofinance.quotesummary.balancesheet;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Andras Svigruha
 */
public class HistoricalBalanceSheet {

    private String symbol;
    private Calendar date;

    private BigDecimal cash;
    private BigDecimal shortTermInvestments;
    private BigDecimal netReceivables;
    private BigDecimal inventory;
    private BigDecimal otherCurrentAssets;
    private BigDecimal totalCurrentAssets;
    private BigDecimal longTermInvestments;
    private BigDecimal propertyPlantEquipment;
    private BigDecimal otherAssets;
    private BigDecimal totalAssets;
    private BigDecimal accountsPayable;
    private BigDecimal shortLongTermDebt;
    private BigDecimal otherCurrentLiab;
    private BigDecimal longTermDebt;
    private BigDecimal otherLiab;
    private BigDecimal totalCurrentLiabilities;
    private BigDecimal totalLiab;
    private BigDecimal commonStock;
    private BigDecimal retainedEarnings;
    private BigDecimal treasuryStock;
    private BigDecimal otherStockholderEquity;
    private BigDecimal totalStockholderEquity;
    private BigDecimal netTangibleAssets;

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

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getShortTermInvestments() {
        return shortTermInvestments;
    }

    public void setShortTermInvestments(BigDecimal shortTermInvestments) {
        this.shortTermInvestments = shortTermInvestments;
    }

    public BigDecimal getNetReceivables() {
        return netReceivables;
    }

    public void setNetReceivables(BigDecimal netReceivables) {
        this.netReceivables = netReceivables;
    }

    public BigDecimal getInventory() {
        return inventory;
    }

    public void setInventory(BigDecimal inventory) {
        this.inventory = inventory;
    }

    public BigDecimal getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    public void setOtherCurrentAssets(BigDecimal otherCurrentAssets) {
        this.otherCurrentAssets = otherCurrentAssets;
    }

    public BigDecimal getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    public void setTotalCurrentAssets(BigDecimal totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    public BigDecimal getLongTermInvestments() {
        return longTermInvestments;
    }

    public void setLongTermInvestments(BigDecimal longTermInvestments) {
        this.longTermInvestments = longTermInvestments;
    }

    public BigDecimal getPropertyPlantEquipment() {
        return propertyPlantEquipment;
    }

    public void setPropertyPlantEquipment(BigDecimal propertyPlantEquipment) {
        this.propertyPlantEquipment = propertyPlantEquipment;
    }

    public BigDecimal getOtherAssets() {
        return otherAssets;
    }

    public void setOtherAssets(BigDecimal otherAssets) {
        this.otherAssets = otherAssets;
    }

    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(BigDecimal totalAssets) {
        this.totalAssets = totalAssets;
    }

    public BigDecimal getAccountsPayable() {
        return accountsPayable;
    }

    public void setAccountsPayable(BigDecimal accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    public BigDecimal getShortLongTermDebt() {
        return shortLongTermDebt;
    }

    public void setShortLongTermDebt(BigDecimal shortLongTermDebt) {
        this.shortLongTermDebt = shortLongTermDebt;
    }

    public BigDecimal getOtherCurrentLiab() {
        return otherCurrentLiab;
    }

    public void setOtherCurrentLiab(BigDecimal otherCurrentLiab) {
        this.otherCurrentLiab = otherCurrentLiab;
    }

    public BigDecimal getLongTermDebt() {
        return longTermDebt;
    }

    public void setLongTermDebt(BigDecimal longTermDebt) {
        this.longTermDebt = longTermDebt;
    }

    public BigDecimal getOtherLiab() {
        return otherLiab;
    }

    public void setOtherLiab(BigDecimal otherLiab) {
        this.otherLiab = otherLiab;
    }

    public BigDecimal getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    public void setTotalCurrentLiabilities(BigDecimal totalCurrentLiabilities) {
        this.totalCurrentLiabilities = totalCurrentLiabilities;
    }

    public BigDecimal getTotalLiab() {
        return totalLiab;
    }

    public void setTotalLiab(BigDecimal totalLiab) {
        this.totalLiab = totalLiab;
    }

    public BigDecimal getCommonStock() {
        return commonStock;
    }

    public void setCommonStock(BigDecimal commonStock) {
        this.commonStock = commonStock;
    }

    public BigDecimal getRetainedEarnings() {
        return retainedEarnings;
    }

    public void setRetainedEarnings(BigDecimal retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    public BigDecimal getTreasuryStock() {
        return treasuryStock;
    }

    public void setTreasuryStock(BigDecimal treasuryStock) {
        this.treasuryStock = treasuryStock;
    }

    public BigDecimal getOtherStockholderEquity() {
        return otherStockholderEquity;
    }

    public void setOtherStockholderEquity(BigDecimal otherStockholderEquity) {
        this.otherStockholderEquity = otherStockholderEquity;
    }

    public BigDecimal getTotalStockholderEquity() {
        return totalStockholderEquity;
    }

    public void setTotalStockholderEquity(BigDecimal totalStockholderEquity) {
        this.totalStockholderEquity = totalStockholderEquity;
    }

    public BigDecimal getNetTangibleAssets() {
        return netTangibleAssets;
    }

    public void setNetTangibleAssets(BigDecimal netTangibleAssets) {
        this.netTangibleAssets = netTangibleAssets;
    }
}
