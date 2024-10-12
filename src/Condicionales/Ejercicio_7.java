package Condicionales;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        //recomiende una actividad basada en su estado de ánimo.

        String animo, mensaje;
        Scanner scn = new Scanner(System.in);
        System.out.println("ingresa tu estado de ánimo (feliz, triste, enérgico, relajado): ");
        animo = scn.next().toLowerCase();

        switch (animo){
            case "feliz":
                mensaje = "¡Genial! Te recomendamos salir a pasear con amigos o hacer algo que disfrutes.";
                break;
            case "triste":
                mensaje = "Lo siento mucho. Tal vez escuchar música relajante o hablar con un ser querido te ayude.";
                break;
            case "energico":
                mensaje = "¡Aprovecha tu energía! Podrías hacer ejercicio o empezar un proyecto creativo.";
                break;
            case "relajado":
                mensaje = "Perfecto. Disfruta del momento, podrías leer un libro o meditar.";
                break;
            default:
                mensaje = "No reconozco ese estado de ánimo. Por favor, elige entre: feliz, triste, enérgico o relajado.";
                break;
        }

        System.out.println(mensaje);
    }
}
