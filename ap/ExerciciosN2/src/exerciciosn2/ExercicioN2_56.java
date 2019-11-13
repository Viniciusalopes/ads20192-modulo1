/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 18/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 56. Escreva um programa que leia uma matriz de inteiros A 3x5. Gere e imprima o vetor
 * SL de tamanho 3, onde cada elemento é a soma dos elementos de uma linha da matriz A.
 *
 */
public class ExercicioN2_56 {

    public static void main(String[] args) {
        // Variáveis
        int matriz[][] = new int[3][5];
        int[] sl = {0, 0, 0};

        // Entrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ExercicioN2_53.sorteia(0, 9);
                // Processamento
                sl[i] += matriz[i][j];
            }
        }
        
        // Saída
        ExercicioN2_55.imprime_matriz("\nMatriz:", matriz);
        ExercicioN2_47.imprime_vetor("\nSL:", sl);
    }
}
