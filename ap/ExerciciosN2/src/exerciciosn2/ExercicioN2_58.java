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
 * 58. Leia uma matriz 8x8 e escreva o maior elemento da diagonal principal e a soma dos
 * elementos da diagonal secundaria.
 */
public class ExercicioN2_58 {

    public static void main(String[] args) {
        // Variáveis
        int[][] matriz = new int[8][8];
        int maior, soma;
        maior = soma = 0;

        // Entrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ExercicioN2_53.sorteia(0, 20);
                // Processamento

                // Maior da diagonal principal
                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                } else {
                    if (i == j) {
                        if (matriz[i][j] > maior) {
                            maior = matriz[i][j];
                        }
                    }
                }
            }
        }

        // Soma da diagonal secundária
        for (int i = matriz.length - 1; i >= 0; i--) { // percorre a linha "DeTrasPáDiante" XD
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        // Saída
        imprime_matriz("\nMatriz:", matriz, "");

        imprime_matriz("\nDiagonal Principal:", matriz, "principal");
        System.out.printf("\nMaior elemento da diagonal principal . . : %d\n", maior);

        imprime_matriz("\nDiagonal Secundária:", matriz, "secundaria");
        System.out.printf("\nSoma dos elementos da diagonal secundária: %d\n", soma);
    }

    /**
     * Imprime uma matriz, alinhamento dos elementos até 9999.
     *
     * @param label Texto antes da impressáo da matriz
     * @param matriz Matriz a ser impressa
     * @param diagonal ""= imprime tudo, "principal" = diagonal principal, "secundaria"=
     * diagonal secundária
     *
     */
    public static void imprime_matriz(String label, int[][] matriz, String diagonal) {

        System.out.println(label);

        if (diagonal.equals("secundaria")) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print("| ");
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j) {
                        System.out.print(StringUtils.pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
                    } else {
                        System.out.print(StringUtils.pad_left("", ' ', 4) + " ");
                    }
                }
                System.out.print("|\n");
            }
        } else {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matriz[i].length; j++) {
                    if (diagonal.equals("")) {
                        System.out.print(StringUtils.pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
                    } else if (diagonal.equals("principal")) {
                        if (i == j) {
                            System.out.print(StringUtils.pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
                        } else {
                            System.out.print(StringUtils.pad_left("", ' ', 4) + " ");
                        }
                    }
                }
                System.out.print("|\n");
            }
        }
    }
}
