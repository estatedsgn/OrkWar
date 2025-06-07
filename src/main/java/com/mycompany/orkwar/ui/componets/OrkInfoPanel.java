/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.ui.componets;

import com.mycompany.orkwar.model.Ork;
import com.mycompany.orkwar.model.OrkAttributes;
import javax.swing.*;
import java.awt.*;

public class OrkInfoPanel extends JPanel {
    private JLabel nameLabel = new JLabel("Имя: ");
    private JLabel tribeLabel = new JLabel("Племя: ");
    private JLabel weaponLabel = new JLabel("Оружие: ");
    private JLabel armorLabel = new JLabel("Броня: ");
    private JLabel bannerLabel = new JLabel("Знамя: ");

    private JProgressBar strengthBar = new JProgressBar(0, 100);
    private JLabel strengthValue = new JLabel("0");

    private JProgressBar dexterityBar = new JProgressBar(0, 100);
    private JLabel dexterityValue = new JLabel("0");

    private JProgressBar intelligenceBar = new JProgressBar(0, 50);
    private JLabel intelligenceValue = new JLabel("0");

    private JProgressBar healthBar = new JProgressBar(0, 200);
    private JLabel healthValue = new JLabel("0");

    public OrkInfoPanel() {
        setLayout(new GridLayout(9, 1));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(nameLabel);
        //add(tribeLabel);
        add(weaponLabel);
        add(armorLabel);
        add(bannerLabel);

        JPanel strengthPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        strengthPanel.add(new JLabel("Сила: "));
        strengthPanel.add(strengthBar);
        strengthPanel.add(strengthValue);
        add(strengthPanel);

        JPanel dexterityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dexterityPanel.add(new JLabel("Ловкость: "));
        dexterityPanel.add(dexterityBar);
        dexterityPanel.add(dexterityValue);
        add(dexterityPanel);

        JPanel intelligencePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        intelligencePanel.add(new JLabel("Интеллект: "));
        intelligencePanel.add(intelligenceBar);
        intelligencePanel.add(intelligenceValue);
        add(intelligencePanel);

        JPanel healthPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        healthPanel.add(new JLabel("Здоровье: "));
        healthPanel.add(healthBar);
        healthPanel.add(healthValue);
        add(healthPanel);
    }

    public void displayOrk(Ork ork) {
        if (ork == null) {
            resetPanel();
            return;
        }

        nameLabel.setText("Имя: " + ork.getName());
        //tribeLabel.setText("Племя: " + getTribeFromName(ork.getName()));
        weaponLabel.setText("Оружие: " + (ork.getWeapon() != null ? ork.getWeapon() : "Неизвестно"));
        armorLabel.setText("Броня: " + (ork.getArmor() != null ? ork.getArmor() : "Неизвестно"));
        bannerLabel.setText("Знамя: " + (ork.getBanner() != null ? ork.getBanner() : "Неизвестно"));

        OrkAttributes attrs = ork.getAttributes();
        if (attrs != null) {
            strengthBar.setValue(attrs.getStrength());
            strengthValue.setText(String.valueOf(attrs.getStrength()));
            dexterityBar.setValue(attrs.getDexterity());
            dexterityValue.setText(String.valueOf(attrs.getDexterity()));
            intelligenceBar.setValue(attrs.getIntelligence());
            intelligenceValue.setText(String.valueOf(attrs.getIntelligence()));
            healthBar.setValue(attrs.getHealth());
            healthValue.setText(String.valueOf(attrs.getHealth()));
        } else {
            resetAttributes();
        }

        revalidate();
        repaint();
    }

    private String getTribeFromName(String name) {
        if (name.contains("Мордор")) return "Мордор";
        else if (name.contains("Гулдур")) return "Дол Гулдур";
        else if (name.contains("Горы")) return "Мглистые Горы";
        return "Неизвестное племя";
    }

    private void resetPanel() {
        nameLabel.setText("Имя: ");
       // tribeLabel.setText("Племя: ");
        weaponLabel.setText("Оружие: Неизвестно");
        armorLabel.setText("Броня: Неизвестно");
        bannerLabel.setText("Знамя: Неизвестно");

        resetAttributes();
    }

    private void resetAttributes() {
        strengthBar.setValue(0);
        strengthValue.setText("0");
        dexterityBar.setValue(0);
        dexterityValue.setText("0");
        intelligenceBar.setValue(0);
        intelligenceValue.setText("0");
        healthBar.setValue(0);
        healthValue.setText("0");
    }
}