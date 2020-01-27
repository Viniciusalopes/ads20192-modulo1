/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 21/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 32. Leia a média de um aluno em certa disciplina e mostre o conceito obtido
 * nessa disciplina. A tabela de conceitos é dada a seguir:
 */
// NOTA         CONCEITO
//  0,0 –  4,9      D
//  5,0 –  6,9      C 
//  7,0 –  8,9      B 
//  9,0 – 10,0      A
//
public class Exercicio32 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double media;
        char conceito = 'A';

        // Entrada
        System.out.println();
        System.out.print("Digite a média do aluno na disciplina: ");
        media = sc.nextDouble();

        // Processamento
        if (media <= 4.9) {
            conceito = 'D';
        } else if (media <= 6.9) {
            conceito = 'C';
        } else if (media <= 8.9) {
            conceito = 'B';
        }

        // Saída
        System.out.println();
        System.out.printf("Conceito do aluno: %c.\n", conceito);
    }
}
