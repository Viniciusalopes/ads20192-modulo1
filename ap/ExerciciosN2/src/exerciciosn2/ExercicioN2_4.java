/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 4. Escreva um programa que leia o nome e a idade de vários usuários, e imprima a
 * seguinte mensagem “O usuário *nome* tem *anos* anos de vida”. O programa deverá
 * continuar executando enquanto o usuário informar que deseja continuar.
 */
public class ExercicioN2_4 {

    public static void main(String[] args) {
        // Declaração de Variaveis
        Scanner sc;
        String nome, resposta;
        int idade;
        boolean sair;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        sair = false;

        // Entrada
        while (!sair) {
            System.out.println();
            System.out.print("Digite o nome do usuário : ");
            nome = sc.next();

            idade = 0;
            while (idade <= 0) {
                System.out.print("Digite a idade do usuário: ");
                idade = sc.nextInt();

                // Validação da idade
                if (idade <= 0) {
                    System.out.println("Idade inválida! Tente outra vez...");
                }
            }

            // Saída
            System.out.println();
            System.out.printf("O usuário %s tem %d ano%s de vida.\n",
                    nome, idade, (idade > 1) ? "s" : "");

            // Continuar
            resposta = "";
            while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
                System.out.print("Deseja continuar [S,n]? ");
                resposta = sc.next();

                if (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
                    System.out.println("\nResposta inválida!");
                }
            }

            // Sair
            if (resposta.equalsIgnoreCase("n")) {
                sair = true;
            }
        }
    }
}
