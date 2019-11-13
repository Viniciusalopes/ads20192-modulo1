/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 12/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 31. Faça um programa que verifique se determinado número X é primo. Obs. Um número é
 * considerado primo se for divisível apenas por 1 e por ele mesmo.
 */
public class ExercicioN2_31 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int n, divisores;
        String saida;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        divisores = 1;

        // Entrada
        System.out.print("Digite um número: ");
        n = sc.nextInt();

        // Processamento
        saida = String.format("O número %d ", n);
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }

        // Verifica se é Primo
        if (divisores == 2) {
            saida += "é";
        } else {
            saida += "NÃO é";
        }

        saida += " um número PRIMO.";
        
        // Saída
        System.out.println(saida);
    }
}
