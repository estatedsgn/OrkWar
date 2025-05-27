/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.factory.builder;

import com.mycompany.orkwar.model.ConcreteOrkBuilder;
import com.mycompany.orkwar.model.OrkBuilder;
import com.mycompany.orkwar.factory.gear.MistyMountainsGearFactory;
import com.mycompany.orkwar.factory.gear.OrcGearFactory;
import com.mycompany.orkwar.model.OrkAttributes;

public class MistyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    private final OrcGearFactory gearFactory = new MistyMountainsGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new ConcreteOrkBuilder()
                .setWeapon(gearFactory.createWeapon())
                .setArmor(gearFactory.createArmor())
                .setBanner(gearFactory.createBanner())
                .setAttributes(new OrkAttributes(
                        (int) (random.nextInt(50) + 30), // Сила: 80–130
                        (int) (random.nextInt(70) + 20),       // Ловкость: 20–50
                        (int) (random.nextInt(10) + 10),       // Интеллект: 10–25
                        (int) (random.nextInt(100) + 100)
                ));
    }
}