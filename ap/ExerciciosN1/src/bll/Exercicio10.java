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
 * 10. Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em
 * graus Celsius.
 * A fórmula de conversão de temperatura a  ser utilizada é C = (F - 32) * 5 / 9, 
 * em que a variável F é a temperatura em graus Fahrenheit e a
 * variável C é a temperatura em graus Celsius.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        vai();
    }
    
    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double f, c;
        
        // Entrada
        System.out.print("Digite uma temperatura em graus Fahrenheit (°F): ");
        f = sc.nextDouble();

        // Processamento
        c = (f - 32.0) * 5 / 9.0;

        // Saída
        System.out.printf("%.1f°F correspondem a %.1f°C.\n", f, c);
    }
}
