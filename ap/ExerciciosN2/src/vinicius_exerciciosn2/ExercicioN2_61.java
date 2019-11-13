/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 18/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 61. Faça um programa que leia dois vetores de cinco elementos numéricos (int) e crie
 * uma matriz 2x5 resultante da intercalação desses dois vetores conforme demonstrado
 * abaixo.
 *
 * Vetor A [ 1 2 3 4 5]
 *
 * Vetor B [10 9 8 7 6]
 *
 * Matriz Resultante AB (2x5)
 *
 * [ 1 10 2 9 3
 *
 * 8 4 7 5 6 ]
 *
 */
public class ExercicioN2_61 {

    public static void main(String[] args) {
        // Declaração de variaveis
        Scanner sc;
        int a[], b[];
        int ab[][];
        int ia, ib;

        // Inicialização de variaveis
        sc = new Scanner(System.in);
        a = new int[5];
        b = new int[5];
        ab = new int[2][5];
        ia = ib = 0;

        // Entrada
        a = ExercicioN2_47.ler_vetor("Vetor A[%d]: ", a.length);
        b = ExercicioN2_47.ler_vetor("Vetor B[%d]: ", b.length);

        // Processamento
        for (int lin = 0; lin < ab.length; lin++) {
            for (int col = 0; col < ab[0].length; col++) {
                if (lin % 2 == 0) {
                    if (col % 2 == 0) {
                        ab[lin][col] = a[ia];
                        ia++;
                    } else {
                        ab[lin][col] = b[ib];
                        ib++;
                    }
                } else {
                    if (col % 2 != 0) {
                        ab[lin][col] = a[ia];
                        ia++;
                    } else {
                        ab[lin][col] = b[ib];
                        ib++;
                    }
                }
            }
        }

        // Saídas
        System.out.println();
        ExercicioN2_47.imprime_vetor("Vetor A:", a);
        ExercicioN2_47.imprime_vetor("Vetor B:", b);
        System.out.println();
        ExercicioN2_20.repete("-", 30);
        System.out.println();
        ExercicioN2_55.imprime_matriz("Matriz AB", ab);
        System.out.println();
    }
}
