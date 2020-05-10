package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TrainerTestClass {

    PokemonTrainer brock = new PokemonTrainer("Ash", 5);
    PokemonTrainer ash = new PokemonTrainer("Brock", 4);

    @Test
    public void trainersShouldHaveDifferentNames() {

        Assert.assertNotSame("Attention! You are can't create trainers with the same names"
                , ash.getName(), brock.getName());
    }
}

