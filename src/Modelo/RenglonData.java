/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import Entidades.RenglonPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class RenglonData {

    private Connection con;

    public RenglonData(Conexion con) {
        this.con = con.getConnection();
    }
    
    public void agregarRenglon(RenglonPedido reng)
    {
        String query = "INSERT INTO renglon_pedido (ID_PRODUCTO, ID_PEDIDO, CANTIDAD, NRO_CAJA, PRECIO_COSTO, PRECIO_PUBLICO, CANT_ESTRELLAS, ANULADO)"+
                       " VALUES (?,?,?,?,?,?,?,?)";
        try
        {
            PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reng.getId_producto());
            ps.setInt(2, reng.getId_pedido());
            ps.setInt(3, reng.getCantidad());
            ps.setInt(4, reng.getNro_caja());
            ps.setFloat(5, reng.getPrecio_costo());
            ps.setFloat(6, reng.getPrecio_publico());
            ps.setInt(7, reng.getCant_estrellas());
            ps.setBoolean(8, reng.isAnulado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next())
            {
                reng.setId_renglon(rs.getInt(1));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public RenglonPedido buscarRenglon(int id)
    {
        String query ="SELECT * FROM renglon_pedido WHERE ID_RENGLON = "+id;
        RenglonPedido reng = new RenglonPedido();
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            if(rs.next())
            {
                reng.setId_renglon(id);
                reng.setId_producto(rs.getInt(2));
                reng.setId_pedido(rs.getInt(3));
                reng.setCantidad(rs.getInt(4));
                reng.setNro_caja(rs.getInt(5));
                reng.setPrecio_costo(rs.getFloat(6));
                reng.setPrecio_publico(rs.getFloat(7));
                reng.setCant_estrellas(rs.getInt(8));
                reng.setAnulado(rs.getBoolean(9));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró renglón con el ID "+id);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return reng;
        
    }
    public void modificarRenglon(RenglonPedido reng)
    {
       String query = "UPDATE renglon_pedido SET ID_PRODUCTO = ?, ID_PEDIDO= ?, CANTIDAD = ?, NRO_CAJA = ?, PRECIO_COSTO = ?, PRECIO_PUBLICO = ?, CANT_ESTRELLAS = ? WHERE ID_RENGLON = ?";       
        try
        {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reng.getId_producto());
            ps.setInt(2, reng.getId_pedido());
            ps.setInt(3, reng.getCantidad());
            ps.setInt(4, reng.getNro_caja());
            ps.setFloat(5, reng.getPrecio_costo());
            ps.setFloat(6, reng.getPrecio_publico());
            ps.setInt(7, reng.getCant_estrellas());
            ps.setInt(8, reng.getId_renglon());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "El Renglón ha sido actualizado con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar el Renglón o no existe ese Id");
            }
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void cambiarEstado(RenglonPedido reng, boolean anular)
    {
    String query = "UPDATE renglon_pedido SET ANULADO = ? WHERE ID_RENGLON = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1,anular);
            ps.setInt(2, reng.getId_renglon());
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
    
}
