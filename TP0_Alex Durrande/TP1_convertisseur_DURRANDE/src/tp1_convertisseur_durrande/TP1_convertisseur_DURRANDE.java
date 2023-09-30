/*
Alexandre Durrande
FG2 TDA
Familiarisé avec Netbeans 
18/09/2023
 */
package tp1_convertisseur_durrande;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TP1_convertisseur_DURRANDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        double valeur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Saisir une valeur réelle");
        valeur = sc.nextDouble();
        System.out.println("\n Saissisez la conversion que vous souhaitez \n 1) De Celius vers Kelvin \n 2) De Kelvin vers Celsius \n 3)De Farenheit vers Celsius \n 4)De Celsius vers Farenheit \n 5)De Kelvin vers Farenheit \n 6)De Farenheit vers Kelvin");
        int choix = sc.nextInt();
        double result;
        switch (choix) {
            case 1 -> {
                result = CelciusVersKelvin(valeur);
                System.out.println("\n La température est de " + result + " Kelvin");
            }

            case 2 -> {
                result = KelvinVersCelcius(valeur);
                System.out.println("\n La température est de" + result + "Celcius");
            }

            case 3 -> {
                result = FarenheitVersCelcius(valeur);
                System.out.println("\n La température est de" + result + " Farenheit");
            }
            case 4 -> {
                result = CelciusVersFarenheit(valeur);
                System.out.println("\n La température est de" + result + "Celcius");
            }

            case 5 -> {
                result = KelvinVersFarenheit(valeur);
                System.out.println("\n La température est de" + result + "Farenheit");
            }

            case 6 -> {
                result = FarenheitVersKelvin(valeur);
                System.out.println("\n La température est de " + result + "Kelvin");
            }
            default ->
                System.out.println("operateur inconnue");

        }
//System.out.println ("\n La température en kelvin est "+ (valeur+ 273.15)) ;

//System.out.println ("\n La température en kelvin est "+ (valeur+ 273.15)) ;
    }

    public static double CelciusVersKelvin(double valeur) {

        double tKelvin = valeur + 273.15;
        return tKelvin;
    }

    public static double KelvinVersCelcius(double valeur) {

        double tCelsius = valeur - 273.15;
        return tCelsius;
    }

    public static double FarenheitVersCelcius(double valeur) {

        double tCelsius = (valeur - 32) * 5.0 / 9.0;
        return tCelsius;
    }

    public static double CelciusVersFarenheit(double valeur) {

        double tFarenheit = (valeur * 1.8) + 32.0;
        return tFarenheit;
    }

    public static double KelvinVersFarenheit(double valeur) {
        double tCelcius = KelvinVersCelcius(valeur);
        double tFarenheit = CelciusVersFarenheit(tCelcius);
        return tFarenheit;

    }

    public static double FarenheitVersKelvin(double valeur) {
        double tCelcius = KelvinVersCelcius(valeur);
        double tKelvin = CelciusVersFarenheit(tCelcius);
        return tKelvin;
    }

}
