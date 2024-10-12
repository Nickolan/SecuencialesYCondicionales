package Condicionales;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
        //calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
        //peso, peso normal, sobrepeso, obesidad).

        double peso, altura, IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu peso en kilogramos");
        peso = sc.nextDouble();

        System.out.println("Ingresa tu altura");
        altura = sc.nextDouble();

        IMC = peso / (altura * altura);
        //Menos de 18.5	Bajo peso
        //18.5 – 24.9	Peso normal
        //25 – 29.9	Sobrepeso
        //30 o más	Obesidad
        System.out.println(IMC);
        if (IMC < 18.5){
            System.out.println("Tu Indice de masa corporal esta muy bajo, deberias comer mas");
        } else if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Tu Indice de masa corporal es estable");
        } else if (IMC >=25 && IMC <= 29.9) {
            System.out.println("Tu Indice de masa corporal esta alto, controla tu consumo de calorias");
        } else {
            System.out.println("Afloja los alfajores");
        }
    }
}
