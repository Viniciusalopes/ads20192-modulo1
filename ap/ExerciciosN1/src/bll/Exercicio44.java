/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 23/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 44. Escreva um algoritmo que leia o código de um determinado produto e mostre
 * a sua classificação de acordo com a tabela apresentada a seguir:
 */
// CÓDIGO           CLASSIFICAÇÃO
//    1             Alimento não-perecível
//    2, 3 ou 4     Alimento perecível
//    5 ou 6        Vestuário
//    7             Higiene pessoal
//    8 até 15      Limpeza e utensílios domésticos
//    qualquer outro código --> Inválido
//
public class Exercicio44 {

    public static void main(String[] args) {
        // loop para testes
        for (int i = 0; i < 30; i++) {
            vai();
        }
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        String codigo, classificacao;

        // Entrada
        System.out.println();
        System.out.print("Digite o código do produto: ");
        codigo = sc.nextLine();

        // Processamento
        if (codigo.equals("1")) {
            classificacao = "Alimento não-perecível";
        } else if (codigo.equals("2") || codigo.equals("3") || codigo.equals("4")) {
            classificacao = "Alimento perecível";
        } else if (codigo.equals("5") || codigo.equals("6")) {
            classificacao = "Vestuário";
        } else if (codigo.equals("7")) {
            classificacao = "Higiene Pessoal";
        } else if (codigo.equals("8") || codigo.equals("9") || codigo.equals("10")
                || codigo.equals("11") || codigo.equals("12") || codigo.equals("13")
                || codigo.equals("14") || codigo.equals("15")) {
            classificacao = "Limpeza e utensílios domésticos";
        } else {
            classificacao = "invalido";
        }

        // Saída
        if (classificacao.equals("invalido")) {
            System.out.println("Código inválido!");
        } else {
            System.out.printf("Classificação . . . . . . : %s\n", classificacao);
        }
    }
}
