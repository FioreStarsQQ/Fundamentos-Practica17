
/*
EJERCICIO 1: Hallar el valor máximo de una serie de n números enteros
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, contador, num, max = 1;
        // Se pide la cantidad de datos que se ingresarán
        System.out.print("Ingrese la cantidad de números que desea ingresar: ");
        n = scan.nextInt();
        for (contador = 1; contador <= n; contador++) {
            System.out.print("Ingrese el valor N° " + contador + ": ");
            num = scan.nextInt(); scan.close();
            if (contador == 1)
                max = num;
            else {
                max = Math.max(num, max);
            }
        }
       
        System.out.println("El valor máximo es: " + max);
    }
}