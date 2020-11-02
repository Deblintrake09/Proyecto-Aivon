package Entidades;

public class Producto {
    private int idProducto;
    private String codigo;
    private String nombre;
    private String uso;
    private int tamaño;
    private float precioCosto;
    private float precioVenta;
    private int cantEstrellas;
    private boolean anulado;

    public Producto(int idProducto, String codigo, String nombre, String uso, int tamaño, float precioCosto, float precioVenta, int cantEstrellas) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamaño = tamaño;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantEstrellas = cantEstrellas;
        this.anulado=false;
    }

    public Producto(String codigo, String nombre, String uso, int tamaño, float precioCosto, float precioVenta, int cantEstrellas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamaño = tamaño;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantEstrellas = cantEstrellas;
        this.anulado=false;
    }

    public Producto() {
        this.anulado=false;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantEstrellas() {
        return cantEstrellas;
    }

    public void setCantEstrellas(int cantEstrellas) {
        this.cantEstrellas = cantEstrellas;
    }
    
      public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
    
    @Override
    public String toString() {
        return "ID. Producto: " + idProducto + ". Codigo: " + codigo + ". Nombre:" + nombre + ". Uso: " + uso + ". Tamaño: " + tamaño + ". Precio costo: " + precioCosto + ". Precio venta:" + precioVenta + ". Cant. Estrellas=" + cantEstrellas + ". Anulado= "+anulado;
    }

    
}
