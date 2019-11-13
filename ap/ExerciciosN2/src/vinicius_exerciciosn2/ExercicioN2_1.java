/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 01/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 1. Faça um programa que leia dois números inteiros, o primeiro é o valor inicial de um
 * contador, e o segundo é o valor final do contador (testar se o valor inicial fornecido
 * é inferior ao valor final). Usando o comando While, escreva na tela uma contagem que
 * comece no primeiro número lido, escreva os números seguintes colocando sempre apenas um
 * número em cada nova linha da tela, e terminando a contagem quando chegar ao valor final
 * indicado.
 */
public class ExercicioN2_1 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int cont_inicial, cont_final;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);

        // Entrada
        System.out.println();

        System.out.print("Número inicial: ");
        cont_inicial = cont_final = sc.nextInt();

        while (cont_inicial >= cont_final) {
            System.out.print("Número final  : ");
            cont_final = sc.nextInt();

            // Validação do cont_final
            if (cont_inicial >= cont_final) {
                System.out.println("O número INICIAL precisa ser MENOR que o número FINAL.");
            }
        }

        // Processamento
        // Saída
        while (cont_inicial <= cont_final) {
            System.out.println(cont_inicial);
            cont_inicial++;
        }
    }
}
