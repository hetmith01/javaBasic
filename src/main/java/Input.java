import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String nombre;
        int edad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre...");
        nombre = entrada.next();
        System.out.println("Escribe tu edad");
        edad = entrada.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
