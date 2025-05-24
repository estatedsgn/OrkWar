/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.model;

public class Ork {
    private final String name;
    private final String weapon;
    private final String armor;
    private final String banner;
    private final OrkAttributes attributes;

    public Ork(String name, String weapon, String armor, String banner, OrkAttributes attributes) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.banner = banner;
        this.attributes = attributes;
    }

    public String getName() { return name; }
    public String getWeapon() { return weapon; }
    public String getArmor() { return armor; }
    public String getBanner() { return banner; }
    public OrkAttributes getAttributes() { return attributes; }

    @Override
    public String toString() {
        return name + " [" + weapon + ", " + armor + ", " + banner + ", " + attributes + "]";
    }
}
