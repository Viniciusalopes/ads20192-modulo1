/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 12/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

import java.util.Scanner;

/**
 *
 * @author vovoubuntu
 */
public class ExercicioN2_43_mp {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int x = 0, y = 0;
        int posi1 = 0;
        int posi2 = 0;
        boolean repetido = false;

        // Entrada: Elementos
        for (int i = 0; i < 10; i++) {
            // Adicionando: Elemento na posição "i" do vetor
            do { // } (while repetido);
                System.out.printf("Informe um número para a posição %d:", i);
                vetor[i] = input.nextInt();  // Recebe direto na posição do vetor
                if (i > 0) {
                    // Verificação: Se o elemento ja está contido dentro do vetor
                    repetido = false;
                    for (int j = 0; j < i; j++) {
                        // Saida: Elemento está contido 
                        if (vetor[j] == vetor[i]) {
                            System.out.printf("\nO elemento %d ja está contido no vetor!\n\n", vetor[i]);
                            repetido = true;
                            break; // Pára o laço FOR, porque já encontrou UM repetido
                        }
                    }
                }

            } while (repetido);

        }
        for (int i = 0; i < 10; i++) {
            // Condição: Menor e maior
            if (i == 0) {
                x = y = vetor[i];
            } else {
                if (vetor[i] < x) {
                    x = vetor[i];
                    posi1 = i;  // Salva a posição do menor
                }
                if (vetor[i] > y) {
                    y = vetor[i];
                    posi2 = i;  // Salva a posição do maior
                }
            }
        }

        System.out.printf("\n");

        // Saida: Menor Elemento 
        System.out.printf("O menor elemento do vetor é “%d”, e sua posição dentro do vetor é “%d”.\n", x, posi1);

        // Saida: Menor Elemento 
        System.out.printf("Já o maior elemento é “%d” e está na posição “%d”.\n", y, posi2);
        System.out.println("Vovolinux é gente boa.");
    }
}
