package Modelo;

import Entidades.Campaña;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CampañaData 
{
    private Connection con;
    
    public CampañaData(Conexion con)
    {
        this.con = con.getConnection();
    }
    
    public void agregarCampaña(Campaña camp)
    {
        String query = "INSERT INTO campaña(NRO_CAMPAÑA, FECHA_INICIO, FECHA_FIN,"
                + "MONTO_MINIMO, MONTO_MAXIMO) VALUES (?,?,?,?,?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, camp.getNroCampaña());
            ps.setDate(2, Date.valueOf(camp.getFechaInicio()));
            ps.setDate(3, Date.valueOf(camp.getFechaFin()));
            ps.setFloat(4, camp.getMontoMinimo());
            ps.setFloat(5, camp.getMontoMaximo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next())
            {
                camp.setIdCampaña(rs.getInt(1));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No se pudo obtener el id de la campaña");
            }
            ps.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la campaña " + e.toString());
        }
    }
    
    public void modificarCampaña(Campaña camp)
    {
        String query = "UPDATE campaña SET NRO_CAMPAÑA = ?, FECHA_INICIO = ?,"
                + " FECHA_FIN = ?, MONTO_MINIMO = ?, MONTO_MAXIMO = ? WHERE ID_CAMPAÑA = ?";
        try
        {
           PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, camp.getNroCampaña());
           ps.setDate(2, Date.valueOf(camp.getFechaInicio()));
           ps.setDate(3, Date.valueOf(camp.getFechaFin()));
           ps.setFloat(4, camp.getMontoMinimo());
           ps.setFloat(5, camp.getMontoMaximo());
           
           ResultSet rs = ps.getGeneratedKeys();
           if(rs.next())
           {
               JOptionPane.showMessageDialog(null, "No se pudo actualizar la campaña");               
           }
           ps.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public Campaña buscarCampaña(int nroCampaña)
    {
        Campaña camp = null;
        String query = "SELECT * FROM campaña WHERE NRO_CAMPAÑA = (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nroCampaña);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                camp = new Campaña();
                camp.setIdCampaña(rs.getInt(1));
                camp.setNroCampaña(rs.getInt(2));
                camp.setFechaInicio(rs.getDate(3).toLocalDate());
                camp.setFechaFin(rs.getDate(4).toLocalDate());
                camp.setMontoMinimo(rs.getFloat(5));
                camp.setMontoMaximo(rs.getFloat(6));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar la campaña con numero de campaña: " + nroCampaña);
                
            }   
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return camp;
    }
    
    public Campaña buscarFechaInicioCampaña(LocalDate fechaInicio)
    {
        Campaña camp = null;
        String query = "SELECT * FROM campaña WHERE FECHA_INICIO = (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(fechaInicio));
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                camp = new Campaña();
                camp.setIdCampaña(rs.getInt(1));
                camp.setNroCampaña(rs.getInt(2));
                camp.setFechaInicio(rs.getDate(3).toLocalDate());
                camp.setFechaFin(rs.getDate(4).toLocalDate());
                camp.setMontoMinimo(rs.getFloat(5));
                camp.setMontoMaximo(rs.getFloat(6));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar la campaña con fecha de inicio de campaña: " + fechaInicio);
                
            }   
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return camp;
    }
    
    public Campaña buscarFechaFinCampaña(LocalDate fechaFin)
    {
        Campaña camp = null;
        String query = "SELECT * FROM campaña WHERE FECHA_FIN = (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(fechaFin));
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                camp = new Campaña();
                camp.setIdCampaña(rs.getInt(1));
                camp.setNroCampaña(rs.getInt(2));
                camp.setFechaInicio(rs.getDate(3).toLocalDate());
                camp.setFechaFin(rs.getDate(4).toLocalDate());
                camp.setMontoMinimo(rs.getFloat(5));
                camp.setMontoMaximo(rs.getFloat(6));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar la campaña con fecha de fin de campaña: " + fechaFin);
                
            }   
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return camp;
    }
    
    public Campaña buscarMontoMinimoCampaña(float montoMinimo)
    {
        Campaña camp = null;
        String query = "SELECT * FROM campaña WHERE MONTO_MINIMO = (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setFloat(1, montoMinimo);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                camp = new Campaña();
                camp.setIdCampaña(rs.getInt(1));
                camp.setNroCampaña(rs.getInt(2));
                camp.setFechaInicio(rs.getDate(3).toLocalDate());
                camp.setFechaFin(rs.getDate(4).toLocalDate());
                camp.setMontoMinimo(rs.getFloat(5));
                camp.setMontoMaximo(rs.getFloat(6));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar la campaña con monto minimo: " + montoMinimo);
                
            }   
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return camp;
    
    }
    
    public Campaña buscarMontoMaximoCampaña(float montoMaximo)
    {
        Campaña camp = null;
        String query = "SELECT * FROM campaña WHERE MONTO_MAXIMO = (?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setFloat(1, montoMaximo);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                camp = new Campaña();
                camp.setIdCampaña(rs.getInt(1));
                camp.setNroCampaña(rs.getInt(2));
                camp.setFechaInicio(rs.getDate(3).toLocalDate());
                camp.setFechaFin(rs.getDate(4).toLocalDate());
                camp.setMontoMinimo(rs.getFloat(5));
                camp.setMontoMaximo(rs.getFloat(6));
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "No se pudo encontrar la campaña con monto minimo: " + montoMaximo);
                
            }   
            ps.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return camp;
    
    }
    
    public ArrayList<Campaña> obtenerCampañas()
    {
        Campaña ca= null;
        ArrayList<Campaña> campañas = new ArrayList<>();
        
        String query= "SELECT * FROM campaña";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                       
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ca = new Campaña();
                ca.setIdCampaña(rs.getInt(1));
                ca.setNroCampaña(rs.getInt(2));
                ca.setFechaInicio(rs.getDate(3).toLocalDate());
                ca.setFechaFin(rs.getDate(4).toLocalDate());
                ca.setMontoMinimo(rs.getFloat(5));
                ca.setMontoMaximo(rs.getFloat(6));
                //System.out.println("Numero de campaña: " + ca.getNroCampaña());
                campañas.add(ca);
            }
            ps.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return campañas;
    }
    
    public ArrayList<Campaña> obtenerMontos()
    {
        Campaña ca= null;
        ArrayList<Campaña> campañas = new ArrayList<>();
       
        String query= "SELECT NRO_CAMPAÑA, MONTO_MINIMO, MONTO_MAXIMO FROM campaña";
        try
        {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                       
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                ca = new Campaña();
                ca.setNroCampaña(rs.getInt(1));
                ca.setMontoMinimo(rs.getFloat(2));
                ca.setMontoMaximo(rs.getFloat(3));
                campañas.add(ca);
                
            }    
            
            ps.close();
        }
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return campañas;
    }
    
    public void cambiarEstadoCampaña(Campaña camp, boolean cambio)
    {
        String query = "UPDATE campaña SET ANULADO = ? WHERE ID_CAMPAÑA = ?";
        try
        {
           PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
           ps.setBoolean(1, cambio);
           ps.setInt(2, camp.getIdCampaña());
           ps.executeUpdate();
           ResultSet rs = ps.getGeneratedKeys();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el estado");
            }
            ps.close();
        }
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

}
