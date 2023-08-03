package com.workintech.S18G4.RPGGame;

import com.workintech.S18G4.RPGGame.enums.TrollsE;

public class Trolls extends Monster {
    private TrollsE troll;

    public Trolls(String name, int hitPoints, double damage, int level, double health, TrollsE troll) {
        super(name, hitPoints, damage, level, health);
        this.troll = troll;
    }


    @Override
    public void restoreHealth(int healthPotion){checkHealth(getHealth()+healthPotion);}
    @Override
    public void attackedBy(Monster m) {
        double damage = m.getLevel()==1? m.bleed() + m.poison():(m.bleed() + m.poison())*1.2 ;
        double healthRemain = getHealth()-damage;
        if(healthRemain<=100&&healthRemain>0){
            System.out.println(getName() + "'s health "  +healthRemain +" remaining" );
        } else if (healthRemain<=0) {
            System.out.println(getName() + "has been knocked out of game");
        }
        checkHealth(healthRemain);
    }
    @Override
    public double bleed() {
        return getDamage()* troll.getBleedDamage();
    };
    @Override
    public double poison() {
        return getDamage()* troll.getPoisonDamage();
    }
}
