/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mario
 */
public class Utilities {
    public static void PanelPrint(JPanel viewPanel, JPanel newPanel) {
        viewPanel.removeAll();
        viewPanel.add(newPanel, BorderLayout.CENTER);
        viewPanel.revalidate();
        viewPanel.repaint();
        
        
    }
    
    public static void SetImageLabel (JLabel labelName, String root, Dimension dimension) {
            ImageIcon image = new ImageIcon(root);
            ImageIcon icon = new ImageIcon (image.getImage() .getScaledInstance (dimension.width, dimension.height, Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
     
            labelName.repaint();
    }
    
}


