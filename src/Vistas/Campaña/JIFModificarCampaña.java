package Vistas.Campaña;

import Entidades.Campaña;
import Modelo.CampañaData;
import Modelo.Conexion;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class JIFModificarCampaña extends javax.swing.JInternalFrame 
{
    private Conexion con;
    private Campaña campaña;
    private CampañaData campañaData;
    
    public JIFModificarCampaña() 
    {
        initComponents();
        jTFNumero.requestFocus();
        con = new Conexion();
        campañaData = new CampañaData(con);
        campaña = null;
        jDCFechaInicio.setEnabled(false);
        jDCFechaDeFin.setEnabled(false);
        jCheckBoxAnulada.setEnabled(false);
        habilitar(false);
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFMontoMinimo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFMontoMaximo = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDCFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDCFechaDeFin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxAnulada = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(437, 420));

        jTFMontoMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMontoMinimoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Monto máximo");

        jTFMontoMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMontoMaximoActionPerformed(evt);
            }
        });
        jTFMontoMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMontoMaximoKeyTyped(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Campaña");

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nro de campaña");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Inicio");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Fin");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Monto mínimo");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Buscar por");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Anulada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jBSalir)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(10, 10, 10)
                                        .addComponent(jCheckBoxAnulada))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDCFechaDeFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFMontoMaximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFMontoMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBBuscar)
                                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCFechaDeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMontoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFMontoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAnulada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBModificar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFMontoMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMontoMinimoKeyTyped
   
    }//GEN-LAST:event_jTFMontoMinimoKeyTyped

    private void jTFMontoMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMontoMaximoActionPerformed

    }//GEN-LAST:event_jTFMontoMaximoActionPerformed

    private void jTFMontoMaximoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMontoMaximoKeyTyped
   
    }//GEN-LAST:event_jTFMontoMaximoKeyTyped

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        
            int numeroCampaña = Integer.parseInt(jTFNumero.getText());
            campaña = campañaData.buscarNroCampaña(numeroCampaña);                
            if(campaña != null)
            {
                jDCFechaInicio.setEnabled(true);
                jDCFechaDeFin.setEnabled(true);
                campaña.setNroCampaña(numeroCampaña);
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(jDCFechaInicio.getDate());
                LocalDate fechaI = LocalDate.parse(fechaInicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                campaña.setFechaInicio(fechaI);
                String fechaFin = formato.format(jDCFechaDeFin.getDate());
                LocalDate fechaF = LocalDate.parse(fechaFin, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                campaña.setFechaFin(fechaF);
                campaña.setMontoMinimo(Float.parseFloat(jTFMontoMinimo.getText()));
                campaña.setMontoMaximo(Float.parseFloat(jTFMontoMaximo.getText()));
                campaña.setAnulado(jCheckBoxAnulada.isSelected());
                campañaData.modificarCampaña(campaña);
                JOptionPane.showMessageDialog(this, "Campaña Actualizada");
                jDCFechaInicio.setEnabled(false);
                jDCFechaDeFin.setEnabled(false);
                jCheckBoxAnulada.setEnabled(false);
                habilitar(false);
                limpiar();
            }

    }//GEN-LAST:event_jBModificarActionPerformed

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

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if(jTFNumero.getText()!=null)
        {
            int numeroCampaña = Integer.parseInt(jTFNumero.getText());
            campaña = campañaData.buscarNroCampaña(numeroCampaña);
            if (campaña.getIdCampaña() != -1)
            {
                habilitar(true);
                jDCFechaInicio.setEnabled(true);
                jDCFechaDeFin.setEnabled(true);
                jTFNumero.setText(campaña.getNroCampaña()+"");
                jDCFechaInicio.setDate(Date.valueOf(campaña.getFechaInicio()));
                jDCFechaDeFin.setDate(Date.valueOf(campaña.getFechaFin()));
                jTFMontoMinimo.setText(campaña.getMontoMinimo()+"");
                jTFMontoMaximo.setText(campaña.getMontoMaximo()+"");
                jCheckBoxAnulada.setSelected(campaña.getAnulado());
                jBModificar.setEnabled(true);                
            }    
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontró campaña con ése número");
                limpiar();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void limpiar()
    {
        jTFNumero.setText("");
        jDCFechaInicio.setDateFormatString(null);
        jDCFechaDeFin.setDateFormatString(null);
        jTFMontoMinimo.setText("");
        jTFMontoMaximo.setText("");
        jDCFechaInicio.setEnabled(false);
        jDCFechaDeFin.setEnabled(false);
        jCheckBoxAnulada.setEnabled(false);
        jTFNumero.requestFocus();
    }
    private void habilitar(boolean b)
    {
        jTFMontoMaximo.setEnabled(b);
        jTFMontoMinimo.setEnabled(b);
        jBModificar.setEnabled(b);
        jBLimpiar.setEnabled(b);
        jCheckBoxAnulada.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JCheckBox jCheckBoxAnulada;
    private com.toedter.calendar.JDateChooser jDCFechaDeFin;
    private com.toedter.calendar.JDateChooser jDCFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFMontoMaximo;
    private javax.swing.JTextField jTFMontoMinimo;
    private javax.swing.JTextField jTFNumero;
    // End of variables declaration//GEN-END:variables
}
