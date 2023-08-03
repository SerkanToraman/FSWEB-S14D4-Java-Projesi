package com.workintech.S18G4.main;

import com.workintech.S18G4.products.Chocolate;
import com.workintech.S18G4.products.ProductForSale;
import com.workintech.S18G4.products.Bread;
import com.workintech.S18G4.products.Coke;
import com.workintech.S18G4.products.enums.BreadType;
import com.workintech.S18G4.products.enums.Cokesize;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Bitter", 40.0, "Delicious", 70);
        products[1] = new Coke("Diet", 25.0, "Ice Cold", Cokesize.M300ML, false);
        products[2] = new Bread("Çavdar", 55.0, "Healthy", BreadType.BROWN);
        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                }
            }
        }

    }
}

