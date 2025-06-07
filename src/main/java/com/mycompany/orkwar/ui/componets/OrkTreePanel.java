/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.ui.componets;


import com.mycompany.orkwar.model.Ork;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class OrkTreePanel extends JPanel {
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode("Армия Мордора");
    private JTree tree = new JTree(root);
    private DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
    private Ork selectedOrk = null;

    public OrkTreePanel() {
        setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);

        tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (node == null) return;

                Object userObject = node.getUserObject();
                if (userObject instanceof Ork) {
                    selectedOrk = (Ork) userObject;
                } else {
                    selectedOrk = null;
                }

                firePropertyChange("selectedOrk", null, selectedOrk);
            }
        });
    }

    public void addOrkToTribe(String tribe, Ork ork) {
        DefaultMutableTreeNode tribeNode = findTribeNode(tribe);
        if (tribeNode == null) {
            tribeNode = new DefaultMutableTreeNode(tribe);
            model.insertNodeInto(tribeNode, root, root.getChildCount());
        }
        model.insertNodeInto(new DefaultMutableTreeNode(ork), tribeNode, tribeNode.getChildCount());
        model.reload();
    }

    public Ork getSelectedOrk() {
        return selectedOrk;
    }

    private DefaultMutableTreeNode findTribeNode(String tribe) {
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) root.getChildAt(i);
            if (node.getUserObject().equals(tribe)) return node;
        }
        return null;
    }
}