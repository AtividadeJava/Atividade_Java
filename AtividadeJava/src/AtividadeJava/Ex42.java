package Logica_programacao;
import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        
        if (numero <= 1) {
            System.out.println("Por favor, digite um n�mero inteiro maior que 1.");
        } else {
            
            int divisor = 2;
            boolean ehPrimo = true;

            
            while (divisor <= Math.sqrt(numero)) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;  
                }
                divisor++;
            }

            
            if (ehPrimo) {
                System.out.println(numero + " � um n�mero primo.");
            } else {
                System.out.println(numero + " n�o � um n�mero primo.");
            }
        }

        scanner.close();
    }

}
