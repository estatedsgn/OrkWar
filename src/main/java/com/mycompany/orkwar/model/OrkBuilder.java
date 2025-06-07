/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.model;

import com.github.javafaker.Faker;

public abstract class OrkBuilder {
    protected String name;
    protected String weapon;
    protected String armor;
    protected String banner;
    protected OrkAttributes attributes;

    public abstract OrkBuilder setName(String name);
    public abstract OrkBuilder setWeapon(String weapon);
    public abstract OrkBuilder setArmor(String armor);
    public abstract OrkBuilder setBanner(String banner);
    public abstract OrkBuilder setAttributes(OrkAttributes attributes);

    public Ork build() {
        if (name == null || name.isEmpty()) {
            this.name = new Faker().lordOfTheRings().character();
        }
        return new Ork(name, weapon, armor, banner, attributes);
    }

    public String getBanner() {
        return this.banner;
    }
}