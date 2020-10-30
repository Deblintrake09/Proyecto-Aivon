package Entidades;

public class Revendedora {
    private int idRev;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private boolean activa;
    private int campaña;

    public Revendedora(int idRev, String nombre, String apellido, int dni, int telefono, boolean activa, int campaña) {
        this.idRev = idRev;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activa = activa;
        this.campaña = campaña;
    }

    public Revendedora(String nombre, String apellido, int dni, int telefono, boolean activa, int campaña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activa = activa;
        this.campaña = campaña;
    }

    public int getIdRev() {
        return idRev;
    }

    public void setIdRev(int idRev) {
        this.idRev = idRev;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getCampaña() {
        return campaña;
    }

    public void setCampaña(int campaña) {
        this.campaña = campaña;
    }

    @Override
    public String toString() {
        return "ID. Rev.: " + idRev + ". Nombre: " + nombre + ". Apellido: " + apellido + ". DNI: " + dni + ". Telefono: " + telefono + ". Activa: " + activa + ". Campaña: " + campaña;
    }
    
}
