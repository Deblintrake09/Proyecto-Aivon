package Vistas.Revendedora;

import Modelo.*;
import Entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFListarRev extends javax.swing.JInternalFrame {
    private Conexion con;
    private RevendedoraData revdta;
    private DefaultTableModel modelo; 
    private ArrayList<Revendedora> lista;

    public JIFListarRev() {
        initComponents();
        con = new Conexion();
        revdta = new RevendedoraData(con);
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            } 
        };
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JBCargar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRev = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Revendedoras registradas");

        JBCargar.setText("Cargar");
        JBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCargarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTRev.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTRev);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jBSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(JBCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18)
                .addComponent(JBCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void JBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCargarActionPerformed
        // TODO add your handling code here:
        cargarRev();
        JOptionPane.showMessageDialog(this, "Listado con éxito.");
    }//GEN-LAST:event_JBCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCargar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRev;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        
        columnas.add("ID.");
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("DNI");
        columnas.add("Telefono");
        columnas.add("Mail");
        columnas.add("Activa");
        columnas.add("Nivel");
        columnas.add("Anulada");
        
        for(Object o : columnas){
            modelo.addColumn(o);
        }
        jTRev.setModel(modelo);
        jTRev.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTRev.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTRev.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTRev.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTRev.getColumnModel().getColumn(6).setPreferredWidth(60);
        jTRev.getColumnModel().getColumn(7).setPreferredWidth(50);
        jTRev.getColumnModel().getColumn(8).setPreferredWidth(70);
        
    }
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargarRev(){
        borrarFilas();
        lista = revdta.mostrarRevendedoras();
        for(Revendedora rev: lista){
            modelo.addRow(new Object[]{rev.getIdRev(), rev.getNombre(), rev.getApellido(),
                rev.getDni(), rev.getTelefono(), rev.getMail(), rev.isActiva(),
                rev.getNivel(), rev.isAnulado()});
        }
    }
}
