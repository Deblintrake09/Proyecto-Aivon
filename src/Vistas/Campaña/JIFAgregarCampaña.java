package Vistas.Campaña;

import Entidades.Campaña;
import Modelo.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;


public class JIFAgregarCampaña extends javax.swing.JInternalFrame 
{
    private Conexion con;
    private Campaña campaña;
    private CampañaData campañaData;
    
    public JIFAgregarCampaña() 
    {
        initComponents();
        con = new Conexion();
        campañaData = new CampañaData(con);
        jDCFechaIni.getDateEditor().setEnabled(false);
        jDCFechaFin.setEnabled(false);
        campActual();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFMontoMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFMontoMax = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jDCFechaFin = new com.toedter.calendar.JDateChooser();
        jDCFechaIni = new com.toedter.calendar.JDateChooser();
        jLNro = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(417, 397));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargar Campaña");

        jBSalir.setBackground(new java.awt.Color(153, 0, 0));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("X");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nro de campaña");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Inicio");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Fin");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Monto mínimo");

        jTFMontoMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMontoMinKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Monto máximo");

        jTFMontoMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMontoMaxKeyTyped(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLNro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(jBSalir)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFMontoMax, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTFMontoMin, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jDCFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jDCFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jLNro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFMontoMax, jTFMontoMin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDCFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFMontoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFMontoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLimpiar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFMontoMax, jTFMontoMin});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmar salida", JOptionPane.CLOSED_OPTION, JOptionPane.CANCEL_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        //try{
            if( jDCFechaIni.getDate()!=null 
                && !(jTFMontoMin.getText().isEmpty()) && !(jTFMontoMax.getText().isEmpty()))
            {   
                int numeroCampaña = Integer.parseInt(jLNro.getText());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaInicio = formato.format(jDCFechaIni.getDate());
                LocalDate fechaI = LocalDate.parse(fechaInicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String fechaFin = formato.format(validarLapso());
                LocalDate fechaF = LocalDate.parse(fechaFin, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                float montoMinimo = Float.parseFloat(jTFMontoMin.getText());
                float montoMaximo = Float.parseFloat(jTFMontoMax.getText());
                if(montoMinimo < montoMaximo){
                    campaña = new Campaña(numeroCampaña,fechaI,fechaF,montoMinimo,montoMaximo);
                    campañaData.agregarCampaña(campaña);
                    JOptionPane.showMessageDialog(this, "La campaña fue cargada con éxito");
                }
                else{
                    JOptionPane.showMessageDialog(this, "El monto máximo debe ser mayor al mínimo");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Por favor llene todos los campos");
            }
            limpiar();        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTFMontoMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMontoMinKeyTyped
         char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8 && validar !=46){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        }  
    }//GEN-LAST:event_jTFMontoMinKeyTyped

    private void jTFMontoMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMontoMaxKeyTyped
        char validar = evt.getKeyChar();
        if(!(Character.isDigit(validar)) && validar != 8 && validar !=46){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
        } 
    }//GEN-LAST:event_jTFMontoMaxKeyTyped
    
    
    private void limpiar()
    {
        Calendar c2 = new GregorianCalendar();
        jDCFechaIni.setCalendar(c2);
        jDCFechaFin.setDate(null);
        jTFMontoMin.setText(null);
        jTFMontoMax.setText(null);
        campActual();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDCFechaFin;
    private com.toedter.calendar.JDateChooser jDCFechaIni;
    private javax.swing.JLabel jLNro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFMontoMax;
    private javax.swing.JTextField jTFMontoMin;
    // End of variables declaration//GEN-END:variables

   private Date validarLapso(){
        Date t = jDCFechaIni.getDate();
        Calendar c = Calendar.getInstance();
        c.setTime(t);
        c.add(Calendar.DAY_OF_YEAR, 25);
        Date n = c.getTime();
        jDCFechaFin.setDate(n);
        return n;
    }
   private void campActual(){
        int cam;
        ArrayList<Campaña> listCamp = campañaData.obtenerCampañas();
        cam = listCamp.size()+1;
        jLNro.setText(String.valueOf(cam));
    }
}
