package aivon;

import Entidades.*;
import Modelo.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aivon 
{

    public static void main(String[] args) 
    {   /*    
        //Creamos todas las variables que usaremos en las pruebas
        Revendedora rev1 = new Revendedora();
        Campaña camp1 = new Campaña();
        Pedido ped1 = new Pedido();
        Producto prod1 = new Producto();
        RenglonPedido renglon = new RenglonPedido();
        ArrayList<RenglonPedido> renglones = new ArrayList();
        ArrayList<Pedido> listaPedidos = new ArrayList();
        
        Conexion con = new Conexion();
        CampañaData cData = new CampañaData(con);
        RevendedoraData revData = new RevendedoraData(con);
        ProductoData prData = new ProductoData(con);
        PedidoData pedData = new PedidoData(con);
        
    /*    
        //Creamos  y cargamos Campañas
        Campaña camp = new Campaña(1, LocalDate.of(2020,8,1), LocalDate.of(2020,8,1).plusDays(25), 5000, 10000);
        cData.agregarCampaña(camp);
        camp = new Campaña(2, LocalDate.of(2020,8,1).plusDays(25), LocalDate.of(2020,8,1).plusDays(50), 5000, 12000);
        cData.agregarCampaña(camp);
        camp = new Campaña(3, LocalDate.of(2020,8,1).plusDays(50), LocalDate.of(2020,8,1).plusDays(75), 6000, 12000);
        cData.agregarCampaña(camp);
        camp = new Campaña(4, LocalDate.of(2020,8,1).plusDays(75), LocalDate.of(2020,8,1).plusDays(100), 7500, 15000);       
        cData.agregarCampaña(camp);
  
        //Creamos y cargamos Revendedoras
        Revendedora rev = new Revendedora("Gabriela", "Martinez", 27537322, 2664426345L, "gabyfernandez@gmail.com" ,true, 1);
        revData.agregarRevendedora(rev);
        rev = new Revendedora("Adriana", "Gonzalez", 25788457, 2664597528L, "adrigon.77@gmail.com");
        revData.agregarRevendedora(rev);
        rev = new Revendedora("Mariela", "Luzardi", 29752863, 2657879535L, "maritaluzardi@hotmail.com");
        revData.agregarRevendedora(rev);
  
        //Creamos y cargamos Productos
        Producto prod = new Producto("CR-0001", "Hidratante EQ10", "Crema", 100, 300, 500, 2);
        prData.agregarProducto(prod);
        prod = new Producto("CR-0002", "Antiage New You", "Crema", 90, 625, 950, 5);
        prData.agregarProducto(prod);
        prod = new Producto("CR-0003", "CC Cream", "Crema", 90, 300, 1050, 5);
        prData.agregarProducto(prod);
        prod = new Producto("LS-0010", "Rojo Carmín X Glitter", "Labial", 10, 300, 500, 2);
        prData.agregarProducto(prod);
        prod = new Producto("MU-0023", "Cuarteto de Sombras", "Maquillaje", 20, 625, 1090, 7);
        prData.agregarProducto(prod);
     
        // Inicializamos Pedido con fecha de Entrega, fecha de pago y renglones vacios.
        rev1 = revData.buscarPorDni(25788457);
        camp1 = cData.buscarNroCampaña(1);    
        ped1 = new Pedido(LocalDate.of(2020, 8, 10), null, null, rev1, camp1, renglones); // Inicializamos Pedido con fecha de Entrega y Pedido Nulas.
        pedData.cargarPedido(ped1);
        
        //Creamos Renglones para Cargar en el pedido (los agregamos al arreglo ya existente en el pedido
        prod1 = prData.buscarPorCodigo("CR-0001");
        renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),1,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
        ped1.getRenglones().add(renglon);
        prod1 = prData.buscarPorCodigo("LS-0010");
        renglon = new RenglonPedido(prod1,ped1.getIdPedido(),3,1);
        ped1.agregarRenglon(renglon);
        prod1 = prData.buscarPorCodigo("MU-0023");
        renglon = new RenglonPedido(prod1,ped1.getIdPedido(),5,2);
        ped1.agregarRenglon(renglon);
       
        ped1.imprimirPedido();
        pedData.actualizarPedido(ped1);   //Actualizamos el Pedido Cargando los renglones en el sistema
        ped1.imprimirPedido();
    
      // Creamos nuevo Pedido, asignamos los nuevos renglones a un arreglo y luego se asigna el arreglo de los renglones al pedido.
      //Cargamos el pedido, lo imprimimos en consola para controlar estado. luego pagamos el pedido y lo reimprimimos para controlar estado.
       renglones.clear();
       ped1 = new Pedido(LocalDate.of(2020,8,10),null, LocalDate.of(2020,8,17),revData.buscarPorDni(29752863), camp1,renglones);
       prod1 = prData.buscarPorCodigo("LS-0010");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),3,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0001");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),5,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0003");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),2,2, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0002");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),3,2, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       ped1.setRenglones(renglones);
       pedData.cargarPedido(ped1);
       ped1.imprimirPedido();
       pedData.pagarPedido(ped1, LocalDate.of(2020,8,23));
       ped1.imprimirPedido();
    
    
    
       //Cargamos un nuevo Pedido de la revendedora en la Campaña 2 y 3 -- Usaremos el mismo pedido anterior (repite el pedido en campaña 2 y campaña 3 cambia las cantidades)
       renglones.clear();
       ped1 = new Pedido(LocalDate.of(2020,8,10),null, null,revData.buscarPorDni(29752863), cData.buscarNroCampaña(2),renglones);
       prod1 = prData.buscarPorCodigo("LS-0010");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),3,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0001");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),5,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0003");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),2,2, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0002");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),3,2, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       ped1.setRenglones(renglones);
       ped1.setFechaIngreso(ped1.getCampaña().getFechaInicio().plusDays(2));
       ped1.setRenglones(renglones);
       pedData.cargarPedido(ped1);
      
       //Limpiamos el arreglo y lo recargamos, porque si no los renglones del array tienen el id del pedido anterior
       renglones.clear();
       prod1 = prData.buscarPorCodigo("LS-0010");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),5,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0001");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),7,2, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0003");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),6,3, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0002");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),4,3, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       ped1.setCampaña(cData.buscarNroCampaña(3));
       ped1.setFechaIngreso(ped1.getCampaña().getFechaInicio().plusDays(2));
       ped1.setFechaEntrega(null);
       ped1.setRenglones(renglones);
       pedData.cargarPedido(ped1);    
   */
    
    
      /*
        //Listamos Todos los Pedidos de una revendedora
        listaPedidos = pedData.buscarPedidoXRev(29752863);
        for(int i=0;i<listaPedidos.size();i++)
        {
         listaPedidos.get(i).imprimirPedido();
        }
     */
    
      /* 
        //listamos todos los pedidos de una campaña
        listaPedidos = pedData.buscarPedidoXCam(1);
                for(int i=0;i<listaPedidos.size();i++)
        {
         listaPedidos.get(i).imprimirPedido();
        }
      */
    
    /*
        //Controlamos y Cambiamos el estado(Activa/Inactiva) y los niveles de las revendedoras de acuerdo a los pedidos que han realizado.
        rev1 = revData.buscarPorDni(29752863);
        boolean estaActiva = revData.controlarActividadRevendedora(rev1);
        System.out.println("La revendedora con DNI N°" + 29752863+", se encuentra: "+ estaActiva);
        revData.calcularNivelPorEstrellas(rev1);
    */
    /*    
        rev1 = revData.buscarPorDni(27537322);
         estaActiva = revData.controlarActividadRevendedora(rev1);
        System.out.println("La revendedora con DNI N°" + 27537322+", se encuentra: "+ estaActiva);
        revData.calcularNivelPorEstrellas(rev1);
    */
    /*
        rev1 = revData.buscarPorDni(29752863);
        estaActiva = revData.controlarActividadRevendedora(rev1);
        System.out.println("La revendedora con DNI N°" + 25788457+", se encuentra: "+ estaActiva);
        revData.calcularNivelPorEstrellas(rev1);
    */
    
    /*  
      //CREAMOS UN PEDIDO QUE EXCEDA EL MONTO MAXIMO DE UNA CAMPAÑA, PARA PODER CONTROLAR QUE SUBAN DE NIVEL SI LO ALCANZAN.
       rev1= revData.buscarPorDni(25788457); 
       ped1 = new Pedido(LocalDate.of(2020,8,28),null, LocalDate.of(2020,8,30),rev1, cData.buscarNroCampaña(2),renglones);
       renglones.clear();
       prod1 = prData.buscarPorCodigo("LS-0010");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),15,1, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0001");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),10,2, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0003");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),12,3, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       prod1 = prData.buscarPorCodigo("CR-0002");
       renglon = new RenglonPedido(prod1.getIdProducto(),ped1.getIdPedido(),14,4, prod1.getPrecioCosto(),prod1.getPrecioVenta(),prod1.getCantEstrellas());
       renglones.add(renglon);
       ped1.setRenglones(renglones);
       pedData.cargarPedido(ped1);
       
       int nivel = rev1.getNivel();
       int nuevonivel= revData.subirNivelPorPedidos(rev1);
       System.out.println("Nivel antes de controlar Pedidos = "+ nivel + ". Nuevo Nivel= "+ nuevonivel);
    */  
    
    }
    
    
    
}
