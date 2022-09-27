package org.example.model;

import org.example.enums.PaymentStatus;

import java.util.Date;
import java.util.List;

public class Receipt {

    private  String customerName;
    private List<String> ItemsBought;
    private Double TotalTransactionFee;
    private Date dateOfPurchase;
    private PaymentStatus paymentStatus;


    public Receipt() {
    }

    public Receipt(String customerName, List<String> itemsBought, Double totalTransactionFee, Date dateOfPurchase, PaymentStatus paymentStatus) {
        this.customerName = customerName;
        ItemsBought = itemsBought;
        TotalTransactionFee = totalTransactionFee;
        this.dateOfPurchase = dateOfPurchase;
        this.paymentStatus = paymentStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItemsBought() {
        return ItemsBought;
    }

    public void setItemsBought(List<String> itemsBought) {
        ItemsBought = itemsBought;
    }
    public Double getTotalTransactionFee() {
        return TotalTransactionFee;
    }
    public void setTotalTransactionFee(Double totalTransactionFee) {
        TotalTransactionFee = totalTransactionFee;
    }
    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }
    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    @Override
    public String toString() {
        return "Receipt{" +
                "customerName='" + customerName + '\'' +
                ", ItemsBought=" + ItemsBought +
                ", TotalTransactionFee=" + TotalTransactionFee +
                ", dateOfPurchase=" + dateOfPurchase +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}
