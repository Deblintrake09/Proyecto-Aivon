/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


public class Nivel {
    private int idNivel;
    private int nombreNivel;
    private float monto_min;
    private float monto_max;
    private boolean anulado;

    public Nivel(int nombreNivel, float monto_min, float monto_max) {
        this.nombreNivel = nombreNivel;
        this.monto_min = monto_min;
        this.monto_max = monto_max;
        this.anulado=false;
    }

    public Nivel() {
    }
  
    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(int nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public float getMonto_min() {
        return monto_min;
    }

    public void setMonto_min(float monto_min) {
        this.monto_min = monto_min;
    }

    public float getMonto_max() {
        return monto_max;
    }

    public void setMonto_max(float monto_max) {
        this.monto_max = monto_max;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

           /** Retorna si el monto pasado se encuentra dentro de los montos permitidos
            * para la revendedora.
            * @param monto Es el monto que se desea comparar
            * @return  0 si es menor al monto mínimo, 1 si es >= al minimo y <= maximo,
            *  2 si fuera mayor que el máximo. 1 y 2 son valores invalidos
        */
    public int controlarMonto(float monto)
    {
        if(monto<monto_min)
            return 0;
        else if(monto <= monto_max)
            return 1;
        else
            return 2;
                
    }
    @Override
    public String toString() {
        return "Nivel{" + "idNivel=" + idNivel + ", nombreNivel=" + nombreNivel + ", monto_min=" + monto_min + ", monto_max=" + monto_max + ", anulado=" + anulado + '}';
    }
    
    
    
}
