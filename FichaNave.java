import java.util.Scanner;
/**
 *
 * @author Jose Amtonio Pineda David y Daniel Jimenez Carrasco
 */
public class FichaNave {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el nombre del piloto: ");
        String nombrePiloto = sc.next();
        System.out.println("Introduzca el rango del piloto: ");
        String rangoPiloto = sc.next();
        int nivelExperiencia;
        double combustibleActual;
        boolean sistemas;
        
        final double CAPACIDAD_MAXIMA_LITROS = 2000.0;
        final double CONSUMO_POR_AÑO_LUZ = 180.5;
        
        System.out.println(rangoPiloto.charAt(0));
    }
}
