package Secuenciales;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        // Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
        //avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
        //duraciones.

        int cfLevel;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu condicion fisica\n1- Principiante\n2- Intermedio\n3- Avanzado");
        cfLevel = sc.nextInt();
        switch (cfLevel){
            case 1:
                generarRutinaPrincipiante();
                break;
            case 2:
                generarRutinaIntermedia();
                break;
            case 3:
                generarRutinaAvanzada();
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }

    }

    public static void generarRutinaPrincipiante(){
        System.out.println("Lunes: Caminata Rapida - 30 Minutos");
        System.out.println("Martes: Descanso o Estiramientos Suaves");
        System.out.println("Miercoles: Bicicleta - 30 Minutos");
        System.out.println("Jueves: Yoga Suave - 30 Minutos");
        System.out.println("Viernes: Caminata Rapita - 30 Minutos");
        System.out.println("Sabado: Ejercicios de movilidad - 15 minutos");
        System.out.println("Domingo: Descanso");
    }

    public static void generarRutinaIntermedia(){
        System.out.println("Lunes: Correr - 40 minutos");
        System.out.println("Martes: Entrenamiento de fuerza (cuerpo superior) - 30 minutos");
        System.out.println("Miércoles: Natación - 30 minutos");
        System.out.println("Jueves: Yoga o Pilates - 40 minutos");
        System.out.println("Viernes: Bicicleta - 45 minutos");
        System.out.println("Sábado: Entrenamiento HIIT - 20 minutos");
        System.out.println("Domingo: Descanso activo (caminata ligera o estiramientos)");
    }

    public static void generarRutinaAvanzada(){
        System.out.println("Lunes: Correr - 60 minutos");
        System.out.println("Martes: Entrenamiento de fuerza (cuerpo completo) - 45 minutos");
        System.out.println("Miércoles: Natación intensa - 45 minutos");
        System.out.println("Jueves: Yoga avanzado - 50 minutos");
        System.out.println("Viernes: Bicicleta de montaña - 60 minutos");
        System.out.println("Sábado: Entrenamiento HIIT - 30 minutos");
        System.out.println("Domingo: Descanso activo (bicicleta ligera o caminata)");
    }
}
