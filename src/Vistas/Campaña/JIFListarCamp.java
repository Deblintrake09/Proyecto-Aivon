package Vistas.Campaña;

import Entidades.*;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFListarCamp extends javax.swing.JInternalFrame {
    
    private Conexion con;
    private CampañaData cpdta;
    private ArrayList<Campaña> listc;
    private DefaultTableModel modelo;
    public JIFListarCamp() {
        initComponents();
        con = new Conexion();
        cpdta = new CampañaData(con);
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

        jBSalir = new javax.swing.JButton();
        jBCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCamp = new javax.swing.JTable();

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBCargar.setText("Cargar");
        jBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Campañas registradas");

        jTCamp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTCamp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jBCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jBSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCargar)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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

    private void jBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarActionPerformed
        // TODO add your handling code here:
        cargarDatos();
        JOptionPane.showMessageDialog(this, "Listado con éxito.");
    }//GEN-LAST:event_jBCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCamp;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera()
    {
        ArrayList<Object> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("Numero");
        columnas.add("Fecha Inicio");
        columnas.add("Fecha Fin");
        columnas.add("Monto Min.");
        columnas.add("Monto Max.");
        columnas.add("Anulada");
        
        for(Object o:columnas)
        {
            modelo.addColumn(o);
        }
        
        jTCamp.setModel(modelo);
        jTCamp.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTCamp.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTCamp.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTCamp.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTCamp.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTCamp.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTCamp.getColumnModel().getColumn(6).setPreferredWidth(70);
    }
    private void borrarFilas()
    {
        int a = modelo.getRowCount()-1;
        
        for (int i=a; i>=0; i--)
        {
            modelo.removeRow(i);
        }
    }
    private void cargarDatos()
    {
        borrarFilas();
        listc = cpdta.obtenerCampañas();
        for( Campaña camp : listc)
        {
            modelo.addRow(new Object[]{camp.getIdCampaña(), camp.getNroCampaña(),
            camp.getFechaInicio(), camp.getFechaFin(), camp.getMontoMinimo(), camp.getMontoMaximo(),
             camp.getAnulado()});
        }
    }
}
