/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 14/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 51. Escreva um programa que leia dois vetores – V1 e V2 – cada um com N(N<=10) valores
 * reais e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa deve
 * gerar um vetor – Resul como sendo o resultado das operações de V1 com V2, onde o código
 * da operação está no vetor Op nas respectivas posições.
 */
/*
        V1 = [  4   7  10   12   3 ]
        V2 = [  8  13  10   18  30 ]
        Op = [  +  -    *    +   * ]
     Resul = [ 12  -6  100  30  90 ]
 */
public class ExercicioN2_51 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int v1[], v2[], resul[];
        char op[];

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        v1 = v2 = resul = new int[5];
        op = new char[v1.length];

        // Entrada
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Digite um número inteiro: ");
            v1[i] = sc.nextInt();

            System.out.print("Digite outro número inteiro: ");
            v1[i] = sc.nextInt();

            // Menu de operações
            do {
                System.out.printf("Opções de operações:\n"
                        + " + para adição\n"
                        + " - para subtração\n"
                        + " * para multiplicação\b"
                        + " / para divisão\n\n"
                        + "Informe a operação para os números %d e %d :", v1[i], v2[i]);
                op[i] = sc.next().charAt(0);

            } while (!operacao_valida(op[i]));
        }
    }

    /**
     * Verifica se a operação aritmética é valida
     *
     * @param op operações: adição('+'), subtração ('-'), multiplicação('*'), divisão
     * ('/')
     * @return Verdadeiro ou falso
     */
    public static boolean operacao_valida(char op) {
        if (op != '+' && op != '-' && op != '*' && op != '/') {
            return false;
        }
        return true;
    }
}
