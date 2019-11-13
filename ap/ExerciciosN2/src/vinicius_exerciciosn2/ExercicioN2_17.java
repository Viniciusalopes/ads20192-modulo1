/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 17. Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
 * deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de
 * validar se a nota informada é válida (0.0 ≤ nota ≥ 10), caso contrário o sistema deve
 * informar ao usuário o erro e pedir para ler novamente. Usar um laço Do-While na leitura
 * das notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:
 */
/*
  SAÍDA:
    Entre com o nome do aluno: Fulano da Silva
    Entre com o grau A: 15.3
    ERRO: Nota inválida! Digite novamente a nota.
    Entre com o grau A: 5.0
    Entre com o grau B: 6.0
    O Aluno Fulano da Silva tem uma média: 5.66
    Continuar(sim/nao)? nao
 */
public class ExercicioN2_17 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        String nome, continuar;
        double n1, n2, media;

        // Inicialização de variáveis
        continuar = "sim";

        do {    // } while (continuar.equalsIgnoreCase("sim"));
            sc = new Scanner(System.in);
            media = 0;

            // Entrada do nome
            System.out.print("Entre com o nome do aluno: ");
            nome = sc.nextLine();

            // Entrada da primeira nota
            do {    // } while (!nota_valida(n1));
                System.out.print("Entre com o grau A: ");
                n1 = sc.nextDouble();

                if (!nota_valida(n1)) {
                    erro();
                }
            } while (!nota_valida(n1));

            // Entrada da segunda nota
            do {    // } while (!nota_valida(n2));
                System.out.print("Entre com o grau B: ");
                n2 = sc.nextDouble();

                if (!nota_valida(n2)) {
                    erro();
                }
            } while (!nota_valida(n2));

            // Processamento
            media = (n1 + n2) / 2;

            // Saída
            System.out.printf("O Aluno %s tem uma média: %.2f\n", nome, media);

            // Continuar
            do {    // } while (!resposta_valida(continuar));
                System.out.print("Continuar(sim/nao)? ");
                continuar = sc.next();
                if (!resposta_valida(continuar)) {
                    System.out.println("Resposta inválida!");
                }
            } while (!resposta_valida(continuar));

        } while (continuar.equalsIgnoreCase("sim"));
    }

    /**
     * @ Validação da nota
     * @param nota
     * @return boolean
     */
    public static boolean nota_valida(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            return false;
        }
        return true;
    }

    /**
     * @ Valida resposta
     * @param resposta sim ou não
     * @return boolean
     */
    public static boolean resposta_valida(String resposta) {
        if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {
            return false;
        }
        return true;
    }

    /**
     * @ Imprime mensagem de erro no console
     */
    public static void erro() {
        System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
    }
}
