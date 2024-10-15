/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.BorderLayout;
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
}
