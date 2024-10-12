package Condicionales;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
        //(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
        //15% para jubilados. Imprime el precio final después del descuento

        double precioProducto, total = 0, totalDescuento;
        int descuento;
        String categoria;

        precioProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio de tu producto"));

        categoria = JOptionPane.showInputDialog("Ingresa tu categoria:\nEstudiante\nAdulto\nJubilado").toLowerCase();

        switch (categoria){
            case "estudiante":
                total = precioProducto - precioProducto * 0.10;
                JOptionPane.showMessageDialog(null, "Por ser " + categoria + " su precio se reduce a " + total);
                break;
            case "adulto":
                total = precioProducto - precioProducto * 0.05;
                JOptionPane.showMessageDialog(null, "Por ser " + categoria + " su precio se reduce a " + total);
                break;
            case "jubilado":
                total = precioProducto - precioProducto * 0.15;
                JOptionPane.showMessageDialog(null, "Por ser " + categoria + " su precio se reduce a " + total);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalido");
                break;
        }
    }
}
