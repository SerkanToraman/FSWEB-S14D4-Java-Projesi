package com.workintech.S18G4.products;

import com.workintech.S18G4.products.enums.BreadType;

public class Bread extends ProductForSale{

    private BreadType breadtype;
    public Bread(String type, Double price, String description, BreadType breadtype) {
        super(type, price, description);
        this.breadtype=breadtype;
    }
    @Override
    public void showDetails() {
        String parentString = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Bread Type: " + breadtype +"\n");
        builder.append("--");
        System.out.println( parentString + builder);
    }
}
