/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;

/**
 *
 * @author mario
 */
public class GameView extends javax.swing.JPanel {

    /**
     * Creates new form GameView
     */
    public GameView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        filled = new javax.swing.JLabel();
        empty = new javax.swing.JLabel();
        empty1 = new javax.swing.JLabel();
        empty2 = new javax.swing.JLabel();
        empty3 = new javax.swing.JLabel();
        flechader = new javax.swing.JLabel();
        flechaizq = new javax.swing.JLabel();
        barrita = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        cuerpo = new javax.swing.JLabel();
        btn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 38, 72));

        MainPanel.setBackground(new java.awt.Color(10, 38, 72));
        MainPanel.setMaximumSize(new java.awt.Dimension(1540, 880));
        MainPanel.setMinimumSize(new java.awt.Dimension(1540, 880));
        MainPanel.setPreferredSize(new java.awt.Dimension(1540, 880));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Embarque0.png"))); // NOI18N
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 690, 460));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cuadrado fondo enfocado.png"))); // NOI18N
        MainPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 72, 765, 421));

        filled.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PuntoCarruselFilled.png"))); // NOI18N
        MainPanel.add(filled, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, 19));

        empty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PuntoCarruselEmpty.png"))); // NOI18N
        MainPanel.add(empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, 19));

        empty1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PuntoCarruselEmpty.png"))); // NOI18N
        MainPanel.add(empty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, 19));

        empty2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PuntoCarruselEmpty.png"))); // NOI18N
        MainPanel.add(empty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, -1, 19));

        empty3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PuntoCarruselEmpty.png"))); // NOI18N
        MainPanel.add(empty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, 19));

        flechader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Flecha derecha.png"))); // NOI18N
        MainPanel.add(flechader, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 269, -1, -1));

        flechaizq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Flecha izquierda.png"))); // NOI18N
        MainPanel.add(flechaizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 271, -1, -1));

        barrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Barrita aislada descripción.png"))); // NOI18N
        MainPanel.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 583, -1, -1));

        titulo.setFont(new java.awt.Font("Raleway Black", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Embarque y desembarque en helicoptero");
        MainPanel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 587, -1, -1));

        cuerpo.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        cuerpo.setForeground(new java.awt.Color(255, 255, 255));
        cuerpo.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        MainPanel.add(cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 629, -1, -1));

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Comenzar.png"))); // NOI18N
        MainPanel.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1254, 805, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel barrita;
    private javax.swing.JLabel btn;
    private javax.swing.JLabel cuerpo;
    private javax.swing.JLabel empty;
    private javax.swing.JLabel empty1;
    private javax.swing.JLabel empty2;
    private javax.swing.JLabel empty3;
    private javax.swing.JLabel filled;
    private javax.swing.JLabel flechader;
    private javax.swing.JLabel flechaizq;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
