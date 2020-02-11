/*
 * Licença    : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em  : 11/09/2019
 * Projeto    : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade : 6. Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima
                (aproximadamente) quantos dias de vida ele possui. Considere que o ano tem 365 dias.
 */
package aula_ads1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        rebenta();
    }

    public static void rebenta() {
        // Variáveis	
        int idade, dias;
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual é a sua idade? ");
        idade = sc.nextInt();

        // Processamento
        dias = idade * 365;

        // Saída
        System.out.printf("%s, você tem aproximadamente %d dias.\n", nome, dias);
    }
}
