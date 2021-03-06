/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Errores.Error;
import Controladora.Main;
import UML.Empleado;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author v6222
 */
public class dEmpleado extends javax.swing.JDialog {

    JFileChooser buscador;
    String foto="";
    /**
     * Creates new form dEmpleado
     * @param titulo
     */
    public dEmpleado(String titulo) {
        super();
        initComponents();
        adaptaciones(titulo);
    }

    private void adaptaciones(String titulo) {
        setTitle(titulo);
        setModal(true);
        setSize(883, 597);
        setLocationRelativeTo(null);
        jLabel11.setVisible(false);
        cFecha.setVisible(false);
        Main.jCombos(cDepartamento, cContrato);
        cDepartamento.setSelectedIndex(-1);
        cContrato.setSelectedIndex(-1);
        lFechae.setVisible(false);
        cFechae.setVisible(false);
        show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gSexo = new javax.swing.ButtonGroup();
        gCivil = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tDNI = new javax.swing.JTextField();
        tNSS = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        rHombre = new javax.swing.JRadioButton();
        rMujer = new javax.swing.JRadioButton();
        rCasado = new javax.swing.JRadioButton();
        rSoltero = new javax.swing.JRadioButton();
        cContrato = new javax.swing.JComboBox<>();
        cDepartamento = new javax.swing.JComboBox<>();
        cFecha = new org.freixas.jcalendar.JCalendarCombo();
        tEmpleado = new javax.swing.JTextField();
        lFoto = new javax.swing.JLabel();
        bFoto = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        bLocalizarDNI = new javax.swing.JButton();
        bLocalizarEmpleado = new javax.swing.JButton();
        lFechae = new javax.swing.JLabel();
        cFechae = new org.freixas.jcalendar.JCalendarCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel3.setText("NSS");

        jLabel4.setText("Nombre y Apellidos");

        jLabel5.setText("Dirección");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Sexo");

        jLabel8.setText("Estado Civil");

        jLabel9.setText("Tipo de Contrato");

        jLabel10.setText("Departamento");

        jLabel11.setText("Fecha Fin");

        jLabel12.setText("Numero de Empleado");

        gSexo.add(rHombre);
        rHombre.setSelected(true);
        rHombre.setText("Hombre");

        gSexo.add(rMujer);
        rMujer.setText("Mujer");

        gCivil.add(rCasado);
        rCasado.setText("Casado");

        gCivil.add(rSoltero);
        rSoltero.setSelected(true);
        rSoltero.setText("Soltero");

        cContrato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cContratoItemStateChanged(evt);
            }
        });

        lFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 153)));

        bFoto.setText("Añadir/Cambiar Foto");
        bFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFotoActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bLocalizarDNI.setText("Localizar");
        bLocalizarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLocalizarDNIActionPerformed(evt);
            }
        });

        bLocalizarEmpleado.setText("Localizar");
        bLocalizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLocalizarEmpleadoActionPerformed(evt);
            }
        });

        lFechae.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lFechae.setText("Fecha Alta");

        cFechae.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tDNI)
                            .addComponent(tNSS)
                            .addComponent(tDireccion)
                            .addComponent(tTelefono)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rHombre)
                                    .addComponent(rSoltero))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rCasado)
                                    .addComponent(rMujer))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(cContrato, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bAceptar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bLocalizarEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(bLocalizarDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lFechae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cFechae, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLocalizarDNI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(lFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rMujer)
                    .addComponent(rHombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rCasado)
                    .addComponent(rSoltero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFoto)
                    .addComponent(cDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lFechae))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLocalizarEmpleado))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        Main.cerrar(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        switch (getTitle()) {
            case "Alta del Empleado":
                Main.asignarEmpleado(tEmpleado);
                tEmpleado.setEditable(false);
                bLocalizarDNI.setVisible(false);
                bLocalizarEmpleado.setVisible(false);
                break;
            case "Baja del Empleado":
                tEmpleado.setEditable(true);
                tDNI.setEditable(true);
                tNSS.setEditable(false);
                tNombre.setEditable(false);
                tDireccion.setEditable(false);
                tTelefono.setEditable(false);
                rHombre.setEnabled(false);
                rMujer.setEnabled(false);
                rCasado.setEnabled(false);
                rSoltero.setEnabled(false);
                cContrato.setEditable(false);
                cDepartamento.setEditable(false);
                cFecha.setEditable(false);
                bFoto.setEnabled(false);
                bLocalizarDNI.setVisible(true);
                bLocalizarEmpleado.setVisible(true);
                break;
            default:
                tEmpleado.setEditable(true);
                tDNI.setEditable(true);
                tNSS.setEditable(false);
                tNombre.setEditable(false);
                tDireccion.setEditable(false);
                tTelefono.setEditable(false);
                rHombre.setEnabled(false);
                rMujer.setEnabled(false);
                rCasado.setEnabled(false);
                rSoltero.setEnabled(false);
                cContrato.setEditable(false);
                cDepartamento.setEditable(false);
                cFecha.setEditable(false);
                bFoto.setEnabled(false);
                bLocalizarDNI.setVisible(true);
                bLocalizarEmpleado.setVisible(true);
                break;
        }
    }//GEN-LAST:event_formWindowOpened

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        if (this.getTitle().equals("Alta del Empleado")) {
                altaMod();
        }
        else{
            try{
                if(tNombre.getText().isEmpty()){
                    throw new Error(10);
                }
                else{
                    if (this.getTitle().equals("Baja del Empleado")){
                        if(Main.eliminar(tDNI.getText())){
                            Main.reabrir(1, this.getTitle(), this);
                        }
                        else
                        {
                            throw new Error(10);
                        }
                    }
                    else{
                        altaMod();
                    }
                }
            }
            catch(Error e){
                JOptionPane.showMessageDialog(this, "No se puede borrar porque: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void cContratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cContratoItemStateChanged
        // TODO add your handling code here:
        if (cContrato.getSelectedIndex() == -1) {

        } else {
            if (cContrato.getSelectedItem().equals("Temporal")) {
                jLabel11.setVisible(true);
                cFecha.setVisible(true);
            } else {
                jLabel11.setVisible(false);
                cFecha.setVisible(false);
            }
        }
    }//GEN-LAST:event_cContratoItemStateChanged

    private void bLocalizarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLocalizarDNIActionPerformed
        // TODO add your handling code here:
        localizar(Main.localizar(tDNI.getText()));
    }//GEN-LAST:event_bLocalizarDNIActionPerformed

    private void localizar(Empleado empleado){
        if(empleado != null){
            tEmpleado.setEditable(false);
            tDNI.setText(empleado.getDni());
            tNSS.setText(empleado.getNss());
            tNombre.setText(empleado.getNombre());
            tTelefono.setText(empleado.getTelefono());
            tDireccion.setText(empleado.getDireccion());
            if(empleado.isSexo()){
                rHombre.setSelected(true);
            }else{
                rMujer.setSelected(true);
            }
            if(empleado.isCivil()){
                rCasado.setSelected(true);
            }else{
                rSoltero.setSelected(true);
            }
            for(int x=0; x<cDepartamento.getItemCount() ;x++){
                if(cDepartamento.getItemAt(x).equals(empleado.getDepartamento().getNombre())){
                    cDepartamento.setSelectedIndex(x);
                    x=cDepartamento.getItemCount();
                }
            }
            for(int x=0; x<cContrato.getItemCount() ;x++){
                if(cContrato.getItemAt(x).equals(empleado.getContrato().getContrato())){
                    cContrato.setSelectedIndex(x);
                    x=cContrato.getItemCount();
                }
            }
            cFecha.setDate(empleado.getFechas());
            if(cFecha.isNullAllowed()){
                org.freixas.jcalendar.JCalendarCombo calendario = new org.freixas.jcalendar.JCalendarCombo();
                cFecha.setDate(calendario.getDate());
            }
            lFechae.setVisible(true);
            cFechae.setVisible(true);
            cFechae.setDate(empleado.getFechae());
            tEmpleado.setText(String.valueOf(empleado.getCod()));
            ImageIcon imagen = new ImageIcon("src/FotosEmpleados/" + tEmpleado.getText() + ".jpg");
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lFoto.getWidth(), lFoto.getHeight(), Image.SCALE_DEFAULT));
            lFoto.setIcon(icono);
            lFoto.repaint();
            bLocalizarDNI.setVisible(false);
            bLocalizarEmpleado.setVisible(false);
            tEmpleado.setEditable(false);
            tDNI.setEditable(false);
            tNSS.setEditable(true);
            tNombre.setEditable(true);
            tDireccion.setEditable(true);
            tTelefono.setEditable(true);
            rHombre.setEnabled(true);
            rMujer.setEnabled(true);
            rCasado.setEnabled(true);
            rSoltero.setEnabled(true);
            cFecha.setEditable(true);
            bFoto.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "El empleado no existe");
        }
    }
    
    private void bFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFotoActionPerformed
        // TODO add your handling code here:
        buscador = new JFileChooser();
        FileNameExtensionFilter filtros = new FileNameExtensionFilter("*.JPG", "jpg");
        buscador.setFileFilter(filtros);
        int seleccion = buscador.showOpenDialog(this);
        foto = "";
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = buscador.getSelectedFile();
            foto = fichero.getAbsolutePath();
            ImageIcon imagen = new ImageIcon(foto);
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lFoto.getWidth(), lFoto.getHeight(), Image.SCALE_DEFAULT));
            lFoto.setIcon(icono);
            lFoto.repaint();
        }

        
    }//GEN-LAST:event_bFotoActionPerformed

    private void bLocalizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLocalizarEmpleadoActionPerformed
        // TODO add your handling code here:
        Empleado empleado = Main.localizar(tEmpleado.getText());
        localizar(empleado);
    }//GEN-LAST:event_bLocalizarEmpleadoActionPerformed

    private void altaMod() {
        try {
            validar(tDNI, "^[0-9]{8}-[A-Z]{1}$", 1);
            validar(tNSS, "^[0-9]{2}-[0-9]{8}-[0-9]{2}$", 2);
            validar(tNombre, "^[A-Z][a-z]{2,}([ ][A-Z][a-z]{1,})*$", 3);
            validar(tDireccion, "^[A-Z][a-z ]{3,}([ ][A-Z][a-z]{2,})*[0-9]{1,}[ ][0-9][a-z]$", 4);
            validar(tTelefono, "^[6-9][0-9]{8}$", 5);

            if (cContrato.getSelectedIndex() == -1) {
                cContrato.setBackground(Color.red);
                cContrato.grabFocus();
                throw new Error(6);
            } else {
                cContrato.setBackground(Color.white);
            }

            if (cDepartamento.getSelectedIndex() == -1) {
                cDepartamento.setBackground(Color.red);
                cDepartamento.grabFocus();
                throw new Error(7);
            } else {
                cDepartamento.setBackground(Color.white);
            }

            org.freixas.jcalendar.JCalendarCombo calendario = new org.freixas.jcalendar.JCalendarCombo();
            if (cContrato.getSelectedItem().toString().equals("Temporal")) {
                if (cFecha.getDate().before(calendario.getDate())) {
                    cFecha.setBackground(Color.red);
                    cFecha.grabFocus();
                    throw new Error(8);
                } else {
                    cFecha.setBackground(Color.white);
                }
            }
            //String dni, String nss, String nombre, String direccion, String telefono, boolean sexo, boolean civil, Date fecha, int cod
            if (this.getTitle().equals("Alta del Empleado")) {
                if(!Main.comprobar(tDNI.getText(), tNSS.getText())){
                    Main.agregar(tDNI.getText(), tNSS.getText(), tNombre.getText(), tDireccion.getText(), tTelefono.getText(), rHombre.isSelected(), rCasado.isSelected(), cFecha.getDate(), calendario.getDate(), cContrato.getSelectedItem().toString(), cDepartamento.getSelectedItem().toString(), foto);
                }
                else{
                    throw new Error(9);
                }
            } else {
                Main.modificar(tNSS.getText(), tNombre.getText(), tDireccion.getText(), tTelefono.getText(), rHombre.isSelected(), rCasado.isSelected(), cFecha.getDate(), calendario.getDate(), Integer.parseInt(tEmpleado.getText()), cContrato.getSelectedItem().toString(), cDepartamento.getSelectedItem().toString(), foto);
            }
            Main.reabrir(1, this.getTitle(), this);

        } catch (Error e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getClass());
        }
    }

    private void validar(javax.swing.JTextField campo, String condicion, int error) throws Exception {
        Pattern patron = Pattern.compile(condicion);
        Matcher mat = patron.matcher(campo.getText());
        if (!mat.matches()) {
            campo.grabFocus();
            campo.setBackground(Color.red);
            throw new Error(error);
        } else {
            campo.setBackground(Color.white);
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bFoto;
    private javax.swing.JButton bLocalizarDNI;
    private javax.swing.JButton bLocalizarEmpleado;
    private javax.swing.JComboBox<String> cContrato;
    private javax.swing.JComboBox<String> cDepartamento;
    private org.freixas.jcalendar.JCalendarCombo cFecha;
    private org.freixas.jcalendar.JCalendarCombo cFechae;
    private javax.swing.ButtonGroup gCivil;
    private javax.swing.ButtonGroup gSexo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lFechae;
    private javax.swing.JLabel lFoto;
    private javax.swing.JRadioButton rCasado;
    private javax.swing.JRadioButton rHombre;
    private javax.swing.JRadioButton rMujer;
    private javax.swing.JRadioButton rSoltero;
    private javax.swing.JTextField tDNI;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tEmpleado;
    private javax.swing.JTextField tNSS;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
