package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Store <T>{
    public Store() {
    }

    public Store(List<T> listOfProducts, List<T> customerCarts) {
        this.listOfProducts = listOfProducts;
        this.customerCarts = customerCarts;

    }

    private List<T> listOfProducts = new ArrayList<>();
    private List<T>  customerCarts = new ArrayList<>();


    public List<T> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<T> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public List<T> getCustomerCarts() {
        return customerCarts;
    }

    public void setCustomerCarts(List<T> customerCarts) {
        this.customerCarts = customerCarts;
    }
}
