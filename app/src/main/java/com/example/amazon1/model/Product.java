package com.example.amazon1.model;

import java.math.BigDecimal;

public class Product {
    private int pId;
    private String pName;
    private BigDecimal pPrice;
    private String pDescription;
    private String pImageName;

    public Product() {
        super();
    }

    public Product(int pId, String pName, BigDecimal pPrice, String pDescription, String pImageName) {
        setId(pId);
        setName(pName);
        setPrice(pPrice);
        setDescription(pDescription);
        setImageName(pImageName);
    }
    public int getId() {
        return pId;
    }

    public void setId(int id) {
        this.pId = id;
    }

    public BigDecimal getPrice() {
        return pPrice;
    }

    public String getName() {
        return pName;
    }

    public void setPrice(BigDecimal price) {
        this.pPrice = price;
    }

    public void setName(String name) {
        this.pName = name;
    }

    public String getDescription() {
        return pDescription;
    }

    public void setDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public String getImageName() {
        return pImageName;
    }

    public void setImageName(String imageName) {
        this.pImageName = imageName;
    }
}


