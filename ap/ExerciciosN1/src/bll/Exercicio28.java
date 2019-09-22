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
 * 28. Receba dois números reais do usuário em seguida exiba o resultado de uma
 * operação escolhida também pelo usuário: (1) Soma (2) Subtração, (3)
 * Multiplicação e (4) Divisão. Obs.: No caso da divisão, se o segundo operando
 * for zero exiba “divisão impossível”.
 */
public class Exercicio28 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String opcao;
        double numero1, numero2;

        // Entrada da operação
        System.out.println();
        System.out.print("Operações Matemáticas\n"
                + "---------------------\n"
                + " Opções:\n"
                + " (1) Soma\n"
                + " (2) Subtração\n"
                + " (3) Multiplicação\n"
                + " (4) Divisão\n");
        System.out.print("Digite uma opção e tecle [ENTER]: ");
        opcao = sc.nextLine();

        if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4")) {
            // Saída de opção inválida
            System.out.printf("'%s' não é uma opção!\n", opcao);
        } else {

            // Entrada de números
            System.out.print("Digite um número real: ");
            numero1 = sc.nextDouble();

            System.out.print("Digite um outro número real: ");
            numero2 = sc.nextDouble();

            // Processamento e Saída
            System.out.println();
            switch (opcao) {
                case "1":
                    System.out.printf("SOMA: (%.2f) + (%.2f) = %.2f\n",
                            numero1, numero2, (numero1 + numero2));
                    break;

                case "2":
                    System.out.printf("SUBTRAÇÃO: (%.2f) - (%.2f) = %.2f\n",
                            numero1, numero2, (numero1 - numero2));
                    break;

                case "3":
                    System.out.printf("MULTIPLICAÇÃO: (%.2f) * (%.2f) = %.2f\n",
                            numero1, numero2, (numero1 * numero2));
                    break;

                case "4":
                    if (numero2 == 0) {
                        System.out.printf("Divisão impossível: (%.2f) / (%.2f)\n", numero1, numero2);
                        break;
                    }
                    System.out.printf("DIVISÃO: (%.2f) / (%.2f) = %.2f\n",
                            numero1, numero2, (numero1 / numero2));
                    break;
            }
        }
    }
}
