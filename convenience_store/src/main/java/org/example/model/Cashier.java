package org.example.model;

import org.example.enums.PaymentStatus;
import org.example.interfaces.CashierInterface;
import org.example.model.Person;

import java.util.Date;

public class Cashier extends Person implements CashierInterface {


    @Override
    public Receipt approvePaymentAndIssueReceipt(ToPaySlip toPaySlip, Customers customers) {
        String msg = "";
        if (toPaySlip.getTotalAmountToPay() <= customers.getWalletBalance()){
            customers.setWalletBalance(customers.getWalletBalance() - toPaySlip.getTotalAmountToPay());
            Receipt receipt = new Receipt();
            receipt.setCustomerName(toPaySlip.getCustomerName());
            receipt.setItemsBought(toPaySlip.getListOfItemsToBuy());
            receipt.setPaymentStatus(PaymentStatus.PAID);
            receipt.setDateOfPurchase(new Date());
            receipt.setTotalTransactionFee(toPaySlip.getTotalAmountToPay());
            return receipt;
        }else{
            msg = "Insufficient fund";
        }
        return null;
    }
}

