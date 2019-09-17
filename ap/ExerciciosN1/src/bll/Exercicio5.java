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
 * 5. Escreva um programa que receba a base e a altura de um retângulo. Em
 * seguida, calcule e imprima a área e o perímetro do retângulo. Obs. Fórmulas:
 * Área = base * altura; Perímetro = 2*base + 2*altura;
 *
 */
public class Exercicio5 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double base, altura, area, perimetro;

        // Entrada
        System.out.print("Digite a medida da BASE do retângulo  : ");
        base = sc.nextDouble();
        System.out.print("Digite a medida da ALTURA do retângulo: ");
        altura = sc.nextDouble();

        // Processamento
        area = base * altura;
        perimetro = (2 * base) + (2 * altura);

        // Saída
        System.out.printf("Área do retângulo     : %.2f\n", area);
        System.out.printf("Perímetro do retângulo: %.2f\n", perimetro);
    }
}
