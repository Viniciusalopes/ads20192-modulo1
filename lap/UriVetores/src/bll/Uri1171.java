/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Uri1171 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int qtd;
        int numeros[];

        // Entrada
        qtd = sc.nextInt();
        numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            numeros[i] = sc.nextInt();
        }

        // Processamento
        // Ordena
        Arrays.sort(numeros);

        for (int i = 0; i < qtd; i++) {
            if (i == 0) {
                System.out.printf("%d aparece %d vez(es)\n", numeros[i], conta(i, numeros));
            } else {
                if (numeros[i] != numeros[i - 1]) {
                    System.out.printf("%d aparece %d vez(es)\n", numeros[i], conta(i, numeros));
                }
            }
        }
    }

    /**
     * Conta as ocorrências de um número no vetor
     *
     * @param pos Posição atual do número no vetor
     * @param vetor Vetor de inteiros
     * @return Quantidade de vezes que o número aparece no vetor
     */
    private static int conta(int pos, int[] vetor) {
        int vezes = 0;
        // Conta as vezes que aparece o número
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[pos] == vetor[i]) {
                vezes++;
            }
        }
        return vezes;
    }
}
