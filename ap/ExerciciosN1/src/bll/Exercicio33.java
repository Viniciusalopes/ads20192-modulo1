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
 * 33. Escreva um programa que leia o nome, o peso de uma pessoa na Terra e o
 * número de um planeta e imprima o valor do peso desta pessoa neste planeta. A
 * relação de planetas é dada a seguir juntamente com o valor das gravidades
 * relativas à Terra:
 */
//          Gravidade
// Opção    Relativa    Planeta
//   1        0,37      Mercúrio
//   2        0,88      Vênus
//   3        0,38      Marte
//   4        2,64      Júpiter
//   5        1,15      Saturno
//   6        1,17      Urano
//
public class Exercicio33 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String opcao, nome, planeta, texto_saida;
        double gr, peso;

        // Entrada
        System.out.println();
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite o seu peso: ");
        peso = sc.nextDouble();

        System.out.println();
        System.out.print("Calcular seu peso em outro planeta\n"
                + "----------------------------------\n"
                + "Opções:\n"
                + " 1 - Mercúrio\n"
                + " 2 - Vênus\n"
                + " 3 - Marte\n"
                + " 4 - Júpiter\n"
                + " 5 - Saturno\n"
                + " 6 - Urano\n\n"
                + "Digite uma opção: ");
        opcao = sc.nextLine();

        // Processamento
        switch (opcao) {
            case "1":
                planeta = "Mercúrio";
                gr = 0.37;
                break;
            case "2":
                planeta = "Vênus";
                gr = 0.88;
                break;
            case "3":
                planeta = "Marte";
                gr = 0.38;
                break;
            case "4":
                planeta = "Júpiter";
                gr = 2.64;
                break;
            case "5":
                planeta = "Saturno";
                gr = 1.15;
                break;
            case "6":
                planeta = "Urano";
                gr = 1.17;
                break;
            default:
                planeta = "invalido";
                gr = 0;
                break;
        }
        if (planeta.equals("invalido")) {
            texto_saida = "'" + opcao + "' não é uma opção";
        } else {
            texto_saida = nome + " em " + planeta + " pesa " + peso * gr + "kg";
        }

        // Saída
        System.out.println();
        System.out.print(texto_saida + ".\n");
    }
}
