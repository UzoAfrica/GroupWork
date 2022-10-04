package org.example.model;

import org.example.interfaces.CustomerInterface;

import java.util.List;

public class Customers extends Person implements CustomerInterface {

    private double walletBalance;
    private String transactionId;
    List<Product> itemsToBuy;
    public Customers() {
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }



    @Override
    public String buysProduct(Product product) {
    String result = "";


        if (product.getPrice() <= this.walletBalance)
        {
            result = "The product is available, proceed to make payment";
        }else {
            result = "Sorry, you have insufficient fund";
        }

        return result;
    }

}

