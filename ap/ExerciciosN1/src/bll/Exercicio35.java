/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 35. Crie um algoritmo que exiba um cardápio com as opções: 1: Pizza, 2:
 * Picanha e 3: Peixe Frito. Ao selecionar uma das opções:1, 2 e 3 deverá exibir
 * a mensagem: “Opção (número) : (nome do prato), pedido realizado com sucesso”.
 */
public class Exercicio35 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String entrada, prato, texto_saida;
        char opcao;

        // Entrada
        System.out.println();
        System.out.print(" C A R D Á P I O\n"
                + "-----------------\n"
                + " 1: Pizza\n"
                + " 2: Picanha\n"
                + " 3: Peixe Frito\n"
                + "\nDigite sua opção: ");
        entrada = sc.next();

        // Processamento
        texto_saida = "'" + entrada + "' não é uma opção";

        if (entrada.length() == 1) {
            opcao = entrada.charAt(0);
            switch (opcao) {
                case '1':
                    prato = "Pizza";
                    break;
                case '2':
                    prato = "Picanha";
                    break;
                case '3':
                    prato = "Peixe Frito";
                    break;
                default:
                    prato = "";
                    break;
            }
            if (!prato.equals("")) {
                texto_saida = "Opção (" + opcao + ") : (" + prato + "), pedido realizado com sucesso";
            }
        }

        // Saída
        System.out.println();
        System.out.print(texto_saida + ".\n");

    }
}
