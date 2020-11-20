package Entidades;

public class Revendedora {
    private int idRev;
    private String nombre;
    private String apellido;
    private int dni;
    private long telefono;
    private String mail;
    private boolean activa;
    private int nivel;
    private boolean anulado;

    public Revendedora(int idRev, String nombre, String apellido, int dni, long telefono, String mail, boolean activa, int nivel ) {
        this.idRev = idRev;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.activa = activa;
        this.nivel = nivel;
        this.anulado = false;
    }

    public Revendedora(String nombre, String apellido, int dni, long telefono, String mail , boolean activa, int nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.activa = activa;
        this.nivel = nivel;
        this.anulado = false;
    }
        public Revendedora(String nombre, String apellido, int dni, long telefono, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.activa = true;
        this.nivel = 1;
        this.anulado = false;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
    
    @Override
    public String toString() {
        return  nombre +" "+ apellido;
    }
    
}
