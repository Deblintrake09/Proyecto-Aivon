package Vistas.Revendedora;

import javax.swing.JOptionPane;
import Entidades.Revendedora;
import Modelo.*;

public class JIFAgregarRev extends javax.swing.JInternalFrame {
    private Conexion con;
    private RevendedoraData revdta;
    private Revendedora rev;
    public JIFAgregarRev() {
        initComponents();
        con = new Conexion();
        revdta = new RevendedoraData(con);
        jBGuardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNomb = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFDni = new javax.swing.JTextField();
        jTFTel = new javax.swing.JTextField();
        jTFMail = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Revendedora");

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Mail");

        jTFNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombKeyTyped(evt);
            }
        });

        jTFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFApellidoKeyTyped(evt);
            }
        });

        jTFDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDniKeyTyped(evt);
            }
        });

        jTFTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelKeyTyped(evt);
            }
        });

        jTFMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMailKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFNomb)
                    .addComponent(jTFApellido)
                    .addComponent(jTFDni)
                    .addComponent(jTFTel)
                    .addComponent(jTFMail, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpiar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(jBSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBGuardar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente desea salir?", "Confirmar salida", JOptionPane.CLOSED_OPTION, JOptionPane.CANCEL_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTFDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDniKeyReleased
        // TODO add your handling code here:
        if(!(jTFDni.getText().isEmpty())){
            jBGuardar.setEnabled(true);
        }
        else{
            jBGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jTFDniKeyReleased

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        if(!(jTFApellido.getText().isEmpty()) && !(jTFDni.getText().isEmpty())){
            String nom = jTFNomb.getText();
            String ape = jTFApellido.getText();
            int dni = Integer.parseInt(jTFDni.getText());
            long tel = Long.parseLong(jTFTel.getText());
            String mail = jTFMail.getText();
            rev = new Revendedora(nom, ape, dni, tel, mail);
            revdta.agregarRevendedora(rev);
            JOptionPane.showMessageDialog(this, "Revendedora Guardada con éxito.");
        }
        else{
            JOptionPane.showMessageDialog(this, "Revendedora no guardada, DNI y Apellido obligatorio");
        }
        limpiar();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jTFNombKeyTyped

    private void jTFApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jTFApellidoKeyTyped

    private void jTFDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDniKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }  
    }//GEN-LAST:event_jTFDniKeyTyped

    private void jTFTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }  
    }//GEN-LAST:event_jTFTelKeyTyped

    private void jTFMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMailKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(validar == 32){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "No se permiten espacios en el mail");
        }
    }//GEN-LAST:event_jTFMailKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNomb;
    private javax.swing.JTextField jTFTel;
    // End of variables declaration//GEN-END:variables
    private void limpiar(){
        jTFNomb.setText("");
        jTFApellido.setText("");
        jTFDni.setText("");
        jTFTel.setText("");
        jTFMail.setText("");
        jBGuardar.setEnabled(false);
    
    }
}
