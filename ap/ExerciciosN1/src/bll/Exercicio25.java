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
 * 25. Crie um programa que leia um valor inteiro e diga se ele é positivo,
 * negativo ou nulo.
 */
public class Exercicio25 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero;
        String texto_saida = "nulo";

        // Entrada
        System.out.println();
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        // Processamento
        if (numero < 0) {
            texto_saida = "negativo";
        } else if (numero > 0) {
            texto_saida = "positivo";
        }

        // Saída
        System.out.println();
        System.out.printf("O número '%d' é %s.\n", numero, texto_saida);
    }
}
