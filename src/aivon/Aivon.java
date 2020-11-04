package aivon;

import Entidades.Campaña;
import Modelo.CampañaData;
import Modelo.Conexion;
import java.time.LocalDate;
import java.time.Month;

public class Aivon 
{

    public static void main(String[] args) 
    {
        //Campaña camp1 = new Campaña(13,LocalDate.of(2020, Month.NOVEMBER,3),LocalDate.of(2021, Month.MARCH,3),1500,6000);
        //Campaña camp2 = new Campaña(23,LocalDate.of(2021, Month.APRIL,3),LocalDate.of(2021, Month.JUNE,3),6000,12000);
        //System.out.println(camp1.toString());
        
        CampañaData cData = new CampañaData(new Conexion());
        //cData.agregarCampaña(camp1);
        //cData.agregarCampaña(camp2);
        //System.out.println(cData.buscarCampaña(13).toString());
        //System.out.println(cData.buscarCampaña(23).toString());
        //System.out.println(cData.buscarFechaInicioCampaña(LocalDate.of(2021, Month.APRIL,03)));
        //System.out.println(cData.buscarFechaFinCampaña(LocalDate.of(2021, Month.MARCH,03)));
        //System.out.println(cData.buscarMontoMinimoCampaña(6000));
        //System.out.println(cData.buscarMontoMaximoCampaña(12000));
        //System.out.println(cData.obtenerCampañas());
        System.out.println(cData.obtenerMontos());

    }
    
}
