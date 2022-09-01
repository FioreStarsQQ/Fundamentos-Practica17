
/*
EJERCICIO 2: Simular el comportamiento de un reloj digital, imprimiendo la
hora, minutos y segundos de un día desde las 0:00:00 horas
hasta las 23:59:59 horas
POR: Fiorela Clariza Quispe Quispe
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        for (int horas = 0; horas < 24; horas++)
            for (int minutos = 0; minutos < 60; minutos++)
                for (int segundos = 0; segundos < 60; segundos++)
                    if (horas < 10 || minutos < 10 || segundos < 10)
                        System.out.println("Hora: " + String.format("%02d", horas) + " : "
                                + String.format("%02d", minutos) + " : " + String.format("%02d", segundos));
                    else
                        System.out.println("Hora: " + horas + " : " + minutos + " : " + segundos);
    }
}