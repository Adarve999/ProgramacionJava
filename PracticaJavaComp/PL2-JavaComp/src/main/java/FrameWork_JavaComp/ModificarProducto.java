/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrameWork_JavaComp;

import JavaComp.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rubén
 */
public class ModificarProducto extends javax.swing.JFrame {

    private ProductoVenta ve = null;
    private ConsultaProductos principal;

    /**
     * Creates new form ModificarProducto
     * @param ventana
     */
    public ModificarProducto(ConsultaProductos ventana) {
        JavaCompProductos.cargarDatos();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
        initComponents();
        cargarImagenes();
        int fila = ConsultaProductos.jTable.getSelectedRow();
        String Titulo = ConsultaProductos.jTable.getValueAt(fila, 0).toString();

        ve = JavaCompProductos.getProductosTitulo(Titulo);

        //obtenemos sus datos
        String nombre = ve.getTitulo();
        String caracteristicas = ve.getCaracteristicas();
        String categoria = ve.getCategoria();
        double precio = ve.getPrecio();
        int stock = ve.getStock();
        String fechaEntrada = ve.getFechaEntrada();
        //obtener la informacion de la opinion
        String comentario = ve.getOpiniones().getComentario();
        int calificacion = ve.getOpiniones().getCalificacion();
        //pasar a string la fecha
        LocalDate fechaRealizacion = ve.getOpiniones().getFechaRealizacion();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = fechaRealizacion.format(formatter);

        //ponermos la informacion del objeto seleccionado
        FieldTitulo.setText(nombre);
        FieldCaracteristicas.setText(caracteristicas);
        FieldPrecio.setText(Double.toString(precio));
        FieldStock.setText(Integer.toString(stock));
        FieldFechaEntrada.setText(fechaEntrada);
        AreaComentario.setText(comentario);
        FieldFechaRealizada.setText(formattedString);

        switch (calificacion) {
            case 1 ->
                jComboBox2.setSelectedIndex(0);
            case 2 ->
                jComboBox2.setSelectedIndex(1);
            case 3 ->
                jComboBox2.setSelectedIndex(2);
            case 4 ->
                jComboBox2.setSelectedIndex(3);
            case 5 ->
                jComboBox2.setSelectedIndex(4);
            default -> {
            }
        }
        if (null != categoria) {
            switch (categoria) {
                case "Componentes" ->
                    jComboBox1.setSelectedIndex(0);
                case "Ordenadores" ->
                    jComboBox1.setSelectedIndex(1);
                case "Moviles y telefonía" ->
                    jComboBox1.setSelectedIndex(2);
                case "TV,audio y foto" ->
                    jComboBox1.setSelectedIndex(3);
                case "Consolas y videojuegos" ->
                    jComboBox1.setSelectedIndex(4);
                default -> {
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        FieldPrecio = new javax.swing.JTextField();
        FieldStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ButtonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FieldTitulo = new javax.swing.JTextField();
        FieldFechaEntrada = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        FieldCaracteristicas = new javax.swing.JTextField();
        LabelCategoria = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaComentario = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ButtonVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FieldFechaRealizada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel3.setText("Precio ");

        jLabel4.setText("Stock");

        ButtonGuardar.setText("Guardar Informacion");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Título");

        jLabel5.setText("Fecha de entrada");

        label.setText("caracteristicas");

        LabelCategoria.setText("Categoría");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Componentes", "Ordenadores", "Moviles y telefonía", "TV,audio y foto", "Consolas y videojuegos" }));

        AreaComentario.setColumns(20);
        AreaComentario.setRows(5);
        jScrollPane1.setViewportView(AreaComentario);

        jLabel6.setText("Comentario");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel7.setText("Calificación");

        ButtonVolver.setText("Volver");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha opinion realizada");

        FieldFechaRealizada.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 444, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(FieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(62, 62, 62))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FieldStock)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldFechaRealizada)
                                    .addComponent(FieldFechaEntrada)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(FieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label)
                                    .addComponent(FieldCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCategoria)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label)
                    .addComponent(LabelCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FieldFechaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(ButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        // TODO add your handling code here:
        String nombre = FieldTitulo.getText();
        String caracteristicas = FieldCaracteristicas.getText();
        String Categoria = "";
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                Categoria = "Componentes";
                break;
            case 1:
                Categoria = "Ordenadores";
                break;
            case 2:
                Categoria = "Moviles y telefonía";
                break;
            case 3:
                Categoria = "TV,audio y foto";
                break;
            case 4:
                Categoria = "Consolas y videojuegos";
                break;
            default:
                break;
        }
        String precio = FieldPrecio.getText();
        String stock = FieldStock.getText();
        String fechaEntrada = FieldFechaEntrada.getText();
        String comentario = AreaComentario.getText();
        String Calificacion = "";
        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                Calificacion = "1";
                break;
            case 1:
                Calificacion = "2";
                break;
            case 2:
                Calificacion = "3";
                break;
            case 3:
                Calificacion = "4";
                break;
            case 4:
                Calificacion = "5";
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(this, "producto modificado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        JavaCompProductos.guardarProductoModificado(ve, nombre, caracteristicas, Categoria, Double.parseDouble(precio), Integer.parseInt(stock), fechaEntrada, comentario, Integer.parseInt(Calificacion));
        JavaCompProductos.guardarDatos();
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void cargarImagenes() {
        //logo
        ImageIcon logo1 = new ImageIcon("images/logo.png");
        ImageIcon logo = new ImageIcon(logo1.getImage());

        jLabel2.setIcon(logo);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea AreaComentario;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JButton ButtonVolver;
    public static javax.swing.JTextField FieldCaracteristicas;
    public static javax.swing.JTextField FieldFechaEntrada;
    public static javax.swing.JTextField FieldFechaRealizada;
    public static javax.swing.JTextField FieldPrecio;
    public static javax.swing.JTextField FieldStock;
    public static javax.swing.JTextField FieldTitulo;
    private javax.swing.JLabel LabelCategoria;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
