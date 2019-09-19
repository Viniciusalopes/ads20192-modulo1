/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 18/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 7. Uma loja resolveu realizar uma promoção de seus produtos oferecendo um
 * desconto variável em % informado pelo vendedor. Escreva um programa que leia
 * o valor original do produto e o valor do desconto oferecido pelo vendedor e
 * imprima o novo valor do produto.
 */
public class Exercicio7 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double valor_original, desconto, novo_valor;

        // Entrada
        System.out.print("Valor ORIGINAL do produto: ");
        valor_original = sc.nextDouble();

        System.out.print("Desconto do vendedor(%)  : ");
        desconto = sc.nextDouble();

        // Processamento
        novo_valor = valor_original * (1 - desconto / 100);

        // Saida
        System.out.printf("Novo valor do produto   : %.2f\n", novo_valor);
    }
}
