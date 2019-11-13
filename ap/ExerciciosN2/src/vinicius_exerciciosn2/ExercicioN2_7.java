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
        String resposta;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        goias = vila = outros = 0;
        resposta = "lalala";

        while (!resposta.equalsIgnoreCase("s")) {
            System.out.println("Digite a letra do time (G=goias,V=vila,O=outros,s=sair");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("g")) {
                goias++;
            } else if (resposta.equalsIgnoreCase("v")) {
                vila++;
            } else if (resposta.equalsIgnoreCase("o")) {
                outros++;
            } else if (!resposta.equalsIgnoreCase("s")) {
                System.out.println("Resposta inválida!");
            }
        }

        System.out.println("Torcedores do goias : " + goias);
        System.out.println("Torcedores do vila  : " + vila);
        System.out.println("Outros Torcedores   : " + outros);
        System.out.println("Total de Torcedores : " + (goias + vila + outros));
    }
}
