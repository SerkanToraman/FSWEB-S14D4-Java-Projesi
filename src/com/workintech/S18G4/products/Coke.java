package com.workintech.S18G4.products;

import com.workintech.S18G4.products.enums.Cokesize;

public class Coke extends ProductForSale{

    private Cokesize size;
    private boolean hasSugar;
    public Coke(String type, Double price, String description, Cokesize size, boolean hasSugar) {
        super(type, price, description);
        this.size=size;
        this.hasSugar=hasSugar;
    }
    @Override
    public void showDetails() {
        String parentString = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Class Size: " + size +"\n");
        builder.append("Has sugar"+ hasSugar+"\n");
        builder.append("--");
        System.out.println( parentString + builder);
    }
}
