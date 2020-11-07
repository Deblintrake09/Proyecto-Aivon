package Entidades;

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

    public Pedido(LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEntrega, Revendedora revendedora, Campaña campaña, ArrayList<RenglonPedido> renglones, int cantCajas, float totalCosto) {
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.revendedora = revendedora;
        this.campaña = campaña;
        this.renglones=renglones;
        this.cantCajas = cantCajas;
        this.totalCosto = calcularTotalCosto();
        this.anulado = false;
    }

    public Pedido(int idPedido, LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEntrega, Revendedora revendedora, Campaña campaña, ArrayList<RenglonPedido> renglones, int cantCajas, float totalCosto) {
        this.idPedido = idPedido;
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.revendedora = revendedora;
        this.campaña = campaña;
        this.renglones=renglones;
        this.cantCajas = cantCajas;
        this.totalCosto = calcularTotalCosto();
        this.anulado = false;
    }

    public Pedido() {
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
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
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
        for (int i=0;i<renglones.size();i++)
        {
            if(!renglones.get(i).isAnulado())
                totalCosto+= renglones.get(i).getPrecio_costo()*renglones.get(i).getCantidad();
        }
        return totalCosto;
    }
    
    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", fechaIngreso=" + fechaIngreso + ", fechaPago=" + fechaPago + ", fechaEntrega=" + fechaEntrega + ", revendedora=" + revendedora + ", campa\u00f1a=" + campaña + ", cantCajas=" + cantCajas + ", renglones=" + renglones + ", totalCosto=" + totalCosto + ", anulado=" + anulado + '}';
    }
    
}