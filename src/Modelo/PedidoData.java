package Modelo;

import Entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoData 
{
    private Connection con;
    public PedidoData(Conexion con)
    {
        this.con = con.getConnection();
    }
    public void cargarPedido(Pedido pedido)
    {
       String query="INSERT INTO pedido(FECHA_INGRESO, FECHA_PAGO, FECHA_ENTREGA, DNI, NRO_CAMPAÑA, CANT_CAJAS, TOTAL_COSTO, ANULADO) VALUES (?,?,?,?,?,?,?,?)";
       try{
           PedidoData pd= new PedidoData(new Conexion());
           
           if(pd.buscarPedidoCampRev(pedido.getCampaña(), pedido.getRevendedora())==null)
           {
                PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setDate(1, Date.valueOf(pedido.getFechaIngreso()));

                if(pedido.getFechaPago()==null)
                    ps.setDate(2,null);
                else
                    ps.setDate(2, Date.valueOf(pedido.getFechaPago()));
                if(pedido.getFechaEntrega()==null)
                    ps.setDate(3,null);
                else
                    ps.setDate(3, Date.valueOf(pedido.getFechaEntrega()));

                ps.setInt(4, pedido.getRevendedora().getDni());
                ps.setInt(5, pedido.getCampaña().getNroCampaña());
                ps.setInt(6, pedido.getCantCajas());
                ps.setFloat(7, pedido.calcularTotalCosto());
                ps.setBoolean(8, pedido.isAnulado());
                ps.executeUpdate();
                ResultSet rs=ps.getGeneratedKeys();
                if(rs.next()){
                    pedido.setIdPedido(rs.getInt(1));
                    Conexion c = new Conexion();
                    RenglonData rd = new RenglonData(c);
                    if(pedido.getRenglones()!=null)
                    {
                        for(int i=0;i<pedido.getRenglones().size();i++)
                        {   
                            pedido.getRenglones().get(i).setId_pedido(pedido.getIdPedido());
                            if(pedido.getRenglones().get(i).getId_renglon()==0)
                            {
                                rd.agregarRenglon(pedido.getRenglones().get(i));
                            }
                            else
                            {
                                rd.modificarRenglon(pedido.getRenglones().get(i));
                            }
                        }
                    }
                    c.cerrarConexion();
                }
                else {
                    JOptionPane.showMessageDialog(null, "No pudo obtener id pedido.");
                }
                ps.close();
           }
           else
           {
                   JOptionPane.showMessageDialog(null, "No se cargó pedido. Ya Hay pedido para ésta revendedora y campaña");                
           }
       }
       catch(SQLException e ){
           JOptionPane.showMessageDialog(null, "No pudo cargar pedido." + e.toString());
       }
   }
    
    public void actualizarPedido(Pedido pedido){
        String query="UPDATE pedido SET FECHA_INGRESO=?, FECHA_PAGO=?, FECHA_ENTREGA=?, CANT_CAJAS=?, TOTAL_COSTO=? WHERE ID_PEDIDO=?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(pedido.getFechaIngreso()));
            if(pedido.getFechaPago()==null)
                ps.setDate(2,null);
            else
                ps.setDate(2, Date.valueOf(pedido.getFechaPago()));
            if(pedido.getFechaEntrega()==null)
                ps.setDate(3,null);
            else
                ps.setDate(3, Date.valueOf(pedido.getFechaEntrega()));
            ps.setInt(4, pedido.getCantCajas());
            ps.setFloat(5, pedido.calcularTotalCosto());
            ps.setInt(6, pedido.getIdPedido());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            
            if(!rs.next()){
               Conexion c = new Conexion();
               RenglonData rd = new RenglonData(c);
               for(int i=0;i<pedido.getRenglones().size();i++)
               {   
                   pedido.getRenglones().get(i).setId_pedido(pedido.getIdPedido());
                   if(pedido.getRenglones().get(i).getId_renglon()<0)
                   {
                       rd.agregarRenglon(pedido.getRenglones().get(i));
                   }
                   else
                   {
                       rd.modificarRenglon(pedido.getRenglones().get(i));
                   }
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
        String query="SELECT * FROM pedido WHERE DNI = ?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt(1));
                pedido.setFechaIngreso(rs.getDate(2).toLocalDate());
                
                if(rs.getDate(3)==null)
                    pedido.setFechaPago(null);
                else
                pedido.setFechaPago(rs.getDate(3).toLocalDate());
                
                if(rs.getDate(4)== null)
                    pedido.setFechaEntrega(null);
                else
                    pedido.setFechaEntrega(rs.getDate(4).toLocalDate());
                
                Revendedora r= buscarRevendedora(rs.getInt(5));
                Campaña c= buscarCampaña(rs.getInt(6));
                pedido.setRevendedora(r);
                pedido.setCampaña(c);
                pedido.setCantCajas(rs.getInt(7));
                pedido.setTotalCosto(rs.getFloat(8));
                pedido.setAnulado(rs.getBoolean(9));
                
                Conexion crd=new Conexion();
                RenglonData rd = new RenglonData(crd);
                pedido.setRenglones(rd.listarRenglonesXPedido(pedido.getIdPedido()));
                crd.cerrarConexion();
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
        String query="SELECT * FROM pedido WHERE NRO_CAMPAÑA = ?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nro);
            ResultSet rs= ps.executeQuery();
            Conexion crd=new Conexion();
            RenglonData rd = new RenglonData(crd);
            while(rs.next()){
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt(1));
                pedido.setFechaIngreso(rs.getDate(2).toLocalDate());
               
                if(rs.getDate(3)==null)
                    pedido.setFechaPago(null);
                else
                pedido.setFechaPago(rs.getDate(3).toLocalDate());
                
                if(rs.getDate(4)== null)
                    pedido.setFechaEntrega(null);
                else
                    pedido.setFechaEntrega(rs.getDate(4).toLocalDate());
                
                Revendedora r= buscarRevendedora(rs.getInt(5));
                Campaña c= buscarCampaña(rs.getInt(6));
                pedido.setRevendedora(r);
                pedido.setCampaña(c);
                pedido.setCantCajas(rs.getInt(7));
                pedido.setTotalCosto(rs.getFloat(8));
                pedido.setAnulado(rs.getBoolean(9));
                
                pedido.setRenglones(rd.listarRenglonesXPedido(pedido.getIdPedido()));
                pedidoscm.add(pedido);
            }
            crd.cerrarConexion();
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pedidoscm;
    }
    
    public Pedido buscarPedidoCampRev(Campaña camp, Revendedora rev)
    {
        Pedido pedido=null;
        String query="SELECT * FROM pedido WHERE NRO_CAMPAÑA = ? AND DNI = ?";
        try{
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, camp.getNroCampaña());
            ps.setInt(2, rev.getDni());
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt(1));
                pedido.setFechaIngreso(rs.getDate(2).toLocalDate());
               
                if(rs.getDate(3)==null)
                    pedido.setFechaPago(null);
                else
                pedido.setFechaPago(rs.getDate(3).toLocalDate());
                
                if(rs.getDate(4)== null)
                    pedido.setFechaEntrega(null);
                else
                    pedido.setFechaEntrega(rs.getDate(4).toLocalDate());
                
                pedido.setRevendedora(rev);
                pedido.setCampaña(camp);
                pedido.setCantCajas(rs.getInt(7));
                pedido.setTotalCosto(rs.getFloat(8));
                pedido.setAnulado(rs.getBoolean(9));
                Conexion conex= new Conexion();
                RenglonData rd = new RenglonData(conex);
                pedido.setRenglones(rd.listarRenglonesXPedido(pedido.getIdPedido()));
                conex.cerrarConexion();
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return pedido;
    }
    
    
    public void entregarPedido(Pedido pedido, LocalDate fecha)
    {
        String query="UPDATE pedido SET FECHA_ENTREGA=? WHERE ID_PEDIDO = ?";
        if(fecha !=null)
        {
            pedido.setFechaEntrega(fecha);
            try{
                PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setDate(1, Date.valueOf(fecha));
                ps.setInt(2, pedido.getIdPedido());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "No pudo cargar fecha de Entrega");
                }
                ps.close();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
     }
    
    
    public void pagarPedido(Pedido pedido, LocalDate fecha)
    {
        String query="UPDATE pedido SET FECHA_PAGO=? WHERE ID_PEDIDO = ?";
        if(fecha !=null)
        {
            pedido.setFechaPago(fecha);
            try{
                PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                ps.setDate(1, Date.valueOf(fecha));
                ps.setInt(2, pedido.getIdPedido());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "No pudo cargar fecha de Pago");
                }
                ps.close();
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
     }
   
    public void cambiarEstado(Pedido pd, boolean an)
    {
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
    
    
    
    
}
