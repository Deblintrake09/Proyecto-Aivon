package Entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private LocalDate fechaIngreso;
    private LocalDate fechaPago;
    private LocalDate fechaEntrega;
    private Revendedora revendedora;
    private Campaña campaña;
    private int cantCajas;
    private ArrayList<RenglonPedido> renglones;
    private float totalCosto;
    private boolean anulado;

    public Pedido(LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEntrega, Revendedora revendedora, Campaña campaña, ArrayList<RenglonPedido> renglones) {
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.revendedora = revendedora;
        this.campaña = campaña;
        this.totalCosto=0;
        this.cantCajas=0;
        setRenglones(renglones);
        this.anulado = false;
    }

    public Pedido(int idPedido, LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEntrega, Revendedora revendedora, Campaña campaña, ArrayList<RenglonPedido> renglones) {
        this.idPedido = idPedido;
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.revendedora = revendedora;        
        this.campaña = campaña;
        this.totalCosto=0;
        this.cantCajas=0;
        setRenglones(renglones);
        this.anulado = false;
    }

    public Pedido() {
        setRenglones(new ArrayList());
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Revendedora getRevendedora() {
        return revendedora;
    }

    public void setRevendedora(Revendedora revendedora) {
        this.revendedora = revendedora;
    }

    public Campaña getCampaña() {
        return campaña;
    }

    public void setCampaña(Campaña campaña) {
        this.campaña = campaña;
    }

    public ArrayList<RenglonPedido> getRenglones() {
        return renglones;
    }
    public void setRenglones(ArrayList<RenglonPedido> renglones) {
        this.renglones = renglones;
        calcularTotalCosto();
        actualizarCajas();
    }
    public void eliminarRenglon(int indice){
        renglones.remove(indice);
        calcularTotalCosto();
        actualizarCajas();
    }
    public void agregarRenglon(RenglonPedido renglon)
    {
        this.renglones.add(renglon);
        calcularTotalCosto();
        actualizarCajas();
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }
    
    public void actualizarCajas()
    {
        this.cantCajas=0;
        if(renglones!=null)
        {
            for(int i=0;i<renglones.size();i++)
            {
                if(!renglones.get(i).isAnulado())
                    if(renglones.get(i).getNro_caja()>this.cantCajas)
                        this.cantCajas=renglones.get(i).getNro_caja();
            }
        }
    }
    
    public float getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(float totalCosto) {
        this.totalCosto = totalCosto;
    }
    public float calcularTotalCosto()
    {
        totalCosto=0;
        if(renglones != null)
        {
            for (int i=0;i<renglones.size();i++)
            {
                if(!renglones.get(i).isAnulado())
                    totalCosto+= renglones.get(i).getPrecio_costo()*renglones.get(i).getCantidad();
            }
        }
        return totalCosto;
    }
    
    /**Controla si el costo Total Actual es un monto válido. 
     * @return insuficiente/excedido/permitido, dependiendo de la situación
    */
    public String controlarMontos()
    {
        String resp=null;
        if(totalCosto<campaña.getMontoMinimo())
            resp="Menor a Mínimo";
        else if(totalCosto>campaña.getMontoMinimo()&&totalCosto<campaña.getMontoMaximo())
            resp="Válido";
        else if(totalCosto>campaña.getMontoMaximo())
            resp="Alcanzado";
        return resp;
    }
    
    public boolean isAnulado() {
        return anulado;
    }
    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
    
    public int mostrarEstrellasTotales(){
         int cantEst=0;
         for(int i=0; i<renglones.size(); i++){
             if(!renglones.get(i).isAnulado()){
                  cantEst+=renglones.get(i).getCant_estrellas()*renglones.get(i).getCantidad();
             }
         }
         return cantEst; 
     }
    public String devolverEstado(){
        String st = null;
        if(this.isAnulado()){
            st="Anulado";
        }
        else if(this.fechaEntrega == null){
            st="Ingresado";
        }
        else if(this.getFechaEntrega()!=null && this.fechaPago==null){
            st="Entregado";
        }
        else if(Duration.between(this.getFechaEntrega().plusDays(10).atStartOfDay(),LocalDate.now().atStartOfDay()).toDays()>=1 && this.fechaPago==null)
        {
            st="Vencido";
        }
        else if(this.getFechaEntrega()!=null && this.fechaPago!=null){
            st="Pagado";
        }        
        return st;
    }
    
    @Override
    public String toString() {
        return "idPedido: " + idPedido + ", fechaIngreso: " + fechaIngreso + ", fechaPago: " + fechaPago + ", fechaEntrega: " + fechaEntrega + ", revendedora: " + revendedora.getDni() + ", campaña: " + campaña.getNroCampaña() + ", cantCajas: " + cantCajas + ", renglones: " + renglones + ", totalCosto: " + totalCosto + ", anulado: " + anulado ;
    }
    
    public void imprimirPedido()
    {   System.out.println("----------------------------------------");
        System.out.println("Pedido N° " + idPedido + "    Revendedor: "+revendedora.getNombre()+" "+ revendedora.getApellido());
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Fecha de Entrega: " + fechaEntrega);
        System.out.println("Fecha de Pago: " + fechaPago);
        for(int i=0;i<renglones.size();i++)
        {
            System.out.println(renglones.get(i).toString());
        }
        System.out.println("Costo Total: " + calcularTotalCosto());
        System.out.println("Estrellas Totales: " + mostrarEstrellasTotales());
        System.out.println("Estado de Pedido: " + devolverEstado());
        System.out.println("El monto del pedido es = "+controlarMontos());
        System.out.println("----------------------------------------");
    }
      
}