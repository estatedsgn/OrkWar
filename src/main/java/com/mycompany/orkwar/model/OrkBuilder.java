/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.model;



import com.github.javafaker.Faker;

public class OrkBuilder {
    private String name;
    private String weapon;
    private String armor;
    private String banner;
    private OrkAttributes attributes;

    public OrkBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public OrkBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public OrkBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public OrkBuilder setBanner(String banner) {
        this.banner = banner;
        return this;
    }
    
    public String getBanner() {
        
        return banner;
    }

    public OrkBuilder setAttributes(OrkAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public Ork build() {
        if (name == null || name.isEmpty()) {
            this.name = new Faker().lordOfTheRings().character();
        }
        Ork newOrk = new Ork(name, weapon, armor, banner, attributes);
        return newOrk;
    }
}
