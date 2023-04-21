package com.hedima.presentacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //EJERCICIO: Pedir un número N y mostrar todos los números del 1 al N

        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduce el número hasta el que quieras sacarlos");
        int numero = s1.nextInt();
        for (int i = 0; i <= numero; i++){
            //para que no imprima la última coma
            if (i==numero){
                System.out.print(i );

            }else{
                System.out.print(i + ", ");
            }
        }

        //Ejercicio: Mostrar todos los números del 100 al 0 de 7 en 7

        for ( int j = 100; j >= 0; j-=7){
            System.out.println(j);

        }

    //Ejercicio: Mostrar todos los números desde un número solicitado por pantalla al 0 de 7 en 7

        System.out.println("");
        System.out.println("hasta que número quieres imprimir de 7 en 7?");
        int n7 = s1.nextInt();

        for ( int j = n7; j >= 0; j-=7){
            System.out.println(j);

        }

    //Ejercicio: Diseñar un programa que muestre el producto de los 10 primeros números impares.

        int resultadoM = 1; // defino variable para guardar el producto de la multiplicación
        for(int im = 0; im <=20; im++) {
            if(im%2!=0) { // si es impar
                resultadoM*=im; //hago el producto
                System.out.println("Iterardor del  producto hasta el momento es de "  + resultadoM);
            }
        }
        System.out.println("El resultado es: " + resultadoM);


    //EJERCICIO: Pedir 10 números y mostrar la media de los números positivos y la media de los números negativos y la cantidad de ceros

        //1.- Defino las variables
        int sumaPositivos = 0, sumaNegativos = 0, contadorPositivo = 0, contadorNegativo = 0, contadorCero=0;
        
        //Declaro el Scanner
        Scanner sc  = new Scanner(System.in);
        
        //2.- Lógica 
        // Definimos un bucle para solicitar los números
        
        for(int ni = 1; ni<=10; ni++) {
            //leemos el número
            System.out.println("Introduce el número a evaluar");
            int numeroEntrada = sc.nextInt();
            //Lo evaluamos
            if(numeroEntrada <0){ // evaluamos los negativos
                contadorNegativo++;// incremento el contador
                sumaNegativos+=numeroEntrada; // lo sumo a la variable
            }else if (numeroEntrada== 0){ // evaluo si es cero
                contadorCero++; // incremento el contador de ceros
            } else if (numeroEntrada >0) { // evalúo si es positivo
                contadorPositivo++; // incremento el contador
                sumaPositivos+=numeroEntrada; //lo sumo a la variable
            }
        }
        if (contadorNegativo > 0) {  // controlo el error de la división por cero
            System.out.println("Promedio de números negativos "+ sumaNegativos/contadorNegativo);
        }else{
            System.out.println("No hay números negativos " );
        }
        if (contadorPositivo > 0) {
            System.out.println("Promedio de números positivos " + sumaPositivos/contadorPositivo);
        }else{
            System.out.println("No hay números negativos " );
        }
        System.out.println("Número de ceros " + contadorCero);

    }
}