package aula_ads1;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Exercicio8 {

    /*
    8. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
        A fórmula de conversão é: C = 5.0 * (F - 32.0)/9.0,
        sendo C a temperatura em Celsius e F a temperatura em Fahrenheit.    
     */
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
