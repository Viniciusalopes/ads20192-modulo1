/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 10. Escreva um programa que receba vários números inteiros informados pelo usuário
 * enquanto os mesmos forem positivos. Imprimir quantos números foram digitados.
 */
public class ExercicioN2_10 {

    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner sc;
        int numero, cont, cont0;

        // Inicialização de Variáveis
        sc = new Scanner(System.in);
        numero = cont = cont0 = 0;

        // Entrada
        while (numero >= 0) {
            System.out.print("\nDigite um número inteiro positivo ou,\n"
                    + "digite um número inteiro negativo para sair: ");
            numero = sc.nextInt();

            // Processamento
            if (numero == 0) {
                cont0++;
                System.out.println("0 (zero) é neutro! =)");
            } else {
                cont++;
            }
        }
        // Saída
        System.out.println();
        System.out.print((cont - 1 == 0) ? "Nenhum número inteiro positivo foi digitado"
                : String.format("For(am) digitado(s) %d números positivo(s)", cont - 1));
        System.out.print((cont0 > 0) ? String.format(",\no número 0 (zero) foi digitado %d vez(es),\n", cont0) : ",\n");
        System.out.printf("e o número %d foi digitado para sair.\n", numero);
        System.out.printf("\nTotal de números digitados: %d\n", cont + cont0);
    }
}
