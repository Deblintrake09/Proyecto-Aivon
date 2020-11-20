package Vistas.Revendedora;

import Entidades.Revendedora;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFNivel extends javax.swing.JInternalFrame {

    private Conexion con;
    private Revendedora rev;
    private RevendedoraData revdta;
    private DefaultTableModel modelo;

    public JIFNivel() {
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
        jBNivel.setEnabled(false);
        jBActiva.setEnabled(false);
        jLNivel.setVisible(false);
        jLActiva.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCBRev = new javax.swing.JComboBox<>();
        jBNivel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNivelRev = new javax.swing.JTable();
        jLNivel = new javax.swing.JLabel();
        jLActiva = new javax.swing.JLabel();
        jBActiva = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Revendedora: Nivel  -  Actividad");

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBRev.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCBRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBRevActionPerformed(evt);
            }
        });

        jBNivel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBNivel.setText("Nivel");
        jBNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNivelActionPerformed(evt);
            }
        });

        jTNivelRev.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTNivelRev);

        jLNivel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNivel.setForeground(new java.awt.Color(255, 51, 51));
        jLNivel.setText("Para controlar el nivel");

        jLActiva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLActiva.setForeground(new java.awt.Color(255, 51, 51));
        jLActiva.setText("Para controlar el estado");

        jBActiva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBActiva.setText("Activa");
        jBActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLActiva)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(jBSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBActiva, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18)
                .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLActiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNivel)
                    .addComponent(jBActiva))
                .addGap(18, 18, 18))
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

    private void jCBRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBRevActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        if(jCBRev.getSelectedItem()!=null){
            cargarDatos();
            jBNivel.setEnabled(true);
            jBActiva.setEnabled(true);
            jLNivel.setVisible(true);
            jLActiva.setVisible(true);
        }
    }//GEN-LAST:event_jCBRevActionPerformed

    private void jBNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNivelActionPerformed
        // TODO add your handling code here:
        Revendedora rev1 = (Revendedora)jCBRev.getSelectedItem();
        if(rev1.isAnulado()==false){
            revdta.calcularNivelPorEstrellas(rev1);
            revdta.subirNivelPorPedidos(rev1);
            JOptionPane.showMessageDialog(this, "Nivel Actualizado");
            borrarFilas();
        }
        else{
            JOptionPane.showMessageDialog(this, "Imposible subir nivel. Revendedora dada de baja.");
            borrarFilas();
        }
    }//GEN-LAST:event_jBNivelActionPerformed

    private void jBActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActivaActionPerformed
        // TODO add your handling code here:
        Revendedora rev2 = (Revendedora)jCBRev.getSelectedItem();
        if(rev2.isAnulado()==false){
            revdta.controlarActividadRevendedora(rev2);
            JOptionPane.showMessageDialog(this, "Actividad controdala");
            borrarFilas();
        }
        else{
            JOptionPane.showMessageDialog(this, "Imposible controlar. Revendedora dada de baja.");
            borrarFilas();
        }
    }//GEN-LAST:event_jBActivaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActiva;
    private javax.swing.JButton jBNivel;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Revendedora> jCBRev;
    private javax.swing.JLabel jLActiva;
    private javax.swing.JLabel jLNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTNivelRev;
    // End of variables declaration//GEN-END:variables
    private void cargarRev(){
        ArrayList<Revendedora> listrev = revdta.mostrarRevendedoras();
        for(Revendedora r: listrev){
            jCBRev.addItem(r);
        }
    }
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("DNI");
        columnas.add("Activa");
        columnas.add("Nivel");
        for(Object it: columnas){
            modelo.addColumn(it);
        }
        jTNivelRev.setModel(modelo);    
    }
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
        jBNivel.setEnabled(false);
        jBActiva.setEnabled(false);
        jLNivel.setVisible(false);
        jLActiva.setVisible(false);
    
    }
    private void cargarDatos(){
        borrarFilas();
        Revendedora rev = (Revendedora)jCBRev.getSelectedItem();
        modelo.addRow(new Object[]{rev.getDni(), rev.isActiva(), rev.getNivel()});
    }
}
