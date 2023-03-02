/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrameWork_JavaComp;

import JavaComp.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rubén
 */
public class OpcionesCliente extends javax.swing.JFrame {

    private TableRowSorter TRSFiltro;

    /**
     *
     */
    public static PantallaInicio principal;
    private PantallaCompra ventana2;

    /**
     * Creates new form OpcionesCliente
     *
     * @param ventana
     */
    public OpcionesCliente(PantallaInicio ventana) {
        JavaCompPersonas.cargarDatos();
        JavaCompProductos.cargarDatos();
        principal = ventana;
        principal.setVisible(false);
        initComponents();
        this.setVisible(true);
        cargarImagenes();
        String correo = PantallaInicio.FieldCorreoElectronico.getText();
        String contraseña = PantallaInicio.FieldContraseña.getText();

        Cliente usuario = JavaCompPersonas.encontrarCliente2(correo, contraseña);
        jLabel4.setText(usuario.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonCompra = new javax.swing.JButton();
        ButtonOpinar = new javax.swing.JButton();
        ButtonModificarDatos = new javax.swing.JButton();
        ButtonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ButtonCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonCompra.setText("Compra Producto");
        ButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCompraActionPerformed(evt);
            }
        });

        ButtonOpinar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonOpinar.setText("Opinar del producto");
        ButtonOpinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOpinarActionPerformed(evt);
            }
        });

        JavaCompPersonas.cargarDatos();
        ButtonModificarDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonModificarDatos.setText("Modificacion datos personales");
        ButtonModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarDatosActionPerformed(evt);
            }
        });

        ButtonVolver.setText("Salir");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Componentes", "Ordenadores", "Moviles y telefonía", "TV,audio y foto", "Consolas y videojuegos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "caracteristica", "categoria", "fecha Entrada", "calificacion", "precio", "stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);

        jLabel2.setText("Busqueda por nombre");

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });

        jLabel3.setText("Busqueda por categoría");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonModificarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(ButtonCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonOpinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(ButtonOpinar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(ButtonModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JavaCompProductos.guardarDatos();
        principal.setVisible(true);
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonOpinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOpinarActionPerformed
        // TODO add your handling code here:        
        if (OpcionesCliente.jTable.getSelectedRow() != -1) {
            OpinarProducto opinion = new OpinarProducto(this);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: ha ocurrido un error selecione el producto", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_ButtonOpinarActionPerformed

    private void ButtonModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarDatosActionPerformed
        // TODO add your handling code here:
        String correo = PantallaInicio.FieldCorreoElectronico.getText();
        String clave = PantallaInicio.FieldContraseña.getText();
        if (JavaCompPersonas.encontrarCliente(correo, clave)) {
            Cliente login = JavaCompPersonas.encontrarCliente2(correo, clave);
            if (login.getClass().getSimpleName().equals("ClienteParticular")) {
                PantallaRegistroParticular particular = new PantallaRegistroParticular(this);
            } else {
                PantallaRegistroEmpresas empresa = new PantallaRegistroEmpresas(this);
            }
        }
    }//GEN-LAST:event_ButtonModificarDatosActionPerformed

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        // TODO add your handling code here:
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                FiltroNombre();
            }
        });
        TRSFiltro = new TableRowSorter(OpcionesCliente.jTable.getModel());
        OpcionesCliente.jTable.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tablaModel = (DefaultTableModel) OpcionesCliente.jTable.getModel();
        for (int i = 0; i < jTable.getRowCount(); i++) {
            tablaModel.removeRow(i);
            i -= 1;
        }
        OpcionesCliente.jTable.setModel(new DefaultTableModel());
        JavaCompProductos.getProductos().stream().forEach((ProductoVenta producto) -> {
            try {
                if (jComboBox1.getSelectedIndex() == 0) {
                    tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + "€", producto.getStock()});
                } else if (jComboBox1.getSelectedIndex() == 1 && "Componentes".equals(producto.getCategoria())) {
                    tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + "€", producto.getStock()});
                } else if (jComboBox1.getSelectedIndex() == 2 && "Ordenadores".equals(producto.getCategoria())) {
                    tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + "€", producto.getStock()});

                } else if (jComboBox1.getSelectedIndex() == 3 && "Moviles y telefonía".equals(producto.getCategoria())) {
                    tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + "€", producto.getStock()});

                } else if (jComboBox1.getSelectedIndex() == 4 && "TV,audio y foto".equals(producto.getCategoria())) {
                    tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + "€", producto.getStock()});

                } else if (jComboBox1.getSelectedIndex() == 5 && "Consolas y videojuegos".equals(producto.getCategoria())) {
                    tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + "€", producto.getStock()});
                }
//Asociar el modelo de lista al JList
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        );
        OpcionesCliente.jTable.setModel(tablaModel);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCompraActionPerformed
        // TODO add your handling code here:
        if (OpcionesCliente.jTable.getSelectedRow() != -1) {
            CantidadProducto compra = new CantidadProducto(this);
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: ha ocurrido un error selecione el producto", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_ButtonCompraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JavaCompProductos.cargarDatos();
        datosTabla();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        JavaCompProductos.guardarDatos();
        JavaCompPersonas.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    private void datosTabla() {
        DefaultTableModel tablaModel = (DefaultTableModel) OpcionesCliente.jTable.getModel();
        JavaCompProductos.getProductos().stream().forEach((ProductoVenta producto) -> {
            try {
                tablaModel.addRow(new Object[]{producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getFechaEntrada(), producto.getOpiniones().getCalificacion(), producto.getPrecio() + " €", producto.getStock()});
//Asociar el modelo de lista al JList
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            OpcionesCliente.jTable.setModel(tablaModel);
        }
        );
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tablaModel);
        OpcionesCliente.jTable.setRowSorter(sorter);
    }

    /**
     *
     */
    public void FiltroNombre() {
        int columnaTabla = 0; //la columna del nombre
        TRSFiltro.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro.getText(), columnaTabla));
    }

    private void cargarImagenes() {
        //logo
        ImageIcon logo1 = new ImageIcon("images/logo.png");
        ImageIcon logo = new ImageIcon(logo1.getImage());

        ImageIcon usuario1 = new ImageIcon("images/usuario.png");
        ImageIcon usuario = new ImageIcon(usuario1.getImage());

        jLabel1.setIcon(logo);
        jLabel6.setIcon(usuario);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCompra;
    private javax.swing.JButton ButtonModificarDatos;
    private javax.swing.JButton ButtonOpinar;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
