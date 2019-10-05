/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 12. Faça um programa que leia dois números inteiros positivos (n1 e n2). Repita a
 * leitura até que n1 seja menor que n2, quando n2 for maior que n1, imprima os números
 * entre n1 e n2.
 */
public class ExercicioN2_12 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = -2147483648, cont;

        // Entrada
        System.out.println();
        while (n1 <= 0 || n2 <= 0 || n1 >= n2) {
            while (n1 <= 0) {
                System.out.print("Digite um número inteiro positivo: ");
                n1 = sc.nextInt();
            }
            while (n2 <= 0 || n1 >= n2) {
                System.out.printf("Digite um número maior que %d: ", n1);
                n2 = sc.nextInt();
            }
        }

        // Saída
        System.out.println();

        if (n2 - n1 == 1) {
            System.out.printf("Não existe nenhum número inteiro entre %d e %d.", n1, n2);
        } else {
            System.out.printf("Números inteiros entre %d e %d:\n", n1, n2);

            cont = n1 + 1;
            while (cont < n2) {
                System.out.print(cont + " ");
                cont++;
                if (cont % 15 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
