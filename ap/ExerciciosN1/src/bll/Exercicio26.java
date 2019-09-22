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
 * 26. Crie um programa para determinar se um número inteiro A é divisível por
 * outro número B. Os valores devem ser fornecidos pelo usuário.
 */
public class Exercicio26 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int a, b, resto;
        String texto_saida = "é";

        // Entrada
        System.out.println();
        System.out.print("Digite um número inteiro para o valor de A: ");
        a = sc.nextInt();

        System.out.print("Digite um número inteiro para o valor de B: ");
        b = sc.nextInt();

        // Processamento
        if (a % b > 0) {
            texto_saida = "não é";
        }

        // Saída
        System.out.println();
        System.out.printf("O número '%d' %s divisível por %d.\n", a, texto_saida, b);
    }
}
