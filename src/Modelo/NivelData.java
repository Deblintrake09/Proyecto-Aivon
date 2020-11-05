/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Entidades.Nivel;
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
public class NivelData 
{
    
    private Connection con;
    
    public NivelData(Conexion con)
    {
        this.con = con.getConnection();
    }
    
    public void agregarNivel(Nivel niv)
    {
         String query ="INSERT INTO niveles (NOMBRE_NIVEL, MONTO_MINIMO, MONTO_MAXIMO, ANULADO) VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, niv.getNombreNivel());
            ps.setFloat(2, niv.getMonto_min());
            ps.setFloat(3, niv.getMonto_max());           
            ps.setBoolean(4, false);
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                niv.setIdNivel(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No pudo obtener id Nivel.");
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puedo cargar el Nivel. " + e.toString());
        }
    }
    
    public Nivel buscarNivel(int nb)
    {
        Nivel nivel=new Nivel();
        String query = "SELECT * FROM niveles WHERE NOMBRE_NIVEL = ?";
        try{
            PreparedStatement ps= con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nb);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                nivel = new Nivel();
                nivel.setIdNivel(rs.getInt(1));
                nivel.setNombreNivel(rs.getInt(2));
                nivel.setMonto_min(rs.getFloat(3));
                nivel.setMonto_max(rs.getFloat(4));
                nivel.setAnulado(rs.getBoolean(5));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el Nivel "+nb);
            }
            ps.close();
        }catch (SQLException e)
        {
             JOptionPane.showMessageDialog(null, "No puedo buscar el Nivel. " + e.toString());
        }
        return nivel;
    }
    
    public void modificarNivel(Nivel niv)
    {
        String query ="UPDATE niveles SET NOMBRE_NIVEL=?, MONTO_MINIMO=?, MONTO_MAXIMO=? WHERE ID_NIVEL=?";
        try{
            PreparedStatement ps= con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, niv.getNombreNivel());
            ps.setFloat(2, niv.getMonto_min());
            ps.setFloat(3, niv.getMonto_max());
            ps.setInt(4, niv.getIdNivel());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "Se ha actualizado con éxito");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo Modificar el Nivel ");
            }
            ps.close();
        }catch (SQLException e)
        {
             JOptionPane.showMessageDialog(null, "No puedo buscar el Nivel. " + e.toString());
        }
    }
    
    public void cambiarEstado(Nivel niv, boolean estado)
    {
        String query = "UPDATE niveles SET ANULADO=? WHERE ID_NIVEL=?";
        try{
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, estado);
            ps.setInt(2,niv.getIdNivel());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "Estado Modificado con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el Nivel");
            }
         
            ps.close();
        }catch (SQLException e)
        {
             JOptionPane.showMessageDialog(null, "No puedo buscar el Nivel. " + e.toString());
        }
    }
    
    public ArrayList<Nivel> listarNiveles(boolean verAnul)
    {
        Nivel niv = new Nivel();
        ArrayList<Nivel> niveles = new ArrayList();
        String query = "SELECT * FROM niveles";
        if(!verAnul)
            query+=" WHERE ANULADO = FALSE";
        try{
            PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                niv=new Nivel();
                niv.setIdNivel(rs.getInt(1));
                niv.setNombreNivel(rs.getInt(2));
                niv.setMonto_min(rs.getFloat(3));
                niv.setMonto_max(rs.getFloat(4));
                niv.setAnulado(rs.getBoolean(5));
                niveles.add(niv);
            }
            if(niveles.isEmpty())
            {
             JOptionPane.showMessageDialog(null, "No hay niveles cargados para mostrar");   
            }
         
            ps.close();
        }catch (SQLException e)
        {
             JOptionPane.showMessageDialog(null, e.toString());
        }
        return niveles;
    }
        
}
