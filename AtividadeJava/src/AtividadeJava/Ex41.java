package Logica_programacao;
import java.util.Scanner;
public class Ex41 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite um n�mero inteiro positivo: ");
	        int numero = scanner.nextInt();

	        
	        if (numero <= 0) {
	            System.out.println("Por favor, digite um n�mero inteiro positivo.");
	        } else {
	            System.out.println("Divisores de " + numero + ":");
	            
	            int divisor = 1;
	            while (divisor <= numero) {
	                if (numero % divisor == 0) {
	                    System.out.println(divisor);
	                }
	                divisor++;
	            }
	        }

	        scanner.close();
	    }

}
