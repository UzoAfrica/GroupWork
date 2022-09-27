package org.example.model;

import org.example.enums.Role;
import org.example.interfaces.CustomerInterface;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Customers extends Person implements CustomerInterface {

    private double walletBalance;
    private String transactionId;
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
    public String buysProduct(Customers customers, Store store) {
    String result = "";
        List<Product> itemsToBuy = new ArrayList<>();

        if (itemsToBuy.contains(store.getListOfProducts())){
            result = "The product is available, proceed to make payment";
        }else {
            result = "Sorry, we are out of stock";
        }

        return result;
    }
}

