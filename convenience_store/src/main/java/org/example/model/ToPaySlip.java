package org.example.model;

import java.util.Date;
import java.util.List;

public class ToPaySlip {
    private String customerName;
    private Double totalAmountToPay;
    private Date timeSlipWasGenerated;
    private List<String > listOfItemsToBuy;
    public ToPaySlip() {
    }
    public ToPaySlip(String customerName, Double totalAmountToPay, Date timeSlipWasGenerated, List<String> listOfItemsToBuy) {
        this.customerName = customerName;
        this.totalAmountToPay = totalAmountToPay;
        this.timeSlipWasGenerated = timeSlipWasGenerated;
        this.listOfItemsToBuy = listOfItemsToBuy;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Double getTotalAmountToPay() {
        return totalAmountToPay;
    }
    public void setTotalAmountToPay(Double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }
    public Date getTimeSlipWasGenerated() {
        return timeSlipWasGenerated;
    }
    public void setTimeSlipWasGenerated(Date timeSlipWasGenerated) {
        this.timeSlipWasGenerated = timeSlipWasGenerated;
    }
    public List<String> getListOfItemsToBuy() {
        return listOfItemsToBuy;
    }
    public void setListOfItemsToBuy(List<String> listOfItemsToBuy) {
        this.listOfItemsToBuy = listOfItemsToBuy;
    }
    @Override
    public String toString() {
        return "ToPaySlip{" +
                "customerName='" + customerName + '\'' +
                ", totalAmountToPay=" + totalAmountToPay +
                ", timeSlipWasGenerated=" + timeSlipWasGenerated +
                ", listOfItemsToBuy=" + listOfItemsToBuy +
                '}';
    }
}
