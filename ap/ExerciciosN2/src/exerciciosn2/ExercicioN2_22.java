/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 22. Faça um programa que leia um número e imprima todos os números de 0 até o número
 * digitado.
 */
public class ExercicioN2_22 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int numero;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        do {
            System.out.print("Digite um número inteiro diferente de 0: ");
            numero = sc.nextInt();
        } while (numero == 0);

        // Saída
        if (numero > 0) {
            for (int i = 0; i <= numero; i++) {
                imprime(i, '+');
            }
        } else {    // Número negativo
            for (int i = 0; i >= numero; i--) {
                imprime(i, '-');
            }
        }
        System.out.println();
    }

    /**
     * Quebra linha a cada 10 números e simula alinhamento para números até 9999.
     * @param valor Inteiro a ser impresso
     * @param sinal '-' para números negativos e '+' para números positivos.
     */
    public static void imprime(int valor, char sinal) {
        String espacos, quebra;
        espacos = "";
        quebra = "";

        int tamanho = String.format("%d", valor).length();

        for (int i = tamanho; i < 4; i++) {
            espacos += " ";
        }

        if (sinal == '+') {
            quebra = ((valor + 1) % 10 == 0) ? " \n" : " ";
        } else {
            quebra = ((valor - 1) % 10 == 0) ? " \n" : " ";
        }

        System.out.print(espacos + valor + quebra);
    }
}
