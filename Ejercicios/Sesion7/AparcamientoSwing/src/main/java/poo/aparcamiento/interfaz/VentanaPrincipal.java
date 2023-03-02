/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 01-feb-2019, 12:58:33
 */
package poo.aparcamiento.interfaz;

import poo.aparcamiento.Aparcamiento;

/**
 *
 * @author alumno
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        Aparcamiento.cargarDatos();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonIntro = new javax.swing.JButton();
        jButtonSacar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aparcamiento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("APARCAMIENTO");

        jButtonIntro.setBackground(new java.awt.Color(0, 102, 255));
        jButtonIntro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonIntro.setText("INTRODUCIR VEHICULO");
        jButtonIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIntroActionPerformed(evt);
            }
        });

        jButtonSacar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSacar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSacar.setText("SACAR VEHICULO");
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonIntro)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSacar)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jButtonIntro)
                .addGap(49, 49, 49)
                .addComponent(jButtonSacar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(400, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIntroActionPerformed
        // TODO add your handling code here:
        Introducir i = new Introducir(this);
    }//GEN-LAST:event_jButtonIntroActionPerformed

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed
        // TODO add your handling code here:
        Sacar s = new Sacar(this);
    }//GEN-LAST:event_jButtonSacarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Aparcamiento.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIntro;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
