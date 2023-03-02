/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrameWork_JavaComp;

import JavaComp.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rubén
 */
public class PantallaInicio extends javax.swing.JFrame {

    /**
     *
     */
    public PantallaInicio() {
        JavaCompPersonas.cargarDatos();
        JavaCompProductos.cargarDatos();
        JavaCompVentas.cargarDatos();
        initComponents();
        cargarImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        FieldCorreoElectronico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FieldContraseña = new javax.swing.JTextField();
        ButtonRegistrar = new javax.swing.JButton();
        ButtonLogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Inicio");
        setBackground(new java.awt.Color(240, 100, 240));
        setLocation(new java.awt.Point(100, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 210, 110));
        jPanel1.add(FieldCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 202, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo Electronico");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));
        jPanel1.add(FieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 202, -1));

        JavaCompPersonas.guardarDatos();         JavaCompProductos.guardarDatos();
        ButtonRegistrar.setText("Registrar");
        ButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, -1));

        JavaCompPersonas.cargarDatos();         JavaCompProductos.cargarDatos();
        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 240, 80, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        JavaCompPersonas.guardarDatos();
        JavaCompProductos.guardarDatos();
        JavaCompVentas.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
        String correo = FieldCorreoElectronico.getText();
        String contraseña = FieldContraseña.getText();

        // Login del Admin
        if ("admin@javacomp.com".equals(correo) & "admin".equals(contraseña)) {
            OpcionesAdmin opciones = new OpcionesAdmin(this);

        }//Si no estan rellenados los campos da error 
        else if ("".equals(correo) & "".equals(contraseña)) {
            JOptionPane.showMessageDialog(this, "ERROR: Rellene los campos correctamente", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } //Login del usuario
        else if (JavaCompPersonas.encontrarCliente(correo, contraseña)) {
            OpcionesCliente cliente = new OpcionesCliente(this);
        } else {
            JOptionPane.showMessageDialog(this, " Usuario o contraseña Incorrecto", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void ButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarActionPerformed
        // TODO add your handling code here:
        SeleccionTipo St = new SeleccionTipo(this);
    }//GEN-LAST:event_ButtonRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
        //Inicializacion de variables para el frame usuario administrador
        Cliente admin = new Cliente();
        System.out.println("--- Informacion de Administrador ---");
        System.out.println("correo :\n" + admin.getCorreoElectronico());
        System.out.println("contraseña:\n" + admin.getClave());
    }

    private void cargarImagenes() {
        //logo
        ImageIcon logo1 = new ImageIcon("images/logo.png");
        ImageIcon logo = new ImageIcon(logo1.getImage());
        //fondo
        ImageIcon fondo1 = new ImageIcon("images/fondo.jpg");
        ImageIcon fondo = new ImageIcon(fondo1.getImage());

        jLabel5.setIcon(logo);
        jLabel8.setIcon(fondo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonRegistrar;
    public static javax.swing.JTextField FieldContraseña;
    public static javax.swing.JTextField FieldCorreoElectronico;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
