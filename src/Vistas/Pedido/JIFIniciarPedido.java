package Vistas.Pedido;

import Entidades.*;
import Modelo.*;
import Vistas.Ventana;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFIniciarPedido extends javax.swing.JInternalFrame {
    
    private Conexion con;
    private CampañaData campdta;
    private RevendedoraData revdta;
    private PedidoData pdta;
    private RenglonData rdta;
    private DefaultTableModel modelo;
    private ProductoData prodta;
    private Pedido pedido;

    public JIFIniciarPedido() {
        initComponents();
        con = new Conexion();
        campdta = new CampañaData(con);
        revdta = new RevendedoraData(con);
        pdta = new PedidoData(con);
        prodta = new ProductoData(con);
        rdta = new RenglonData(con);
        pedido = new Pedido();
        modelo = new DefaultTableModel();
        armarCabecera();
        cargarProd();
        campActual();
        cargarRev();
        jDFecha.getDateEditor().setEnabled(false);
        jCBProduc.setEnabled(false);
        jBGuardarRen.setEnabled(false);
        jBCargar.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCBRev = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLNumCamp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDFecha = new com.toedter.calendar.JDateChooser();
        jBIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedido = new javax.swing.JTable();
        jCBProduc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSCant = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSCaja = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jBCargar = new javax.swing.JButton();
        jBGuardarRen = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar un pedido");

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.setToolTipText("");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBRev.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Campaña Actual:");

        jLNumCamp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Iniciado el Pedido");

        jBIniciar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBIniciar.setText("Iniciar Pedido");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar Productos Al Pedido");

        jTPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTPedido);

        jCBProduc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Seleccione el producto");

        jSCant.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSCant.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Seleccione la Cantidad");

        jSCaja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSCaja.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Numero de Caja");

        jBCargar.setText("Cargar");
        jBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarActionPerformed(evt);
            }
        });

        jBGuardarRen.setText("Guardar Renglon");
        jBGuardarRen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarRenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)
                                .addComponent(jBSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNumCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jSCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jBIniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jSCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jBCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardarRen)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSalir)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jBIniciar)
                        .addGap(4, 4, 4))
                    .addComponent(jLNumCamp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCargar)
                    .addComponent(jBGuardarRen))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        // TODO add your handling code here:
        Revendedora rev = (Revendedora) jCBRev.getSelectedItem();
        Campaña camp = campdta.buscarNroCampaña(Integer.parseInt(jLNumCamp.getText()));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(jDFecha.getDate());
        LocalDate fechaP = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        ArrayList<RenglonPedido> renglones = new ArrayList<>();
        pedido = new Pedido(fechaP, null, null, rev, camp, renglones);
        pdta.cargarPedido(pedido);
        jCBProduc.setEnabled(true);
        jBGuardarRen.setEnabled(true);
        jBCargar.setEnabled(true);
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void jBGuardarRenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarRenActionPerformed
        // TODO add your handling code here:
        Revendedora rv = (Revendedora) jCBRev.getSelectedItem();
        String cod = modelo.getValueAt(0, 0).toString();
        Producto produc = prodta.buscarPorCodigo(cod);
        Campaña cam = campdta.buscarNroCampaña(Integer.parseInt(jLNumCamp.getText()));
        Pedido pd = pdta.buscarPedidoCampRev(cam, rv);
        int cant = Integer.parseInt(jSCant.getValue().toString());
        int caja = Integer.parseInt(jSCaja.getValue().toString());
        RenglonPedido renglon = new RenglonPedido(produc, pd.getIdPedido(), cant, caja);
        rdta.agregarRenglon(renglon);
        pd.agregarRenglon(renglon);
        pdta.actualizarPedido(pd);
    }//GEN-LAST:event_jBGuardarRenActionPerformed

    private void jBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarActionPerformed
        // TODO add your handling code here:
        cargarRen();
    }//GEN-LAST:event_jBCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargar;
    private javax.swing.JButton jBGuardarRen;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Producto> jCBProduc;
    private javax.swing.JComboBox<Revendedora> jCBRev;
    private com.toedter.calendar.JDateChooser jDFecha;
    private javax.swing.JLabel jLNumCamp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSCaja;
    private javax.swing.JSpinner jSCant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPedido;
    // End of variables declaration//GEN-END:variables
    private void campActual(){
        int cam;
        ArrayList<Campaña> listCamp = campdta.obtenerCampañas();
        cam = listCamp.size();
        jLNumCamp.setText(String.valueOf(cam));
    }
    private void cargarRev(){
        ArrayList<Revendedora> listrev = revdta.mostrarRevendedoras();
        for(Revendedora r: listrev){
            jCBRev.addItem(r);
        }
    }
    private void cargarProd(){
        ArrayList<Producto> listprod = prodta.listarProductos();
        for(Producto p : listprod){
            jCBProduc.addItem(p);
        }
    }
    private void armarCabecera(){
        ArrayList<Object> columnas = new ArrayList<>();
        
        columnas.add("Codigo");
        columnas.add("Producto");
        columnas.add("Cantidad");
        columnas.add("Nro. Caja");
        columnas.add("Precio Costo");
        columnas.add("Precio venta");
        columnas.add("Cant. Estrellas");
        
        for(Object o : columnas){
            modelo.addColumn(o);
        }
        jTPedido.setModel(modelo);
              
    }
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    private void cargarRen(){
        //borrarFilas();
        Producto prod = (Producto) jCBProduc.getSelectedItem();
        modelo.addRow(new Object[]{prod.getCodigo(), prod.getNombre(), jSCant.getValue(),
        jSCaja.getValue(), prod.getPrecioCosto(), prod.getPrecioVenta(), prod.getCantEstrellas()});
    }
}
