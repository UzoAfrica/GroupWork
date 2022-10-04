package org.example;

import org.example.enums.Qualification;
import org.example.enums.Role;
import org.example.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager uzor = new Manager();
        uzor.setName("Uzor");
        uzor.setAge(30);
        uzor.setEmail("uzo@gmail.com");
        uzor.setPhoneNumber("08067829077");
        uzor.setRole(Role.STAFF);
        uzor.setAddress("3, Abiola road");

        Applicant akpan = new Applicant();
        akpan.setName("Akpan");
        akpan.setPositionAppliedFor("Cashier");
        akpan.setQualification(Qualification.BSC);

        System.out.println(akpan.apply(akpan));


        System.out.println(uzor.hire(akpan));

        Product product = new Product();
        product.setProductId(1L);
        product.setTitle("Rice");
        product.setDescription("Neatly packaged");
        product.setPrice(20000.99);
        product.setQuantity(2);
        product.setDateCreated(new Date());

        System.out.println(product);

        Product product1 = new Product();
        product1.setProductId(2L);
        product1.setTitle("Beans");
        product1.setDescription("Neatly packaged");
        product1.setPrice(15000.55);
        product1.setQuantity(5);
        product1.setDateCreated(new Date());

        System.out.println(product1);

        List<String> listOfThingsToBuy= new ArrayList<>();
        listOfThingsToBuy.add("Rice");
        listOfThingsToBuy.add("Yam");
        listOfThingsToBuy.add("Bread");

        System.out.println(listOfThingsToBuy);
    }
}