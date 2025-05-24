/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.factory.builder;

import com.mycompany.orkwar.model.OrkBuilder;
import com.mycompany.orkwar.factory.gear.MordorGearFactory;
import com.mycompany.orkwar.factory.gear.OrcGearFactory;
import com.mycompany.orkwar.model.OrkAttributes;

public class MordorOrkBuilderFactory implements OrkBuilderFactory {
    private final OrcGearFactory gearFactory = new MordorGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new OrkBuilder()
                .setWeapon(gearFactory.createWeapon())
                .setArmor(gearFactory.createArmor())
                .setBanner(gearFactory.createBanner())
                .setAttributes(new OrkAttributes((int) (100 * 1.3), (int) (50 * 0.7),  25, 150));
              
    }
}
