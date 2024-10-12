package Secuenciales;

import javax.swing.*;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
        //combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
        //calcule e imprima el costo total del viaje.

        double total, kilometros, consumoXKilometro, precioCombustiblexLitro, litrosConsumidos;

        kilometros = Double.parseDouble(JOptionPane.showInputDialog("Cual es la distancia del viaje en Kilometros")); // 50 km
        consumoXKilometro = Double.parseDouble(JOptionPane.showInputDialog("Cuantos litros de combustible consume el vehiculo por kilometros")); // 5L x km
        precioCombustiblexLitro = Double.parseDouble(JOptionPane.showInputDialog("Cual es el precio del combustible por litro")); //

        total = (kilometros * consumoXKilometro) * precioCombustiblexLitro;

        JOptionPane.showMessageDialog(null, "El precio total del viaje es de: $" + total);


    }
}
