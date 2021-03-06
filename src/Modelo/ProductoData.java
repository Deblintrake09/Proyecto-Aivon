/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jackd
 */
public class ProductoData {
        private Connection con;

    public ProductoData(Conexion con) {
        this.con = con.getConnection();
    }
    
    /** AGREGA  un producto a la base de datos
     */
    public void agregarProducto(Producto prod)
    {   	
         String query ="INSERT INTO producto (CODIGO, NOMBRE, USO, TAMAÑO_CM3, PRECIO_COSTO, "
                 + "PRECIO_PUBLICO, CANT_ESTRELLAS, ANULADO) VALUES(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getUso());
            ps.setInt(4, prod.getTamaño());
            ps.setFloat(5, prod.getPrecioCosto());
            ps.setFloat(6, prod.getPrecioVenta());
            ps.setInt(7, prod.getCantEstrellas());
            ps.setBoolean(8, false);
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                prod.setIdProducto(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No pudo obtener id Producto.");
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puedo cargar la Producto / Producto ya Existente ");
        }
    }
    
    public Producto buscarPorCodigo(String codigo)
    {
        Producto prod = null;
        String query = "SELECT * FROM producto WHERE CODIGO LIKE (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                prod= new Producto();
                prod.setIdProducto(rs.getInt(1));
                prod.setCodigo(rs.getString(2));
                prod.setNombre(rs.getString(3));
                prod.setUso(rs.getString(4));
                prod.setTamaño(rs.getInt(5));
                prod.setPrecioCosto(rs.getFloat(6));
                prod.setPrecioVenta(rs.getFloat(7));
                prod.setCantEstrellas(rs.getInt(8));
                prod.setAnulado(rs.getBoolean(9));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar el producto con código: " + codigo);
                
            }   
            ps.close();
        }
            catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return prod;
    }
    public Producto buscarPorID(int ID)
    {
        Producto prod = null;
        String query = "SELECT * FROM producto WHERE ID_PRODUCTO LIKE (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                prod= new Producto();
                prod.setIdProducto(rs.getInt(1));
                prod.setCodigo(rs.getString(2));
                prod.setNombre(rs.getString(3));
                prod.setUso(rs.getString(4));
                prod.setTamaño(rs.getInt(5));
                prod.setPrecioCosto(rs.getFloat(6));
                prod.setPrecioVenta(rs.getFloat(7));
                prod.setCantEstrellas(rs.getInt(8));
                prod.setAnulado(rs.getBoolean(9));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar el producto con código: " + ID);
                
            }   
            ps.close();
        }
            catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return prod;
    }
    
    public ArrayList<Producto> listarPorUSO(String uso){
        String query = "SELECT * FROM producto WHERE USO = ?";
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, uso);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
    
    public ArrayList<String> listarUsos(){
        String query = "SELECT DISTINCT USO FROM producto";
        ArrayList<String> lista= new ArrayList();
        String uso;
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                
                uso =rs.getString(1);
                lista.add(uso);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
    
        public ArrayList<Producto> listarNombre(String nombre){
        String query = "SELECT * FROM producto WHERE NOMBRE LIKE ?";
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "%"+nombre+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
        
        /** Lista los productos por precio de Vental al Público
         * @param pcosto es el valor de cossto
         * @param simbolo ingresar '<', '>' o '=' para buscar
         * @param dir ingresar 'a' para ordenar ascendentemente, cualquier otro valor es descendente
         * @return retorna una Lista con los productos
     */
        public ArrayList<Producto> listarPorCosto(float pcosto, char simbolo, char dir){
        //String query = "SELECT * FROM producto WHERE PRECIO_COSTO ? ? ORDER BY PRECIO_COSTO, ?";
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;
        String s1;
        String s2;
        try{
            //PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            switch (simbolo) {
                case '<':
                    s1= "<=";
                    break;
                case '>':
                    s1=">=";
                    break;
                default:
                    s1="=";
                    break;
            }
            if(dir=='a')
                s2="ASC";
            else
                s2="DESC";
             String query = "SELECT * FROM producto WHERE PRECIO_COSTO"+s1+" ? ORDER BY PRECIO_COSTO "+s2;
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            //ps.setString(1, s1);
            ps.setFloat(1,pcosto);
           // ps.setString(3, s2);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
        
        public ArrayList<Producto> listarPorPVP(float pventa, char simbolo, char dir){
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;
        String s1;
        String s2;
        try{
            switch (simbolo) {
                case '<':
                    s1= "<=";
                    break;
                case '>':
                    s1=">=";
                    break;
                default:
                    s1="=";
                    break;
            }
            if(dir=='a')
                s2="ASC";
            else
                s2="DESC";
             String query = "SELECT * FROM producto WHERE PRECIO_PUBLICO"+s1+" ? ORDER BY PRECIO_PUBLICO "+s2;
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setFloat(1,pventa);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
        
        
        /** Lista los productos por precio de Vental al Público
         * @param pventa es el valor de cossto
         * @param simbolo ingresar '<', '>' o '=' para buscar
         * @param dir ingresar 'a' para ordenar ascendentemente, cualquier otro valor es descendente
         * @return retorna una Lista con los productos
     */
    public ArrayList<Producto> listarProductos(){
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;
        try{
            String query = "SELECT * FROM producto";
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
         
     public ArrayList<Producto> listarPorEstrellas(int cEstrella){
        String query = "SELECT * FROM producto WHERE CANT_ESTRELLAS = ?";
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;

        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);            
            ps.setInt(1,cEstrella);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
     
    public ArrayList<Producto> listarPorTamaño(int tam, char simbolo, char dir){
        ArrayList<Producto> lista= new ArrayList();
        Producto p1;
        String s1;
        String s2;
        try{
            switch (simbolo) {
                case '<':
                    s1= "<=";
                    break;
                case '>':
                    s1=">=";
                    break;
                default:
                    s1="=";
                    break;
            }
            if(dir=='a')
                s2="ASC";
            else
                s2="DESC";
             String query = "SELECT * FROM producto WHERE TAMAÑO_CM3 "+s1+" ? ORDER BY TAMAÑO_CM3 "+s2;
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,tam);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p1=new Producto();
                p1.setIdProducto(rs.getInt(1));
                p1.setCodigo(rs.getString(2));
                p1.setNombre(rs.getString(3));
                p1.setUso(rs.getString(4));
                p1.setTamaño(rs.getInt(5));
                p1.setPrecioCosto(rs.getFloat(6));
                p1.setPrecioVenta(rs.getFloat(7));
                p1.setCantEstrellas(rs.getInt(8));
                p1.setAnulado(rs.getBoolean(9));
                lista.add(p1);
            }
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;            
    }
    
    public void modificarProducto(Producto prod)
    {
        String query = "UPDATE producto SET CODIGO = ?, NOMBRE = ?, USO = ?, TAMAÑO_CM3 = ?, PRECIO_COSTO = ?, PRECIO_PUBLICO = ?, CANT_ESTRELLAS = ? WHERE ID_PRODUCTO = ?";       
        try
        {
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getUso());
            ps.setInt(4, prod.getTamaño());
            ps.setFloat(5, prod.getPrecioCosto());
            ps.setFloat(6, prod.getPrecioVenta());
            ps.setInt(7, prod.getCantEstrellas());
            ps.setInt(8, prod.getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "El Producto ha sido actualizado con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar el producto o  producto inexistente");
            }
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void cambiarEstado(String codigo, boolean anular)
    {
    String query = "UPDATE producto SET ANULADO = ? WHERE CODIGO = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1,anular);
            ps.setString(2, codigo);
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
