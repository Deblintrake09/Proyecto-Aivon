package aivon;

import Entidades.*;
import Modelo.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aivon 
{

    public static void main(String[] args) 
    {       
        Conexion con = new Conexion();
        
        //Creamos Campañas
        CampañaData cData = new CampañaData(con);
        Campaña camp = new Campaña(1, LocalDate.of(2020,11,5), LocalDate.of(2020,11,30), 10000, 20000);
        cData.agregarCampaña(camp);
        camp = new Campaña(2, LocalDate.of(2020,12,1), LocalDate.of(2020,12,26), 10000, 20000);
        cData.agregarCampaña(camp);
        camp = new Campaña(3, LocalDate.of(2020,12,27), LocalDate.of(2021,1,21), 12500, 25000);
        cData.agregarCampaña(camp);
        camp = new Campaña(4, LocalDate.of(2021,1,22), LocalDate.of(2021,1,22).plusDays(25), 12500, 25000);       
        cData.agregarCampaña(camp);
            
        //Creamos Revendedoras
        RevendedoraData rData = new RevendedoraData(con);
        Revendedora rev= new Revendedora("Gabriela", "Martinez", 27537322, 2664426345L, "gabyfernandez@gmail.com" ,true, 1);
        rData.agregarRevendedora(rev);
        rev= new Revendedora("Adriana", "Gonzalez", 25788457, 2664597528L, "adrigon.77@gmail.com");
        rData.agregarRevendedora(rev);
        rev= new Revendedora("Mariela", "Luzardi", 29752863, 2657879535L, "maritaluzardi@hotmail.com");
        rData.agregarRevendedora(rev);
        
        //Creamos Productos
        ProductoData pData = new ProductoData(con);
        Producto prod= new Producto("CR-0001", "Hidratante EQ10", "Crema", 100, 300, 500, 2);
        pData.agregarProducto(prod);
        prod= new Producto("CR-0002", "Antiage New You", "Crema", 90, 625, 950, 5);
        pData.agregarProducto(prod);
        prod= new Producto("CR-0003", "CC Cream", "Crema", 90, 300, 1050, 5);
        pData.agregarProducto(prod);
        prod= new Producto("LS-0010", "Rojo Carmín X Glitter", "Labial", 10, 300, 500, 2);
        pData.agregarProducto(prod);
        prod= new Producto("MU-0023", "Cuarteto de Sombras", "Maquillaje", 20, 625, 1090, 7);
        pData.agregarProducto(prod);
        
        
        PedidoData pedData = new PedidoData(con);
        
        
        /*
        
        
        
        RenglonData rdata = new RenglonData(new Conexion());
      RenglonPedido renglon = new RenglonPedido(p1.getIdProducto(), 1, 4, 1, p1.getPrecioCosto(), p1.getPrecioVenta(), p1.getCantEstrellas());
        rdata.agregarRenglon(renglon);

        
        renglon.setCantidad(3);       
                
        rdata.modificarRenglon(renglon);
        rdata.cambiarEstado(renglon, true);
        System.out.print(renglon.toString());
        
        RenglonPedido renglon2 = rdata.buscarRenglon(3);
        System.out.print(renglon2.toString());*/

    }
    
    
    
    
    
}
