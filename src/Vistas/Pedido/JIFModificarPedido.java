package Vistas.Pedido;

import Entidades.*;
import Modelo.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JIFModificarPedido extends javax.swing.JInternalFrame {
    
    private Conexion con;
    private CampañaData campdta;
    private RevendedoraData revdta;
    private PedidoData pdta;
    private RenglonData rdta;
    private DefaultTableModel modelo;
    private ProductoData prodta;
    private Pedido pedido;
    private ArrayList<Producto> listprod;
    private ArrayList<RenglonPedido> eliminados;

    public JIFModificarPedido() {
        initComponents();
        con = new Conexion();
        campdta = new CampañaData(con);
        revdta = new RevendedoraData(con);
        pdta = new PedidoData(con);
        prodta = new ProductoData(con);
        rdta = new RenglonData(con);
        pedido = new Pedido();
        eliminados=new ArrayList();
        modelo = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {   if(column==2|| column==3)
                    return true;
                return false;//This causes all cells to be not editable
            }
        };
        armarCabecera();
        cargarProd();
        campActual();
        cargarRev();
        cargarFiltroSelector();
        jdFechaEntrega.getDateEditor().setEnabled(false);
        jCBProduc.setEnabled(false);
        jBConfirmarPedido.setEnabled(false);
        jBCargarRenglon.setEnabled(false);
        jBorrarRenglon.setEnabled(false);
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
        jdFechaEntrega = new com.toedter.calendar.JDateChooser();
        jBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedido = new javax.swing.JTable();
        jCBProduc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSCant = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSCaja = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jBCargarRenglon = new javax.swing.JButton();
        jBConfirmarPedido = new javax.swing.JButton();
        jCBSelectUso = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcheckUso = new javax.swing.JCheckBox();
        jBorrarRenglon = new javax.swing.JButton();
        jlbCosto = new javax.swing.JLabel();
        jlbEstrellas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jdFechaPago = new com.toedter.calendar.JDateChooser();
        jlbEstado = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar un Pedido Vigente");

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
        jLabel3.setText("Fecha Inicio:            --/--/--");

        jBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBuscar.setText("Buscar Pedido");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modificar Productos de Pedido");

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

        jBCargarRenglon.setText("Cargar Renglon");
        jBCargarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarRenglonActionPerformed(evt);
            }
        });

        jBConfirmarPedido.setText("Confirmar Pedido");
        jBConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarPedidoActionPerformed(evt);
            }
        });

        jCBSelectUso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Filtrar por Uso");

        jcheckUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckUsoActionPerformed(evt);
            }
        });

        jBorrarRenglon.setText("Borrar Renglon");
        jBorrarRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarRenglonActionPerformed(evt);
            }
        });

        jlbCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbCosto.setText("Costo Total: $");

        jlbEstrellas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbEstrellas.setText("Estrellas Totales: ");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Fecha Entrega");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Fecha Pago");

        jlbEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbEstado.setText("Estado:      ----------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197)
                                .addComponent(jBSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBConfirmarPedido)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLNumCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBuscar)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbEstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCBSelectUso, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcheckUso)
                                        .addGap(73, 73, 73)
                                        .addComponent(jSCant, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jSCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jBCargarRenglon)
                .addGap(31, 31, 31)
                .addComponent(jBorrarRenglon)
                .addGap(59, 59, 59)
                .addComponent(jlbEstrellas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbCosto)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSalir)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLNumCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBSelectUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcheckUso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCargarRenglon)
                            .addComponent(jBorrarRenglon)
                            .addComponent(jlbEstrellas)
                            .addComponent(jlbCosto))
                        .addGap(11, 11, 11)
                        .addComponent(jBConfirmarPedido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

        Revendedora rev = (Revendedora) jCBRev.getSelectedItem();
        Campaña camp = campdta.buscarNroCampaña(Integer.parseInt(jLNumCamp.getText()));
        
        pedido =null;
        pedido =  pdta.buscarPedidoCampRev(camp, rev);
        if(pedido==null)
        {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = formato.format(jdFechaEntrega.getDate());
            LocalDate fechaP = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            ArrayList<RenglonPedido> renglones = new ArrayList<>();
            pedido = new Pedido(fechaP, null, null, rev, camp, renglones);
            pdta.cargarPedido(pedido);
            jCBProduc.setEnabled(true);
            jBConfirmarPedido.setEnabled(true);
            jBCargarRenglon.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "No se puede crear pedido.\n Ya existe pedido para la campaña actual para ésta revendedora. Nro Pedido:  "+pedido.getIdPedido());
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarPedidoActionPerformed
        
        Producto produc=new Producto();
        if(modelo.getRowCount()>=1)
        {
            for(int i=0;i<modelo.getRowCount();i++)
            {
                int cant = Integer.parseInt(jSCant.getValue().toString());
                int caja = Integer.parseInt(jSCaja.getValue().toString());
                pedido.getRenglones().get(i).setCantidad(cant);
                pedido.getRenglones().get(i).setNro_caja(caja);
            }
            int confirmar = JOptionPane.showConfirmDialog(this, "Confirmar Pedido", "Desea Confirmar éste Pedido?", JOptionPane.OK_OPTION);
            if(confirmar ==0)
            {
                if(!eliminados.isEmpty())
                {
                    for(int i=0;i<eliminados.size();i++)
                    {
                        rdta.BorrarRenglon(eliminados.get(i));
                    }
                }
                pdta.actualizarPedido(pedido);
                
                pedido.imprimirPedido();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Agregue algun producto antes de confirmar el pedido");
        }
    }//GEN-LAST:event_jBConfirmarPedidoActionPerformed

    private void jBCargarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarRenglonActionPerformed
        int cant = Integer.parseInt(jSCant.getValue().toString());
        int caja = Integer.parseInt(jSCaja.getValue().toString());
        
        if(cant>=1)
        {
            if(caja>=1)
            {
                Producto prod = (Producto) jCBProduc.getSelectedItem();
                RenglonPedido renglon = new RenglonPedido (prod,pedido.getIdPedido(),cant,caja);
                pedido.agregarRenglon(renglon);

                modelo.addRow(new Object[]{prod.getCodigo(), prod.getNombre(), cant,
                caja, prod.getPrecioCosto(), prod.getPrecioVenta(), prod.getCantEstrellas()});
                jlbCosto.setText("Costo Total $"+pedido.calcularTotalCosto());
                jlbEstrellas.setText("Estrellas Totales: "+pedido.mostrarEstrellasTotales());
                jBorrarRenglon.setEnabled(true);   
            }else{ JOptionPane.showMessageDialog(this, "Debe asignar un número de caja superior a 0");}
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese una cantidad mayor a 0 del producto a agregar");
        }
    }//GEN-LAST:event_jBCargarRenglonActionPerformed

    private void jcheckUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckUsoActionPerformed
            cargarProd();
    }//GEN-LAST:event_jcheckUsoActionPerformed

    private void jBorrarRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarRenglonActionPerformed
        int fila = jTPedido.getSelectedRow();
        if(fila!=-1)
        {
            if(pedido.getRenglones().get(fila).getId_renglon()>=0)
            {
                eliminados.add(pedido.getRenglones().get(fila));
            }
            pedido.eliminarRenglon(fila);
            modelo.removeRow(fila);
            jlbCosto.setText("Costo Total $"+pedido.calcularTotalCosto());
            jlbEstrellas.setText("Estrellas Totales: "+pedido.mostrarEstrellasTotales());
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione el producto que desee eliminar del pedido");
        }
    }//GEN-LAST:event_jBorrarRenglonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargarRenglon;
    private javax.swing.JButton jBConfirmarPedido;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBorrarRenglon;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<Producto> jCBProduc;
    private javax.swing.JComboBox<Revendedora> jCBRev;
    private javax.swing.JComboBox<String> jCBSelectUso;
    private javax.swing.JLabel jLNumCamp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSCaja;
    private javax.swing.JSpinner jSCant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPedido;
    private javax.swing.JCheckBox jcheckUso;
    private com.toedter.calendar.JDateChooser jdFechaEntrega;
    private com.toedter.calendar.JDateChooser jdFechaPago;
    private javax.swing.JLabel jlbCosto;
    private javax.swing.JLabel jlbEstado;
    private javax.swing.JLabel jlbEstrellas;
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
        
            
    
    private void cargarFiltroSelector() {
        ArrayList<String> listUsos = prodta.listarUsos();
        jCBSelectUso.addItem("-------");
        for(int i =0;i<listUsos.size();i++)
        {
            jCBSelectUso.addItem(listUsos.get(i));
        }
    }
    
    private void cargarProd(){
        jCBProduc.removeAllItems();
        listprod = prodta.listarProductos();
        if(jcheckUso.isSelected())
        {
            listprod = prodta.listarPorUSO((String)jCBSelectUso.getSelectedItem());
        }else
        {
            listprod = prodta.listarProductos();
        }
        
        for(Producto prod: listprod){
            jCBProduc.addItem(prod);
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

    
}
