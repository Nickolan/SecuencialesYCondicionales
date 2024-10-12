package Condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
        //elige una opción al azar y determina quién gana. Imprime el resultado del juego.
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        Scanner sc = new Scanner(System.in);
        Random randomString = new Random();
        int num = randomString.nextInt(3);
        String choice;

        System.out.println(num);


        System.out.println("Elige: Piedra, Papel o Tijeras");
        choice = sc.nextLine();

        switch (choice){
            case "Piedra":
                if (opciones[num].equals("Papel")){
                    System.out.println(opciones[num] + ", Tu Pierdes");
                } else if (opciones[num].equals("Tijeras")){
                    System.out.println(opciones[num] + ", Tu Ganas");
                }
                break;
            case "Papel":
                if (opciones[num].equals("Tijeras")){
                    System.out.println(opciones[num] + ", Tu Pierdes");
                } else if (opciones[num].equals("Piedra")){
                    System.out.println(opciones[num] + ", Tu Ganas");
                }
                break;
            case "Tijeras":
                if (opciones[num].equals("Piedra")){
                    System.out.println(opciones[num] + ", Tu Pierdes");
                } else if (opciones[num].equals("Papel")){
                    System.out.println(opciones[num] + ", Tu Ganas");
                }
                break;
            default:
                System.out.println("Esa no es una opcion");
                break;
        }

    }
}
