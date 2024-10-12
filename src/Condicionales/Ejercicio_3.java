package Condicionales;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
        //ciencia ficción) y luego recomiende un libro basado en su elección.

        String categoria, libro;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu Genero de libro favorito (fantasía, misterio, romance, ciencia ficción)");
        categoria = sc.next().toLowerCase();

        switch (categoria){
            case "fantasia":
                libro = "\"El Hobbit\" – J.R.R. Tolkien";
                System.out.println("Puedes leer " + libro);
                break;
            case "misterio":
                libro = "\"El Código Da Vinci\" – Dan Brown";
                System.out.println("Puedes leer " + libro);
                break;
            case "romance":
                libro = "\"Orgullo y Prejuicio\" – Jane Austen";
                System.out.println("Puedes leer " + libro);
                break;
            case "ciencia ficcion":
                libro = "\"Dune\" – Frank Herbert";
                System.out.println("Puedes leer " + libro);
                break;
            default:
                System.out.println("Esa categorian no esta en la lista");
                break;
        }
    }
}
