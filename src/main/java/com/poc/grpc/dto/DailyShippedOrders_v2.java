package com.poc.grpc.dto;

import java.util.Date;

/**
 * @author a0k02hz
 */

public class DailyShippedOrders_v2 {

    private String shipFileName;
    private String salesOrderNum;
    private int orderLineNum;
    private String sONLIN;
    private Date orderDate;
    private Date invoiceDate;
    private Date txnDateTm;
    private Date txnDate;
    private String sellerID;
    private String txnType;
    private int shipQty;
    private int itemID;
    private String itemUPC;
    private double custTenderAmt;
    private double netPayableAmt;
    private double comAmt;
    private double effComRate;
    private String itemName;
    private String custFirstName;
    private String custLastName;
    private String custEmail;
    private String pmtMethod;
    private String custCity;
    private String custState;
    private String custZipCode;
    private String reasonCode;
    private String reasonDesc;
    private String productType;
    private String flexComRuleID;
    private String walmartPONum;
    private int walmartPOLineNum;
    private String productTaxCode;
    private double taxOnSalesRevAmt;
    private double taxOnShipRevAmt;
    private double taxOnRefundSalesAmt;
    private double taxOnShipRefundAmt;
    private double taxTotalAmt;
    private String taxWithheldFlag;
    private String specCategory;
    private String contractCategory;
    private String addAdjustmentNotes;
    private double netShipRevAmt;
    private double origItemPriceAmt;
    private double origComAmt;
    private double itemPriceAmt;
    private double shipChargeAmt;
    private String returnReasonCode;
    private String returnReasonDesc;
    private double feeRevenueAmt;
    private double feeRefundAmt;
    private double taxOnFeeRevenueAmt;
    private double taxOnFeeRefundAmt;
    private String feeWithheldFlag;
    private String fulfillmentType;

    public String getShipFileName() {
        return shipFileName;
    }

    public void setShipFileName(String shipFileName) {
        this.shipFileName = shipFileName;
    }

    public String getSalesOrderNum() {
        return salesOrderNum;
    }

    public void setSalesOrderNum(String salesOrderNum) {
        this.salesOrderNum = salesOrderNum;
    }

    public int getOrderLineNum() {
        return orderLineNum;
    }

    public void setOrderLineNum(int orderLineNum) {
        this.orderLineNum = orderLineNum;
    }

    public String getsONLIN() {
        return sONLIN;
    }

    public void setsONLIN(String sONLIN) {
        this.sONLIN = sONLIN;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getTxnDateTm() {
        return txnDateTm;
    }

    public void setTxnDateTm(Date txnDateTm) {
        this.txnDateTm = txnDateTm;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public int getShipQty() {
        return shipQty;
    }

    public void setShipQty(int shipQty) {
        this.shipQty = shipQty;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemUPC() {
        return itemUPC;
    }

    public void setItemUPC(String itemUPC) {
        this.itemUPC = itemUPC;
    }

    public double getCustTenderAmt() {
        return custTenderAmt;
    }

    public void setCustTenderAmt(double custTenderAmt) {
        this.custTenderAmt = custTenderAmt;
    }

    public double getNetPayableAmt() {
        return netPayableAmt;
    }

    public void setNetPayableAmt(double netPayableAmt) {
        this.netPayableAmt = netPayableAmt;
    }

    public double getComAmt() {
        return comAmt;
    }

    public void setComAmt(double comAmt) {
        this.comAmt = comAmt;
    }

    public double getEffComRate() {
        return effComRate;
    }

    public void setEffComRate(double effComRate) {
        this.effComRate = effComRate;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getPmtMethod() {
        return pmtMethod;
    }

    public void setPmtMethod(String pmtMethod) {
        this.pmtMethod = pmtMethod;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustZipCode() {
        return custZipCode;
    }

    public void setCustZipCode(String custZipCode) {
        this.custZipCode = custZipCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getFlexComRuleID() {
        return flexComRuleID;
    }

    public void setFlexComRuleID(String flexComRuleID) {
        this.flexComRuleID = flexComRuleID;
    }

    public String getWalmartPONum() {
        return walmartPONum;
    }

    public void setWalmartPONum(String walmartPONum) {
        this.walmartPONum = walmartPONum;
    }

    public int getWalmartPOLineNum() {
        return walmartPOLineNum;
    }

    public void setWalmartPOLineNum(int walmartPOLineNum) {
        this.walmartPOLineNum = walmartPOLineNum;
    }

    public String getProductTaxCode() {
        return productTaxCode;
    }

    public void setProductTaxCode(String productTaxCode) {
        this.productTaxCode = productTaxCode;
    }

    public double getTaxOnSalesRevAmt() {
        return taxOnSalesRevAmt;
    }

    public void setTaxOnSalesRevAmt(double taxOnSalesRevAmt) {
        this.taxOnSalesRevAmt = taxOnSalesRevAmt;
    }

    public double getTaxOnShipRevAmt() {
        return taxOnShipRevAmt;
    }

    public void setTaxOnShipRevAmt(double taxOnShipRevAmt) {
        this.taxOnShipRevAmt = taxOnShipRevAmt;
    }

    public double getTaxOnRefundSalesAmt() {
        return taxOnRefundSalesAmt;
    }

    public void setTaxOnRefundSalesAmt(double taxOnRefundSalesAmt) {
        this.taxOnRefundSalesAmt = taxOnRefundSalesAmt;
    }

    public double getTaxOnShipRefundAmt() {
        return taxOnShipRefundAmt;
    }

    public void setTaxOnShipRefundAmt(double taxOnShipRefundAmt) {
        this.taxOnShipRefundAmt = taxOnShipRefundAmt;
    }

    public double getTaxTotalAmt() {
        return taxTotalAmt;
    }

    public void setTaxTotalAmt(double taxTotalAmt) {
        this.taxTotalAmt = taxTotalAmt;
    }

    public String getTaxWithheldFlag() {
        return taxWithheldFlag;
    }

    public void setTaxWithheldFlag(String taxWithheldFlag) {
        this.taxWithheldFlag = taxWithheldFlag;
    }

    public String getSpecCategory() {
        return specCategory;
    }

    public void setSpecCategory(String specCategory) {
        this.specCategory = specCategory;
    }

    public String getContractCategory() {
        return contractCategory;
    }

    public void setContractCategory(String contractCategory) {
        this.contractCategory = contractCategory;
    }

    public String getAddAdjustmentNotes() {
        return addAdjustmentNotes;
    }

    public void setAddAdjustmentNotes(String addAdjustmentNotes) {
        this.addAdjustmentNotes = addAdjustmentNotes;
    }

    public double getNetShipRevAmt() {
        return netShipRevAmt;
    }

    public void setNetShipRevAmt(double netShipRevAmt) {
        this.netShipRevAmt = netShipRevAmt;
    }

    public double getOrigItemPriceAmt() {
        return origItemPriceAmt;
    }

    public void setOrigItemPriceAmt(double origItemPriceAmt) {
        this.origItemPriceAmt = origItemPriceAmt;
    }

    public double getOrigComAmt() {
        return origComAmt;
    }

    public void setOrigComAmt(double origComAmt) {
        this.origComAmt = origComAmt;
    }

    public double getItemPriceAmt() {
        return itemPriceAmt;
    }

    public void setItemPriceAmt(double itemPriceAmt) {
        this.itemPriceAmt = itemPriceAmt;
    }

    public double getShipChargeAmt() {
        return shipChargeAmt;
    }

    public void setShipChargeAmt(double shipChargeAmt) {
        this.shipChargeAmt = shipChargeAmt;
    }

    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    public String getReturnReasonDesc() {
        return returnReasonDesc;
    }

    public void setReturnReasonDesc(String returnReasonDesc) {
        this.returnReasonDesc = returnReasonDesc;
    }

    public double getFeeRevenueAmt() {
        return feeRevenueAmt;
    }

    public void setFeeRevenueAmt(double feeRevenueAmt) {
        this.feeRevenueAmt = feeRevenueAmt;
    }

    public double getFeeRefundAmt() {
        return feeRefundAmt;
    }

    public void setFeeRefundAmt(double feeRefundAmt) {
        this.feeRefundAmt = feeRefundAmt;
    }

    public double getTaxOnFeeRevenueAmt() {
        return taxOnFeeRevenueAmt;
    }

    public void setTaxOnFeeRevenueAmt(double taxOnFeeRevenueAmt) {
        this.taxOnFeeRevenueAmt = taxOnFeeRevenueAmt;
    }

    public double getTaxOnFeeRefundAmt() {
        return taxOnFeeRefundAmt;
    }

    public void setTaxOnFeeRefundAmt(double taxOnFeeRefundAmt) {
        this.taxOnFeeRefundAmt = taxOnFeeRefundAmt;
    }

    public String getFeeWithheldFlag() {
        return feeWithheldFlag;
    }

    public void setFeeWithheldFlag(String feeWithheldFlag) {
        this.feeWithheldFlag = feeWithheldFlag;
    }

    public String getFulfillmentType() {
        return fulfillmentType;
    }

    public void setFulfillmentType(String fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }
}
