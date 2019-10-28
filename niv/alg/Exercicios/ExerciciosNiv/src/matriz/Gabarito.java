/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 26/10/2019
 * Projeto   : ExerciciosNiv
 * Finalidade: Exercícios de Nivelamento de Algorítimos e Lógica
 * ---------------------------------------------------------------------------------------
 */
package matriz;

import java.util.Scanner;
import static matriz.DiagonalPrincipal.pad_left;

/**
 *
 * @author vovox
 */
public class Gabarito {

    public static void main(String[] args) {
        // Declaração de variaveis
        Scanner sc;
        int questoes, alunos, matriculas[][], acertos[][];
        String gabarito[][], respostas[][];

        // Inicialização de variaveis
        sc = new Scanner(System.in);

        questoes = 3;
        alunos = 5;

        gabarito = new String[1][questoes];
        matriculas = new int[alunos][1];
        respostas = new String[alunos][questoes];
        acertos = new int[alunos][1];

        // Laço para leitura do gabarito
        System.out.println();
        System.out.println("----Leitura do Gabarito----");
        for (int i = 0; i < questoes; i++) {
            System.out.printf("Questão [%d]: ", i + 1);
            gabarito[0][i] = sc.nextLine();
        }

        System.out.println();
        System.out.println("----Leitura das Respostas----");
        // i controla os alunos
        for (int i = 0; i < alunos; i++) {
            System.out.printf("\nMatricula Aluno [%d]: ", i + 1);
            matriculas[i][0] = sc.nextInt();
            
            // Laço para variar as questões
            for (int j = 0; j < questoes; j++) {
                System.out.printf("Resposta [%d]: ", i + 1);
                respostas[i][j] = sc.nextLine();
            }
        }

        // verifica respostas
        for (int i = 0; i < alunos; i++) {
            for (int j = 0; j < questoes; j++) {
                if (respostas[i][j].equalsIgnoreCase(gabarito[0][j])) {
                    acertos[i][0]++;
                }
            }
        }

        System.out.println();
        System.out.println("----Resultado----");

        System.out.println();
        imprime_matriz("GABARITO:", gabarito, "");

        System.out.println();
        imprime_matriz("RESPOSTAS:", respostas, "");
        
        System.out.println();
        for (int i = 0; i < alunos; i++) {
            System.out.printf("O aluno %d acertou %d questões.\n", matriculas[i][0], acertos[i][0]);
        }
        System.out.println();
    }

    /**
     * Imprime uma matriz de Strings, alinhamento dos elementos até 4 posicoes.
     *
     * @param label Texto antes da impressáo da matriz
     * @param matriz Matriz a ser impressa
     * @param diagonal ""= imprime tudo, "principal" = diagonal principal, "secundaria"=
     * diagonal secundária
     *
     */
    public static void imprime_matriz(String label, String[][] matriz, String diagonal) {

        System.out.println(label);

        if (diagonal.equals("secundaria")) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print("| ");
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j) {
                        System.out.print(pad_left(matriz[i][j], ' ', 4) + " ");
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
                        System.out.print(pad_left(matriz[i][j], ' ', 4) + " ");
                    } else if (diagonal.equals("principal")) {
                        if (i == j) {
                            System.out.print(pad_left(matriz[i][j], ' ', 4) + " ");
                        } else {
                            System.out.print(pad_left("", ' ', 4) + " ");
                        }
                    }

                }
                System.out.print("|\n");
            }
        }
    }
}
