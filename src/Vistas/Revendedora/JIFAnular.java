package Vistas.Revendedora;

import Entidades.Revendedora;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class JIFAnular extends javax.swing.JInternalFrame {
    
    private Conexion con;
    private Revendedora rev;
    private RevendedoraData revdta;
    private DefaultTableModel modelo;
    
    public JIFAnular() {
        initComponents();
        con = new Conexion();
        revdta = new RevendedoraData(con);
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }  
        };
        cargarRev();
        armarCabecera();
        jBAlta.setEnabled(false);
        jBBaja.setEnabled(false);
        jLAlta.setVisible(false);
        jLBaja.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCBRevAl = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRevAl = new javax.swing.JTable();
        jBBaja = new javax.swing.JButton();
        jBAlta = new javax.swing.JButton();
        jLAlta = new javax.swing.JLabel();
        jLBaja = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Revendedora: Alta - Baja");

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBRevAl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCBRevAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRevAlActionPerformed(evt);
            }
        });

        jTRevAl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTRevAl);

        jBBaja.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBBaja.setText("Baja");
        jBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaActionPerformed(evt);
            }
        });

        jBAlta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBAlta.setText("Alta");
        jBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaActionPerformed(evt);
            }
        });

        jLAlta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLAlta.setForeground(new java.awt.Color(255, 51, 51));
        jLAlta.setText("Para dar de Alta");

        jLBaja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLBaja.setForeground(new java.awt.Color(255, 51, 51));
        jLBaja.setText("Para dar de Baja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBRevAl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jBSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jBAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jBBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18)
                .addComponent(jCBRevAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAlta)
                    .addComponent(jLBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBaja)
                    .addComponent(jBAlta))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente desea salir?", "Confirmar salida", JOptionPane.CLOSED_OPTION, JOptionPane.CANCEL_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBRevAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRevAlActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        if(jCBRevAl.getSelectedItem()!=null){
            cargarDatos();
            jBAlta.setEnabled(true);
            jBBaja.setEnabled(true);
            jLAlta.setVisible(true);
            jLBaja.setVisible(true);
        }
    }//GEN-LAST:event_jCBRevAlActionPerformed

    private void jBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaActionPerformed
        // TODO add your handling code here:
        Revendedora r = (Revendedora)jCBRevAl.getSelectedItem();
        if(r.isAnulado()==false){
            r.setActiva(false);
            revdta.darBaja(r, false);
            r.setAnulado(true);
            revdta.anular(r, true);
            JOptionPane.showMessageDialog(this, "Revendedora dada de Baja");
            borrarFilas();
        }
        else{
            JOptionPane.showMessageDialog(this, "Revendedora ya dada de Baja");
            borrarFilas();
        }
    }//GEN-LAST:event_jBBajaActionPerformed

    private void jBAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaActionPerformed
        // TODO add your handling code here:
        Revendedora r1 = (Revendedora)jCBRevAl.getSelectedItem();
        if(r1.isAnulado()==true){
            r1.setActiva(true);
            revdta.darBaja(r1, true);
            r1.setAnulado(false);
            revdta.anular(r1, false);
            JOptionPane.showMessageDialog(this, "Revendedora dada de Alta");
            borrarFilas();
        }
        else{
            JOptionPane.showMessageDialog(this, "Revendedora ya dada de Alta");
            borrarFilas();
        }
    }//GEN-LAST:event_jBAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBBaja;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Revendedora> jCBRevAl;
    private javax.swing.JLabel jLAlta;
    private javax.swing.JLabel jLBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRevAl;
    // End of variables declaration//GEN-END:variables
    private void cargarRev(){
        ArrayList<Revendedora> listrev = revdta.mostrarRevendedoras();
        for(Revendedora r: listrev){
            jCBRevAl.addItem(r);
        }
    }
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("DNI");
        columnas.add("Activa");
        columnas.add("Anulada");
        for(Object it: columnas){
            modelo.addColumn(it);
        }
        jTRevAl.setModel(modelo);    
    }
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
        jBAlta.setEnabled(false);
        jBBaja.setEnabled(false);
        jLAlta.setVisible(false);
        jLBaja.setVisible(false);
    
    }
    private void cargarDatos(){
        borrarFilas();
        Revendedora rev = (Revendedora)jCBRevAl.getSelectedItem();
        modelo.addRow(new Object[]{rev.getDni(), rev.isActiva(), rev.isAnulado()});
    }
}
