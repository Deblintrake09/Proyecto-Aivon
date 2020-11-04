package Entidades;

import java.time.LocalDate;

public class Campaña 
{
    private int idCampaña;
    private int nroCampaña;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float montoMinimo;
    private float montoMaximo;
    private int estrellas;
    
    public Campaña(int idCampaña, int nroCampaña, LocalDate fechaInicio, LocalDate fechaFin, float montoMinimo, float montoMaximo) 
    {
        this.idCampaña = idCampaña;
        this.nroCampaña = nroCampaña;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
    }

    public Campaña(int nroCampaña, LocalDate fechaInicio, LocalDate fechaFin, float montoMinimo, float montoMaximo) 
    {
        this.nroCampaña = nroCampaña;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
    }

    public Campaña() 
    {
    }

    public int getIdCampaña() 
    {
        return idCampaña;
    }

    public void setIdCampaña(int idCampaña) 
    {
        this.idCampaña = idCampaña;
    }

    public int getNroCampaña() 
    {
        return nroCampaña;
    }

    public void setNroCampaña(int nroCampaña) 
    {
        this.nroCampaña = nroCampaña;
    }

    public LocalDate getFechaInicio() 
    {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) 
    {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() 
    {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) 
    {
        this.fechaFin = fechaFin;
    }

    public float getMontoMinimo() 
    {
        return montoMinimo;
    }

    public void setMontoMinimo(float montoMinimo) 
    {
        this.montoMinimo = montoMinimo;
    }

    public float getMontoMaximo() 
    {
        return montoMaximo;
    }

    public void setMontoMaximo(float montoMaximo) 
    {
        this.montoMaximo = montoMaximo;
    }

    @Override
    public String toString() 
    {
        return "ID. Campaña: " + idCampaña + ". Nro. Campaña: " 
                + nroCampaña + ". Fecha inicio: " + fechaInicio 
                + ". Fecha fin: " + fechaFin + ". Monto minimo: $" + montoMinimo + ". Monto maximo: $" + montoMaximo;
    }
    
}
