import java.util.Scanner;

public class Scanner_Var {
    public static void main(String[] args) {
        String nombre;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingressa tu nombre...");
        nombre = entrada.next();

        //var de clara variables de cualquier tipo, es importante que estas se inicialisen
        var numero = entrada.next();

        System.out.println("el nombre es "+ nombre);
        System.out.println("el numero es " + numero);
        var intergers = numero + 5;
        System.out.println(intergers);
    }
}
