/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.factory.builder;

import com.mycompany.orkwar.model.ConcreteOrkBuilder;
import com.mycompany.orkwar.model.OrkBuilder;
import com.mycompany.orkwar.factory.gear.DolGuldurGearFactory;
import com.mycompany.orkwar.factory.gear.OrcGearFactory;
import com.mycompany.orkwar.model.OrkAttributes;

public class DolGuldurOrkBuilderFactory implements OrkBuilderFactory {
    private final OrcGearFactory gearFactory = new DolGuldurGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new ConcreteOrkBuilder()
                .setWeapon(gearFactory.createWeapon())
                .setArmor(gearFactory.createArmor())
                .setBanner(gearFactory.createBanner())
                .setAttributes(new OrkAttributes(   (int) (random.nextInt(70)  + 30),
                        (int) (random.nextInt(50) + 20),       
                        (int) (random.nextInt(25) + 10),       
                        (int) (random.nextInt(100) + 100)));
    }
}