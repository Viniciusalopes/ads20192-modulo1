/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 20/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 20. Numa determinada região, o imposto sobre propriedade é calculado a partir
 * de duas informações: - área total do terreno (m2). - área construída do
 * terreno (m2). O imposto é cobrado da seguinte maneira: - R$ 5,00 para cada
 * metro quadrado construído. - R$ 3,80 para cada metro quadrado não construído.
 * Faça um programa que leia a área total do terreno, a área construída do
 * terreno, calcule e imprima o valor total a ser pago.
 */
public class Exercicio20 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double area_total, area_construida, area_nao_construida,
                imposto_construida, imposto_nao_construida, imposto_total;

        imposto_construida = 5.0;
        imposto_nao_construida = 3.8;

        // Entrada
        System.out.println();
        System.out.print("Área total do terreno em m².....: ");
        area_total = sc.nextDouble();

        System.out.print("Área construída do terreno em m²: ");
        area_construida = sc.nextDouble();

        // Processamento
        area_nao_construida = area_total - area_construida;
        imposto_total = (area_construida * imposto_construida)
                + (area_nao_construida * imposto_nao_construida);

        // Saída
        System.out.println();
        System.out.printf("Valor total do imposto..........: %.2f.\n", imposto_total);
    }
}
