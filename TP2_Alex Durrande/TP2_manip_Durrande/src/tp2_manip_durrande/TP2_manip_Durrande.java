/*
Alexandre Durrande
FG2 TDA
TP2 
18/09/2023
 */
package tp2_manip_durrande;
import java.util.Random;
/**
 *
 * @author Alexandre
 */
public class TP2_manip_Durrande {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Tartiflette assiette1 = new Tartiflette(500);
Tartiflette assiette2 = new Tartiflette(600);
Tartiflette assiette3 = assiette2 ;

System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;

 Tartiflette temp = assiette1;
 assiette1 = assiette2;
 assiette2 = temp;

 System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
 System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

 

  Random generateurAleat = new Random();
        Moussaka[] tableauMoussaka = new Moussaka[10];
        for (int i = 0; i < tableauMoussaka.length; i++) {
            tableauMoussaka[i] = new Moussaka(generateurAleat.nextInt(1000));
        }
        // TODO code application logic here
    }

}
