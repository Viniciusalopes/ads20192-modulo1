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
 * 6. Para o cálculo de vários tributos, a base de cálculo é o salário mínimo.
 * Faça um programa que leia o valor do salário mínimo e o valor do salário de
 * uma pessoa. Calcule e imprima quantos salários mínimos a pessoa ganha.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double salario, salario_minimo, qtd_salarios;

        // Entrada
        System.out.println();
        System.out.print("Digite o valor do SALÁRIO MÍNIMO: ");
        salario_minimo = sc.nextDouble();

        System.out.print("Digite o valor do seu SALÁRIO...: ");
        salario = sc.nextDouble();

        // Processamento
        qtd_salarios = salario / salario_minimo;

        // Saída
        System.out.println();
        System.out.printf("Você recebe %.2f salários mínimos.\n", qtd_salarios);
    }
}
