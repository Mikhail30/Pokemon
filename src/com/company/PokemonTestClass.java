package com.company;

import org.junit.Assert;
import org.junit.Test;

public class PokemonTestClass {

    Pokemon pikachu = new Pokemon(40, "Pikachu", 40, 40,
            false, 3);

    Pokemon charmander = new Pokemon(25, "Charmander", 25, 25,
            false, 6);

    Pokemon bulbozaur = new Pokemon(41, "Bulbozaur", 41, 41,
            false, 3);

    Pokemon squirtle = new Pokemon(24, "Squirtle", 24, 24,
            false, 6);


    @Test
    public void pokemonsShouldHaveDifferentNames() {
        Assert.assertNotSame("Attention! You are can't create pokemons with the same names!"
                , pikachu.getName(), charmander.getName());
        Assert.assertNotSame("Attention! You are can't create pokemons with the same names!"
                , pikachu.getName(), squirtle.getName());
        Assert.assertNotSame("Attention! You are can't create pokemons with the same names!"
                , pikachu.getName(), bulbozaur.getName());
    }
}

