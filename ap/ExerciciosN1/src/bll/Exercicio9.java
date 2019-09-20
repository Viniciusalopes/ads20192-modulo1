/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 19/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 9. Uma loja resolveu realizar uma promoção de seus produtos oferecendo um
 * desconto variável informado pelo vendedor. Escreva um programa que leia o
 * valor original do produto e o valor do desconto oferecido pelo vendedor e
 * imprima o novo valor do produto.
 */
public class Exercicio9 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double valor, desconto, novo_valor;

        // Entrada
        System.out.println();
        System.out.print("Valor do produto.: ");
        valor = sc.nextDouble();

        System.out.print("Valor do desconto: ");
        desconto = sc.nextDouble();

        // Processamento
        novo_valor = valor - desconto;

        // Saída
        System.out.println();
        System.out.printf("Novo valor.......: %.2f\n", novo_valor);

    }
}
