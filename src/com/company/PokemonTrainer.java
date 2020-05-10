package com.company;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    private int healPower;
    private List <Pokemon> pokemons = new ArrayList<>();
    private Pokemon currentPokemon;
    private boolean disabledPokemon;

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
    public PokemonTrainer(String name, int healPower) {
        this.name = name;
        this.healPower = healPower;
    }
    public void choosePokemon(String name) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getName().equals(name)) {
                currentPokemon = pokemon;
                System.out.println(this.getName() + " said: " + name + ", I'm choosing you!");
                break;
            }
        }
        if(currentPokemon == null)
            System.out.println(this.name + " doesn't have that pokemon!");
    }
    public void healPokemon (Pokemon pokemon) {
        if (this.currentPokemon == pokemon) {
            System.out.println(this.getName() + " heal " + currentPokemon.getName());
            pokemon.regainHealth(healPower);
        } else
            System.out.println(this.name + " said: " + "i didn't choose " +  pokemon.getName() + ", i can't heal him" );
    }
    public void attackOtherTrainer (PokemonTrainer pokemontrainer){
        this.currentPokemon.attack(pokemontrainer.currentPokemon);
    }

    //Getters
    public int getHealPower() { return healPower; }
    public List<Pokemon>  getPokemons() { return pokemons; }
    public String getName () { return name; }
    public Pokemon getCurrentPokemon() { return currentPokemon; }
    public boolean isDisabledPokemon() { return disabledPokemon; }

}





