package exercicio;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        // 20. Escreva um programa que leia um
        // número inteiro e exiba se ele é par ou ímpar.

        Scanner escanear = new Scanner(System.in);

        System.out.println("digite um numero inteiro ");

        int numero = escanear.nextInt();

        if(numero==0){
            System.out.println("Números iguais ");
        }else if(numero<=2){
            System.out.println("Numero Par ");
        }else{
            System.out.println("Numero Impar ");
        }

    }
}
