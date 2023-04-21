package com.hedima.presentacion;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <=5){
            System.out.println(i);
            i++;
        }
        // Ejemplo: Solicitar número por la consola hasta que escriban un número negativo y al final mostrar la suma.
        // Forma 1
        Scanner s1 = new Scanner(System.in);
        int numero = 0, suma = 0;
        while (numero >= 0){
            System.out.println("Introduce un número");
            numero = s1.nextInt();
            if (numero >= 0){// para controlar que sólo sume los positivos
                suma+=numero;
            }
        }
        System.out.println("La suma de los número es: " + suma);

        //Forma 2:

        int numero1 = 0, suma1 = 0;
        while (true){  // utilizamos un bucle infinito
            System.out.println("Introduce un número");
            numero1 = s1.nextInt();
            if (numero1 >= 0){// para controlar que sólo sume los positivos
                suma1+=numero1;
            }else{
                break;  // Rompemos aquí el bucle infinito, cuando el número es negativo
            }
        }
        System.out.println("La suma de los número es: " + suma1);

        // EJERCICIO: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo:

        int numero2 = 0;
        System.out.println("Introduce un número y te muestro su cuadrado:");
        while (true){  // utilizamos un bucle infinito
            System.out.println("Introduce un número");
            numero2 = s1.nextInt();
            if (numero2 >= 0){// para controlar que sólo sume los positivos
                System.out.println("Su cuadrado es: " + Math.pow(numero2,2));// también podíamos haber puesto numero2*numero2
            }else{
                break;  // Rompemos aquí el bucle infinito, cuando el número es negativo
            }
        }
    }
}
