/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 * 6. Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
 * usuário. Cuidado com valores inválidos!
 */
public class ExercicioN2_6 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int numero, multiplicador, fatorial;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        numero = multiplicador = -1;
        fatorial = 1;

        // Entrada
        while (numero < 0) {
            System.out.print("Digite um número inteiro não negativo (n >= 0): ");
            multiplicador = numero = sc.nextInt();

            // Validação do número
            if (numero < 0) {
                System.out.println("Número inválido!");
            }
        }

        // Processamento
        //n! = n . (n – 1).(n – 2) … 3 . 2 . 1
        while (multiplicador >= 1) {
            fatorial *= multiplicador;
            multiplicador--;
        }
        // Saída
        System.out.printf("%d! = %d\n", numero, fatorial);

    }
}
