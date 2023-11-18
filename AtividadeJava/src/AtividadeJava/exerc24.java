package exerc21ao25;

import  java.util.Scanner;

public class exerc24 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Informe o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.print("Informe o terceiro número inteiro: ");
            int numero3 = scanner.nextInt();

            exibirEmOrdemCrescente(numero1, numero2, numero3);

            scanner.close();
        }

        private static void exibirEmOrdemCrescente(int a, int b, int c) {
            // Ordenação simples usando if-else
            if (a <= b && a <= c) {
                if (b <= c) {
                    System.out.println("Números em ordem crescente: " + a + ", " + b + ", " + c);
                } else {
                    System.out.println("Números em ordem crescente: " + a + ", " + c + ", " + b);
                }
            } else if (b <= a && b <= c) {
                if (a <= c) {
                    System.out.println("Números em ordem crescente: " + b + ", " + a + ", " + c);
                } else {
                    System.out.println("Números em ordem crescente: " + b + ", " + c + ", " + a);
                }
            } else {
                if (a <= b) {
                    System.out.println("Números em ordem crescente: " + c + ", " + a + ", " + b);
                } else {
                    System.out.println("Números em ordem crescente: " + c + ", " + b + ", " + a);
                }
            }
        }
    }
