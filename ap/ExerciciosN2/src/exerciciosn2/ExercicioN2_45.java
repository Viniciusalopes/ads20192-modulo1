/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 45. Escreva um programa que receba quinze números inteiros e armazene em um vetor a
 * raiz quadrada de cada número. Caso o valor digitado seja menor do que zero, o número -1
 * deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
 * armazenados.
 */
public class ExercicioN2_45 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        double vetor[], num;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        vetor = new double[15];

        // Entrada
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %d número: ", i + 1);
            num = sc.nextInt();

            // Processamento
            vetor[i] = (num < 0) ? -1 : Math.sqrt(num);
        }

        // Saída
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("v[%d] %s= %s\n", i, ((i < 10) ? " " : ""), casas_decimais(vetor[i]));
        }
    }

    /**
     *
     * @param numero Número decimal a ser comparado
     * @return String sem casas decimais para inteiros e com 2 casas para decimais
     */
    public static String casas_decimais(double numero) {
        return (numero % 1 == 0) ? String.format("%.0f", numero) : String.format("%.2f", numero);
    }
}
