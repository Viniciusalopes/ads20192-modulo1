/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;
import static vinicius_exerciciosn2.ExercicioN2_20.repete;

/**
 * 23. Faça um programa que imprima os números pares e ímpares de 1 até N, onde N deverá
 * ser informado pelo usuário.
 */
public class ExercicioN2_23 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int numero;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        do {
            System.out.print("Digite um número positivo, diferente de 1: ");
            numero = sc.nextInt();
        } while (numero <= 1);

        // Saída
        System.out.println();
        System.out.printf("Números PARES de 1 até %d:\n", numero);
        imprime_numeros("pares", 1, numero);

        System.out.println("\n" + repete("-", 55));

        System.out.printf("Números ÍMPARES de 1 até %d:\n", numero);
        imprime_numeros("impares", 1, numero);

        System.out.println();
    }

    /**
     * Imprime números pares ou ímpares
     *
     * @param paresOuImpares "pares", "impares"
     * @param de inteiro para início do laço
     * @param ate inteiro para o final do laço
     */
    public static void imprime_numeros(String paresOuImpares, int de, int ate) {
        int cont = 0;
        boolean imprime;

        for (int i = de; i <= ate; i++) {
            imprime = false;
            if (paresOuImpares.equals("pares") && i % 2 == 0) {
                imprime = true;
            } else if (paresOuImpares.equals("impares") && i % 2 != 0) {
                imprime = true;
            }

            if (imprime) {
                cont++;
                System.out.print(i + (((cont + 1) % 20 == 0) ? "\n" : " "));
            }
        }
    }
}
