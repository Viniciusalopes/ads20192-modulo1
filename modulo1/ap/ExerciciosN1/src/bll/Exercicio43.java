/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 23/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 43. Faça um algoritmo que receba o salário e um código correspondente ao
 * cargo de um funcionário e imprima seu cargo, o salário, o percentual de
 * aumento ao qual este funcionário tem direito segundo a tabela a seguir e o
 * valor do aumento baseado no salário:
 */
// CÓDIGO   CARGO           PERCENTUAL %
//   1      Escriturário        50
//   2      Secretário          35
//   3      Caixa               20
//   4      Gerente             10
//   5      Diretor              0
//
public class Exercicio43 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        InputMismatchException erro = new InputMismatchException("Valor inválido para o código do cargo!");
        int opcao;
        double salario, percentual;
        String cargo, texto_saida;

        cargo = "";
        percentual = 0.0;
        try {
            // Entrada
            System.out.println();
            System.out.print("CÓDIGO\tCARGO\n"
                    + "-----------------------\n"
                    + "   1\tEscriturário\n"
                    + "   2\tSecretário\n"
                    + "   3\tCaixa\n"
                    + "   4\tGerente\n"
                    + "   5\tDiretor\n\n"
                    + "Digite o código do cargo . . . .: ");
            opcao = sc.nextInt();

            if (opcao < 1 || opcao > 5) {
                throw new InputMismatchException("'" + opcao + "' não é uma opção.");
            }
            erro = new InputMismatchException("Valor inválido para o salário.");
            System.out.print("Informe o salário do funcionário: ");
            salario = sc.nextDouble();

            if (salario < 0.0) {
                throw new InputMismatchException();
            }

            // Processamento
            switch (opcao) {
                case 1:
                    cargo = "Escriturário";
                    percentual = 0.5;
                    break;
                case 2:
                    cargo = "Secretário";
                    percentual = 0.35;
                    break;
                case 3:
                    cargo = "Caixa";
                    percentual = 0.2;
                    break;
                case 4:
                    cargo = "Gerente";
                    percentual = 0.1;
                    break;
                case 5:
                    cargo = "Diretor";
                    percentual = 0.0;
                    break;
                default:
                    break;

            }

            texto_saida = "Cargo . . . . . . .: " + cargo + "\n"
                    + "Salário atual . . .: R$ " + String.format("%.2f", salario) + "\n"
                    + "Aumento (%) . . . .: " + String.format("%.0f", percentual * 100) + "%\n"
                    + "Valor do aumento. .: R$ " + String.format("%.2f", salario * percentual) + "\n"
                    + "Salário com aumento: R$ " + String.format("%.2f", salario + (salario * percentual)) + "\n";

            // Saída
            System.out.println();
            System.out.print(texto_saida);

        } catch (InputMismatchException e) {
            System.out.print((e.getMessage() != null) ? e.getMessage() + "\n" : "\n");
            System.out.print(erro.getMessage() + "\n");
        }
    }
}
