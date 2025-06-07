/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.model;

/**
 *
 * @author nyaku
 */


import java.util.Random;

public class MistyMountainsBuilder extends OrkBuilder {
    private final Random random = new Random();

    public MistyMountainsBuilder() {
        setWeapon("Топор");
        setArmor("Кожаная броня");
        setBanner("Луна");
        setAttributes(generateDefaultAttributes());
    }

    @Override
    public OrkBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public OrkBuilder setWeapon(String weapon) {
        this.weapon = weapon != null ? weapon : "Топор";
        return this;
    }

    @Override
    public OrkBuilder setArmor(String armor) {
        this.armor = armor != null ? armor : "Кожаная броня";
        return this;
    }

    @Override
    public OrkBuilder setBanner(String banner) {
        this.banner = banner != null ? banner : "Луна";
        return this;
    }

    @Override
    public OrkBuilder setAttributes(OrkAttributes attributes) {
        this.attributes = attributes != null ? attributes : generateDefaultAttributes();
        return this;
    }

    private OrkAttributes generateDefaultAttributes() {
        return new OrkAttributes(
            (int) (random.nextInt(50) + 30),       // Сила: 30–80
            (int) (random.nextInt(70) + 50),       // Ловкость: 50–120
            (int) (random.nextInt(10) + 5),        // Интеллект: 5–15
            (int) (random.nextInt(100) + 100)      // Здоровье: 100–200
        );
    }
}