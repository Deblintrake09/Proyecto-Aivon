package Modelo;

import Entidades.Revendedora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RevendedoraData {
    private Connection con;

    public RevendedoraData(Conexion con) {
        this.con = con.getConnection();
    }
    public void agregarRevendedora(Revendedora rev){
        String query ="INSERT INTO revendedora(NOMBRE, APELLIDO, DNI, TEL, MAIL, ACTIVA, CAMPAÑA, ANULADO) VALUES(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, rev.getNombre());
            ps.setString(2, rev.getApellido());
            ps.setInt(3, rev.getDni());
            ps.setInt(4, rev.getTelefono());
            ps.setString(5, rev.getMail());
            ps.setBoolean(6, rev.isActiva());
            ps.setInt(7, rev.getCampaña());
            ps.setBoolean(8, rev.isAnulado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                rev.setIdRev(rs.getInt(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "No pudo obtener id revendedora.");
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puedo cargar la revendedora o revendedora ya existente");
        }
    }
    public Revendedora buscarPorDni(int dni){
        Revendedora rev=null;
        String query ="SELECT * FROM revendedora WHERE DNI = (?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                rev = new Revendedora();
                rev.setIdRev(rs.getInt(1));
                rev.setNombre(rs.getString(2));
                rev.setApellido(rs.getString(3));
                rev.setDni(rs.getInt(4));
                rev.setTelefono(rs.getInt(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setCampaña(rs.getInt(8));
                rev.setAnulado(rs.getBoolean(9));  
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se encontro la revendedora");
        }
        return rev;
    }
        public ArrayList <Revendedora> buscarPorApellido(String apellido){
        Revendedora rev=null;
        ArrayList<Revendedora> apellidos = new ArrayList<>();
        String query ="SELECT * FROM revendedora WHERE APELLIDO = (?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                rev = new Revendedora();
                rev.setIdRev(rs.getInt(1));
                rev.setNombre(rs.getString(2));
                rev.setApellido(rs.getString(3));
                rev.setDni(rs.getInt(4));
                rev.setTelefono(rs.getInt(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setCampaña(rs.getInt(8));
                rev.setAnulado(rs.getBoolean(9));
                apellidos.add(rev);
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se encontro la revendedora");
        }
        return apellidos;
    }
     public ArrayList <Revendedora> buscarPorNombre(String nombre){
        Revendedora rev=null;
        ArrayList<Revendedora> nombres = new ArrayList<>();
        String query ="SELECT * FROM revendedora WHERE NOMBRE = (?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                rev = new Revendedora();
                rev.setIdRev(rs.getInt(1));
                rev.setNombre(rs.getString(2));
                rev.setApellido(rs.getString(3));
                rev.setDni(rs.getInt(4));
                rev.setTelefono(rs.getInt(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setCampaña(rs.getInt(8));
                rev.setAnulado(rs.getBoolean(9));
                nombres.add(rev);
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se encontro la revendedora");
        }
        return nombres;
    }
     public ArrayList <Revendedora> buscarPorTelefono(int telefono){
        Revendedora rev=null;
        ArrayList<Revendedora> telefonos = new ArrayList<>();
        String query ="SELECT * FROM revendedora WHERE TEL = (?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, telefono);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                rev = new Revendedora();
                rev.setIdRev(rs.getInt(1));
                rev.setNombre(rs.getString(2));
                rev.setApellido(rs.getString(3));
                rev.setDni(rs.getInt(4));
                rev.setTelefono(rs.getInt(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setCampaña(rs.getInt(8));
                rev.setAnulado(rs.getBoolean(9));
                telefonos.add(rev);
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se encontro la revendedora");
        }
        return telefonos;
    }
     public ArrayList <Revendedora> buscarPorMail(String mail){
        Revendedora rev=null;
        ArrayList<Revendedora> mails = new ArrayList<>();
        String query ="SELECT * FROM revendedora WHERE MAIL = (?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mail);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                rev = new Revendedora();
                rev.setIdRev(rs.getInt(1));
                rev.setNombre(rs.getString(2));
                rev.setApellido(rs.getString(3));
                rev.setDni(rs.getInt(4));
                rev.setTelefono(rs.getInt(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setCampaña(rs.getInt(8));
                rev.setAnulado(rs.getBoolean(9));
                mails.add(rev);
            }
            ps.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se encontro la revendedora");
        }
        return mails;
    }
     public void modificarRevendedora(Revendedora rev){
         String query="UPDATE revendedora SET NOMBRE=?, APELLIDO=?, DNI=?, TEL=?, MAIL=?, ACTIVA=?, CAMPAÑA=?, ANULADO=? WHERE ID_REV=?";
         try{
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, rev.getNombre());
             ps.setString(2, rev.getApellido());
             ps.setInt(3, rev.getDni());
             ps.setInt(4, rev.getTelefono());
             ps.setString(5, rev.getMail());
             ps.setBoolean(6, rev.isActiva());
             ps.setInt(7, rev.getCampaña());
             ps.setBoolean(8, rev.isAnulado());
             ps.setInt(9, rev.getIdRev());
             ps.executeUpdate();
             ResultSet rs= ps.getGeneratedKeys();
             if(rs.next()){
                 JOptionPane.showMessageDialog(null, "No se puedo actualizar");
             }
             ps.close();
             
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.toString());
         }
     
     }
     public ArrayList<Revendedora> mostrarRevendedoras(){
         Revendedora rev=null;
         ArrayList<Revendedora> revendedoras = new ArrayList<>();
         String query="SELECT * FROM revendedora";
         try{
             PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 rev = new Revendedora();
                 rev.setIdRev(rs.getInt(1));
                 rev.setNombre(rs.getString(2));
                 rev.setApellido(rs.getString(3));
                 rev.setDni(rs.getInt(4));
                 rev.setTelefono(rs.getInt(5));
                 rev.setMail(rs.getString(6));
                 rev.setActiva(rs.getBoolean(7));
                 rev.setCampaña(rs.getInt(8));
                 rev.setAnulado(rs.getBoolean(9));
                 revendedoras.add(rev);
             
             }
             ps.close();
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
         }
         return revendedoras;
     }
     public void anular(Revendedora rev, boolean an){
         String query="UPDATE revendedora SET ANULADO=? WHERE ID_REV = ?";
         try{
             PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             ps.setBoolean(1, an);
             ps.setInt(2, rev.getIdRev());
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
