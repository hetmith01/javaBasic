import javax.swing.*;
import java.util.Scanner;

public class Condicional_Switch {
    public static void main(String[] args) {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese día a consultar");
        diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.println("hoy es lunes");
            case 2 -> System.out.println("hoy es martes");
            case 3 -> System.out.println("hoy es miercoles");
            case 4 -> System.out.println("hoy es jueves");
            case 5 -> System.out.println("hoy es viernes");
            default -> System.out.println("valor fuera de rango, sistema cerrado");
        }
        String h = "carla";
        System.out.println(h);
        h = "sabina";
        System.out.println(h);
    }
}
