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
 */
public class Exercicio5 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        int base, altura, area, perimetro;

        // Entrada
        System.out.println();
        System.out.print("Digite a base do retângulo..: "); // La pregunta
        base = sc.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        altura = sc.nextInt();

        // Processamento
        //Área = base * altura; 
        area = base * altura;

        //Perímetro = 2*base + 2*altura;
        perimetro = 2 * base + 2 * altura;

        // Saída
        System.out.println();
        System.out.printf("A área do retangulo é %d.\n", area);
        System.out.printf("O perímetro do retangulo é %d.\n", perimetro);

    }
}
