package Vistas;

import Vistas.Campaña.*;
import Vistas.Revendedora.*;
import Vistas.Producto.*;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMRevendedora = new javax.swing.JMenu();
        jMenuAgregarRev = new javax.swing.JMenuItem();
        jMenuBuscar = new javax.swing.JMenuItem();
        jMenuNivel = new javax.swing.JMenuItem();
        jMenuBajaRev = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuListarRev = new javax.swing.JMenuItem();
        jMProducto = new javax.swing.JMenu();
        jMenuFormProd = new javax.swing.JMenuItem();
        jmModifProd = new javax.swing.JMenuItem();
        jmListarProductos = new javax.swing.JMenuItem();
        jMPedido = new javax.swing.JMenu();
        jMenuFormPedido = new javax.swing.JMenuItem();
        jMenuRenglon = new javax.swing.JMenu();
        jMCampaña = new javax.swing.JMenu();
        jMFormCamp = new javax.swing.JMenuItem();
        jMListarCamp = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jMRevendedora.setText("Revendedora");
        jMRevendedora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuAgregarRev.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuAgregarRev.setText("Agregar");
        jMenuAgregarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarRevActionPerformed(evt);
            }
        });
        jMRevendedora.add(jMenuAgregarRev);

        jMenuBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBuscar.setText("Buscar y modificar");
        jMenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarActionPerformed(evt);
            }
        });
        jMRevendedora.add(jMenuBuscar);

        jMenuNivel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuNivel.setText("Subir nivel");
        jMRevendedora.add(jMenuNivel);

        jMenuBajaRev.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBajaRev.setText("Cambiar estado");
        jMRevendedora.add(jMenuBajaRev);

        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem2.setText("Anular");
        jMRevendedora.add(jMenuItem2);

        jMenuListarRev.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuListarRev.setText("Mostrar Todas");
        jMenuListarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarRevActionPerformed(evt);
            }
        });
        jMRevendedora.add(jMenuListarRev);

        jMenuBar1.add(jMRevendedora);

        jMProducto.setText("Producto");
        jMProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuFormProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuFormProd.setText("Agregar Producto");
        jMenuFormProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormProdActionPerformed(evt);
            }
        });
        jMProducto.add(jMenuFormProd);

        jmModifProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmModifProd.setText("Modificar Producto");
        jmModifProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModifProdActionPerformed(evt);
            }
        });
        jMProducto.add(jmModifProd);

        jmListarProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmListarProductos.setText("Listar Productos");
        jmListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListarProductosActionPerformed(evt);
            }
        });
        jMProducto.add(jmListarProductos);

        jMenuBar1.add(jMProducto);

        jMPedido.setText("Pedido");
        jMPedido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuFormPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuFormPedido.setText("Formulario");
        jMPedido.add(jMenuFormPedido);

        jMenuBar1.add(jMPedido);

        jMenuRenglon.setText("Renglon");
        jMenuRenglon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuBar1.add(jMenuRenglon);

        jMCampaña.setText("Campaña");
        jMCampaña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMFormCamp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMFormCamp.setText("Formulario");
        jMCampaña.add(jMFormCamp);

        jMListarCamp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMListarCamp.setText("Mostrar todas");
        jMListarCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarCampActionPerformed(evt);
            }
        });
        jMCampaña.add(jMListarCamp);

        jMenuBar1.add(jMCampaña);

        jMSalir.setText("Salir");
        jMSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMISalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMSalir.add(jMISalir);

        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmar salida", JOptionPane.CLOSED_OPTION, JOptionPane.CANCEL_OPTION);
        if(opcion==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMISalirActionPerformed

    private void jMenuListarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarRevActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        JIFListarRev listre = new JIFListarRev();
        listre.setVisible(true);
        listre.setBounds(400, 150, 620, 300);
        escritorio.add(listre);
        escritorio.moveToFront(listre);
    }//GEN-LAST:event_jMenuListarRevActionPerformed

    private void jMListarCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarCampActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        JIFListarCamp listcam = new JIFListarCamp();
        listcam.setVisible(true);
        listcam.setBounds(400, 190, 521, 244);
        escritorio.add(listcam);
        escritorio.moveToFront(listcam);
    }//GEN-LAST:event_jMListarCampActionPerformed

    private void jMenuAgregarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarRevActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        JIFAgregarRev agregarRev = new JIFAgregarRev();
        agregarRev.setVisible(true);
        agregarRev.setBounds(500, 150, 400, 403);
        escritorio.add(agregarRev);
        escritorio.moveToFront(agregarRev);
    }//GEN-LAST:event_jMenuAgregarRevActionPerformed

    private void jMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        JIFBuscarRev buscarRev = new JIFBuscarRev();
        buscarRev.setVisible(true);
        buscarRev.setBounds(500, 150, 397, 437);
        escritorio.add(buscarRev);
        escritorio.moveToFront(buscarRev);
    }//GEN-LAST:event_jMenuBuscarActionPerformed

    private void jMenuFormProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormProdActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JIFAgregarProducto prod = new JIFAgregarProducto();
        prod.setVisible(true);
        prod.setBounds(500, 150, 340, 420);
        escritorio.add(prod);
        escritorio.moveToFront(prod);
    }//GEN-LAST:event_jMenuFormProdActionPerformed

    private void jmListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListarProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JIFListarProductos prod = new JIFListarProductos();
        prod.setVisible(true);
        prod.setBounds(500, 150, 800, 500);
        escritorio.add(prod);
        escritorio.moveToFront(prod);
    }//GEN-LAST:event_jmListarProductosActionPerformed

    private void jmModifProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModifProdActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        JIFModificarProductos prod = new JIFModificarProductos();
        prod.setVisible(true);
        prod.setBounds(500, 150, 340, 454);
        escritorio.add(prod);
        escritorio.moveToFront(prod);
    }//GEN-LAST:event_jmModifProdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana vent = new Ventana();
                vent.setVisible(true);
                vent.setExtendedState(MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMCampaña;
    private javax.swing.JMenuItem jMFormCamp;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenuItem jMListarCamp;
    private javax.swing.JMenu jMPedido;
    private javax.swing.JMenu jMProducto;
    private javax.swing.JMenu jMRevendedora;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuAgregarRev;
    private javax.swing.JMenuItem jMenuBajaRev;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuBuscar;
    private javax.swing.JMenuItem jMenuFormPedido;
    private javax.swing.JMenuItem jMenuFormProd;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuListarRev;
    private javax.swing.JMenuItem jMenuNivel;
    private javax.swing.JMenu jMenuRenglon;
    private javax.swing.JMenuItem jmListarProductos;
    private javax.swing.JMenuItem jmModifProd;
    // End of variables declaration//GEN-END:variables
}
