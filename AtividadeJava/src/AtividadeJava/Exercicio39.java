package Exercicios110;
import java.util.Scanner;

public class Exercicios39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contar = 0;
        int soma = 0;

        while (contar < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            soma += numero;
            contar++;
        }

        double media = (double) soma / 5;
        System.out.println("A média dos números é: " + media);
    }

}
