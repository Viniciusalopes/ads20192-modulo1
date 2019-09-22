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
 * 37. Construa um programa que receba a idade de uma pessoa e classifique-a
 * seguindo o critério apresentado a seguir. Considere a idade é um valor
 * inteiro e que será informada de forma válida.
 */
//  IDADE               CLASSIFICAÇÃO
//   0 a  2 anos        Recém-nascido
//   3 a 11 anos           Criança
//  12 a 19 anos         Adolescente
//  20 a 55 anos           Adulto
//  Acima de 55 anos       Idoso
public class Exercicio37 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int idade;
        String classificacao = "Idoso";

        // Entrada
        System.out.println();
        System.out.print("Digite a idade da pessoa: ");
        idade = sc.nextInt();

        // Processamento
        if (idade >= 0 && idade <= 2) {
            classificacao = "Recém-nascido";
        } else if (idade >= 3 && idade <= 11) {
            classificacao = "Criança";
        } else if (idade >= 12 && idade <= 19) {
            classificacao = "Adolescente";
        } else if (idade >= 20 && idade <= 55) {
            classificacao = "Adulto";
        }

        // Saída
        System.out.println();
        System.out.printf("Classificação: %s.\n", classificacao);
    }

}
