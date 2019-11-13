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

/**
 * 59. Faça um algoritmo que leia duas matrizes de tamanho 3 x 3. Em seguida, compare os
 * valores das duas matrizes, e mostre quais números são iguais nas duas matrizes. Isto é,
 * caso o elemento 5 exista em na matriz A e na matriz B, o programa deverá dizer que ele
 * existe em ambas as matrizes informando também as coordenadas do elemento 5 em A e em B.
 */
public class ExercicioN2_59 {

    public static void main(String[] args) {
// Variáveis
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        // Entrada
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = ExercicioN2_53.sorteia(0, 20);
                matrizB[i][j] = ExercicioN2_53.sorteia(0, 20);
            }
        }

        // Saída matrizes
        ExercicioN2_58.imprime_matriz("\nMatriz A:", matrizA, "");
        ExercicioN2_58.imprime_matriz("\nMatriz B:", matrizB, "");
        
        // Processamento
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    for (int l = 0; l < matrizB[k].length; l++) {
                        if (matrizA[i][j] == matrizB[k][l]) {
                            // Saída elemento encontrado
                            System.out.printf("\nO elemento '%d' existe nas duas matrizes.\n"
                                    + "matrizA[%d][%d] = %d\n"
                                    + "matrizB[%d][%d] = %d\n",
                                    matrizA[i][j], i, j, matrizA[i][j], k, l, matrizB[k][l]
                            );
                        }
                    }
                }
            }
        }
    }
}
