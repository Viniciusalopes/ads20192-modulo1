/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 18. Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao
 * usuário a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
 * novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
 * “Senha correta! Bem-vindo ao sistema”.
 */
public class ExercicioN2_18 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int senha1, senha2;

        // Inicialização de variávels
        sc = new Scanner(System.in);

        // Entrada da senha1
        System.out.print("Digite a senha: ");
        senha1 = sc.nextInt();

        do {    // } while (senha1 != senha2);
            // Entrada da senha2
            System.out.print("Digite a senha novamente: ");
            senha2 = sc.nextInt();
            if (senha1 != senha2) {
                // Senha incorreta
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (senha1 != senha2);

        // Saída senha correta
        System.out.println("Senha correta! Bem-vindo ao sistema.");
    }
}
