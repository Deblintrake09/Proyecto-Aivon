package Entidades;

import java.time.LocalDate;

public class Pedido {
    private int idPedido;
    private LocalDate fechaIngreso;
    private LocalDate fechaPago;
    private LocalDate fechaEntrega;
    private Revendedora revendedora;
    private Campaña campaña;
    private int cantCajas;
    private float totalCosto;
    private boolean anulado;

    public Pedido(LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEntrega, Revendedora revendedora, Campaña campaña, int cantCajas, float totalCosto) {
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.revendedora = revendedora;
        this.campaña = campaña;
        this.cantCajas = cantCajas;
        this.totalCosto = totalCosto;
        this.anulado = false;
    }

    public Pedido(int idPedido, LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEntrega, Revendedora revendedora, Campaña campaña, int cantCajas, float totalCosto) {
        this.idPedido = idPedido;
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEntrega = fechaEntrega;
        this.revendedora = revendedora;
        this.campaña = campaña;
        this.cantCajas = cantCajas;
        this.totalCosto = totalCosto;
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

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    @Override
    public String toString() {
        return "ID. Pedido: " + idPedido + ". Fecha ingreso: " + fechaIngreso + ". Fecha pago: " + fechaPago + ". Fecha entrega: " + fechaEntrega + ". Revendedora:" + revendedora.getApellido() + ". Campaña: " + campaña.getNroCampaña() + ". Cant. Cajas: " + cantCajas + ". Total costo: " + totalCosto + ". Anulado: " + anulado ;
    }
    
}