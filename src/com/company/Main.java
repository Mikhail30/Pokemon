package com.company;

public class Main {

    public static void main(String[] args) {

            PokemonTrainer ash = new PokemonTrainer("Ash", 4);
            PokemonTrainer brock = new PokemonTrainer("Brock", 5);

            Pokemon pikachu = new Pokemon(40, "Pikachu", 40, 40,
                    false, 3);

            Pokemon charmander = new Pokemon(25, "Charmander", 25, 25,
                    false, 6);

            Pokemon bulbozaur = new Pokemon(41, "Bulbozaur", 41, 41,
                    false, 3);

            Pokemon squirtle = new Pokemon(24, "Squirtle", 24, 24,
                    false, 6);

            ash.addPokemon(pikachu);
            ash.addPokemon(charmander);
            brock.addPokemon(bulbozaur);
            brock.addPokemon(squirtle);

            ash.choosePokemon("Pikachu");
            brock.choosePokemon("Squirtle");
            ash.attackOtherTrainer(brock);
            brock.choosePokemon("Bulbozaur");
            brock.attackOtherTrainer(ash);
            brock.choosePokemon("Squirtle");
            ash.attackOtherTrainer(brock);

            brock.healPokemon(squirtle);
            brock.healPokemon(charmander);
        }
    }

