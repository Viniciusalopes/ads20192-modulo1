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

import static exerciciosn2.ExercicioN2_46.pad_left;
import java.util.Scanner;

/**
 * 55. Escreva um programa que leia uma matriz A 4x4 e outra matriz B 4x4. Calcule e
 * imprima a matriz Soma, correspondente a A + B.
 */
public class ExercicioN2_55 {

    public static void main(String[] args) {
        // Declaração de variáveis

        int a[][], b[][], soma[][];

        // Inicialização de variáveis
        a = new int[4][4];
        b = new int[4][4];
        soma = new int[4][4];

        // Entrada
        a = ler_matriz("a[%d,%d]: ", a);
        b = ler_matriz("b[%d,%d]: ", b);
        soma = soma_matrizes(a, b);

        // Saída
        System.out.print("\nMatriz a:\n");
        imprime_matriz(a);
        System.out.print("\nMatriz b:\n");
        imprime_matriz(b);
        System.out.print("\nMatriz soma:\n");
        imprime_matriz(soma);
    }

    /**
     * Faz a leitura dos valores para uma matriz.
     *
     * @param label Texto para solicitar o valor para o usuário
     * @param matriz matriz que receberá os valores
     * @return matriz preenchida
     */
    public static int[][] ler_matriz(String label, int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format(label, i, j));
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    /**
     * Imprime uma matriz, alinhamento dos elementos até 9999.
     *
     * @param matriz Matriz a ser impressa
     */
    public static void imprime_matriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
            }
            System.out.print("|\n");
        }
    }

    /**
     * Soma duas matrizes de mesmas dimensões
     *
     * @param matriz1 Primeira matriz
     * @param matriz2 Segunda matriz
     * @return Matriz com a soma (matriz1 + matriz2)
     */
    public static int[][] soma_matrizes(int[][] matriz1, int[][] matriz2) {
        int[][] ret = new int[matriz1.length][matriz1[0].length];

        if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    ret[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
        }
        return ret;
    }
}
