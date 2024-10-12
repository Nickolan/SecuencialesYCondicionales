package Condicionales;

import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        String choice;
        choice = JOptionPane.showInputDialog("Ingresa tu genero de pelicula favorito:\n1- Accion\n2- Comedia\n3- Drama\n4-Ciencia Ficcion");
        if (Integer.parseInt(choice) == 1){
            System.out.println("Te recomiendo ver Mision Imposible");
        } else if (Integer.parseInt(choice) == 2) {
            System.out.println("Te recomiendo ver Son como niños");
        } else if (Integer.parseInt(choice) == 3) {
            System.out.println("Te recomiendo ver Sin novedad en el frente");
        } else if (Integer.parseInt(choice) == 1){
            System.out.println("Te recomiendo ver Star Wars");
        } else {
            System.out.println("Opcion Invalida");
        }
    }
}
