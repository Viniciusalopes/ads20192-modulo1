/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 02/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 6. Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
 * usuário. Cuidado com valores inválidos!
 */
public class ExercicioN2_6 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero = -1, multiplicador = -1, fatorial = 1;

        // Entrada
        while (numero < 0) {
            System.out.print("Digite um número inteiro positivo: ");
            multiplicador = numero = sc.nextInt();
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
