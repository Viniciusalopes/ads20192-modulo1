/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;
import static exerciciosn2.ExercicioN2_47.ler_vetor;
import static exerciciosn2.ExercicioN2_47.imprime_vetor;

/**
 * 50. Faça um programa que leia um vetor com 10 elementos inteiros e um segundo vetor com
 * 5 números inteiros. Calcule e mostre dois vetores resultantes. O primeiro vetor
 * resultante será composto pelos números pares gerados pelo elemento do primeiro vetor
 * somado a todos elementos do segundo vetor. O segundo vetor resultante será composto
 * pelos números ímpares gerados pelo elemento do primeiro vetor somado a todos os
 * elementos do segundo vetor.
 */
/*  Primeiro vetor = [ 4 7 5 8 2 15 9 6 10 11] 
    Segundo vetor = [ 3 4 5 8 2 ]
    Primeiro vetor resultante = [26 30 . . . ], sendo 26 = 4+3+4+5+8+2, 30 = 8+3+4+5+8+2, . . .
    Segundo vetor resultante  = [29 27 . . . ], sendo 29 = 7+3+4+5+8+2, 27 = 5+3+4+5+8+2, . . .
 */
public class ExercicioN2_50 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int vetor1[], vetor2[], resultante1[], resultante2[];

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        vetor1 = new int[10];
        vetor2 = new int[5];

        //Entrada
        vetor1 = ler_vetor("Primeiro vetor[%d]: ", vetor1.length);
        System.out.println();
        vetor2 = ler_vetor("Segundo vetor[%d]: ", vetor2.length);
        System.out.println();

        // Processamento
        resultante1 = get_resultante(true, vetor1, vetor2);
        resultante2 = get_resultante(false, vetor1, vetor2);

        // Saída
        imprime_vetor("Primeiro vetor = ", vetor1);
        imprime_vetor("Segundo vetor  = ", vetor2);
        imprime_vetor("Primeiro vetor resultante = ", resultante1);
        imprime_vetor("Segundo vetor resultante  = ", resultante2);
        System.out.println();
    }

    /**
     * Retorna um vetor de números inteiros pares ou ímpares, resultantes da soma de dois
     * vetores.
     *
     * @param pares true = pares, false = impares
     * @param vetor1 Vetor de inteiros, com elementos a serem somados ao segundo vetor
     * @param vetor2 Vetor de inteiros a serem somados a cada elemento do primeiro vetor
     * @return Vetor resultante de números pares ou ímpares
     */
    public static int[] get_resultante(boolean pares, int[] vetor1, int[] vetor2) {
        int vetor[], ret[], tamanho, ir; // ir = indice ret
        vetor = new int[vetor1.length];
        tamanho = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor1[i]; // Obtém o valor do vetor1
            for (int j = 0; j < vetor2.length; j++) {
                // Efetua a soma
                vetor[i] += vetor2[j];
            }

            // Testa par ou impar e dimensiona o vetor de retorno 'ret'
            if (vetor[i] % 2 == 0 && pares) {
                tamanho++;
            } else if (vetor[i] % 2 != 0 && !pares) {
                tamanho++;
            }
        }

        ret = new int[tamanho];
        ir = 0;

        for (int i = 0; i < vetor.length; i++) {
            // Testa par ou impar e salva o valor no vetor de retorno 'ret'
            if (vetor[i] % 2 == 0 && pares) {
                ret[ir] = vetor[i];
                // Incrementa posição do vetor de retorno
                ir++;
            } else if (vetor[i] % 2 != 0 && !pares) {
                ret[ir] = vetor[i];
                // Incrementa posição do vetor de retorno
                ir++;
            }
        }
        return ret;
    }
}
