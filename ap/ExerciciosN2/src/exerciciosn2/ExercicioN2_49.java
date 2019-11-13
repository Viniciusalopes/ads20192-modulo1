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
import static exerciciosn2.ExercicioN2_20.repete;

/**
 * 49. Faça um programa que leia um código numérico inteiros e um vetor de 10 posições de
 * números reais. Se o código for zero, termine o programa. Se for 1, mostre o vetor na
 * ordem direta. Se for 2, mostre o vetor na ordem inversa.
 */
public class ExercicioN2_49 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int opcao;
        double reais[];
        String ordem;

        // Inicialização de variáveis
        reais = new double[10];

        System.out.println();
        reais = ler_vetor("Valor para a posição %d do vetor: ", reais.length);

        do {
            // Entrada
            opcao = menu();

            // Define a ordem de impressão
            ordem = (opcao == 1) ? "direta" : "inversa";

            // Saída
            if (opcao != 0) {
                System.out.println();
                imprime_vetor(" Vetor (Ordem " + ordem.toUpperCase() + ") :\n", reais, ordem);
            }
        } while (opcao != 0);

        // Saída final
        System.out.println("\n" + repete("-", 38) + "\n Fim da execução do programa.\n");
    }

    /**
     * Lê valores decimais e retorna um vetor preenchido
     * @param label Texto que será exibido para a digitação
     * @param tamanho Tamanho do vetor a ser lido
     * @return Vetor de DECIMAIS, preenchido
     */
    public static double[] ler_vetor(String label, int tamanho) {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf(label, i);
            vetor[i] = sc.nextDouble();
        }
        return vetor;
    }

    /**
     * Exibe um menu de opções
     *
     * @return Inteiro da opção selecionada no menu
     */
    public static int menu() {
        Scanner sc;
        sc = new Scanner(System.in);
        int ret = 0;

        System.out.print(repete("-", 38)
                + "\n           MENU de OPÇÕES           \n" + repete("-", 38) + "\n"
                + " 1 - Imprime o vetor na ordem DIRETA\n"
                + " 2 - Imprime o vetor na ordem INVERSA\n\n"
                + " 0 - Encerra o programa.\n\n");

        do {
            System.out.print(repete("-", 38)
                    + "\n Digite uma opção: ");
            ret = sc.nextInt();

            // Validação
            if (ret < 0 || ret > 2) {
                System.out.printf(" Opa! '%d' não é uma opção!\n Tente outra vez...\n", ret);
            }
        } while (ret < 0 || ret > 2);

        return ret;
    }

    /**
     * Imprime vetor de decimais, passado por parâmetro.
     *
     * @param label Texto antes do vetor
     * @param vetor Vetor com valores a ser impresso
     * @param ordem direta ou inversa
     */
    public static void imprime_vetor(String label, double[] vetor, String ordem) {
        String saida = label + "[ ";

        if (ordem == "direta") {
            for (int i = 0; i < vetor.length; i++) {
                saida += String.format("%.2f", vetor[i]) + ", ";
            }
        } else {
            for (int i = vetor.length - 1; i >= 0; i--) {
                saida += String.format("%.2f", vetor[i]) + ", ";
            }
        }

        // para remover a última vírgula
        saida = saida.substring(0, saida.length() - 2) + " ";

        saida += "]";

        System.out.println(saida);
    }
}
