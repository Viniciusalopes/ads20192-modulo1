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

/**
 * 27. Escreva um programa que receba dois números x e y e calcule x^y . Obs. Não utilize
 * nenhuma biblioteca matemática, apenas a estrutura de repetição.
 */
public class ExercicioN2_27 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int x, y, resultado;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        System.out.println();
        System.out.print("Entre com o valor de X para a base: ");
        x = sc.nextInt();

        System.out.print("Entre com o valor de Y para o exponente: ");
        y = sc.nextInt();

        // Processamento
        resultado = x;
        for (int i = 1; i < y; i++) {
            resultado *= x;
        }

        // Saída
        System.out.println();
        System.out.printf("%d ^%d = %d\n", x, y, resultado);
    }
}
