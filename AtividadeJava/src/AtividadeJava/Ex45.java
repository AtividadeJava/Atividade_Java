package Logica_programacao;
import java.util.Scanner;

public class Ex45 {

    public static void main(String[] args) {
        int limite = 20;
        int contador = 0;
        int primeiro = 0, segundo = 1;

        System.out.println("Os primeiros 20 n�meros da sequ�ncia de Fibonacci:");

        while (contador < limite) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            contador++;
        }
    }
}
