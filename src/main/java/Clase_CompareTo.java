import java.util.Scanner;

public class Clase_CompareTo {
    public static void main(String[] args) {

        int contador = 0;

        String cadena1, cadena2;

        Scanner entrada = new Scanner(System.in);

        while(contador < 5)
        {
            System.out.println("ingrese la primera palabra");
            cadena1 = entrada.next();
            System.out.println("ingrese la segunda palabra");
            cadena2 = entrada.next();

            System.out.println(cadena1.compareTo(cadena2));
            contador++;

        }
    }
}
