package com.workintech.S18G4.RPGGame.enums;

public enum TrollsE {
    BUGGANE(1.01,1.3),
    GRINCH(1.02,1.4),
    NOKKEN(1.02,1.2),
    RIVERTROLL(1.03,1.3),
    STONETROLL(1.2,1.4);

    private double poisonDamage;
    private double bleedDamage;
    TrollsE(double poisonDamage, double bleedDamage) {
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
