package Logica_programacao;
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 5;
        int contador = 0;
        int somaIdades = 0;

        while (contador < totalPessoas) {
            
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.next();

            
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

           
            somaIdades += idade;

            // Incrementa o contador
            contador++;
        }

        // Calcula a m�dia das idades
        double mediaIdades = (double) somaIdades / totalPessoas;

        
        System.out.println("A m�dia das idades �: " + mediaIdades);

        scanner.close();
    }

}
