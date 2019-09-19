/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 17/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 3. Faça um programa que leia o nome e sobrenome de duas pessoas (marido e
 * esposa) e um ano (inteiro). E exiba a seguinte mensagem: “Fulano da Silva é
 * casado com Ciclana de Souza há XX anos”. Considere o ano atual como 2019.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String nome, sobrenome, nome_conjuge, sobrenome_conjuge;
        int ano_casamento, tempo_casamento;

        // Entrada
        System.out.print("Digite o seu primeiro nome: ");
        nome = sc.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.print("Digite o primeiro nome do(a) seu(a) cônjuge: ");
        nome_conjuge = sc.nextLine();

        System.out.print("Digite o sobrenomenome do(a) seu(a) cônjuge: ");
        sobrenome_conjuge = sc.nextLine();

        System.out.print("Em qual ano vocês se casaram?: ");
        ano_casamento = sc.nextInt();

        // Processamento
        tempo_casamento = 2019 - ano_casamento;

        // Saída
        System.out.printf("%s %s é casado com %s %s há %d anos.\n",
                nome, sobrenome, nome_conjuge, sobrenome_conjuge, tempo_casamento);
    }
}
