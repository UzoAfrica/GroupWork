package org.example.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomersTest {

    @Test
    void buysProduct() {
        Customers customers= new Customers();
        customers.setWalletBalance(5000);

        Product product = new Product();
        product.setPrice(1000);


        Assert.assertEquals("The product is available, proceed to make payment", customers.buysProduct(product));
    }

    @Test
    void testInsufficientFund() {
        Customers customers= new Customers();
        customers.setWalletBalance(2000);

        Product product = new Product();
        product.setPrice(3000);


        Assert.assertEquals("Sorry, you have insufficient fund", customers.buysProduct(product));
    }
}