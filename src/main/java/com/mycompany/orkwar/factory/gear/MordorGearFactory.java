/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.factory.gear;

public class MordorGearFactory implements OrcGearFactory {
    @Override
    public String createWeapon() { return "Тяжёлый меч"; }
    @Override
    public String createArmor() { return "Стальная броня"; }
    @Override
    public String createBanner() { return "Красное Око"; }
}