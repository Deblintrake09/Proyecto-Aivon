package aivon;
import Modelo.*;
import Entidades.*;
import java.util.ArrayList;

public class Aivon2 {

   
        Conexion con= new Conexion();
        
        Producto p1 = new Producto("CR-1005", "Crema Garmin", "Crema", 125, 350.50f, 400, 10);
        ProductoData pdata = new ProductoData(con);
        
        //AGREGAR PRODUCTO
        //pdata.agregarProducto(p1);
        
       
       //BUSCAR POR CODIGO
        /*Producto p2= new Producto();
        p2 =  pdata.buscarPorCodigo("CR-1001");
        System.out.println(p2.toString());
        
       //CAMBIAR ESTADO ANULADO
        pdata.cambiarEstado("CR-1001", false);
        p2 =  pdata.buscarPorCodigo("CR-1001");
        System.out.println(p2.toString());
        
       //MODIFICAR PRODUCTO
        p2.setCantEstrellas(155);
        p2.setNombre("Crema Extra Hidratante");
        pdata.modificarProducto(p2);
        System.out.println(p2.toString());
        
       
       //LISTAR POR USO
        /* ArrayList<Producto> lista=pdata.listarUSO("Crema");
        for(int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
        }*/
        
        //LISTAR POR NOMBRE
        /* ArrayList<Producto> lista=pdata.listarnombre("crem");
        for(int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
        }
        */
        
        //MOSTRAR POR PRECIO DE COSTO
        /*ArrayList<Producto> lista=pdata.listarPorCosto(250.50f, '>', 'a');
        for(int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
        }*/
        
        // MOSTRAR POR PVP
        /*ArrayList<Producto> lista=pdata.listarPorPVP(400.50f, '<', 'a');
        for(int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
        }*/
        
        //MOSTRAR POR TAMAÑO
        /*ArrayList<Producto> lista=pdata.listarPorTamaño(100, '>', 'd');
        for(int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
        }*/
        
        
        //MOSTRAR POR ESTRELLAS
        /*ArrayList<Producto> lista=pdata.listarPorEstrellas(10);
        for(int i=0; i< lista.size();i++)
        {
            System.out.println(lista.get(i).toString());
        } */     
    
}
