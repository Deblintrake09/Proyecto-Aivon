package Vistas.Producto;

import Vistas.Producto.*;
import Modelo.*;
import Entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFListarProductos extends javax.swing.JInternalFrame {
    private Conexion con;
    private ProductoData prodData;
    private DefaultTableModel modelo; 
    private ArrayList<Producto> lista;
    private ArrayList<String> listUsos;

    public JIFListarProductos() {
        initComponents();
        con = new Conexion();
        prodData = new ProductoData(con);
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            } 
        };
        cargarSelector();
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
        jcbSelectUso = new javax.swing.JComboBox<>();
        jchckFiltrar = new javax.swing.JCheckBox();

        setResizable(true);
        setMinimumSize(new java.awt.Dimension(800, 400));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Productos Registrados");

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

        jcbSelectUso.setMaximumRowCount(10);

        jchckFiltrar.setText("Filtrar por Uso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 299, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(jBSalir)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(JBCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbSelectUso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jchckFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCargar)
                    .addComponent(jcbSelectUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchckFiltrar))
                .addGap(18, 18, 18)
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
        cargarProductos();
    }//GEN-LAST:event_JBCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCargar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRev;
    private javax.swing.JComboBox<String> jcbSelectUso;
    private javax.swing.JCheckBox jchckFiltrar;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        
        columnas.add("Codigo");
        columnas.add("Nombre");
        columnas.add("Uso");
        columnas.add("Tamaño");
        columnas.add("P.Costo");
        columnas.add("P.V.P.");
        columnas.add("Estrellas");
        columnas.add("Anulado");
        
        for(Object o : columnas){
            modelo.addColumn(o);
        }
        jTRev.setModel(modelo);
        jTRev.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTRev.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTRev.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(6).setPreferredWidth(120);
        jTRev.getColumnModel().getColumn(7).setPreferredWidth(100);
    }
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargarProductos(){
        borrarFilas();
        if(jchckFiltrar.isSelected())
        {
            lista = prodData.listarPorUSO((String)jcbSelectUso.getSelectedItem());
        }else
        {
            lista = prodData.listarProductos();
        }
        
        for(Producto prod: lista){
            modelo.addRow(new Object[]{prod.getCodigo(),prod.getNombre(),prod.getUso(),prod.getTamaño(),prod.getPrecioCosto(),prod.getPrecioVenta(),prod.getCantEstrellas(),prod.isAnulado()});
        }
    }

    private void cargarSelector() {
        listUsos = prodData.listarUsos();
        for(int i =0;i<listUsos.size();i++)
        {
            jcbSelectUso.addItem(listUsos.get(i));
        }
    }
}
