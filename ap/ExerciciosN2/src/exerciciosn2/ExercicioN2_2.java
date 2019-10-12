/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 2. Escreva um programa que receba a idade de várias pessoas (para teste utilize 10
 * pessoas). Calcule e imprima: a quantidade de pessoas com até 18 anos; quantidade de
 * pessoas entre 18 e 65 anos; quantidade de pessoas com mais de 65 anos.
 */
public class ExercicioN2_2 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int quantidade, cont, idade, ate18, de18a65, maisDe65;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        quantidade = 10;
        cont = 1;
        ate18 = de18a65 = maisDe65 = 0;

        // Entrada
        System.out.println();
        while (cont <= quantidade) {
            idade = 0;
            while (idade <= 0) {
                System.out.printf("Informe a idade da %dª pessoa: ", cont);
                idade = sc.nextInt();

                // Validação da idade
                if (idade <= 0) {
                    System.out.println("Idade inválida! Tente outra vez...");
                }
            }

            // Processamento
            if (idade <= 18) {
                ate18++;
            } else if (idade > 18 && idade < 65) {
                de18a65++;
            } else if (idade > 65) {
                maisDe65++;
            }

            cont++; // Incremento
        }

        // Saída
        System.out.println();
        System.out.printf("Pessoas com até 18 anos . . . . . . : %d\n", ate18);
        System.out.printf("Pessoas com idade entre 18 a 65 anos: %d\n", de18a65);
        System.out.printf("Pessoas com mais de 65 anos . . . . : %d\n", maisDe65);
    }
}
