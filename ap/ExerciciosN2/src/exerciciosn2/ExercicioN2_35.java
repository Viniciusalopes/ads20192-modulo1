/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/11/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 35. Um certo aço é classificado de acordo com o resultado de três testes, que devem
 * verificar se o mesmo satisfaz às seguintes especificações:
 *
 * - Teste 1 - conteúdo de carbono abaixo de 7%;
 *
 * - Teste 2 - dureza de Rockwell maior que 50;
 *
 * - Teste 3 - resistência à tração maior do que 80.000 psi.
 *
 * Ao aço é atribuído o grau 10, se passa pelos três testes;
 *
 * 9, se passa apenas nos testes 1 e 2;
 *
 * 8, se passa no teste 1;
 *
 * e 7, se não passou nos três testes.
 *
 * Supondo que sejam lidos de uma unidade de entrada: número da amostra, conteúdo de
 * carbono (em %), a dureza de Rockwell e a resistência à tração (em psi)
 *
 * - fazer um programa que dê a classificação de 112 amostras de aço que foram testadas,
 * escrevendo o número da amostra e o grau obtido.
 */
public class ExercicioN2_35 {

    // Declaração de variáveis
    static Scanner sc;
    static int amostras = 10;
    //static int amostras = 112;
    static double dados[][] = new double[amostras][5];
    static boolean carbono_ok, dureza_ok, resistencia_ok;

    /*
    dados[n][0] = número da amostra
    dados[n][1] = conteúdo de carbono
    dados[n][2] = dureza de Rockwelll
    dados[n][3] = resistência à tração (em psi)
    dados[n][4] = grau atribuído
     */
    public static void main(String[] args) {
        inicializa();
        preenche_dados();
        testar_amostras();
        imprime_matriz();
    }

    private static void inicializa() {
        // Inicialização de variáveis
        sc = new Scanner(System.in);

    }

    private static void preenche_dados() {
        for (int i = 0; i < amostras; i++) {
            dados[i][0] = i;
            dados[i][1] = ExercicioN2_60.sorteia_double(0, 100);
            dados[i][2] = ExercicioN2_60.sorteia_double(10, 100);
            dados[i][3] = ExercicioN2_60.sorteia_double(60000, 100000);
        }
    }

    public static void testar_amostras() {

        // Leitura dos dados
        for (int i = 0; i < amostras; i++) {
            carbono_ok = dureza_ok = resistencia_ok = false;

            if (dados[i][1] < 7) {
                carbono_ok = true;
            }
            if (dados[i][2] > 50) {
                dureza_ok = true;
            }
            if (dados[i][3] > 80000) {
                resistencia_ok = true;
            }

            // Atribuição de grau
            /*
        Ao aço é atribuído o grau 10, se passa pelos três testes;
        9, se passa apenas nos testes 1 e 2;
        8, se passa no teste 1;
        e 7, se não passou nos três testes.
             */
            if (carbono_ok && dureza_ok && resistencia_ok) {
                dados[i][4] = 10;
            }
            if (carbono_ok && dureza_ok && !resistencia_ok) {
                dados[i][4] = 9;
            }
            if (carbono_ok && !dureza_ok && !resistencia_ok) {
                dados[i][4] = 8;
            }
            if (!carbono_ok && !dureza_ok && !resistencia_ok) {
                dados[i][4] = 7;

            }
        }
    }

    private static void imprime_matriz() {
        for (int i = 0; i < dados.length; i++) {
            System.out.print("| ");
            System.out.printf("%.0f\t", dados[i][0]);
            System.out.printf("%.0f %%\t", dados[i][1]);
            System.out.printf("%.0f\t", dados[i][2]);
            System.out.printf("%.0f\t", dados[i][3]);
            System.out.printf("%.0f\t", dados[i][4]);
            System.out.print("|\n");
        }
    }

}
