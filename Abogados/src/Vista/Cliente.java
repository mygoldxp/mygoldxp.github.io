/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladora.Main;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Errores.Error;
import UML.Clientes;

/**
 *
 * @author v6222
 */
public class Cliente extends javax.swing.JDialog {

    private int n;
    private Clientes clie;
    /**
     * Creates new form Abogado
     */
    public Cliente(int n, String dato) {
        initComponents();
        this.n = n;
        setTitle(dato + this.getTitle());
        adaptaciones();
    }

    public void adaptaciones(){
        setModal(true);
        clie = null;
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        tApe1 = new javax.swing.JTextField();
        tApe2 = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lLogo = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Cliente");
        setName("Cliente"); // NOI18N

        jLabel1.setText("DNI:");

        tNombre.setEnabled(false);

        tApe1.setEnabled(false);

        tApe2.setEnabled(false);

        tDireccion.setEnabled(false);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido 1:");

        jLabel4.setText("Apellido 2:");

        jLabel5.setText("Dirección:");

        lLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bAceptar.setText("Consultar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        tTelefono.setEnabled(false);

        jLabel6.setText("Teléfono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tTelefono)
                                    .addComponent(tDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tApe2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(lLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        try{
            validar(1, tDNI, "^[0-9]{8}[A-Z]$");
                        
            if(bAceptar.getText().equals("Consultar")){
                clie = null;
                clie = Main.consultarCliente(tDNI.getText());
                
                if(clie == null & n == 1){
                    habilitarCliente();
                    bAceptar.setText("Añadir");
                }
                else{
                    if(n == 2){
                        if(clie == null){
                            throw new Error(6);
                        }
                        else{
                            llenarDatos(clie);
                            tDNI.setEnabled(false);
                            bAceptar.setText("Eliminar");
                        }
                        
                    }
                    else{
                        habilitarCliente();
                        llenarDatos(clie);
                        bAceptar.setText("Modificar");
                    }
                    
                }
            }
            else{
                validar(2, tNombre, "^[A-Z][a-z]{2,}$");
                validar(2, tApe1, "^[A-Z][a-z]{1,}$");
                validar(2, tApe2, "^[A-Z][a-z]{1,}$");
                validar(3, tDireccion, "^[A-Z][a-z]{2,}([ a-z])*$");
                validar(4, tTelefono, "^[6-9][0-9]{8}$");
                
                if(bAceptar.getText().equals("Añadir")){
                    Main.crearCliente(tDNI.getText(), tNombre.getText(), tApe1.getText(), tApe2.getText(), tDireccion.getText(), tTelefono.getText());
                    JOptionPane.showMessageDialog(this, "Cliente añadido correctamente.");
                    Main.cerrar(this);
                }
                else if(bAceptar.getText().equals("Eliminar")){
                    Main.eliminarCliente(tDNI.getText());
                    JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
                    Main.cerrar(this);
                }
                else{
                    clie.setDni(tDNI.getText());
                    clie.setNombre(tNombre.getText());
                    clie.setApe1(tApe1.getText());
                    clie.setApe2(tApe2.getText());
                    clie.setDir(tDireccion.getText());
                    clie.setTel(tTelefono.getText());
                    Main.setClie(clie);
                    Main.modificarCliente();
                    JOptionPane.showMessageDialog(this, "Cliente modificado correctamente.");
                    Main.cerrar(this);
                }
                
            }
            
            
        }
        catch(Error e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(this, ee.getClass());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        Main.cerrar(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void validar(int error, JTextField dato, String patron) throws Exception{
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(dato.getText());
        if(m.matches()){
            dato.setBackground(Color.white);
        }
        else{
            dato.setBackground(Color.red);
            dato.grabFocus();
            throw new Error(error);
        }
    }
    
    private void habilitarCliente(){
        tDNI.setEnabled(false);
        tNombre.setEnabled(true);
        tApe1.setEnabled(true);
        tApe2.setEnabled(true);
        tDireccion.setEnabled(true);
        tTelefono.setEnabled(true);
    }
    
    private void llenarDatos(Clientes clie){
        tNombre.setText(clie.getNombre());
        tApe1.setText(clie.getApe1());
        tApe2.setText(clie.getApe2());
        tDireccion.setText(clie.getDir());
        tTelefono.setText(clie.getTel());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lLogo;
    private javax.swing.JTextField tApe1;
    private javax.swing.JTextField tApe2;
    private javax.swing.JTextField tDNI;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
