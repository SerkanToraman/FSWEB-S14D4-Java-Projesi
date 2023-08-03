package com.workintech.S18G4.RPGGame.enums;

public enum PokemonsE {
    BULBASAUR(1.2,0.8),
    IVYSAUR(1.4,0.9),
    VENUSAUR(1.3,1.1),
    CHARMANDER(1.2,1.2),
    CHARMELON(1.3,1.05),
    CHARIZARD(1.6,1.2),
    ;


    private double poisonDamage;
    private double bleedDamage;

    PokemonsE(double poisonDamage, double bleedDamage) {
        this.poisonDamage = poisonDamage;
        this.bleedDamage = bleedDamage;
    }

    public double getPoisonDamage() {
        return poisonDamage;
    }

    public double getBleedDamage() {
        return bleedDamage;
    }
}
