/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nyaku
 */
package com.mycompany.orkwar.model;

public class ConcreteOrkBuilder extends OrkBuilder {
    public ConcreteOrkBuilder() {
        // Сброс состояния
        this.name = null;
        this.weapon = null;
        this.armor = null;
        this.banner = null;
        this.attributes = null;
    }

    @Override
    public OrkBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public OrkBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public OrkBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public OrkBuilder setBanner(String banner) {
        this.banner = banner;
        return this;
    }

    @Override
    public OrkBuilder setAttributes(OrkAttributes attributes) {
        this.attributes = new OrkAttributes(
            attributes.getStrength(),
            attributes.getDexterity(),
            attributes.getIntelligence(),
            attributes.getHealth()
        );
        return this;
    }

    @Override
    public String getBanner() {
        return this.banner;
    }
}