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
 * 24. Escreva um programa que leia um valor inteiro e diga se o número
 * informado é par ou ímpar.
 */
public class Exercicio24 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero;
        String texto = "par";

        // Entrada
        System.out.println();
        System.out.print("Informe um número inteiro: ");
        numero = sc.nextInt();

        // Processamento
        if (numero % 2 > 0) {
            texto = "ímpar";
        }

        // Saída
        System.out.println();
        System.out.printf("O número %d é %s.\n", numero, texto);
    }
}
