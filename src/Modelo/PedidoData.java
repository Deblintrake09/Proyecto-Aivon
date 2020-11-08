package Modelo;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoData {
    private Connection con;
    public PedidoData(Conexion con){
        this.con = con.getConnection();
    }
   public void cargarPedido(Pedido pedido){
       String query="INSERT INTO pedido(FECHA_INGRESO, FECHA_PAGO, FECHA_ENTREGA, DNI, NRO_CAMPAÑA, CANT_CAJAS, TOTAL_COSTO, ANULADO) VALUES (?,?,?,?,?,?,?,?)";
       try{
           PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           ps.setDate(1, Date.valueOf(pedido.getFechaIngreso()));
           ps.setDate(2, Date.valueOf(pedido.getFechaPago()));
           ps.setDate(3, Date.valueOf(pedido.getFechaEntrega()));
           ps.setInt(4, pedido.getRevendedora().getIdRev());
           ps.setInt(5, pedido.getCampaña().getIdCampaña());
           ps.setInt(6, pedido.getCantCajas());
           ps.setFloat(7, pedido.getTotalCosto());
           ps.setBoolean(8, pedido.isAnulado());
           ps.executeUpdate();
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()){
               pedido.setIdPedido(rs.getInt(1));
               Conexion c = new Conexion();
               RenglonData rd = new RenglonData(c);
               for(int i=0;i<pedido.getRenglones().size();i++)
               {   
                   pedido.getRenglones().get(i).setId_pedido(pedido.getIdPedido());
                   rd.agregarRenglon(pedido.getRenglones().get(i));
               }
               c.cerrarConexion();
           }
           else {
               JOptionPane.showMessageDialog(null, "No pudo obtener id pedido.");
           }
           ps.close();
       }
       catch(SQLException e ){
           JOptionPane.showMessageDialog(null, "No pudo cargar pedido.");
       }
   }
    public void anularPedido(Pedido pd, boolean an){
         String query="UPDATE pedido SET ANULADO=? WHERE ID_PEDIDO = ?";
         try{
             PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             ps.setBoolean(1, an);
             ps.setInt(2, pd.getIdPedido());
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             if(rs.next()){
                 JOptionPane.showMessageDialog(null, "No pudo se dar de baja");
             }
             ps.close();
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.toString());
         }
     }
    
    public void actualizarPedido(Pedido pedido){
        String query="UPDATE pedido SET FECHA_INGRESO=?, FECHA_PAGO=?, FECHA_ENTREGA=?, CANT_CAJAS=?, TOTAL_COSTO=? WHERE ID_PEDIDO=?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(pedido.getFechaIngreso()));
            ps.setDate(2, Date.valueOf(pedido.getFechaPago()));
            ps.setDate(3, Date.valueOf(pedido.getFechaEntrega()));
            ps.setInt(4, pedido.getCantCajas());
            ps.setFloat(5, pedido.getTotalCosto());
            ps.setInt(6, pedido.getIdPedido());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(!rs.next()){
               Conexion c = new Conexion();
               RenglonData rd = new RenglonData(c);
               for(int i=0;i<pedido.getRenglones().size();i++)
               {   
                   pedido.getRenglones().get(i).setId_pedido(pedido.getIdPedido());
                   rd.agregarRenglon(pedido.getRenglones().get(i));
               }
               c.cerrarConexion();
            } else
            {
                JOptionPane.showMessageDialog(null, "No pudo actualizar.");
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public ArrayList<Pedido> buscarPedidoXRev(int dni){
        Pedido pedido=null;
        ArrayList<Pedido> pedidosrv = new ArrayList<>();
        String query="SELECT * FROM pedido WHERE pedido.DNI = ?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt(1));
                pedido.setFechaIngreso(rs.getDate(2).toLocalDate());
                pedido.setFechaPago(rs.getDate(3).toLocalDate());
                pedido.setFechaEntrega(rs.getDate(4).toLocalDate());
                Revendedora r= buscarRevendedora(rs.getInt(5));
                Campaña c= buscarCampaña(rs.getInt(6));
                pedido.setRevendedora(r);
                pedido.setCampaña(c);
                pedido.setCantCajas(rs.getInt(7));
                pedido.setTotalCosto(rs.getFloat(8));
                pedido.setAnulado(rs.getBoolean(9));
                pedidosrv.add(pedido);
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pedidosrv;
    }
    public ArrayList<Pedido> buscarPedidoXCam(int nro){
        Pedido pedido=null;
        ArrayList<Pedido> pedidoscm = new ArrayList<>();
        String query="SELECT * FROM pedido WHERE pedido.NRO_CAMPAÑA = ?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nro);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt(1));
                pedido.setFechaIngreso(rs.getDate(2).toLocalDate());
                pedido.setFechaPago(rs.getDate(3).toLocalDate());
                pedido.setFechaEntrega(rs.getDate(4).toLocalDate());
                Revendedora r= buscarRevendedora(rs.getInt(5));
                Campaña c= buscarCampaña(rs.getInt(6));
                pedido.setRevendedora(r);
                pedido.setCampaña(c);
                pedido.setCantCajas(rs.getInt(7));
                pedido.setTotalCosto(rs.getFloat(8));
                pedido.setAnulado(rs.getBoolean(9));
                pedidoscm.add(pedido);
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pedidoscm;
    }
    public Revendedora buscarRevendedora(int dni){
        Conexion c = new Conexion();
        RevendedoraData rd=new RevendedoraData(c);
        Revendedora rev= rd.buscarPorDni(dni);
        c.cerrarConexion();
        return rev;
    }
    public Campaña buscarCampaña(int numero){
        Conexion c=new Conexion();
        CampañaData cd=new CampañaData(c);
        Campaña cam =cd.buscarNroCampaña(numero);
        c.cerrarConexion();
        return cam;
    }
    // falta hacer ActualizarPedido- BuscarPedido 

}
