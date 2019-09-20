/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 20/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 12. Escreva um programa que receba quatro números e imprima a média
 * ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
 *
 * // FONTE DE PESQUISA:
 * https://brasilescola.uol.com.br/o-que-e/matematica/o-que-e-media-ponderada.htm
 *
 */
public class Exercicio12 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, mp;

        // Entrada
        System.out.println();
        System.out.print("Digite o 1º número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o 2º número: ");
        n2 = sc.nextDouble();

        System.out.print("Digite o 3º número: ");
        n3 = sc.nextDouble();

        System.out.print("Digite o 4º número: ");
        n4 = sc.nextDouble();

        // Processamento
        mp = ((n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4)) / 10; // soma dos pesos = 1 + 2 + 3 + 4 = 10

        // Saída
        System.out.println();
        System.out.printf("Média ponderada..: %.2f\n", mp);
    }
}
