package com.workintech.S18G4.main;

import com.workintech.S18G4.RPGGame.Monster;
import com.workintech.S18G4.RPGGame.Pokemons;
import com.workintech.S18G4.RPGGame.Trolls;
import com.workintech.S18G4.RPGGame.enums.PokemonsE;
import com.workintech.S18G4.RPGGame.enums.TrollsE;

public class MainMonster {
    public static void main(String[] args) {
        Monster pokemon1 = new Pokemons("Serkan",30,20.5,2,95.0, PokemonsE.CHARIZARD);
        Monster pokemon2 = new Pokemons("Ahmet",40,30.5,1,100.0, PokemonsE.BULBASAUR);
        Monster pokemon3 = new Pokemons("Mehmet",20,25.5,1,80.0, PokemonsE.IVYSAUR);
        Monster troll1 = new Trolls("Musacan",30,25.5,2,95.0, TrollsE.BUGGANE);
        Monster troll2 = new Trolls("Fatih",20,12.5,2,100.0, TrollsE.NOKKEN);
        Monster troll3 = new Trolls("Mert",40,25.5,1,80.0, TrollsE.STONETROLL);

        System.out.println(troll2.getDamage());
        troll3.attackedBy(troll2);
        troll3.restoreHealth(10);
        System.out.println(troll3.getHealth());

    }
}
