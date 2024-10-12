package Condicionales;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
        //ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
        //hábitos saludables basada en estos datos.

        String mensaje = "Evaluacion de tus habitos saludables\n";

        int horasDormido, horasEjercicio, comidasSaludables;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de horas que duermes al dia: ");
        horasDormido = sc.nextInt();

        System.out.print("Ingresa la cantidad de horas te ejercitas al dia: ");
        horasEjercicio= sc.nextInt();

        System.out.print("Ingresa la cantidad de comidas saludables que consumes al dia: ");
        comidasSaludables = sc.nextInt();

        if (horasDormido >= 7 &&horasDormido <=9){
            mensaje += "- Buen hábito de sueño.\n";
        } else if (horasDormido < 7){
            mensaje += "- Duermes poco, intenta descansar más.\n";
        } else {
            mensaje += "- Estás durmiendo demasiado, intenta moderar tu descanso.\n";
        }

        if (horasEjercicio >= 1){
            mensaje += "- Excelente, haces suficiente ejercicio diario.\n";
        } else if (horasDormido > 0){
            mensaje += "- Intenta hacer un poco más de ejercicio.\n";
        } else {
            mensaje += "- No haces ejercicio, es importante para tu salud.\n";
        }

        if (comidasSaludables >= 3){
            mensaje += "- Muy bien, tienes una buena alimentación saludable.\n";
        } else if (horasDormido > 0){
            mensaje += "- Podrías mejorar tu alimentación con más comidas saludables.\n";
        } else {
            mensaje += "- No consumes comidas saludables, intenta cambiar tu dieta.\n";
        }

        System.out.println(mensaje);

    }
}
