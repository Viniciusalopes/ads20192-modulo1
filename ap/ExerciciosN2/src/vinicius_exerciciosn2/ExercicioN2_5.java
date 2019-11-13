/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 5. Faça um programa que leia um número indeterminado de números, calcule e mostre a
 * soma dos números digitados, a quantidade de números digitados e a média dos números
 * digitados.
 */
public class ExercicioN2_5 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int quantidade;
        double media, soma;
        boolean sair;
        String entrada;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        quantidade = 0;
        soma = 0.0;
        sair = false;

        // Entrada
        System.out.println();
        while (!sair) {
            System.out.printf("Digite 'S' para Sair, ou digite o %dº número: ", quantidade + 1);
            entrada = sc.next();

            if (entrada.equalsIgnoreCase("s")) {
                sair = true;
            } else {
                quantidade++;
                soma += Double.parseDouble(entrada);
            }
        }

        // Processamento
        media = (quantidade > 0) ? soma / quantidade : 0;

        // Saída
        System.out.printf("\nQuantidade de números digitados: %d\n"
                + "Soma dos números digitados . . : %.0f\n"
                + "Média dos números digitados: . : %.2f\n",
                quantidade,
                soma,
                media
        );
    }
}
