
/*
EJERCICIO 4:  En un centro de verificación de automóviles se desea saber el
promedio de puntos contaminantes de los n automóviles que
lleguen. Asimismo se desea saber los puntos contaminantes
del auto que menos contaminó y del que más contaminó.
[0:100]
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cont = 1, suma = 0, max = 0, min = 0;
        double promedio;
        String txt;
        System.out.print(
                "*** Datos: \n- El rango de la puntuación de contaminación es [0:100]\n- Para finalizar ingrese \"s\"\n\n");
        while (true) {
            // Validación del dato a ingresar con el bucle FOR
            for (;;) {
                System.out.print("Ingrese el puntaje de contaminación del auto N° " + cont + ": ");
                txt = scan.next();
                if (txt.equals("s")) {
                    break;
                }
                num = Integer.valueOf(txt);
                if (num >= 0 && num <= 100)
                    break;
            }
            // Procesamiento de los datos para obtener la suma y el valor maximo y minimo
            if (txt.equals("s"))
                break;
            num = Integer.valueOf(txt);
            suma += num;
            if (cont == 1)
                max = num;
            else if (num > max)
                max = num;
            if (cont == 1)
                min = num;
            else if (num < min)
                min = num;
            cont++;
        }
        promedio = (double) suma / (cont - 1);
        System.out.println("\nPromedio de los puntajes ingresados: " + promedio + "\nLa puntuación más alta fue: " + max
                + "\nLa puntuación más baja fue: " + min);

    }
}