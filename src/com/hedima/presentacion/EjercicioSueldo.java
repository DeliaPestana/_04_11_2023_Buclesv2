package com.hedima.presentacion;

import java.util.Scanner;

public class EjercicioSueldo {
    public static void main(String[] args) {

        // Pedir 5 sueldos y mostrar su suma y decir cuantos son mayores a 1000

        Scanner s1 = new Scanner(System.in);
        int sueldo = 0,  con = 0, sumaSueldos=0;  // inicializo el sueldo y el contador
        for (int i = 1; i <=5;i++){ // realizo un bucle para 5 veces
            System.out.println("Introduzca el sueldo nº: "+ i);
            sueldo = s1.nextInt();
            sumaSueldos+=sueldo;// Acumulo los sueldos en sumaSueldo
            if(sueldo >1000){ // si es mayor que 1000
                con++; //incremento el contador
            }
        }
        System.out.println("La suma de los sueldos es de: " + sumaSueldos);
        System.out.println("Sueldos mayores que 1000: " + con);
     }
}
