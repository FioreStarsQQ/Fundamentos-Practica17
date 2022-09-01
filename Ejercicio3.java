
/*
EJERCICIO 3:  Se introducen números por teclado, y se desea calcular
cuántos son mayores que 0, cuántos son menores a 0 y
cuántos son iguales a 0

POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sumaCeros = 0, sumaNeg = 0, sumaPos = 0;

        System.out.print("*** Dato: Para terminar ingrese \"s\"\n\n");
        while (true) {
            System.out.print("Ingrese un número: ");
            String txt = scan.next();
            if (txt.equals("s"))
                break;
            num = Integer.valueOf(txt);
            if (num < 0)
                sumaNeg += 1;
            else if (num > 0)
                sumaPos += 1;
            else
                sumaCeros += 1;
        }
        System.out.print(
                "\n- Cantidad de números mayores que cero: " + sumaPos + "\n- Cantidad de números menores que cero: "
                        + sumaNeg + "\n- Cantidad de ceros ingresados: " + sumaCeros);
        scan.close();
    }
}