package com.workintech.S18G4.products;

public class Chocolate extends ProductForSale{

    private int choclateRatio;
    public Chocolate(String type, Double price, String description, int choclateRatio) {
        super(type, price, description);
        this.choclateRatio=choclateRatio;
    }

    @Override
    public void showDetails() {
        String parentString = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("ChoclateRatio: " + choclateRatio +"\n");
        builder.append("--");
        System.out.println( parentString + builder);
    }
}
