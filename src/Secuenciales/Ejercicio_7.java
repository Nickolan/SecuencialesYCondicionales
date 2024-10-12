package Secuenciales;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
        //vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
        //índice de felicidad basado en esos factores.

        byte nivelVida, nivelEstres, nivelSalud;
        int avarage;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nivel de satisfaccion con la vida 1-10: ");
        nivelVida = sc.nextByte();
        validarRango(nivelVida);

        System.out.print("Ingresa tu nivel de estres 1-10: ");
        nivelEstres = sc.nextByte();
        validarRango(nivelEstres);

        System.out.print("Ingresa tu nivel de salud 1-10: ");
        nivelSalud = sc.nextByte();
        validarRango(nivelSalud);

        avarage = (nivelSalud - nivelEstres + nivelVida) / 2;

        System.out.println("Tu indice de felicidad es de " + avarage);
    }

    public static void validarRango(byte level){
        if (level < 1 || level > 10){
            System.out.println("El rango es entre 1 y 10");
            return;
        }
    }
}
