package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion 
{
    private final String base = "aivon";
    private final String url="jdbc:mysql://localhost:3306/"+base;
    private final String user="root";
    private final String pass="";
    private Connection con;
    
    public Connection getConnection()
    {
        if(con==null)
        {
            try
            {
                Class.forName("org.mariadb.jdbc.Driver");
                con = (Connection)DriverManager.getConnection(url, user, pass);
            }
            catch (SQLException |ClassNotFoundException e)
            { 
                JOptionPane.showMessageDialog(null, "Error de Conexión");
            }
        }   
        
        return con;
    }
    
    public void cerrarConexion()
    {
        try{
            con.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
        }
        
    }
}