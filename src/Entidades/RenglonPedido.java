/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author jackd
 */
public class RenglonPedido {
    
    private int id_renglon;
    private int id_producto;
    private int id_pedido;
    private int cantidad;
    private int nro_caja;
    private float precio_costo;
    private float precio_publico;
    private int cant_estrellas;
    private boolean anulado;

    public RenglonPedido(int id_producto, int id_pedido, int cantidad, int nro_caja, float precio_costo, float precio_publico, int cant_estrellas) {
        this.id_renglon=0;
        this.id_producto = id_producto;
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
        this.nro_caja = nro_caja;
        this.precio_costo = precio_costo;
        this.precio_publico = precio_publico;
        this.cant_estrellas = cant_estrellas;
        this.anulado=false;
    }
    
    public RenglonPedido(Producto prod, int id_pedido, int cantidad, int nro_caja)
    {
        this.id_renglon=0;
        this.id_producto = prod.getIdProducto();
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
        this.nro_caja = nro_caja;
        this.precio_costo = prod.getPrecioCosto();
        this.precio_publico = prod.getPrecioVenta();
        this.cant_estrellas = prod.getCantEstrellas();
        this.anulado=false;
    }

    public RenglonPedido() {
        this.id_renglon=0;
    }
    
    public int getId_renglon() {
        return id_renglon;
    }

    public void setId_renglon(int id_renglon) {
        this.id_renglon = id_renglon;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNro_caja() {
        return nro_caja;
    }

    public void setNro_caja(int nro_caja) {
        this.nro_caja = nro_caja;
    }

    public float getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(float precio_costo) {
        this.precio_costo = precio_costo;
    }

    public float getPrecio_publico() {
        return precio_publico;
    }

    public void setPrecio_publico(float precio_publico) {
        this.precio_publico = precio_publico;
    }

    public int getCant_estrellas() {
        return cant_estrellas;
    }

    public void setCant_estrellas(int cant_estrellas) {
        this.cant_estrellas = cant_estrellas;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    @Override
    public String toString() {
        return "Renglon_Pedido{" + "id_renglon=" + id_renglon + ", id_producto=" + id_producto + ", id_pedido=" + id_pedido + ", cantidad=" + cantidad + ", nro_caja=" + nro_caja + ", precio_costo=" + precio_costo + ", precio_publico=" + precio_publico + ", cant_estrellas=" + cant_estrellas + ", anulado=" + anulado + '}';
    }
    
    
    
    
}
