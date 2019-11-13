/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 47. Faça um programa que leia dois vetores de 10 elementos inteiros cada um e mostre o
 * vetor resultante da intercalação desses dois vetores.
 */
/* Exemplo: 
  Vetor 1 [0 5 4 2 1 5 3 2 5 9]
  Vetor 2 [1 5 4 2 0 5 3 2 5 9]
  Vetor resultante da intercalação [0 1 5 5 4 4 2 2 1 0 5 5 3 3 2 2 5 5 9 9]
 */
public class ExercicioN2_47 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int vetor1[], vetor2[], vetor_resultante[];

        // Inicialização de variáveis
        vetor1 = vetor2 = new int[10];
        vetor_resultante = new int[vetor1.length + vetor2.length];

        // Entrada
        vetor1 = ler_vetor("Valor para vetor1[%d]: ", vetor1.length);
        System.out.println();
        vetor2 = ler_vetor("Valor para vetor2[%d]: ", vetor2.length);
        System.out.println();

        // Processamento
        vetor_resultante = intercala_vetores(vetor1, vetor2);

        // Saída
        imprime_vetor("Vetor 1: ", vetor1);
        imprime_vetor("Vetor 2: ", vetor2);
        imprime_vetor("Vetor Resultante: ", vetor_resultante);

        System.out.println();
    }

    /**
     * Lê valores inteiros e retorna um vetor preenchido
     *
     * @param label Texto que será exibido para a digitação
     * @param tamanho Tamanho do vetor a ser lido
     * @return Vetor de INTEIROS, preenchido
     */
    public static int[] ler_vetor(String label, int tamanho) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf(label, i);
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    /**
     * @param vet1 Primeiro vetor com valores
     * @param vet2 Segundo vetor com valores
     * @return vet1 e vet2 intercalados
     */
    public static int[] intercala_vetores(int[] vet1, int[] vet2) {
        int vetor[] = new int[vet1.length + vet2.length];
        int i1, i2;
        i1 = i2 = 0;

        if (vet1.length == vet2.length) {
            for (int i = 0; i < vetor.length; i++) {
                if (i % 2 == 0) {
                    vetor[i] = vet1[i1];
                    i1++;
                } else {
                    vetor[i] = vet2[i2];
                    i2++;
                }
            }
        }
        return vetor;
    }

    /**
     * Imprime vetor de inteiros, passado por parâmetro.
     *
     * @param label Texto antes do vetor
     * @param vetor Vetor com valores a ser impresso
     */
    public static void imprime_vetor(String label, int[] vetor) {
        String saida = label + "[ ";

        for (int i = 0; i < vetor.length; i++) {
            saida += vetor[i] + " ";
        }

        saida += "]";

        System.out.println(saida);
    }
}
