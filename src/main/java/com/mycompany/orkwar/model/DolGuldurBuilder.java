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

public class DolGuldurBuilder extends OrkBuilder {
    private final Random random = new Random();

    public DolGuldurBuilder() {
        setWeapon("Копьё");
        setArmor("Кольчуга");
        setBanner("Паук");
        setAttributes(generateDefaultAttributes());
    }

    @Override
    public OrkBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public OrkBuilder setWeapon(String weapon) {
        this.weapon = weapon != null ? weapon : "Копьё";
        return this;
    }

    @Override
    public OrkBuilder setArmor(String armor) {
        this.armor = armor != null ? armor : "Кольчуга";
        return this;
    }

    @Override
    public OrkBuilder setBanner(String banner) {
        this.banner = banner != null ? banner : "Паук";
        return this;
    }

    @Override
    public OrkBuilder setAttributes(OrkAttributes attributes) {
        this.attributes = attributes != null ? attributes : generateDefaultAttributes();
        return this;
    }

    private OrkAttributes generateDefaultAttributes() {
        return new OrkAttributes(
            (int) (random.nextInt(70) + 30),       // Сила: 30–100
            (int) (random.nextInt(50) + 30),       // Ловкость: 30–80
            (int) (random.nextInt(25) + 10),       // Интеллект: 10–35
            (int) (random.nextInt(100) + 100)      // Здоровье: 100–200
        );
    }
}