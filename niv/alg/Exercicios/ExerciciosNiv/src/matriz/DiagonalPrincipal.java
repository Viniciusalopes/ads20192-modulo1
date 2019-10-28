/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 26/10/2019
 * Projeto   : ExerciciosNiv
 * Finalidade: Exercícios de Nivelamento de Algorítimos e Lógica
 * ---------------------------------------------------------------------------------------
 */
package matriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vovox
 */
public class DiagonalPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha = 5, coluna = 5;
        int[][] a = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Digite o valor [" + i + "," + j + "]: ");
                a[i][j] = sorteia(0, 99);
                System.out.println(a[i][j]);
            }
        }
        System.out.println();
        imprime_matriz("Matriz A:", a, "");
        System.out.println(repete("-", 30));
        System.out.println();
        imprime_matriz("Diagonal Principal da Matriz A:", a, "principal");
        System.out.println(repete("-", 30));
        System.out.println();
        imprime_matriz("Diagonal Secundária da Matriz A:", a, "secundaria");
        System.out.println();
    }

    /**
     * Gera um número aleatório
     *
     * @param limiteInferior Limite inferior para o número aleatório
     * @param limiteSuperior Limite superior para o número aleatório
     * @return Inteiro randômico
     */
    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
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
                        System.out.print(pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
                    } else {
                        System.out.print(pad_left("", ' ', 4) + " ");
                    }
                }
                System.out.print("|\n");
            }
        } else {

            for (int i = 0; i < matriz.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < matriz[i].length; j++) {
                    if (diagonal.equals("")) {
                        System.out.print(pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
                    } else if (diagonal.equals("principal")) {
                        if (i == j) {
                            System.out.print(pad_left(Integer.toString(matriz[i][j]), ' ', 4) + " ");
                        } else {
                            System.out.print(pad_left("", ' ', 4) + " ");
                        }
                    }

                }
                System.out.print("|\n");
            }
        }

    }

    /**
     * Formata a string com caracteres à esquerda
     *
     * @param texto String a ser formatada
     * @param caractere char de preenchimento à esquerda
     * @param tamanho Tamanho final da String de retorno
     * @return String
     */
    public static String pad_left(String texto, char caractere, int tamanho) {
        return repete(Character.toString(caractere), tamanho - (texto.length())) + texto;
    }

    /**
     * Repetição de textos
     *
     * @param texto Texto a ser repetido
     * @param vezes Quantidade de repetições
     * @return String texto*vezes
     */
    public static String repete(String texto, int vezes) {
        String ret = "";
        for (int i = 0; i < vezes; i++) {
            ret += texto;
        }
        return ret;
    }
}
