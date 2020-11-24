package Vistas.Revendedora;

import javax.swing.JOptionPane;
import Entidades.Revendedora;
import Modelo.*;

public class JIFBuscarRev extends javax.swing.JInternalFrame {
    private Conexion con;
    private RevendedoraData revdta;
    private Revendedora rev;
    
    public JIFBuscarRev() {
        initComponents();
        con = new Conexion();
        revdta = new RevendedoraData(con);
        jBModificar.setEnabled(false);
        jBBuscar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFDni = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFMail = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar y Modificar");

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

        jTFNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreKeyTyped(evt);
            }
        });

        jTFApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFApellidoKeyTyped(evt);
            }
        });

        jTFDni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTFDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDniKeyTyped(evt);
            }
        });

        jTFTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTFTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelefonoKeyTyped(evt);
            }
        });

        jTFMail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTFMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMailKeyTyped(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Ingrese el DNI de la revendedora");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("ID.");

        jLID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTFApellido)
                            .addComponent(jTFDni)
                            .addComponent(jTFTelefono)
                            .addComponent(jTFMail)
                            .addComponent(jLID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jBModificar)
                        .addGap(116, 116, 116)
                        .addComponent(jBLimpiar)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBLimpiar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmar salida", JOptionPane.CLOSED_OPTION, JOptionPane.CANCEL_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTFDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDniKeyReleased
        // TODO add your handling code here:
        if(!(jTFDni.getText().isEmpty())){
            jBBuscar.setEnabled(true);
        }
        else{
            jBBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_jTFDniKeyReleased

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        if(!(jTFDni.getText().isEmpty())){
            int dni= Integer.parseInt(jTFDni.getText());
            rev = revdta.buscarPorDni(dni);
            if(rev!=null){
                jTFApellido.setText(rev.getApellido());
                jTFNombre.setText(rev.getNombre());
                jTFTelefono.setText(String.valueOf(rev.getTelefono()));
                jTFMail.setText(rev.getMail());
                jLID.setText(String.valueOf(rev.getIdRev()));
                jBModificar.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Revendedora encontrada.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Revendedora no encontrada.");
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        if(!(jTFDni.getText().isEmpty()) && !(jTFApellido.getText().isEmpty())){
            int dni= Integer.parseInt(jTFDni.getText());
            rev = revdta.buscarPorDni(dni);
            if(rev!=null){
                    rev.setDni(Integer.parseInt(jTFDni.getText()));
                    rev.setApellido(jTFApellido.getText());
                    rev.setNombre(jTFNombre.getText());
                    rev.setTelefono(Long.parseLong(jTFTelefono.getText()));
                    rev.setMail(jTFMail.getText());
                    revdta.modificarRevendedora(rev);
                JOptionPane.showMessageDialog(this, "Revendedora Actualizada con exito");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(this, "No Actualizada");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No Actualizada, DNI y Apellido requerido");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTFDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDniKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }  
    }//GEN-LAST:event_jTFDniKeyTyped

    private void jTFApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jTFApellidoKeyTyped

    private void jTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jTFNombreKeyTyped

    private void jTFTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelefonoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        } 
    }//GEN-LAST:event_jTFTelefonoKeyTyped

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
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
    private void limpiar(){
        jTFApellido.setText("");
        jTFDni.setText("");
        jTFMail.setText("");
        jTFTelefono.setText("");
        jTFNombre.setText("");
        jBModificar.setEnabled(false);
        jBBuscar.setEnabled(false);
    }
    
}