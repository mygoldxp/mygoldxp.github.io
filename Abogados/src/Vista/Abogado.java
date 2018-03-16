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
import UML.Abogados;

/**
 *
 * @author v6222
 */
public class Abogado extends javax.swing.JDialog {

    private int n;
    /**
     * Creates new form Abogado
     */
    public Abogado(int n, String dato) {
        initComponents();
        this.n = n;
        setTitle(dato + this.getName());
        adaptaciones(dato);
    }

    public void adaptaciones(String dato){
        setModal(true);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Abogado"); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addComponent(tDireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tApe2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(tDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tApe1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(bCancelar)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        try{
            validar(1, tDNI, "^[0-9]{8}[A-Z]$");
                        
            if(bAceptar.getText().equals("Consultar")){
                Abogados abo = Main.consultarAbogado(tDNI.getText());
                
                if(abo == null){
                    habilitarAbogado();
                    bAceptar.setText("Añadir");
                }
                else{
                    if(n == 2){
                        llenarDatos(abo);
                        bAceptar.setText("Eliminar");
                    }
                    else{
                        habilitarAbogado();
                        llenarDatos(abo);
                        bAceptar.setText("Modificar");
                    }
                    
                }
            }
            else{
                validar(2, tNombre, "^[A-Z][a-z]{2,}$");
                validar(2, tApe1, "^[A-Z][a-z]{2,}$");
                validar(2, tApe2, "^[A-Z][a-z]{2,}$");
                validar(3, tDireccion, "^[A-Z][a-z]{2,}([ a-z])*$");
                
                if(bAceptar.getText().equals("Añadir")){
                    Main.crearAbogado(tDNI.getText(), tNombre.getText(), tApe1.getText(), tApe2.getText(), tDireccion.getText());
                    JOptionPane.showMessageDialog(this, "Abogado añadido correctamente.");
                    Main.cerrar(this);
                }
                else if(bAceptar.getText().equals("Eliminar")){
                    Main.eliminarAbogado(tDNI.getText());
                    JOptionPane.showMessageDialog(this, "Abogado eliminado correctamente.");
                    Main.cerrar(this);
                }
                else{
                    Main.modificarAbogado(tDNI.getText(), tNombre.getText(), tApe1.getText(), tApe2.getText(), tDireccion.getText());
                    JOptionPane.showMessageDialog(this, "Abogado modificado correctamente.");
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
    
    private void habilitarAbogado(){
        tDNI.setEnabled(false);
        tNombre.setEnabled(true);
        tApe1.setEnabled(true);
        tApe2.setEnabled(true);
        tDireccion.setEnabled(true);
    }
    
    private void llenarDatos(Abogados abo){
        tNombre.setText(abo.getNombre());
        tApe1.setText(abo.getApe1());
        tApe2.setText(abo.getApe2());
        tDireccion.setText(abo.getDir());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lLogo;
    private javax.swing.JTextField tApe1;
    private javax.swing.JTextField tApe2;
    private javax.swing.JTextField tDNI;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}
