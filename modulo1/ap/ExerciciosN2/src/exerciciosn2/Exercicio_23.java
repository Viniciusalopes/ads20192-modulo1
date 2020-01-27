/*
 Faça um programa que imprima os números pares e ímpares de 1 até N, onde N deverá
 ser informado pelo usuário.
 */
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, i;
        System.out.print(" porfavor informe o numero a ser verificado ");
        n = entrada.nextInt();

        for (i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.printf(" Numeros Pares Encontrados %d \n", i);
            }

        }

    }
}
