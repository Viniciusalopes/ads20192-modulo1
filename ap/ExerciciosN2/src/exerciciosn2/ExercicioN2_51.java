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

import static exerciciosn2.ExercicioN2_45.casas_decimais;
import java.util.Scanner;

/**
 * 51. Escreva um programa que leia dois vetores – V1 e V2 – cada um com N(N<=10) valores
 * reais e um terceiro vetor – Op - com N valores do tipo caracter. Seu programa deve
 * gerar um vetor – Resul como sendo o resultado das operações de V1 com V2, onde o código
 * da operação está no vetor Op nas respectivas posições.
 */
/*
    Posicoes:   0   1   2    3   4
        V1 = [  4   7  10   12   3 ]
        V2 = [  8  13  10   18  30 ]
        Op = [  +  -    *    +   * ]
     Resul = [ 12  -6  100  30  90 ]
 */
public class ExercicioN2_51 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int v1[], v2[];
        char op[];
        double resul[];
        String operacoes, opcao, texto_menu;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        v1 = new int[3];
        v2 = new int[v1.length];
        op = new char[v1.length];
        resul = new double[v1.length];

        texto_menu = "\nOpções de operações:\n"
                + " + para adição\n"
                + " - para subtração\n"
                + " * para multiplicação\n"
                + "%s"
                + "Informe a operação para os números %d e %d :";

        // Entrada
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Digite um número inteiro: ");
            v1[i] = sc.nextInt();

            System.out.print("Digite outro número inteiro: ");
            v2[i] = sc.nextInt();

            if (v2[i] == 0) {
                operacoes = "+-*";
            } else {
                operacoes = "+-*/";
            }

            // Menu de operações
            do {
                System.out.printf(texto_menu, ((v2[i] == 0) ? "\n" : " / para divisão\n\n"), v1[i], v2[i]);
                opcao = sc.next();
                if (!operacao_valida(operacoes, opcao.charAt(0))) {
                    System.out.printf("'%s' não é uma opção. Tente outra vez...\n", opcao);
                }
            } while (!operacao_valida(operacoes, opcao.charAt(0)));

            // Processamento
            op[i] = opcao.charAt(0);
            resul[i] = resultado(v1[i], op[i], v2[i]);
            System.out.printf("Resultado da operação: %d %s %d = %s\n\n", v1[i], op[i], v2[i], casas_decimais(resul[i]));
        }

        // Saída
        imprime_vetor_tabulado("  V1  = ", v1);
        imprime_vetor_tabulado("  V2  = ", v2);
        imprime_vetor_tabulado("  op  = ", op);
        imprime_vetor_tabulado("Resul = ", resul, "direta");
        System.out.println();
    }

    /**
     * Verifica se a operação aritmética é valida
     *
     * @param op operações: adição('+'), subtração ('-'), multiplicação('*'), divisão
     * ('/')
     * @return Verdadeiro ou falso
     */
    public static boolean operacao_valida(String opcoes, char op) {
        for (char opcao : opcoes.toCharArray()) {
            if (opcao == op) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna o resultado das 4 operações básicas: (+,-,*,/) [Não valida divisão por 0
     * (zero)]
     *
     * @param valor1 Inteiro para a operação
     * @param operacao adição('+'), subtração ('-'), multiplicação('*'), divisão('/')
     * @param valor2 Inteiro para a operação
     * @return Decimal com o resultado da operação
     */
    public static double resultado(int valor1, char operacao, int valor2) {
        switch (operacao) {
            case '+':
                return (double) valor1 + (double) valor2;
            case '-':
                return (double) valor1 - (double) valor2;
            case '*':
                return (double) valor1 * (double) valor2;
            case '/':
                return (double) valor1 / (double) valor2;
            default:
                return 0.0;
        }
    }

    /**
     * Imprime vetor de inteiros, passado por parâmetro, espaçado por tabulações (\t)
     *
     * @param label Texto antes do vetor
     * @param vetor Vetor com valores a ser impresso
     */
    public static void imprime_vetor_tabulado(String label, int[] vetor) {
        String saida = label + "[\t";

        for (int i = 0; i < vetor.length; i++) {
            saida += vetor[i] + "\t";
        }

        saida += "]";

        System.out.println(saida);
    }

    /**
     * Imprime vetor de decimais, passado por parâmetro, espaçado por tabulações (\t) e
     * omitindo casa decimais para valores inteiros.
     *
     * @param label Texto antes do vetor
     * @param vetor Vetor com valores a ser impresso
     * @param ordem direta ou inversa
     */
    public static void imprime_vetor_tabulado(String label, double[] vetor, String ordem) {
        String saida = label + "[\t";

        if (ordem == "direta") {
            for (int i = 0; i < vetor.length; i++) {
                saida += casas_decimais(vetor[i]) + "\t";
            }
        } else {
            for (int i = vetor.length - 1; i >= 0; i--) {
                saida += casas_decimais(vetor[i]) + "\t";
            }
        }

        saida += "]";

        System.out.println(saida);
    }

    /**
     *
     * @param label Texto antes do vetor
     * @param vetor Vetor com valores a ser impresso
     */
    public static void imprime_vetor_tabulado(String label, char[] vetor) {
        String saida = label + "[\t";

        for (int i = 0; i < vetor.length; i++) {
            saida += Character.toString(vetor[i]) + "\t";
        }
        saida += "]";

        System.out.println(saida);
    }

}
