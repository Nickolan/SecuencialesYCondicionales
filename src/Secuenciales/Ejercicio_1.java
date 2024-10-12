package Secuenciales;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        String fecha;
        Scanner scn = new Scanner(System.in);
        fecha = JOptionPane.showInputDialog("Ingresa Tu fecha de nacimiento con el formato 'DD/MM/AAAA'");
        System.out.println(fecha);

        String regex = "/";
        String [] myArray = fecha.split(regex);

        switch (Integer.parseInt(myArray[1]) ){
            case 1:
                System.out.println("Ingrese a Enero");
                if (Integer.parseInt(myArray[0]) <= 20){
                    System.out.println("Capricornio");
                    JOptionPane.showMessageDialog(null, "Capricornio");
                } else {
                    System.out.println("Acuario");
                    JOptionPane.showMessageDialog(null, "Acuario");
                }
                break;
            case 2:
                System.out.println("Ingrese a Febrero");
                if (Integer.parseInt(myArray[0]) <= 19){
                    JOptionPane.showMessageDialog(null, "Acuario");
                    System.out.println("Acuario");
                } else {
                    JOptionPane.showMessageDialog(null, "Piscis");
                    System.out.println("Piscis");
                }
                break;
            case 3:
                System.out.println("Ingrese a Marzo");
                if (Integer.parseInt(myArray[0]) <= 20){
                    JOptionPane.showMessageDialog(null, "Piscis");
                    System.out.println("Piscis");
                } else {
                    JOptionPane.showMessageDialog(null, "Aries");
                    System.out.println("Aries");
                }
                break;
            case 4:
                System.out.println("Ingrese a Abril");

                if (Integer.parseInt(myArray[0]) <= 20){
                    System.out.println("Aries");
                    JOptionPane.showMessageDialog(null, "Aries");
                } else {
                    JOptionPane.showMessageDialog(null, "Tauro");
                    System.out.println("Tauro");
                }
                break;
            case 5:
                System.out.println("Ingrese al Mayo");
                if (Integer.parseInt(myArray[0]) <= 21){
                    JOptionPane.showMessageDialog(null, "Tauro");
                    System.out.println("Tauro");
                } else {
                    JOptionPane.showMessageDialog(null, "Geminis");
                    System.out.println("Geminis");
                }
                break;
            case 6:
                System.out.println("Ingrese al Junio");
                if (Integer.parseInt(myArray[0]) <= 21){
                    JOptionPane.showMessageDialog(null, "Geminis");
                } else {
                    JOptionPane.showMessageDialog(null, "Cancer");
                }
                break;
            case 7:
                System.out.println("Ingrese al Julio");
                if (Integer.parseInt(myArray[0]) <= 23){
                    JOptionPane.showMessageDialog(null, "Cancer");
                } else {
                    JOptionPane.showMessageDialog(null, "Leo");
                }
                break;
            case 8:
                System.out.println("Ingrese al Agosto");
                if (Integer.parseInt(myArray[0]) <= 23){
                    JOptionPane.showMessageDialog(null, "Leo");
                } else {
                    JOptionPane.showMessageDialog(null, "Virgo");
                }
                break;
            case 9:
                System.out.println("Ingrese al Septiembre");
                if (Integer.parseInt(myArray[0]) <= 23){
                    JOptionPane.showMessageDialog(null, "Virgo");
                } else {
                    JOptionPane.showMessageDialog(null, "Libra");
                }
                break;
            case 10:
                System.out.println("Ingrese al Octubre");
                if (Integer.parseInt(myArray[0]) <= 23){
                    JOptionPane.showMessageDialog(null, "Libra");
                } else {
                    JOptionPane.showMessageDialog(null, "Escorpio");
                }
                break;
            case 11:
                System.out.println("Ingrese al Noviembre");
                if (Integer.parseInt(myArray[0]) <= 22){
                    JOptionPane.showMessageDialog(null, "Escorpio");
                } else {
                    JOptionPane.showMessageDialog(null, "Sagitario");
                }
                break;
            case 12:
                System.out.println("Ingrese al Diciembre");
                if (Integer.parseInt(myArray[0]) <= 22){
                    JOptionPane.showMessageDialog(null, "Sagitario");
                } else {
                    JOptionPane.showMessageDialog(null, "Capricornio");
                }
                break;
            default:
                System.out.println("Ese mes no cuenta");
                break;
        }
    }
}
