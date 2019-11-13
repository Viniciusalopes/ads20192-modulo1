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
 * 57. Escrever um algoritmo que lê uma matriz M(5,5)e cria 2 vetores SL(5)e SC(5) que
 * contenham, respectivamente, as somas das linhas e das colunas de M. Escrever a matriz e
 * os vetores criados.
 *
 */
public class ExercicioN2_57 {

    public static void main(String[] args) {
        // Variáveis
        int num;
        int matriz[][] = new int[5][5];
        int sl[] = {0, 0, 0, 0, 0};
        int sc[] = {0, 0, 0, 0, 0};

        // Entrada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                num = matriz[i][j] = ExercicioN2_53.sorteia(0, 9);
                // Processamento
                sl[i] += matriz[i][j];
                sc[j] += matriz[i][j];
            }
        }
        
        // Saída
        ExercicioN2_55.imprime_matriz("\nMatriz:", matriz);
        ExercicioN2_47.imprime_vetor("\nSL:", sl);
        ExercicioN2_47.imprime_vetor("\nSC:", sc);
    }
}
