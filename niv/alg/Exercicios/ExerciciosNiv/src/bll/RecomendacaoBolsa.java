/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 28/09/2019
 * Projeto   : ExerciciosNiv
 * Finalidade: Exercícios de Nivelamento de Algorítimos e Lógica
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * Recomendam-se estudantes para bolsas de estudo em função de seu desempenho
 * anterior. A natureza das recomendações é baseada na seguinte tabela.
 *
 */
// MÉDIA                RECOMENDAÇÃO
// Média >= 9,0         Altamente recomendado
// 8,0 <= Média < 9,0   Fortemente recomendado
// 7,0 <= Média < 8,0   Altamente recomendado
// Média < 7,0          Não recomendado
//
public class RecomendacaoBolsa {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double media;
        String recomendacao;

        // Entrada
        System.out.println();
        System.out.print("Informe a média: ");
        media = sc.nextDouble();

        // Processamento
        if (media < 7.0) {
            recomendacao = "Não recomendado";
        } else if (media < 8.0) {
            recomendacao = "Recomendado";
        } else if (media < 9.0) {
            recomendacao = "Fortemente recomendado";
        } else {
            recomendacao = "Altamente recomendado";
        }

        // Saída
        System.out.println();
        System.out.println("Resultado: " + recomendacao + "\n");
    }
}
