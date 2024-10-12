package Secuenciales;

import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        //genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
        String animo;

        animo = JOptionPane.showInputDialog("Ingrese su estado de Animo (feliz, triste, enérgico, relajado)").toLowerCase();
        switch (animo){
            case "feliz":
                listaFeliz();
                break;
            case "triste":
                listaTriste();
                break;
            case "energico":
                listaEnergico();
                break;
            case "relajado":
                listaRelajado();
                break;
            default:
                break;
        }

    }

    public static void listaFeliz(){
        System.out.println("Happy – Pharrell Williams");
        System.out.println("\"Can't Stop the Feeling!\" – Justin Timberlake");
        System.out.println("\"Walking on Sunshine\" – Katrina and the Waves");
        System.out.println("\"Good as Hell\" – Lizzo");
        System.out.println("\"Uptown Funk\" – Mark Ronson ft. Bruno Mars");
    }

    public static void listaTriste(){
        System.out.println("\"Someone Like You\" – Adele");
        System.out.println("\"Fix You\" – Coldplay");
        System.out.println("\"Tears in Heaven\" – Eric Clapton");
        System.out.println("\"All I Want\" – Kodaline");
        System.out.println("\"Let Her Go\" – Passenger");
    }

    public static void listaEnergico(){
        System.out.println("\"Eye of the Tiger\" – Survivor");
        System.out.println("\"Lose Yourself\" – Eminem");
        System.out.println("\"We Will Rock You\" – Queen");
        System.out.println("\"Stronger\" – Kanye West");
        System.out.println("\"Believer\" – Imagine Dragons");
    }

    public static void listaRelajado(){
        System.out.println("\"Weightless\" – Marconi Union");
        System.out.println("\"Stay\" – Rihanna ft. Mikky Ekko");
        System.out.println("\"Banana Pancakes\" – Jack Johnson");
        System.out.println("\"Breathe Me\" – Sia");
        System.out.println("\"The Night We Met\" – Lord Huron");
    }
}
