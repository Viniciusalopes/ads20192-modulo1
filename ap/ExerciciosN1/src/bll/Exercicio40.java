/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 40. Crie um programa que leia a idade de uma pessoa e que mostre a sua classe
 * eleitoral:
 */
// a. Não-Eleitor: Abaixo de 16 anos.
// b. Eleitor obrigatório: entre 18 e 65 anos.
// c. Eleitor Facultativo: entre 16 e 18 anos e maior de 65 anos.
//
public class Exercicio40 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int idade;
        String classe_eleitoral = "NÃO-ELEITOR";

        try {
            // Entrada
            System.out.println();
            System.out.print("Informe a sua idade: ");
            idade = sc.nextInt();

            // Validação
            if (idade <= 0) {
                throw new InputMismatchException();
            }
            
            // Processamento
            if (idade >= 16) {
                if (idade < 18 || idade >= 65) {
                    classe_eleitoral = "ELEITOR FACULTATIVO";
                } else if (idade >= 18 && idade < 65) {
                    classe_eleitoral = "ELEITOR OBRIGATÓRIO";
                }
            }
            // Saída
            System.out.println();
            System.out.printf("Sua classe eleitoral: %s\n", classe_eleitoral);
        } catch (InputMismatchException e) {
            System.out.println("Idade inválida!");
        }

    }
}
