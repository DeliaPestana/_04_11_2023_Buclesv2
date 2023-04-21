package com.hedima.presentacion;

public class PalabraReservadaBreakContinue {
    public static void main(String[] args) {

        //BREAK
        System.out.println("El BREAK --------------------------------");
        for(int i = 0; i <=10;i++){  //entra 10 veces
            System.out.println("El valor actual del i es: " + i);
            if(i ==5){
                break;
            }
        }
        System.out.println("El CONTINUE-----------------------------");
        //CONTINUE

        for(int i = 0; i <=10;i++){  //entra 10 veces

            if(i ==5){

                continue;// va a volver a analizar la condicion
            }
            System.out.println("El valor actual del i es: " + i);
        }
    }
}
