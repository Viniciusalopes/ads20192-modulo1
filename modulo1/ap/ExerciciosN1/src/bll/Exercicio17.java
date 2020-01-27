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
 * 17. Faça um programa que leia via teclado um valor, em dólares, e a cotação
 * do dólar; converta e imprima o mesmo num valor em reais.
 */
public class Exercicio17 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double dolares, dolar, reais;

        // Entrada
        System.out.println();
        System.out.print("Digite o valor em dólares ($): ");
        dolares = sc.nextDouble();

        System.out.print("Digite o valor de $1,00 em reais (R$): ");
        dolar = sc.nextDouble();

        // Processamento
        reais = dolares * dolar;

        // Saída
        System.out.println();
        System.out.printf("$ %.2f equivalem a R$ %.2f.\n", dolares, reais);
    }
}
