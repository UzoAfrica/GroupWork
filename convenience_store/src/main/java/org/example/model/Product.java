package org.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product{
    List<String> productList = new ArrayList<>();

    private Long productId;
    private String title;
    private double price;
    private int quantity;
    private String description;
    private Date dateCreated;

    public Product() {
    }



    public Product(Long productId, String title, double price, int quantity, String description, Date dateCreated) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.dateCreated = dateCreated;
    }

    public Long getProductId() {
        return productId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

