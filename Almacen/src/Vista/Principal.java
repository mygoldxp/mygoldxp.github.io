/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladora.Almacen;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author v6222
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Almacen
     */
    private int dto=0;
    
    public Principal() {
        initComponents();
        deshabilitar();
    }
    public void añadir(String dato){
        cbProveedor.addItem(dato);
    }
    
    public void deshabilitar(){
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        bAceptar.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contabilizar = new javax.swing.ButtonGroup();
        lTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfUnidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbCompra = new javax.swing.JRadioButton();
        rbVenta = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfPrecioCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfImporteCompra = new javax.swing.JTextField();
        cbProveedor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfPrecioVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbVolumen = new javax.swing.JCheckBox();
        cbPP = new javax.swing.JCheckBox();
        tfImporteVenta = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lTitulo.setText("ALMACÉN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Unidades");

        tfUnidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfUnidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUnidadFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre del Producto");

        tfNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNombreFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opción a Contabilizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setToolTipText("");

        Contabilizar.add(rbCompra);
        rbCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbCompra.setText("Compra");
        rbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompraActionPerformed(evt);
            }
        });

        Contabilizar.add(rbVenta);
        rbVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbVenta.setText("Venta");
        rbVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCompra)
                .addGap(98, 98, 98)
                .addComponent(rbVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCompra)
                    .addComponent(rbVenta)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Precio");

        tfPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioCompraFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Proveedor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Importe de la Compra");

        tfImporteCompra.setEditable(false);
        tfImporteCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfImporteCompra))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(cbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("jLabel2");
        tfPrecioCompra.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) { getToolkit().beep(); e.consume(); } } });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Precio");

        tfPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfPrecioVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioVentaFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Cliente");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Importe de la Venta");

        tfCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfClienteFocusLost(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descuentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(51, 102, 255))); // NOI18N

        cbVolumen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbVolumen.setText("Por Volumen");
        cbVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVolumenActionPerformed(evt);
            }
        });

        cbPP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbPP.setText("Por Pronto Pago");
        cbPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbVolumen)
                .addGap(18, 18, 18)
                .addComponent(cbPP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVolumen)
                    .addComponent(cbPP))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tfImporteVenta.setEditable(false);
        tfImporteVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCliente)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfImporteVenta)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfImporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tfPrecioVenta.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) ||
                    (c == KeyEvent.VK_BACK_SPACE) ||
                    (c == KeyEvent.VK_DELETE) ||
                    (c == KeyEvent.VK_PERIOD))) {
                getToolkit().beep();
                e.consume();
            }
        }
    });

    bAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    bAceptar.setText("Aceptar");
    bAceptar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bAceptarActionPerformed(evt);
        }
    });

    bCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    bCancelar.setText("Cancelar");
    bCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bCancelarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(bAceptar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCancelar))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lTitulo)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(73, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(47, 47, 47)
            .addComponent(lTitulo)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(tfUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bAceptar)
                .addComponent(bCancelar))
            .addContainerGap(54, Short.MAX_VALUE))
    );

    tfUnidad.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE) ||
                (c == KeyEvent.VK_PERIOD))) {
            getToolkit().beep();
            e.consume();
        }
    }
    });

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed
        // TODO add your handling code here:
        if(cbProveedor.getSelectedItem().equals("Seleccionar")){
            bAceptar.setVisible(false);
        }
        else{
            bAceptar.setVisible(true);
        }
        
    }//GEN-LAST:event_cbProveedorActionPerformed

    private void tfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreFocusLost
        // TODO add your handling code here:
        if(Almacen.buscarP(tfNombre.getText())){
            tfUnidad.setText(String.valueOf(Almacen.buscarUni()));
            tfPrecioCompra.setText(String.valueOf(Almacen.buscarPre()));
            tfNombre.setBackground(Color.white);
            tfPrecioVenta.setText(Almacen.precioVenta(tfPrecioCompra.getText()));
            cbProveedor.setSelectedItem(Almacen.proveedor());
            jPanel1.setVisible(true);
        }
        else{
            deshabilitar();
            tfNombre.requestFocus();
            tfNombre.setText("EL PRODUCTO NO EXISTE");
            tfNombre.setBackground(Color.red);
            tfNombre.selectAll();
            
        }
    }//GEN-LAST:event_tfNombreFocusLost

    private void rbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompraActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        cbProveedor.requestFocus();
        bAceptar.setVisible(false);
    }//GEN-LAST:event_rbCompraActionPerformed

    private void rbVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVentaActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);
        tfCliente.requestFocus();
        bAceptar.setVisible(false);
        cbProveedor.setSelectedIndex(0);
    }//GEN-LAST:event_rbVentaActionPerformed

    private void tfUnidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUnidadFocusLost
        // TODO add your handling code here:
        if(tfUnidad.getText().isEmpty() || tfUnidad.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "La cantidad no puede estar vacío o con valor 0.");
            tfUnidad.setText("0");
            tfUnidad.requestFocus();
        }
        
    }//GEN-LAST:event_tfUnidadFocusLost

    private void tfPrecioCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioCompraFocusLost
        // TODO add your handling code here:
        try{
            if(tfPrecioCompra.getText().isEmpty() || tfPrecioCompra.getText().equals("0")){
                JOptionPane.showMessageDialog(this, "Precio no puede estar vacío o con valor 0.");
                tfPrecioCompra.setText("0");
                tfPrecioCompra.requestFocus();
            }
            else{
                tfImporteCompra.setText(Almacen.importe(tfUnidad.getText() , tfPrecioCompra.getText(), 0)); 
            }
        }
        catch(NumberFormatException e){}
            
        
    }//GEN-LAST:event_tfPrecioCompraFocusLost

    private void tfPrecioVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioVentaFocusLost
        // TODO add your handling code here:
        try{
            if(tfPrecioVenta.getText().isEmpty() || tfPrecioVenta.getText().equals("0")){
                JOptionPane.showMessageDialog(this, "Precio no puede estar vacío o con valor 0.");
                tfPrecioVenta.setText("0");
                tfPrecioVenta.requestFocus();
            }else{
                tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
            }
        }
        catch(NumberFormatException e){}
            
        
    }//GEN-LAST:event_tfPrecioVentaFocusLost

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        if(rbCompra.isSelected()){
            tfImporteCompra.setText(Almacen.importe(tfUnidad.getText() , tfPrecioCompra.getText(), 0));
            JOptionPane.showMessageDialog(this, "Total a pagar " + tfImporteCompra.getText() + "€");
        }
        else{
            tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
            JOptionPane.showMessageDialog(this, "Total a pagar " + tfImporteVenta.getText() + "€");
        }
        
        if(tfNombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "No has introducido ningún producto.\nNo se ha grabado nada.");
        }
        else{
            if(rbCompra.isSelected()){
                Almacen.comprar(tfUnidad.getText(),tfPrecioCompra.getText(), cbProveedor.getSelectedItem().toString());
            }
            else{
                Almacen.vender(tfUnidad.getText());
            }
            Almacen.aceptado(this);
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void tfClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfClienteFocusLost
        // TODO add your handling code here:
        if(tfCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Escriba un cliente.");
            tfCliente.grabFocus();
            bAceptar.setVisible(false);
        }
        else{
            bAceptar.setVisible(true);
            tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
        }
    }//GEN-LAST:event_tfClienteFocusLost

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        Almacen.cerrar();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void cbPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPPActionPerformed
        // TODO add your handling code here:
        //3% dto
        if(cbPP.isSelected()){
            dto += 3;
            tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
        }
        else{
            dto -= 3;
            tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
        }
    }//GEN-LAST:event_cbPPActionPerformed

    private void cbVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVolumenActionPerformed
        // TODO add your handling code here:
        // 2%dto
        if(cbVolumen.isSelected()){
            dto += 2;
            tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
        }
        else{
            dto -= 2;
            tfImporteVenta.setText(Almacen.importe(tfUnidad.getText(), tfPrecioVenta.getText(), dto));
        }
    }//GEN-LAST:event_cbVolumenActionPerformed

    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Contabilizar;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JCheckBox cbPP;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JCheckBox cbVolumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JRadioButton rbCompra;
    private javax.swing.JRadioButton rbVenta;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfImporteCompra;
    private javax.swing.JTextField tfImporteVenta;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecioCompra;
    private javax.swing.JTextField tfPrecioVenta;
    private javax.swing.JTextField tfUnidad;
    // End of variables declaration//GEN-END:variables
}
