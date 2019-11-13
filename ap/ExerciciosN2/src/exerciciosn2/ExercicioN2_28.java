/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 12/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 28. Num frigorífico existem 5 bois. Cada boi traz em seu pescoço um cartão contendo seu
 * número de identificação e seu peso. Faça um programa que escreva o número e o peso do
 * boi mais gordo e do boi mais magro. Assuma que os dados são válidos.
 */
public class ExercicioN2_28 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int id, id_gordo, id_magro;
        double peso, peso_gordo, peso_magro;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        id_gordo = id_magro = 0;
        peso_gordo = peso_magro = 0;

        // Entrada
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.printf("Número do %dº boi : ", i);
            id = sc.nextInt();

            System.out.printf("Peso do boi número %d: ", id);
            peso = sc.nextDouble();

            // Processamento
            if (i == 1) {
                id_gordo = id_magro = id;
                peso_gordo = peso_magro = peso;
            } else {
                if (peso > peso_gordo) {
                    id_gordo = id;
                    peso_gordo = peso;
                }
                if (peso < peso_magro) {
                    id_magro = id;
                    peso_magro = peso;
                }
            }
        }

        // Saída
        System.out.println();
        System.out.printf("O boi número %d é o mais gordo, com %.2f kg.\n", id_gordo, peso_gordo);
        System.out.printf("O boi número %d é o mais magro, com %.2f kg.\n", id_magro, peso_magro);
    }
}
