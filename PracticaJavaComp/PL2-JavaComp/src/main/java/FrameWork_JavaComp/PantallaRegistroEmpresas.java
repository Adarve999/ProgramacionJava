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
public class PantallaRegistroEmpresas extends javax.swing.JFrame {

    private SeleccionTipo ventana2;
    private OpcionesCliente ventana3;
    private ConsultaUsuarios ventana4;
    private Cliente cliente = null;

    /**
     * Creates new form PantallaRegistroEmpresas2
     *
     * @param ventana
     */
    public PantallaRegistroEmpresas(SeleccionTipo ventana) {
        ventana2 = ventana;
        ventana2.setVisible(false);
        initComponents();
        this.setVisible(true);
        cargarImagenes();
    }

    /**
     *
     * @param ventana
     */
    public PantallaRegistroEmpresas(ConsultaUsuarios ventana) {
        ventana4 = ventana;
        ventana4.setVisible(false);
        initComponents();
        this.setVisible(true);
        FieldCorreo.setEditable(false);
        cargarImagenes();
        int fila = ConsultaUsuarios.jTable1.getSelectedRow();
        String Titulo = ConsultaUsuarios.jTable1.getValueAt(fila, 1).toString();
        cliente = JavaCompPersonas.getPersonasTitulo(Titulo);
        //empezamos a poner los datos del usuario en cuestion
        String nombre = cliente.getNombre();
        String correo = cliente.getCorreoElectronico();
        String clave = cliente.getClave();
        String telefono = cliente.getTelefono();
        //obtenemos la informacion de la tarjeta que es otra clase
        String NombreTitular = cliente.getTarjetaCredito().getNombreTitular();
        String fechaCaducidad = cliente.getTarjetaCredito().getFechaCaducidad();
        String numeroTarjetaTitular = cliente.getTarjetaCredito().getnumeroTarjetaTitular();
        //Obtenemos los datos de la dirrecion que es otro clase como tarjeta de credito
        String calle = cliente.getDireccion().getCalle();
        String numero = cliente.getDireccion().getNumero();
        String codigoPostal = cliente.getDireccion().getCodigoPostal();
        String ciudad = cliente.getDireccion().getCiudad();
        //obtenemos los datos de la clase hija
        ClienteEmpresas alu = (ClienteEmpresas) cliente;
        String cif = alu.getCIF();
        String web = alu.getWeb();

        FieldWeb.setText(web);
        FieldCif.setText(cif);
        FieldNombre.setText(nombre);
        FieldCorreo.setText(correo);
        FieldClave.setText(clave);
        FieldTelefono.setText(telefono);
        FieldNombreTitular.setText(NombreTitular);
        FieldFechaCaducidad.setText(fechaCaducidad);
        FieldNumeroTarjeta.setText(numeroTarjetaTitular);
        FieldCalle.setText(calle);
        FieldNumero.setText(numero);
        FieldCodigoPostal.setText(codigoPostal);
        FieldCiudad.setText(ciudad);
    }

    /**
     *
     * @param ventana
     */
    public PantallaRegistroEmpresas(OpcionesCliente ventana) {
        JavaCompPersonas.cargarDatos();
        ventana3 = ventana;
        ventana3.setVisible(false);
        initComponents();
        this.setVisible(true);
        cargarImagenes();
        cliente = JavaCompPersonas.encontrarCliente2(PantallaInicio.FieldCorreoElectronico.getText(), PantallaInicio.FieldContraseña.getText());

        String nombre = cliente.getNombre();
        String correo = cliente.getCorreoElectronico();
        String clave = cliente.getClave();
        String telefono = cliente.getTelefono();
        //obtenemos la informacion de la tarjeta que es otra clase
        String NombreTitular = cliente.getTarjetaCredito().getNombreTitular();
        String fechaCaducidad = cliente.getTarjetaCredito().getFechaCaducidad();
        String numeroTarjetaTitular = cliente.getTarjetaCredito().getnumeroTarjetaTitular();
        //Obtenemos los datos de la dirrecion que es otro clase como tarjeta de credito
        String calle = cliente.getDireccion().getCalle();
        String numero = cliente.getDireccion().getNumero();
        String codigoPostal = cliente.getDireccion().getCodigoPostal();
        String ciudad = cliente.getDireccion().getCiudad();
        //obtenemos los datos de la clase hija
        ClienteEmpresas alu = (ClienteEmpresas) cliente;
        String cif = alu.getCIF();
        String web = alu.getWeb();

        FieldWeb.setText(web);
        FieldCif.setText(cif);
        FieldNombre.setText(nombre);
        FieldCorreo.setText(correo);
        FieldClave.setText(clave);
        FieldTelefono.setText(telefono);
        FieldNombreTitular.setText(NombreTitular);
        FieldFechaCaducidad.setText(fechaCaducidad);
        FieldNumeroTarjeta.setText(numeroTarjetaTitular);
        FieldCalle.setText(calle);
        FieldNumero.setText(numero);
        FieldCodigoPostal.setText(codigoPostal);
        FieldCiudad.setText(ciudad);
        FieldCorreo.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FieldNombreTitular = new javax.swing.JTextField();
        FieldNumeroTarjeta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldFechaCaducidad = new javax.swing.JTextField();
        FieldCif = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        FieldTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FieldWeb = new javax.swing.JTextField();
        FieldCorreo = new javax.swing.JTextField();
        ButtonVolver = new javax.swing.JButton();
        FieldClave = new javax.swing.JTextField();
        ButtonRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FieldCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FieldNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FieldCodigoPostal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FieldCiudad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("pantalla Empresas");
        setLocation(new java.awt.Point(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel14.setText("Télefono");

        jLabel3.setText("Correo");

        jLabel15.setText("Web");

        jLabel4.setText("Clave");

        ButtonVolver.setText("Volver");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        ButtonRegistrar.setText("Registrar");
        ButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Dirección");

        jLabel6.setText("Calle");

        jLabel7.setText("Número");

        jLabel8.setText("Código Postal");

        jLabel9.setText("Ciudad");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("Tarjeta de Crédito");

        jLabel11.setText("nombre titular");

        jLabel12.setText("Número de tarjeta");

        jLabel13.setText("Fecha Caducidad");

        jLabel1.setText("CIF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(FieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldNombreTitular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(FieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addComponent(FieldCorreo)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FieldCif, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(ButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(FieldWeb)
                                        .addComponent(FieldTelefono)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(FieldNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(FieldFechaCaducidad)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel16))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(61, 61, 61))
                                        .addComponent(FieldCiudad)))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        String correo = PantallaInicio.FieldCorreoElectronico.getText();
        String contraseña = PantallaInicio.FieldContraseña.getText();
        JavaCompPersonas.cargarDatos();
        this.setVisible(false);
        if ("admin@javacomp.com".equals(correo) & "admin".equals(contraseña)) {
            ventana4.setVisible(true);
        } else if (!"".equals(FieldNombre.getText()) && !"".equals(FieldCorreo.getText())) {
            ventana3.setVisible(true);
        } else {
            ventana2.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        // TODO add your handling code here:
        String correo = PantallaInicio.FieldCorreoElectronico.getText();
        String contraseña = PantallaInicio.FieldContraseña.getText();
        JavaCompPersonas.cargarDatos();
        this.setVisible(false);
        if ("admin@javacomp.com".equals(correo) & "admin".equals(contraseña)) {
            ventana4.setVisible(true);
        } else if (!"".equals(FieldNombre.getText()) && !"".equals(FieldCorreo.getText())) {
            ventana3.setVisible(true);
        } else {
            ventana2.setVisible(true);
        }
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            String correo = PantallaInicio.FieldCorreoElectronico.getText();
            String contraseña = PantallaInicio.FieldContraseña.getText();

            String CIF = FieldCif.getText();
            String web = FieldWeb.getText();
            String nombre = FieldNombre.getText();
            String clave = FieldClave.getText();
            String correoElectronico = FieldCorreo.getText();
            String telefono = FieldTelefono.getText();

            //Objeto de direccion
            String calle = FieldCalle.getText();
            String numero = FieldNumero.getText();
            String codigoPostal = FieldCodigoPostal.getText();
            String ciudad = FieldCiudad.getText();
            //creacion del objeto direccion
            Direccion direccion = new Direccion(calle, numero, codigoPostal, ciudad);

            //Objeto de tarjeta de credito
            String nombreTitular = FieldNombreTitular.getText();
            String numeroTarjetaTitular = FieldNumeroTarjeta.getText();
            String fechaCaducidad = FieldFechaCaducidad.getText();

            //creacion del objeto tarjeta credito
            TarjetaCredito tarjetaCredito = new TarjetaCredito(nombreTitular, numeroTarjetaTitular, fechaCaducidad);

            //creacion del objeto cliente empresa
            ClienteEmpresas clienteNuevo = new ClienteEmpresas(CIF, web, nombre, clave, correoElectronico, direccion, tarjetaCredito, telefono);

            //evaluacion del objeto para darlo de alta
            //si hay un campo en blanco da un mensaje de error por pantalla
            if ("".equals(CIF) || "".equals(web) || "".equals(nombre) || "".equals(correoElectronico) || "".equals(clave) || "".equals(telefono) || "".equals(calle) || "".equals(numero) || "".equals(codigoPostal) || "".equals(ciudad) || "".equals(nombreTitular) || "".equals(numeroTarjetaTitular) || "".equals(fechaCaducidad)) {
                JOptionPane.showMessageDialog(this, "ERROR: Rellene todos los campos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } //evaluacion para saber si esta o no está creado el usuario
            else if (JavaCompPersonas.altaPersona(clienteNuevo)) {
                JOptionPane.showMessageDialog(this, "Persona registrada correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                ventana2.setVisible(true);
            } else {
                if ("admin@javacomp.com".equals(correo) & "admin".equals(contraseña)) {
                    JavaCompPersonas.modificaPersonaEmpresa(cliente, nombre, clave, correoElectronico, calle, numero, codigoPostal, ciudad, nombreTitular, numeroTarjetaTitular, fechaCaducidad, telefono, CIF, web);
                    JOptionPane.showMessageDialog(this, "Persona Modificada correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    ventana4.setVisible(true);
                } else {
                    JavaCompPersonas.modificaPersonaEmpresa(cliente, nombre, clave, correoElectronico, calle, numero, codigoPostal, ciudad, nombreTitular, numeroTarjetaTitular, fechaCaducidad, telefono, CIF, web);
                    JOptionPane.showMessageDialog(this, "Persona Modificada correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    ventana3.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrarse.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
        }

    }//GEN-LAST:event_ButtonRegistrarActionPerformed
    private void cargarImagenes() {
        //logo
        ImageIcon logo1 = new ImageIcon("images/logo.png");
        ImageIcon logo = new ImageIcon(logo1.getImage());

        jLabel16.setIcon(logo);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegistrar;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JTextField FieldCalle;
    private javax.swing.JTextField FieldCif;
    private javax.swing.JTextField FieldCiudad;
    private javax.swing.JTextField FieldClave;
    private javax.swing.JTextField FieldCodigoPostal;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldFechaCaducidad;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldNombreTitular;
    private javax.swing.JTextField FieldNumero;
    private javax.swing.JTextField FieldNumeroTarjeta;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JTextField FieldWeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
