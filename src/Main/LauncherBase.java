/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author mario
 */
public class LauncherBase extends javax.swing.JFrame {

    /**
     * Creates new form LauncherBase
     */
    public LauncherBase() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        JLabel[] labels = { jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, 
                    jLabel7, jLabel8, jLabel15, jLabel10, jLabel11, 
                    jLabel12, jLabel13, jLabel14, jLabel9 };

        String[] rutamagenes = { "src/Images/LauncherButton0.png", "src/Images/LauncherButton1.png", 
                        "src/Images/LauncherButton2.png", "src/Images/LauncherButton3.png", 
                        "src/Images/LauncherButton4.png", "src/Images/LauncherButton5.png", 
                        "src/Images/LauncherButton6.png", "src/Images/LauncherButton7.png", 
                        "src/Images/LauncherButton8.png", "src/Images/LauncherButton9.png", 
                        "src/Images/LauncherButton10.png", "src/Images/LauncherButton11.png", 
                        "src/Images/LauncherButton12.png", "src/Images/LauncherButton13.png" };

        for (int i = 0; i < labels.length; i++) {
            Utilities.SetImageLabel(labels[i], rutamagenes[i], new Dimension(85, 85));
        }
        
        for (int i = 0; i < labels.length; i++) {
            final int indexgrado = i;
        
            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent entered) {
                    System.out.println("Prueba click");
                }

                @Override
                public void mouseEntered(MouseEvent entered) {
                    System.out.println("Has entrado al icono del curso");
                    Utilities.SetImageLabel(labels[indexgrado], "src/Images/LauncherButton" + indexgrado + ".png", new Dimension(90, 90));
                }

                @Override
                public void mouseExited(MouseEvent entered) {
                    System.out.println("Has salido del icono del curso");
                    Utilities.SetImageLabel(labels[indexgrado], "src/Images/LauncherButton" + indexgrado + ".png", new Dimension(85, 85));
                }
            });
        }
        
        
        HomeView home = CreateHomeView();
        Utilities.PanelPrint(ViewPanel, home);
        
      }
    
    public final GameView CreateGameView() {
       GameView game = new GameView();
        game.parent = this;
        game.setSize(ViewPanel.getSize());
        game.setLocation(0, 0);
        return game;
    }
    
    public final HomeView CreateHomeView() {
        HomeView home = new HomeView();
        home.parent = this;
        home.setSize(ViewPanel.getSize());
        home.setLocation(0, 0);
        return home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ViewPanel = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        MainPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        MainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewPanel.setOpaque(false);

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        MainPanel.add(ViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 1540, 880));

        Header.setOpaque(false);
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFocusable(false);
        jLabel12.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 15, -1, -1));

        jLabel11.setFocusable(false);
        jLabel11.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 15, -1, -1));

        jLabel10.setFocusable(false);
        jLabel10.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 15, -1, -1));

        jLabel9.setFocusable(false);
        jLabel9.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1388, 15, -1, -1));

        jLabel8.setFocusable(false);
        jLabel8.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 15, -1, -1));

        jLabel7.setFocusable(false);
        jLabel7.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 15, -1, -1));

        jLabel6.setFocusable(false);
        jLabel6.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 15, -1, -1));

        jLabel5.setFocusable(false);
        jLabel5.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 15, -1, -1));

        jLabel4.setFocusable(false);
        jLabel4.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 15, -1, -1));

        jLabel3.setFocusable(false);
        jLabel3.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 15, -1, -1));

        jLabel2.setFocusable(false);
        jLabel2.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, -1, -1));

        jLabel13.setFocusable(false);
        jLabel13.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1073, 15, -1, -1));

        jLabel14.setFocusable(false);
        jLabel14.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1178, 15, -1, -1));

        jLabel15.setFocusable(false);
        jLabel15.setPreferredSize(new java.awt.Dimension(85, 85));
        Header.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 15, -1, -1));

        MainPanel.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 1550, 130));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo base.png"))); // NOI18N
        MainPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LauncherBase().setVisible(true);
            }
        });
    }

    
    private void SetImageLabel (JLabel labelName, String root) {
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon (image.getImage() .getScaledInstance (labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
            labelName.setIcon(icon);
            this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MainPanel;
    public javax.swing.JPanel ViewPanel;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables


}
