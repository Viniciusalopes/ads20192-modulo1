/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 7. Uma empresa de pesquisa resolveu entrevistar os torcedores do estado de Goiás para
 * saber qual a maior torcida. Faça um programa que calcule a quantidade de torcedores de
 * cada time que torce: G – Goiás, V – Vila Nova, ou O - outros. O programa deve encerrar
 * quando for digitado F - fim. Escrever ao final o total de torcedores entrevistados, a
 * quantidade de torcedores do Goiás, a quantidade do Vila Nova, a quantidade total de
 * torcedores de Outros times.
 */
public class ExercicioN2_7 {

    public static void main(String[] args) {

        // Declaração de Variáveis
        Scanner sc;
        int goias, vila, outros;
        boolean continuar;
        String resposta;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        continuar = true;
        goias = vila = outros = 0;
        resposta = "lalala";

        // Entrada
        while (continuar) {
            System.out.println();
            System.out.print("TIMES\n"
                    + "G - Goiás\n"
                    + "V - Vila Nova\n"
                    + "O - Outros\n\n"
                    + "F - para finalizar a pesquisa.\n\n"
                    + "Qual é o time do entrevistado? ");
            resposta = sc.next();

            // Processamento
            switch (resposta.toUpperCase()) {
                case "G":
                    goias++;
                    break;
                case "V":
                    vila++;
                    break;
                case "O":
                    outros++;
                    break;
                case "F":
                    continuar = false;
                    break;
                default:
                    System.out.printf("\n'%s' não é uma opção!\n", resposta);
                    break;
            }
        }

        // Saída
        System.out.println();
        System.out.printf("Torcedores entrevistados:\n"
                + "Goiás . .: %d\n"
                + "Vila Nova: %d\n"
                + "Outros . : %d\n"
                + "----------\n"
                + "Total . .: %d\n", goias, vila, outros, (goias + vila + outros));
    }
}
