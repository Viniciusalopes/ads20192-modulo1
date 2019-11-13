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
import static vinicius_exerciciosn2.ExercicioN2_47.ler_vetor;
import static vinicius_exerciciosn2.ExercicioN2_47.imprime_vetor;

/**
 * 48. Faça um programa que leia um primeiro vetor com dez números inteiros e um segundo
 * vetor com cinco números inteiros. Mostre uma lista dos números do primeiro vetor com
 * seus respectivos divisores armazenados no segundo vetor, bem como suas posições.
 */
/* Ex.:
Num [ 5 12 4 7 10 3 2 6 23 16 ] 
Divis [ 3 11 5 8 2 ] 
Saída: 
Número 5: 
    Divisível por 5 na posição 2 
Número 12:
    Divisível por 3 na posição 0 
    Divisível por 2 na posição 4 
Número 4: 
    Divisível por 2 na posição 4
 */
public class ExercicioN2_48 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int numeros[], divisores[];
        boolean divisor, nenhum_divisor;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        numeros = new int[10];
        divisores = new int[5];
        nenhum_divisor = true;

        // Entrada
        numeros = ler_vetor("Número inteiro para numeros[%d]: ", numeros.length);
        System.out.println();
        divisores = ler_vetor("Número inteiro para divisores[%d]: ", divisores.length);
        System.out.println();

        // Processamento e Saída
        imprime_vetor("Números   = ", numeros);
        imprime_vetor("Divisores = ", divisores);
        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            // Busca divisores
            divisor = false;
            for (int j = 0; j < divisores.length; j++) {
                if (divisores[j] != 0) {
                    if (numeros[i] % divisores[j] == 0) {
                        // Identificado pelo menos um divisor
                        System.out.printf("Número %d:\n", numeros[i]);
                        divisor = true;
                        nenhum_divisor = false;
                        break;
                    }
                }
            }   // for (int j = 0; j < divisores.length; j++) {

            if (divisor) {
                // Imprime posição dos divisores
                for (int j = 0; j < divisores.length; j++) {
                    if (divisores[j] != 0) {
                        if (numeros[i] % divisores[j] == 0) {
                            System.out.printf("\tDivisível por %d na posição %d\n",
                                    divisores[j], j);

                        }
                    }
                }   // for (int j = 0; j < divisores.length; j++) {
                System.out.println();
            }   // if(divisor){

        }   // for (int i = 0; i < numeros.length; i++) {

        if (nenhum_divisor) {
            System.out.println("Nenhum número é divisível por nenhum elemento em 'Divisores[]'.\n");
        }

    }   // public static void main(String[] args) {
}
