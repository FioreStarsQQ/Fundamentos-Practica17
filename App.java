
/*
EJERCICIO 3:  Se introducen números por teclado, y se desea calcular
cuántos son mayores que 0, cuántos son menores a 0 y
cuántos son iguales a 0

POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;
public class App {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
int num, sumaCeros=0, sumaNeg=0, sumaPos=0;
String validador= "1";
        while (validador != "--") {
            System.out.print("Ingrese un número: ");
        num = scan.nextInt();
        if (num<0)
        sumaNeg += 1;
        else if (num > 0)
        sumaPos += 1;
        else 
        sumaCeros += 1;
        validador = Integer.toString(num);
        /*System.out.println("¿Desea continuar?\nPresione \"c\" si desea seguir\nPresione la tecla del espaciador para terminar.");
        validador = scan.next();*/
        }
        System.out.print("Cantidad de número positivos: "+sumaPos+"\nCantidad de números negativos: "+sumaNeg+"\nCantidad de ceros: "+sumaCeros);
scan.close();
    }
}