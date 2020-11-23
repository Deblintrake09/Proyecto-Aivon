package Vistas.Pedido;

import Modelo.*;
import Entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFListarPedidosRevendedora extends javax.swing.JInternalFrame {
    private Conexion con;
    private PedidoData pedData;
    private RevendedoraData revData;
    private DefaultTableModel modelo; 
    private ArrayList<Pedido> listaPed;
    private ArrayList<Revendedora> listaRevs;

    public JIFListarPedidosRevendedora() {
        initComponents();
        con = new Conexion();
        pedData = new PedidoData(con);
        revData= new RevendedoraData(con);
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
        jcbSelectRevendedora = new javax.swing.JComboBox<>();
        jlbselector = new javax.swing.JLabel();

        setResizable(true);
        setMinimumSize(new java.awt.Dimension(800, 400));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Pedidos Por Revendedora");

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

        jcbSelectRevendedora.setMaximumRowCount(10);
        jcbSelectRevendedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectRevendedoraActionPerformed(evt);
            }
        });

        jlbselector.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlbselector.setText("Elija Revendedora a ver:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 299, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(jBSalir)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlbselector, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbSelectRevendedora, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCargar)
                    .addComponent(jcbSelectRevendedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbselector))
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
        cargarPedidos();
    }//GEN-LAST:event_JBCargarActionPerformed

    private void jcbSelectRevendedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectRevendedoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectRevendedoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCargar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTRev;
    private javax.swing.JComboBox<Revendedora> jcbSelectRevendedora;
    private javax.swing.JLabel jlbselector;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        
        columnas.add("Campaña");
        columnas.add("Fecha Ingreso");
        columnas.add("Fecha Entrega");
        columnas.add("Fecha Pago");
        columnas.add("# Cajas");
        columnas.add("Precio Costo");
        columnas.add("Estrellas");
        columnas.add("Maximo?");
        columnas.add("Anulado");
        
        for(Object o : columnas){
            modelo.addColumn(o);
        }
        jTRev.setModel(modelo);
        jTRev.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTRev.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTRev.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTRev.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTRev.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTRev.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTRev.getColumnModel().getColumn(6).setPreferredWidth(60);
        jTRev.getColumnModel().getColumn(7).setPreferredWidth(90);
        jTRev.getColumnModel().getColumn(8).setPreferredWidth(50);
    }
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void cargarPedidos(){
        borrarFilas();
        if(jcbSelectRevendedora.getSelectedIndex()>=0)
        {
            Revendedora rev= (Revendedora)jcbSelectRevendedora.getSelectedItem();
            listaPed = pedData.buscarPedidoXRev(rev.getDni());
         for(Pedido ped: listaPed){
             modelo.addRow(new Object[]{ped.getCampaña().getNroCampaña(), ped.getFechaIngreso(),ped.getFechaEntrega(),ped.getFechaPago(), ped.getCantCajas(),ped.calcularTotalCosto(), ped.mostrarEstrellasTotales(),ped.controlarMontos(),ped.isAnulado()});

         }
        }
    }

    private void cargarSelector() {
        listaRevs = revData.mostrarRevendedoras();
        for(int i =0;i<listaRevs.size();i++)
        {
            jcbSelectRevendedora.addItem(listaRevs.get(i));
        }
    }
}
