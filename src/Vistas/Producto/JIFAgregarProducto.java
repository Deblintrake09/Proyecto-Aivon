package Vistas.Producto;

import javax.swing.JOptionPane;
import Entidades.Producto;
import Modelo.*;

public class JIFAgregarProducto extends javax.swing.JInternalFrame {
    private Conexion con;
    private ProductoData pData;
    private Producto prod;
    public JIFAgregarProducto() {
        initComponents();
        con = new Conexion();
        pData = new ProductoData(con);
        prod=null;
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
        jTFCodigo = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFUso = new javax.swing.JTextField();
        jTFTamaño = new javax.swing.JTextField();
        jTFCosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfVenta = new javax.swing.JTextField();
        JspinEstrellas = new javax.swing.JSpinner();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargar Producto");

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
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Uso");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tamaño");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Precio Costo");

        jTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyTyped(evt);
            }
        });

        jTFNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNombreMouseClicked(evt);
            }
        });
        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreKeyTyped(evt);
            }
        });

        jTFUso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFUsoKeyTyped(evt);
            }
        });

        jTFTamaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFTamañoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTamañoKeyTyped(evt);
            }
        });

        jTFCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCostoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCostoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Precio Venta");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Estrellas");

        jtfVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfVentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfVentaKeyTyped(evt);
            }
        });

        JspinEstrellas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(jBSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JspinEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo)
                            .addComponent(jTFCosto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFUso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFTamaño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JspinEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBLimpiar))
                .addGap(35, 35, 35))
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

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:

         if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            String codigo = jTFCodigo.getText();
            String nombre= jTFNombre.getText();
            String uso=jTFUso.getText();
            int tam= Integer.parseInt(jTFTamaño.getText());
            try{
            float costo=Float.parseFloat(jTFCosto.getText());
            float venta=Float.parseFloat(jtfVenta.getText());
            int estrellas = (Integer)JspinEstrellas.getValue();
            prod=new Producto(codigo,nombre,uso,tam,costo,venta,estrellas);
            pData.agregarProducto(prod);
            JOptionPane.showMessageDialog(null,"Se ha guardado el producto con exito!");
            limpiar();
            }
            catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "El costo contiene más de un punto", "Warning", JOptionPane.WARNING_MESSAGE);
           }
        }
         else{
             JOptionPane.showMessageDialog(this, "Hay campos vacíos!", "Warning" ,JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTFNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyReleased

        if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jTFNombreKeyReleased

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyReleased

        if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jTFCodigoKeyReleased

    private void jTFUsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsoKeyReleased

        if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jTFUsoKeyReleased

    private void jTFTamañoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTamañoKeyReleased

        if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jTFTamañoKeyReleased

    private void jTFCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCostoKeyReleased

        if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jTFCostoKeyReleased

    private void jtfVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfVentaKeyReleased

        if(!(jTFNombre.getText().isEmpty()) && !(jTFCodigo.getText().isEmpty()) && !(jTFUso.getText().isEmpty())
                && !(jTFTamaño.getText().isEmpty()) && !(jTFCosto.getText().isEmpty()) && !(jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }//GEN-LAST:event_jtfVentaKeyReleased

    private void jTFNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNombreMouseClicked
    
    }//GEN-LAST:event_jTFNombreMouseClicked

    private void jTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyTyped
        char c = evt.getKeyChar();
        String letra = String.valueOf(c);
        
        
        if(!letra.matches("[A-Za-zÑñ ]*$") && c != 8)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
//        else{JOptionPane.showMessageDialog(this, "Ingrese solo letras");}
    }//GEN-LAST:event_jTFNombreKeyTyped

    private void jTFCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCostoKeyTyped
         char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8 && validar !=46){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
    }//GEN-LAST:event_jTFCostoKeyTyped

    private void jtfVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfVentaKeyTyped
         char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8 && validar !=46){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
    }//GEN-LAST:event_jtfVentaKeyTyped

    private void jTFTamañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTamañoKeyTyped
         char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }
    }//GEN-LAST:event_jTFTamañoKeyTyped

    private void jTFUsoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsoKeyTyped
        char c = evt.getKeyChar();
        String letra = String.valueOf(c);
        
        
        if(!letra.matches("[A-Za-zñÑ ]*$") && c != 8)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
        }
    }//GEN-LAST:event_jTFUsoKeyTyped

    private void jTFCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyTyped
        char c = evt.getKeyChar();
        String letra = String.valueOf(c);
        
        
        if(!letra.matches("[A-Za-z0-9-/Ññ ]*$") && c != 8)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo admite los signos: ( / - ) letras y números");
        }
    }//GEN-LAST:event_jTFCodigoKeyTyped
    
   /* private void chequeo1()
    {
        if((!jTFNombre.getText().isEmpty()) && (!jTFCodigo.getText().isEmpty()) && (!jTFUso.getText().isEmpty())
                && (!jTFTamaño.getText().isEmpty()) && (!jTFCosto.getText().isEmpty()) && (!jtfVenta.getText().isEmpty()))
        {
            jBGuardar.setEnabled(true);
        }
        else
            jBGuardar.setEnabled(false);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner JspinEstrellas;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCosto;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTamaño;
    private javax.swing.JTextField jTFUso;
    private javax.swing.JTextField jtfVenta;
    // End of variables declaration//GEN-END:variables
    
    private void limpiar(){
        jTFCodigo.setText("");
        jTFNombre.setText("");
        jTFUso.setText("");
        jTFTamaño.setText("");
        jTFCosto.setText("");
        jtfVenta.setText("");
        JspinEstrellas.setValue(0);
        jBGuardar.setEnabled(false);
    
    }
}
