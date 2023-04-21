package com.hedima.presentacion;

import java.util.Scanner;

public class EjemploEdades {
    public static void main(String[] args) {
        //Ejercicio: Dadas las edades de 5 alumnos mostrar la edad media, la cantidad de alumnos mayores de 18 años
        Scanner s1 = new Scanner(System.in);
        int edad = 0, con =0, sumaEdad = 0;
        for (int i = 1; i<=5;i++){
            System.out.println("Introduce la edad del alumno nº " + i );
            edad = s1.nextInt();
            sumaEdad+=edad;
            if(edad>18){
                con++;
            }
        }
        System.out.println("la media es: " + sumaEdad/5);

        System.out.println("Hay "+ con + " alumnos mayores de 18 años");

    }
}
