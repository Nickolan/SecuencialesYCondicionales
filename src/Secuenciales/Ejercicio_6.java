package Secuenciales;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        // Pedimos al usuario cuántas horas puede estudiar por día
        String input = JOptionPane.showInputDialog("¿Cuántas horas al día puedes estudiar?");

        int horasPorDia = Integer.parseInt(input);

        if (horasPorDia <= 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un número positivo.");
            return;
        }

        generarPlanEstudio(horasPorDia);

    }

    public static void generarPlanEstudio(int horasPorDia) {
        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        String[] materias = { "Matemáticas", "Ciencias", "Historia", "Literatura", "Inglés" };

        StringBuilder plan = new StringBuilder("--- Plan de Estudio Semanal ---\n");

        for (int i = 0; i < dias.length; i++) {
            plan.append(dias[i]).append(":\n");

            // Distribuimos las horas disponibles entre las materias de forma equitativa
            for (int j = 0; j < materias.length; j++) {
                int horasPorMateria = horasPorDia / materias.length;
                plan.append("  ").append(materias[j]).append(": ").append(horasPorMateria).append(" horas\n");
            }

            // Si sobran horas, las distribuimos en la primera materia
            int horasRestantes = horasPorDia % materias.length;
            if (horasRestantes > 0) {
                plan.append("  ").append(materias[0]).append(" (extra): ").append(horasRestantes).append(" horas\n");
            }

            plan.append("\n");
        }

        // Mostramos el plan en una ventana emergente
        JOptionPane.showMessageDialog(null, plan.toString());
    }
}
