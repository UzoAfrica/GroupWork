package org.example.model;

import org.example.interfaces.CashierInterface;
import org.example.model.Person;

public class Cashier extends Person implements CashierInterface {

    @Override
    public String sellsProduct(Cashier cashier) {
        return null;
    }

    @Override
    public String givesReceipt(Cashier cashier) {
        return null;
    }
}

