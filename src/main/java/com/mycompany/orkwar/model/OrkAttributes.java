/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.model;

public class OrkAttributes {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int health;

    public OrkAttributes(int strength, int dexterity, int intelligence, int health) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.health = health;
    }

    public int getStrength() { return strength; }
    public int getDexterity() { return dexterity; }
    public int getIntelligence() { return intelligence; }
    public int getHealth() { return health; }

    @Override
    public String toString() {
        return String.format("Str: %d, Dex: %d, Int: %d, HP: %d", strength, dexterity, intelligence, health);
    }
}
