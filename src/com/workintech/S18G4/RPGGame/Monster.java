package com.workintech.S18G4.RPGGame;

public abstract class  Monster implements Bleedable,Poisanable  {
    private String name;
    private int hitPoints;
    private double damage;
    private int level;
    private double health;

    public Monster(String name, int hitPoints, double damage, int level, double health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.level=level;
        checkHealth(health);
    }

    public void checkHealth(double health){
        if(health>100){
            this.health = 100;
        }else if (health<0){
            this.health = 0;
        }else{
            this.health = health;
        }
    }
    public String getName() {
        return name;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }
    public int getLevel() {
        return level;
    }
    public double getHealth() {
        return health;
    }

    public abstract void attackedBy(Monster m);
    public abstract void restoreHealth(int healthPotion);



}
