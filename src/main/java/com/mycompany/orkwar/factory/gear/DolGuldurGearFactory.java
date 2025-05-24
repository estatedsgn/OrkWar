/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.factory.gear;

public class DolGuldurGearFactory implements OrcGearFactory {
    @Override
    public String createWeapon() { return "Копьё"; }
    @Override
    public String createArmor() { return "Кольчуга"; }
    @Override
    public String createBanner() { return "Паук"; }
}   
