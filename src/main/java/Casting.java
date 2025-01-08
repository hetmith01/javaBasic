public class Casting {
    public static void main(String[] args) {
        String textoNum = "222";
        int entero = Integer.parseInt(textoNum);
        System.out.println("Numero entero " + entero);

        int entero2 = 303;
        String enteroTexto = String.valueOf(entero2);
        System.out.println("texto entero; " + enteroTexto);

        double numDouble = 40.78;
        int enteroDouble = (int)numDouble;
        System.out.println("Entero double " + enteroDouble);

        int entero3 = 782;
        double doble3 = (double)entero3;
        System.out.println("De entero a double " + doble3);
    }
}
