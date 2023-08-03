package com.workintech.S18G4.RPGGame;

import com.workintech.S18G4.RPGGame.enums.PokemonsE;

public class Pokemons extends Monster {

    private PokemonsE pokemon;

    public Pokemons(String name, int hitPoints, double damage, int level, double health, PokemonsE pokemon) {
        super(name, hitPoints, damage, level, health);
        this.pokemon = pokemon;
    }


    @Override
    public void attackedBy(Monster m) {
        double damage = m.getLevel()==1? m.bleed() + m.poison():( m.bleed() + m.poison())*1.2 ;
        double healthRemain = getHealth()-damage;
        if(healthRemain<=100&&healthRemain>0){
            System.out.println(getName() + "'s health "  +healthRemain +" remaining" );
        } else if (healthRemain<=0) {
            System.out.println(getName() + "player has been knocked out of game");
        }
    }
    @Override
    public void restoreHealth(int healthPotion){checkHealth(getHealth()+healthPotion);}
    @Override
    public double bleed() {
        return getDamage()* pokemon.getBleedDamage();
    };
    @Override
    public double poison() {
        return getDamage()* pokemon.getPoisonDamage();
    }
}
