package com.company;

public class Pokemon {
    private int level;
    private String name;
    private int maxHealth;
    private int currentHealth;
    private boolean knockedOut;
    private int attackPower;
    private boolean attackAbility = true;

    public Pokemon(int level, String name, int maxHealth, int currentHealth, boolean knockedOut, int attackPower) {
        this.level = level;
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.knockedOut = knockedOut;
        this.attackPower = attackPower;
    }

    public void loseHealth(int healthPoints) {
        this.currentHealth = this.currentHealth - healthPoints;
        if (this.currentHealth > 0)
            System.out.println(this.name + " lost " + healthPoints + " hp!");
        else {
            this.currentHealth = 0;
            this.knockedOut = true;
            System.out.println(this.name + " was knocked out!");
        }
    }

    public void regainHealth(int healthPoints) {
        if (this.currentHealth == maxHealth) {
            System.out.println(this.name + " said: " + "thank you, but my health is full.");
        } else if (this.currentHealth + healthPoints > maxHealth) {
            this.currentHealth = maxHealth;
            System.out.println(this.name + " said: " + "thank you!" + " Now my health is: " + currentHealth + ".");
        } else if (this.currentHealth + healthPoints <= maxHealth) {
            this.currentHealth = currentHealth + healthPoints;
            System.out.println(this.name + " said: " + "thank you!" + " Now my health is: " + currentHealth + ".");
        }
    }

    public void attack(Pokemon pokemon) {
        if (pokemon.currentHealth == 0) {
            attackAbility = false;
            System.out.println(pokemon.name + " was alredy dead, you are can not attack him!");
        } else if (this.currentHealth == 0) {
            attackAbility = false;
            System.out.println(this.name + " said: " + "I can not attack, cause I was killed...");
        } else {
            System.out.println(this.name + " attack " + pokemon.name + "!");
            pokemon.loseHealth(this.attackPower);
            System.out.println("It's current health is: " + pokemon.currentHealth + " hp");
        }
    }


    //Getters
    public String getName() { return name; }

    public int getLevel() { return level; }

    public int getMaxHealth() { return maxHealth; }

    public int getCurrentHealth() { return currentHealth; }

    public boolean isKnockedOut() { return knockedOut; }

    public int getAttackPower() { return attackPower; }

    public boolean isAttackAbility() { return attackAbility; }

}