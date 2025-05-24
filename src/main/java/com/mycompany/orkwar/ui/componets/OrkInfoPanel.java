/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.ui.componets;

import com.mycompany.orkwar.model.Ork;
import javax.swing.*;
import java.awt.*;

public class OrkInfoPanel extends JPanel {
    private JLabel nameLabel = new JLabel();
    private JProgressBar strengthBar = new JProgressBar(0, 100);
    private JProgressBar dexterityBar = new JProgressBar(0, 100);
    private JProgressBar intelligenceBar = new JProgressBar(0, 50);
    private JProgressBar healthBar = new JProgressBar(0, 200);

    public OrkInfoPanel() {
        setLayout(new GridLayout(5, 1));
        add(new JLabel("Имя:"));
        add(nameLabel);
        add(new JLabel("Сила:"));
        add(strengthBar);
        add(new JLabel("Ловкость:"));
        add(dexterityBar);
        add(new JLabel("Интеллект:"));
        add(intelligenceBar);
        add(new JLabel("Здоровье:"));
        add(healthBar);
    }

    public void displayOrk(Ork ork) {
        nameLabel.setText(ork.getName());
        strengthBar.setValue(ork.getAttributes().getStrength());
        dexterityBar.setValue(ork.getAttributes().getDexterity());
        intelligenceBar.setValue(ork.getAttributes().getIntelligence());
        healthBar.setValue(ork.getAttributes().getHealth());
    }
}
