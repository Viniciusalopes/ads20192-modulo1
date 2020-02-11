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
 * 54. Altere o programa feito para o exercício 44 de modo que este novo programa deve
 * calcular o maior elemento da matriz, calcular também o menor e a média dos valores
 * presentes na matriz. Armazene também as coordenadas (linha e coluna) do maior e menor
 * elemento respectivamente e mostre todas estas informações ao final.
 */
public class ExercicioN2_54 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int matriz[][];
        int maior, menor, lin_maior, lin_menor, col_maior, col_menor, soma;
        double media;

        // Inicialização de variáveis
        matriz = new int[5][5];
        maior = menor = lin_maior = lin_menor = col_maior = col_menor = soma = 0;
        media = 0.0;

        // Entrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ExercicioN2_53.sorteia(10, 99);
            }
        }

        // Processamento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 && j == 0) {
                    maior = menor = matriz[i][j];
                } else {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                        lin_maior = i;
                        col_maior = j;
                    }
                    if (matriz[i][j] < menor) {
                        menor = matriz[i][j];
                        lin_menor = i;
                        col_menor = j;
                    }
                }
                soma += matriz[i][j];
            }
        }

        media = soma / (matriz.length * matriz[0].length);

        // Saída
        System.out.println();
        ExercicioN2_55.imprime_matriz("Matriz: ", matriz);

        System.out.printf("\nMaior número: %d\n"
                + "    Linha [%d], coluna [%d].\n\n",
                maior, lin_maior, col_maior);

        System.out.printf("\nMenor número: %d\n"
                + "    Linha [%d], coluna [%d].\n\n",
                menor, lin_menor, col_menor);

        System.out.printf("Média dos valores da matriz: %.2f\n", media);
    }
}
