package Entidades;

public class Revendedora {
    private int idRev;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String mail;
    private boolean activa;
    private int campaña;
    private boolean anulado;

    public Revendedora(int idRev, String nombre, String apellido, int dni, int telefono, String mail, boolean activa, int campaña, boolean anulado) {
        this.idRev = idRev;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.activa = activa;
        this.campaña = campaña;
        this.anulado = anulado;
    }

    public Revendedora(String nombre, String apellido, int dni, int telefono, String mail , boolean activa, int campaña, boolean anulado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.activa = activa;
        this.campaña = campaña;
        this.anulado = anulado;
    }

    public Revendedora() {
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
    
    @Override
    public String toString() {
        return "ID. Rev.: " + idRev + ". Nombre: " + nombre + ". Apellido: " + apellido + ". DNI: " + dni + ". Telefono: " + telefono +". Mail: "+ mail +". Activa: " + activa + ". Campaña: " + campaña  + ". Anulado: " + anulado;
    }
    
}