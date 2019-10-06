/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 9.Escreva um programa que mostre na tela os números inteiros de 1 a 300, em ordem
 * crescente. Em seguida imprima os números em ordem decrescente.
 */
public class ExercicioN2_9 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        int n;
        
        // Inicialização de Variáveis
        n = 1;

        // Saída
        System.out.println();
        System.out.print("ORDEM CRESCENTE:\n");
        while (n <= 300) {
            if (n < 10) {
                System.out.print("   " + n);
            } else if (n < 100) {
                System.out.print("  " + n);
            } else {
                System.out.print(" " + n);
            }
            if (n % 15 == 0) {
                System.out.println();
            }
            n++;
        }
        System.out.println();

        // Laço anterior acaba em 301
        n--;

        System.out.print("ORDEM DECRESCENTE:\n");
        while (n > 0) {
            if (n < 10) {
                System.out.print("   " + n);
            } else if (n < 100) {
                System.out.print("  " + n);
            } else {
                System.out.print(" " + n);
            }

            if ((n + 14) % 15 == 0) {
                System.out.println();
            }
            n--;
        }
        System.out.println();
    }
}
