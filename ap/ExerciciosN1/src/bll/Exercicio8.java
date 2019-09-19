/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 19/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que a percentagem do distribuidor seja de 12% do preço de fábrica e
 * os impostos de 30% do preço de fábrica, faça um programa para ler o custo de
 * fábrica de um carro e imprimir o custo ao consumidor.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double custo, distribuidor, impostos, consumidor;
        distribuidor = 12.0;
        impostos = 30.0;

        // Entrada
        System.out.print("Digite o preço de custo de fábrica do veículo: ");
        custo = sc.nextDouble();

        // Processamento
        consumidor = custo + (custo * (distribuidor / 100)) + (custo * (impostos / 100));

        // Saída
        System.out.printf("Preço do veículo ao consumidor: %.2f \n", consumidor);
    }
}
