/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.model;

public class OrcDirector {
    private OrkBuilder orkBuilder;

    public void setOrkBuilder(OrkBuilder orkBuilder) {
        this.orkBuilder = orkBuilder;
    }

    public Ork createBasicOrk() {
        return orkBuilder.build();
    }

    public Ork createLeaderOrk() {
        if (orkBuilder.getBanner() != null) {
            return orkBuilder.setBanner(orkBuilder.getBanner() + " (Командир)").build();
        }
        return orkBuilder.setBanner("Командирский").build();
    }

    public Ork createScoutOrk() {
        return orkBuilder.setWeapon("Лук").build();
    }
}
