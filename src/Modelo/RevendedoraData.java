package Modelo;

import Entidades.Campaña;
import Entidades.Pedido;
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
        String query ="INSERT INTO revendedora(NOMBRE, APELLIDO, DNI, TEL, MAIL, ACTIVA, NIVEL, ANULADO) VALUES(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, rev.getNombre());
            ps.setString(2, rev.getApellido());
            ps.setInt(3, rev.getDni());
            ps.setLong(4, rev.getTelefono());
            ps.setString(5, rev.getMail());
            ps.setBoolean(6, rev.isActiva());
            ps.setInt(7, rev.getNivel());
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
            JOptionPane.showMessageDialog(null, "No puedo cargar la revendedora o revendedora ya existente" + e.toString());
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
                rev.setTelefono(rs.getLong(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setNivel(rs.getInt(8));
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
                rev.setTelefono(rs.getLong(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setNivel(rs.getInt(8));
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
                rev.setTelefono(rs.getLong(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setNivel(rs.getInt(8));
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
                rev.setTelefono(rs.getLong(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setNivel(rs.getInt(8));
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
                rev.setTelefono(rs.getLong(5));
                rev.setMail(rs.getString(6));
                rev.setActiva(rs.getBoolean(7));
                rev.setNivel(rs.getInt(8));
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
         String query="UPDATE revendedora SET NOMBRE=?, APELLIDO=?, DNI=?, TEL=?, MAIL=?, ACTIVA=?, NIVEL=?, ANULADO=? WHERE ID_REV=?";
         try{
             PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, rev.getNombre());
             ps.setString(2, rev.getApellido());
             ps.setInt(3, rev.getDni());
             ps.setLong(4, rev.getTelefono());
             ps.setString(5, rev.getMail());
             ps.setBoolean(6, rev.isActiva());
             ps.setInt(7, rev.getNivel());
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
                 rev.setTelefono(rs.getLong(5));
                 rev.setMail(rs.getString(6));
                 rev.setActiva(rs.getBoolean(7));
                 rev.setNivel(rs.getInt(8));
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
     public void darBaja(Revendedora rev, boolean db){
         String query="UPDATE revendedora SET ACTIVA=? WHERE ID_REV = ?";
         try{
             PreparedStatement ps=con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
             ps.setBoolean(1, db);
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
<<<<<<< HEAD
     
     
    public boolean controlarActividadRevendedora(Revendedora rev)
    {
        Conexion con=new Conexion();
        PedidoData pd = new PedidoData(con);
        RevendedoraData rd=new RevendedoraData(con);
        CampañaData cd= new CampañaData(con);
        ArrayList<Campaña> camps= cd.obtenerCampañas();
        if(camps.size()<3)
        {
            return true;
        }
        ArrayList<Pedido> pedidosRev= pd.buscarPedidoXRev(rev.getDni());
        for (int i=1;i<4;i++)
        {
            int indC=camps.size();;
            Campaña camp = camps.get(indC-i);
            System.out.println(camp.toString());
            for(int j=1;j<4;j++)
            {
                
                Pedido ped =null;
                int indP= pedidosRev.size()-j;
                if(indP>=0)
                    ped = pedidosRev.get(indP);
                if(ped!=null)
                {
                    System.out.println(ped.toString());
                    if(camp.getNroCampaña()== ped.getCampaña().getNroCampaña())
                    {
                        System.out.println("pedido =");
                        rev.setActiva(true);
                        rd.darBaja(rev, true);
                        return true;
                    }
                }
=======
     public boolean controlarActividadRevendedora(Revendedora rev)
    {
        
        Conexion con = new Conexion();
        PedidoData pd = new PedidoData(con);
        CampañaData cd = new CampañaData(con);
        RevendedoraData rd = new RevendedoraData(con);
        ArrayList<Campaña> camps = cd.obtenerCampañas();
        
        if(camps.size()<3)
        {
            con.cerrarConexion();
            return true;
        }
        
        ArrayList<Pedido> pedidosRev = pd.buscarPedidoXRev(rev.getDni());
        
        for(int i=1; i<4 ; i++)
        {
            for(int j=1; j<4 ; j++)
            {
                Campaña camp = camps.get(camps.size()-i);
                Pedido ped = pedidosRev.get(pedidosRev.size()-j);
                
                if(ped!=null)
                {
                    if(camp.getNroCampaña() == ped.getCampaña().getNroCampaña())
                    {
                       rev.setActiva(true);
                       rd.darBaja(rev, true);
                       con.cerrarConexion();
                       return true;
                    }
                }
                
>>>>>>> 87929ba232dd2e57edbb896aa3447b7ee9d3ddd7
            }
        }
        rev.setActiva(false);
        rd.darBaja(rev, false);
<<<<<<< HEAD
        return false;
        
    }
    
    
    public int calcularNivelPorEstrellas(Revendedora rev)
    {
        Conexion con=new Conexion();
        PedidoData pd=new PedidoData(con);
        ArrayList<Pedido> pedidosRev=pd.buscarPedidoXRev(rev.getDni());
        
        int niv=1;
        int totEstrellas=0;
        
        for(int i=0;i<pedidosRev.size();i++)
        {
            totEstrellas+=pedidosRev.get(i).mostrarEstrellasTotales();
        }
        niv+=totEstrellas/50;
        System.out.println("Total de Estrellas: "+totEstrellas + " nivel= "+niv);
        if (niv >rev.getNivel())
        {
            rev.setNivel(niv);
            String query = "UPDATE revendedora SET NIVEL=? WHERE ID_REV=?";
            con.cerrarConexion();
            try
            {
                PreparedStatement ps = this.con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, niv);
                ps.setInt(2, rev.getIdRev());
                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar Nivel de Revendedora");
                }
                ps.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return niv;
    }
    
    public int subirNivelPorPedidos(Revendedora rev)
    {
        Conexion con=new Conexion();
        PedidoData pd=new PedidoData(con);
        ArrayList<Pedido> pedidosRev=pd.buscarPedidoXRev(rev.getDni());
        
        int niveles=0;
        
        
        for(int i=0;i<pedidosRev.size();i++)
        {
            if(pedidosRev.get(i).controlarMontos().equalsIgnoreCase("excedido"))
                niveles++;
        }
        if(niveles>0)
        {
            niveles=rev.getNivel()+niveles;
            rev.setNivel(niveles);
            String query = "UPDATE revendedora SET NIVEL=? WHERE ID_REV=?";
            con.cerrarConexion();
            try
            {
                PreparedStatement ps = this.con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, rev.getNivel());
                ps.setInt(2, rev.getIdRev());
                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar Nivel de Revendedora");
                }
                ps.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return niveles;
    }
=======
        con.cerrarConexion();
        return false;
        
    }
>>>>>>> 87929ba232dd2e57edbb896aa3447b7ee9d3ddd7
}

