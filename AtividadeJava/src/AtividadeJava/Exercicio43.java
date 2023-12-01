package Logica_programacao;
import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        
        int primeiro = 0, segundo = 1, proximo;

        
        System.out.println("Sequência de Fibonacci até " + numero + ":");

        while (primeiro <= numero) {
            System.out.print(primeiro + " ");

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
