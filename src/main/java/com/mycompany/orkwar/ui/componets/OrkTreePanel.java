/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orkwar.ui.componets;

import com.mycompany.orkwar.model.Ork;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class OrkTreePanel extends JPanel {
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode("Армия Мордора");
    private JTree tree = new JTree(root);
    private DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

    public OrkTreePanel() {
        setLayout(new BorderLayout());
        add(new JScrollPane(tree), BorderLayout.CENTER);
    }

    public void addOrkToTribe(String tribe, Ork ork) {
        DefaultMutableTreeNode tribeNode = findTribeNode(tribe);
        if (tribeNode == null) {
            tribeNode = new DefaultMutableTreeNode(tribe);
            model.insertNodeInto(tribeNode, root, root.getChildCount());
        }
        model.insertNodeInto(new DefaultMutableTreeNode(ork.getName()), tribeNode, tribeNode.getChildCount());
        model.reload();
    }

    private DefaultMutableTreeNode findTribeNode(String tribe) {
        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) root.getChildAt(i);
            if (node.getUserObject().equals(tribe)) return node;
        }
        return null;
    }
}
