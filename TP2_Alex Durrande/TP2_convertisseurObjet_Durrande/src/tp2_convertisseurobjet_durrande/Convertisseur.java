/*
Alexandre Durrande
FG2 TDA
TP2 
18/09/2023
 */
package tp2_convertisseurobjet_durrande;

/**
 *
 * @author Alexandre
 */
public class Convertisseur {
     int nbConversions;
    
    public Convertisseur () {
     nbConversions = 0 ;
}
    
   public  double CelciusVersKelvin(double valeur) {

        double tKelvin = valeur + 273.15;
        return tKelvin;
    }

    public  double KelvinVersCelcius(double valeur) {

        double tCelsius = valeur - 273.15;
        return tCelsius;
    }

    public  double FarenheitVersCelcius(double valeur) {

        double tCelsius = (valeur - 32) * 5.0 / 9.0;
        return tCelsius;
    }

    public static double CelciusVersFarenheit(double valeur) {

        double tFarenheit = (valeur * 1.8) + 32.0;
        return tFarenheit;
    }

    public  double KelvinVersFarenheit(double valeur) {
        double tCelcius = KelvinVersCelcius(valeur);
        double tFarenheit = CelciusVersFarenheit(tCelcius);
        return tFarenheit;

    }

    public  double FarenheitVersKelvin(double valeur) {
        double tCelcius = KelvinVersCelcius(valeur);
        double tKelvin = CelciusVersFarenheit(tCelcius);
        return tKelvin;
    }
    @Override
    public String toString() {
        return "nb de conversions"+ nbConversions ;
    }
}
