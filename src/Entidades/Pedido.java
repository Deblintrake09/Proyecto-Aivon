package Entidades;

import java.time.LocalDate;

public class Pedido {
    private int idPedido;
    private LocalDate fechaIngreso;
    private LocalDate fechaPago;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private boolean vencido;
    private int cantCajas;
    private float costo;
    private int cantEstrellas;

    public Pedido(int idPedido, LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEnvio, LocalDate fechaEntrega, boolean vencido, int cantCajas, float costo, int cantEstrellas) {
        this.idPedido = idPedido;
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.vencido = vencido;
        this.cantCajas = cantCajas;
        this.costo = costo;
        this.cantEstrellas = cantEstrellas;
    }

    public Pedido(LocalDate fechaIngreso, LocalDate fechaPago, LocalDate fechaEnvio, LocalDate fechaEntrega, boolean vencido, int cantCajas, float costo, int cantEstrellas) {
        this.fechaIngreso = fechaIngreso;
        this.fechaPago = fechaPago;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.vencido = vencido;
        this.cantCajas = cantCajas;
        this.costo = costo;
        this.cantEstrellas = cantEstrellas;
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

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getCantEstrellas() {
        return cantEstrellas;
    }

    public void setCantEstrellas(int cantEstrellas) {
        this.cantEstrellas = cantEstrellas;
    }

    @Override
    public String toString() {
        return "ID. Pedido: " + idPedido + ". Fecha ingreso: " + fechaIngreso + ". Fecha pago: " + fechaPago + ". Fecha envio: " + fechaEnvio + ". Fecha entrega: " + fechaEntrega + ". Vencido: " + vencido + ". Cant. Cajas: " + cantCajas + ". Costo:" + costo + ". Cant. Estrellas: " + cantEstrellas;
    }
    
}
