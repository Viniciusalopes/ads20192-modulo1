/*
 * Licença    : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em  : 11/09/2019
 * Projeto    : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade : 8. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
                A fórmula de conversão é: C = 5.0 * (F - 32.0)/9.0,
                sendo C a temperatura em Celsius e F a temperatura em Fahrenheit.
 */
package aula_ads1;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        avia_minino();
    }

    public static void avia_minino() {
        // Variáveis
        double c, f;
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite uma temperatura em graus Fahrenheit (°F): ");
        f = sc.nextDouble();

        // Processamento
        c = 5.0 * (f - 32.0) / 9.0;

        // Saída
        System.out.printf("%.1f°F correspondem a %.1f°C.\n", f, c);
    }
}
