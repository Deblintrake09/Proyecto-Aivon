package Vistas.Pedido;

import Entidades.*;
import Modelo.*;
import java.awt.Color;
import java.sql.Date;
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
    private String estado;

    public JIFModificarPedido() {
        initComponents();
        con = new Conexion();
        campdta = new CampañaData(con);
        revdta = new RevendedoraData(con);
        pdta = new PedidoData(con);
        prodta = new ProductoData(con);
        rdta = new RenglonData(con);
        pedido = null;
        eliminados=new ArrayList();
        estado="";
        modelo = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {  
                return false;
            }
        };
        armarCabecera();
        cargarProd();
        cargarSelectorCampañas();
        cargarRev();
        cargarFiltroSelector();
        resetearCampos();

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCBRev = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jlbFechaInicio = new javax.swing.JLabel();
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
        jCBCampaña = new javax.swing.JComboBox<>();
        jbAnular = new javax.swing.JButton();
        jBModifRenglon = new javax.swing.JButton();
        jBEntrega = new javax.swing.JButton();
        jBPagar = new javax.swing.JButton();
        jlbMin = new javax.swing.JLabel();
        jlbMax = new javax.swing.JLabel();
        jlbInicioCamp = new javax.swing.JLabel();
        jlbFinCamp = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver / Modificar un Pedido");

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
        jLabel2.setText("Campaña");

        jlbFechaInicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbFechaInicio.setText("Fecha Inicio:            --/--/--");

        jdFechaEntrega.setNextFocusableComponent(jBEntrega);

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

        jdFechaPago.setNextFocusableComponent(jBPagar);

        jlbEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbEstado.setText("Estado:      ----------");

        jCBCampaña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jbAnular.setText("Aunlar Pedido");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jBModifRenglon.setText("Modificar Renglon");
        jBModifRenglon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifRenglonActionPerformed(evt);
            }
        });

        jBEntrega.setText("Entregar");
        jBEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntregaActionPerformed(evt);
            }
        });

        jBPagar.setText("Pagar");
        jBPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPagarActionPerformed(evt);
            }
        });

        jlbMin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbMin.setText("Monto Min. $");

        jlbMax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbMax.setText("Monto Máx. $");

        jlbInicioCamp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbInicioCamp.setText("Inicio Camp:");

        jlbFinCamp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbFinCamp.setText("Fin Camp:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCBCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jSCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBuscar)
                                        .addGap(53, 53, 53))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbInicioCamp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlbFinCamp)
                                        .addGap(101, 101, 101)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlbEstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlbFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBPagar)
                                    .addComponent(jBEntrega)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197)
                                .addComponent(jBSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAnular)
                                .addGap(25, 25, 25)
                                .addComponent(jBConfirmarPedido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCargarRenglon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBModifRenglon)
                                .addGap(4, 4, 4)
                                .addComponent(jBorrarRenglon)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbMin)
                            .addComponent(jlbEstrellas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbMax)
                            .addComponent(jlbCosto))
                        .addGap(63, 63, 63)))
                .addContainerGap())
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBCampaña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jBEntrega)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jdFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbInicioCamp)))
                    .addComponent(jBPagar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlbFinCamp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCargarRenglon)
                    .addComponent(jlbEstrellas)
                    .addComponent(jlbCosto)
                    .addComponent(jBModifRenglon)
                    .addComponent(jBorrarRenglon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbMin)
                    .addComponent(jlbMax))
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
        CargarPedido();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarPedidoActionPerformed
        
        if(modelo.getRowCount()>=1)
        {
            if(pedido.calcularTotalCosto()>=pedido.getCampaña().getMontoMinimo())
            {
                for(int i=0;i<modelo.getRowCount();i++)
                {
                    int cant = Integer.parseInt(modelo.getValueAt(i, 2).toString());
                    int caja = Integer.parseInt(modelo.getValueAt(i, 3).toString());
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
                    JOptionPane.showMessageDialog(this, "Pedido Actualizado con éxito");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Para Confirmar el pedido debe alcanzar el monto mínimo\n Monto minimo:" + pedido.getCampaña().getMontoMinimo());
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
                configurarLabelsMontos(pedido);
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
            configurarLabelsMontos(pedido);
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione el producto que desee eliminar del pedido");
        }
    }//GEN-LAST:event_jBorrarRenglonActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        int confirmar;
        if(pedido.devolverEstado()!="Pagado")
        {
        if(!pedido.isAnulado())
        {
        confirmar = JOptionPane.showConfirmDialog(this, "Seguro desea anular el Pedido", "¿Confirma anular éste Pedido?", JOptionPane.OK_OPTION);
        }else{
            confirmar = JOptionPane.showConfirmDialog(this, "Seguro desea reactivar el Pedido", "¿Confirma reactivar éste Pedido?", JOptionPane.OK_OPTION);
        }
            if(confirmar ==0)
            {
                pedido.setAnulado(!pedido.isAnulado());
                pdta.cambiarEstado(pedido, pedido.isAnulado());
                CargarPedido();
            }
        } 
        else{
            JOptionPane.showMessageDialog(this, "No Puedes Anular un pedido que ya ha sido entregado y pagado");
        }
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jBModifRenglonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifRenglonActionPerformed
        int fila = jTPedido.getSelectedRow();
        if(fila!=-1)
        {
            int cant =Integer.parseInt(jSCant.getValue().toString());
            int caja = Integer.parseInt(jSCaja.getValue().toString());
            if(caja>0)
            {
                if(caja>0)
                {
                    pedido.getRenglones().get(fila).setCantidad(cant);
                    pedido.getRenglones().get(fila).setNro_caja(caja);
                    modelo.setValueAt(cant, fila, 2);
                    modelo.setValueAt(caja, fila, 3);
                    
                    configurarLabelsMontos(pedido);
                }else{
                    JOptionPane.showMessageDialog(this, "Debe Asignar un N° de caja superior a 0 para el producto.");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad de producto superior a 0. \n Si no desea ingresar dicho producto borre el renglon");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione el renglon que desee modificar");
        }
    }//GEN-LAST:event_jBModifRenglonActionPerformed

    private void jBPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPagarActionPerformed
        
        if(pedido.getFechaEntrega()!=null)
        {
            if(jdFechaPago.getDate()!=null)
            {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = formato.format(jdFechaPago.getDate());
                LocalDate fechaP = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if(fechaP.isAfter(pedido.getFechaEntrega()))
                {
                    int confirma = JOptionPane.showConfirmDialog(this, "Asignar Fecha de Pago", "¿Confirma que desea asignar fecha de pago a éste Pedido?", JOptionPane.OK_OPTION);
                    if(confirma ==0)
                    {

                        pdta.pagarPedido(pedido, fechaP);
                        JOptionPane.showMessageDialog(this, "Fecha de Pago Cargada con éxito");
                        CargarPedido();
                    }
                }else {
                JOptionPane.showMessageDialog(this, "Debe asignar una Fecha de Pago posterior a la de entrega");
                }
            }
        }else
        {
            JOptionPane.showMessageDialog(this, "Antes de Cargar Fecha de Pago, asigne una fecha de Entrega");
        }
        
    }//GEN-LAST:event_jBPagarActionPerformed

    private void jBEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntregaActionPerformed
        
        Pedido pcontrol= pdta.buscarPedidoCampRev(pedido.getCampaña(), pedido.getRevendedora());
        if(pcontrol.calcularTotalCosto()<pcontrol.getCampaña().getMontoMinimo())
        {
                    JOptionPane.showMessageDialog(this, "No se puede entregar un pedido con monto menor al mínimo de campaña.\n"
                            + "Controle que todos los productos deseados esten cargados en el pedido y confirme el pedido");
        }
        else{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = formato.format(jdFechaEntrega.getDate());
            LocalDate fechaP = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (fechaP.isAfter(pedido.getFechaIngreso()))
            {
                int confirma = JOptionPane.showConfirmDialog(this, "Asignar Fecha de Entrega", "¿Confirma que desea asignar fecha de entrega a éste Pedido?", JOptionPane.OK_OPTION);
                   if(confirma ==0)
                {

                    JOptionPane.showMessageDialog(this, "Fecha de Entrega Cargada con éxito");
                    pdta.entregarPedido(pedido, fechaP);
                    CargarPedido();
                }
            }else{
                    JOptionPane.showMessageDialog(this, "Debe asignar una Fecha de Pago posterior a la de Ingreso");
            }
        }
    }//GEN-LAST:event_jBEntregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargarRenglon;
    private javax.swing.JButton jBConfirmarPedido;
    private javax.swing.JButton jBEntrega;
    private javax.swing.JButton jBModifRenglon;
    private javax.swing.JButton jBPagar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBorrarRenglon;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<Campaña> jCBCampaña;
    private javax.swing.JComboBox<Producto> jCBProduc;
    private javax.swing.JComboBox<Revendedora> jCBRev;
    private javax.swing.JComboBox<String> jCBSelectUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JButton jbAnular;
    private javax.swing.JCheckBox jcheckUso;
    private com.toedter.calendar.JDateChooser jdFechaEntrega;
    private com.toedter.calendar.JDateChooser jdFechaPago;
    private javax.swing.JLabel jlbCosto;
    private javax.swing.JLabel jlbEstado;
    private javax.swing.JLabel jlbEstrellas;
    private javax.swing.JLabel jlbFechaInicio;
    private javax.swing.JLabel jlbFinCamp;
    private javax.swing.JLabel jlbInicioCamp;
    private javax.swing.JLabel jlbMax;
    private javax.swing.JLabel jlbMin;
    // End of variables declaration//GEN-END:variables

    private void cargarRev(){
        ArrayList<Revendedora> listrev = revdta.mostrarRevendedoras();
        for(Revendedora r: listrev){
            jCBRev.addItem(r);
        }
    }

    private void cargarSelectorCampañas() {
        ArrayList<Campaña>listaCamp = campdta.obtenerCampañas();
        for(int i =0;i<listaCamp.size();i++)
        {
            if(listaCamp.get(i).getFechaInicio().isBefore(java.time.LocalDate.now()))
            {
            jCBCampaña.addItem(listaCamp.get(i));
            }
        }
        jCBCampaña.setSelectedIndex(jCBCampaña.getItemCount()-1);
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
    
    private void cargarTabla(Pedido p)
    {
        borrarFilas();
        Producto prod;
        for (int i=0;i<p.getRenglones().size();i++)
        {
            prod= prodta.buscarPorID(p.getRenglones().get(i).getId_producto());
            
            modelo.addRow(new Object[]{prod.getCodigo(), prod.getNombre(), p.getRenglones().get(i).getCantidad(),p.getRenglones().get(i).getNro_caja(),
                p.getRenglones().get(i).getPrecio_costo(), p.getRenglones().get(i).getPrecio_publico(),p.getRenglones().get(i).getCant_estrellas()});
        }
    }
    
    private void borrarFilas(){
        int a = modelo.getRowCount()-1;
        for (int i =a; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    public void resetearCampos()
    {
        jdFechaEntrega.getDateEditor().setEnabled(false);
        jCBProduc.setEnabled(false);
        jCBSelectUso.setEnabled(false);
        jSCaja.setEnabled(false);
        jSCant.setEnabled(false);
        jBConfirmarPedido.setEnabled(false);
        jBCargarRenglon.setEnabled(false);
        jBorrarRenglon.setEnabled(false);
        jdFechaPago.setEnabled(false);
        jdFechaEntrega.setEnabled(false);
        jbAnular.setEnabled(false);
        jbAnular.setBackground(Color.red);
        jbAnular.setText("Anular Pedido");
        jdFechaEntrega.setDate(null);
        jdFechaPago.setDate(null);
        jBModifRenglon.setEnabled(false);
        jBEntrega.setEnabled(false);
        jBPagar.setEnabled(false);
        jlbEstado.setForeground(Color.black);
        configurarLabelsMontos(pedido);
        jlbFinCamp.setText("Fin Camp:");
        jlbInicioCamp.setText("Inicio Camp:");
        
    }
    
    private void configurarLabelsMontos(Pedido ped)
    {
        jlbMin.setForeground(Color.black);
        jlbMax.setForeground(Color.black);
        jlbMin.setText("Monto Mín. $");
        jlbMax.setText("Monto Máx. $");
        if(pedido!=null)
        {
            float costo = ped.calcularTotalCosto();
            jlbMin.setText("Monto Mín. $"+ped.getCampaña().getMontoMinimo());
            jlbMax.setText("Monto Máx. $"+ped.getCampaña().getMontoMaximo());
            jlbCosto.setText("Costo Total $"+pedido.calcularTotalCosto());
            jlbEstrellas.setText("Estrellas Totales: "+pedido.mostrarEstrellasTotales());
            if(ped.getCampaña().getMontoMinimo()<=costo)
            {
                jlbMin.setForeground(Color.green);
            }
            else{
                jlbMin.setForeground(Color.red);
            }if(ped.getCampaña().getMontoMaximo()<=costo)
            {
                jlbMin.setForeground(Color.green);
            }
        }
    }
    
    private void configurarBotonAnular(){
        if(pedido.isAnulado())
        {
            jbAnular.setText("Reactivar Pedido");
            jbAnular.setBackground(Color.green);
        }else
        {
            jbAnular.setText("Anular Pedido");
            jbAnular.setBackground(Color.red);
            }
    }
    
    private void CargarPedido(){
        
        Revendedora rev = (Revendedora) jCBRev.getSelectedItem();
        Campaña camp = (Campaña)jCBCampaña.getSelectedItem();
        resetearCampos();
        pedido =null;
        pedido =  pdta.buscarPedidoCampRev(camp, rev);
        if(pedido!=null)
        {
            String estado= pedido.devolverEstado();
            jlbFechaInicio.setText("Fecha Inicio:        "+pedido.getFechaIngreso().toString());
            jlbEstado.setText("Estado:                 "+estado);
            jlbInicioCamp.setText("Inicio Camp: "+ camp.getFechaInicio());
            jlbFinCamp.setText("Fin Camp: "+camp.getFechaFin());
            configurarLabelsMontos(pedido);
            configurarBotonAnular();
            jbAnular.setEnabled(true);
            cargarTabla(pedido);
            if(java.time.LocalDate.now().isAfter(camp.getFechaInicio())&&java.time.LocalDate.now().isBefore(camp.getFechaFin()))
            {
                switch(estado)
                {
                    case ("Ingresado"):
                        jCBProduc.setEnabled(true);
                        jBCargarRenglon.setEnabled(true);
                        jBorrarRenglon.setEnabled(true);
                        jBModifRenglon.setEnabled(true);
                        jdFechaEntrega.setEnabled(true);
                        jdFechaPago.setEnabled(true);
                        jCBSelectUso.setEnabled(true);
                        jSCaja.setEnabled(true);
                        jSCant.setEnabled(true);
                        jBEntrega.setEnabled(true);
                        jBPagar.setEnabled(true);
                        jBConfirmarPedido.setEnabled(true);

                    break;
                    case ("Entregado"):

                        jdFechaEntrega.setDate(Date.valueOf(pedido.getFechaEntrega()));
                        jdFechaEntrega.setEnabled(false);
                        jdFechaPago.setEnabled(true);
                        jBPagar.setEnabled(true);
                    break;
                    case ("Vencido"):
                        jdFechaEntrega.setDate(Date.valueOf(pedido.getFechaEntrega()));
                        jdFechaEntrega.setEnabled(false);
                        jdFechaPago.setEnabled(true);
                        jBPagar.setEnabled(true);
                        jlbEstado.setForeground(Color.red);
                    break;
                    case ("Pagado"):
                        jdFechaEntrega.setDate(Date.valueOf(pedido.getFechaEntrega()));
                        jdFechaEntrega.setEnabled(false);
                        jdFechaPago.setDate(Date.valueOf(pedido.getFechaPago()));
                        jdFechaPago.setEnabled(false);
                    break;
                    case ("Anulado"):
                        if(pedido.getFechaEntrega()!=null)
                        {
                        jdFechaEntrega.setDate(Date.valueOf(pedido.getFechaEntrega()));
                        jdFechaEntrega.setEnabled(false);
                        }else{
                        }
                        if(pedido.getFechaPago()!=null)
                        {
                        jdFechaPago.setDate(Date.valueOf(pedido.getFechaPago()));
                        jdFechaPago.setEnabled(false);
                        }
                        jbAnular.setText("Reactivar");
                        jbAnular.setBackground(Color.green);
                        break;                                
                }
            }
            else
            {
                configurarBotonAnular();
                JOptionPane.showMessageDialog(this, "La Campaña para éste pedido ha terminado.\n No puedes modificar el Pedido");
                
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay pedido para ésta revendedora en la campaña seleccionada.\n Cree un pedido desde Iniciar Pedido");
            resetearCampos();
        }
    }
   
 
}
