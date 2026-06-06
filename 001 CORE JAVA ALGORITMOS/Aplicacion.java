import clases.Algoritmos;

public class Aplicacion {

    public static void main(String[] args) {
        boolean resultadoPar = Algoritmos.esPar(4);
        System.out.println(resultadoPar);

        boolean resultadoImpar = Algoritmos.esPar(7);
        System.out.println(resultadoImpar);

        boolean resultadoPrimo = Algoritmos.esPrimo(7);
        System.out.println(resultadoPrimo);

        boolean resultadoNoPrimo = Algoritmos.esPrimo(4);
        System.out.println(resultadoNoPrimo);

        String textoInvertido = Algoritmos.stringEnReversa("hola");
        System.out.println(textoInvertido);

        boolean esPalin1 = Algoritmos.esPalindromo("radar");
        System.out.println(esPalin1);

        boolean esPalin2 = Algoritmos.esPalindromo("java");
        System.out.println(esPalin2);

        Algoritmos.secuenciaFizzBuzz(15);
    }
}