/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 12. Faça um programa que leia dois números inteiros positivos (n1 e n2). Repita a
 * leitura até que n1 seja menor que n2, quando n2 for maior que n1, imprima os números
 * entre n1 e n2.
 */
public class ExercicioN2_12 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int n1, n2, cont;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        n1 = n2 = 0;

        // Entrada
        System.out.println();
        while (n1 >= n2) {
            while (n1 <= 0) {
                System.out.print("\nDigite um número inteiro positivo: ");
                n1 = sc.nextInt();
                if (n1 == 0) {
                    System.out.println("O número 0 (zero) é neutro.\n");
                } else if (n1 < 0) {
                    System.out.println("O número precisa ser positivo.\n");
                }
            }
            while (n2 <= 0) {
                System.out.printf("Digite um número inteiro positivo, e maior que %d: ", n1);
                n2 = sc.nextInt();
                if (n2 == 0) {
                    System.out.println("O número 0 (zero) é neutro.\n");
                } else if (n2 < 0) {
                    System.out.println("O número precisa ser positivo.\n");
                }

            }
            if (n1 >= n2) {
                System.out.printf("O número precisa ser maior que %d.\n", n1);
                // Reset numeros
                n1 = n2 = 0;
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
