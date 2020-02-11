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
 * 22. Escreva um programa que receba um número inteiro de 3 dígitos e imprima o
 * dígito das Centenas, o dígito das Dezenas e o dígito das Unidades. Em
 * seguida, o programa deverá inverter o número recebido, isto é, se o usuário
 * digitou 123, seu programa deverá gerar o número 321.
 */
public class Exercicio22 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero, inverso, unidade, dezena, centena, aux;

        // Entrada
        System.out.println();
        System.out.print("Informe um número inteiro de 3 dígitos: ");
        numero = sc.nextInt();

        // Processamento
        unidade = numero % 10;
        dezena = (numero % 100) / 10;
        centena = numero / 100;

        inverso = unidade * 100 + dezena * 10 + centena;

        // Saída
        System.out.println();
        System.out.printf("O número '%d' invertido é '%d'.\n", numero, inverso);
    }
}
