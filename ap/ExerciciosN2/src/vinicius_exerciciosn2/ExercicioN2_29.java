/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 12/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

/**
 * 29. Altere o exercício 23, onde o sistema deverá gerar a tabuada completa de 1 até 10.
 */
public class ExercicioN2_29 {

    public static void main(String[] args) {
        // Processamento
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // Saída
                System.out.printf("%d  x%s%d = %d\n", i, ((j < 10) ? "  " : " "), j, (i * j));
            }
            System.out.println("--------------");
        }

    }
}
