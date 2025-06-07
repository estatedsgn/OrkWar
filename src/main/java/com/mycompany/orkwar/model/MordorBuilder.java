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

public class MordorBuilder extends OrkBuilder {
    private final Random random = new Random();

    public MordorBuilder() {
        setWeapon("Тяжёлый меч");
        setArmor("Стальная броня");
        setBanner("Красное Око");
        setAttributes(generateDefaultAttributes());
    }

    @Override
    public OrkBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public OrkBuilder setWeapon(String weapon) {
        this.weapon = weapon != null ? weapon : "Тяжёлый меч";
        return this;
    }

    @Override
    public OrkBuilder setArmor(String armor) {
        this.armor = armor != null ? armor : "Стальная броня";
        return this;
    }

    @Override
    public OrkBuilder setBanner(String banner) {
        this.banner = banner != null ? banner : "Красное Око";
        return this;
    }

    @Override
    public OrkBuilder setAttributes(OrkAttributes attributes) {
        this.attributes = attributes != null ? attributes : generateDefaultAttributes();
        return this;
    }

    private OrkAttributes generateDefaultAttributes() {
        return new OrkAttributes(
            (int) (random.nextInt(80) + 50 + 30), // Сила: 80–130
            (int) (random.nextInt(30) + 20),       // Ловкость: 20–50
            (int) (random.nextInt(15) + 10),       // Интеллект: 10–25
            (int) (random.nextInt(100) + 100)      // Здоровье: 100–200
        );
    }
}
