package com.workintech.S18G4.products;

import java.util.Locale;

public abstract class ProductForSale {
    private String type;
    private Double price;
    private String description;

    public ProductForSale(String type, Double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public abstract void showDetails();

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("--\n");
       builder.append("Class Type: " + getClass().getSimpleName()+"\n");
       builder.append("Type: "+ type +"\n");
       builder.append("Price: "+ price + "\n");
       builder.append("Description:"+ description+"\n");
       return builder.toString();
    }
}
