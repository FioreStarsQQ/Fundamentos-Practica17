
/*
EJERCICIO 4: Determinar cuántos hombres y cuántas mujeres se
encuentran en un grupo de alumnos, suponiendo que los
datos son extraídos alumno por alumno. También indicar los
porcentajes de cada género. Considerar la interacción con el
usuario
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sexo, cont = 1, sumaFemenino = 0, sumaMasculino = 0;
        double porcentajeFemenino, porcentajeMasculino;
        System.out.print(
                "*** Datos: \n- Ingrese \"1\" para femenino y \"2\" para masculino\n- Para finalizar ingrese \"0\"\n\n");
        while (true) {
            // Validación del dato a ingresar con el bucle FOR
            for (;;) {
                System.out.print("Ingrese el sexo del estudiante N° " + cont + ": ");
                sexo = scan.nextInt();
                if (sexo == 0) {
                    break;
                }
                if (sexo == 1 || sexo == 2)
                    break;
            }
            // Procesamiento de los datos para obtener la cantidad de estudiantes del sexo
            // femanino y masculino
            if (sexo == 0)
                break;
            if (sexo == 1)
                sumaFemenino += 1;
            if (sexo == 2)
                sumaMasculino += 1;
            cont++;
        }
        porcentajeFemenino = (double) Math.round((((double) sumaFemenino * 100) / (sumaFemenino + sumaMasculino)) * 100)
                / 100;
        porcentajeMasculino = (double) Math
                .round((((double) sumaMasculino * 100) / (sumaFemenino + sumaMasculino)) * 100) / 100;
        System.out.println("\nEstudiantes del sexo femenino: " + porcentajeFemenino
                + " %\nEstudiantes del sexo masculino: " + porcentajeMasculino + " %");

    }
}