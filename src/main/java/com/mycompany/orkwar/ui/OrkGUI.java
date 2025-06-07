/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.ui;

import com.mycompany.orkwar.factory.builder.*;
import com.mycompany.orkwar.model.*;
import com.mycompany.orkwar.ui.componets.*;
import java.awt.BorderLayout;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;

public class OrkGUI extends JFrame {
    private JComboBox<String> tribeComboBox = new JComboBox<>(new String[]{"Мордор", "Дол Гулдур", "Мглистые Горы"});
    private JComboBox<String> roleComboBox = new JComboBox<>(new String[]{"Базовый", "Командир", "Разведчик"});
    private JButton createButton = new JButton("Создать Орка");

    private OrkTreePanel treePanel = new OrkTreePanel();
    private OrkInfoPanel infoPanel = new OrkInfoPanel();

    private OrcDirector director = new OrcDirector();

    public OrkGUI() {
        setTitle("Армия Орков");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Племя:"));
        controlPanel.add(tribeComboBox);
        controlPanel.add(new JLabel("Роль:"));
        controlPanel.add(roleComboBox);
        controlPanel.add(createButton);

        add(controlPanel, BorderLayout.NORTH);
        add(treePanel, BorderLayout.WEST);
        add(infoPanel, BorderLayout.EAST);

        treePanel.addPropertyChangeListener("selectedOrk", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Ork ork = (Ork) evt.getNewValue();
                infoPanel.displayOrk(ork);
            }
        });

        createButton.addActionListener(this::createOrk);
    }

    private void createOrk(ActionEvent e) {
        String tribe = (String) tribeComboBox.getSelectedItem();
        String role = (String) roleComboBox.getSelectedItem();

        OrkBuilderFactory factory = null;
        switch (tribe) {
            case "Мордор" -> factory = new MordorOrkBuilderFactory();
            case "Дол Гулдур" -> factory = new DolGuldurOrkBuilderFactory();
            case "Мглистые Горы" -> factory = new MistyMountainsOrkBuilderFactory();
        }

        if (factory == null) return;

        OrkBuilder builder = factory.createOrkBuilder();
        director.setOrkBuilder(builder);

        Ork ork = switch (role) {
            case "Командир" -> director.createLeaderOrk();
            case "Разведчик" -> director.createScoutOrk();
            default -> director.createBasicOrk();
        };

        treePanel.addOrkToTribe(tribe, ork);
        infoPanel.displayOrk(ork); // Обновление UI сразу после создания
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OrkGUI().setVisible(true));
    }
}