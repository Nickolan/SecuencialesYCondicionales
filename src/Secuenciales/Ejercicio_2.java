package Secuenciales;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int min, ej, kg;
        double calorias = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilos que pesa actualmente: ");
        kg = sc.nextInt();

        System.out.print("Ingrese la cantidad de minutos que planea ejercitarse: ");
        min = sc.nextInt();

        System.out.println("1: Correr\n2: Nadar\n3: Ciclismo");
        ej = sc.nextInt();

        System.out.println(kg);
        System.out.println(min);
        System.out.println(ej);

        switch (ej){
            case 1:
                System.out.println("Correr");

                if (kg < 69){
                    calorias = min * 8.4;
                } else if (kg >= 70 && kg < 83){
                    calorias = min * 9.8;
                } else if (kg >= 84 && kg < 100) {
                    calorias = min * 11.4;
                } else if (kg > 100) {
                    calorias = min * 13.2;
                }

                System.out.println("Se han quemado " + calorias + " calorias");
                break;
            case 2: // 7.8 cal/min	9.8 cal/min	11.8 cal/min 14.0 cal/min
                System.out.println("Nadar");
                if (kg < 69){
                    calorias = min * 7.8;
                } else if (kg >= 70 && kg < 83){
                    calorias = min * 9.8;
                } else if (kg >= 84 && kg < 100) {
                    calorias = min * 11.8;
                } else if (kg > 100) {
                    calorias = min * 14.0;
                }
                System.out.println("Se han quemado " + calorias + " calorias");
                break;
            case 3: // 6.4 cal/min	7.8 cal/min	9.2 cal/min	10.9 cal/min
                System.out.println("Ciclismo");
                if (kg < 69){
                    calorias = min * 6.4;
                } else if (kg >= 70 && kg < 83){
                    calorias = min * 7.8;
                } else if (kg >= 84 && kg < 100) {
                    calorias = min * 9.2;
                } else if (kg > 100) {
                    calorias = min * 10.9;
                }
                System.out.println("Se han quemado " + calorias + " calorias");
                break;
            default:
                System.out.println("Esa opcion no esta disponible");
                break;
        }

    }
}
