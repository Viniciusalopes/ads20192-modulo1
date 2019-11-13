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
public class ExercicioN2_43_mp_comentado {

    public static void main(String[] args) {
        // Variaveis
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        //int aux;
        int x = 0, y = 0;
        int posi1 = 0;
        int posi2 = 0;
        boolean repetido = false;

        // Entrada: Elementos
        for (int i = 0; i < 10; i++) {
            // Adicionando: Elemento na posição "i" do vetor
            do { // } (while repetido);
                System.out.printf("Informe um número para a posição %d:", i);
                //aux = input.nextInt();
                vetor[i] = input.nextInt();  // Recebe direto na posição do vetor
                // vetor[i] = aux; -> Não precisa de aux, porque o i estará parado ao
                //                    buscar outro igual com a posição j
                // if (i >= 1) {
                if (i > 0) {
                    // Verificação: Se o elemento ja está contido dentro do vetor
                    // for (int j = 0; j < i; j++) {
                    repetido = false;
                    for (int j = 0; j < i; j++) {
                        // Saida: Elemento está contido 
                        //if (vetor[j] == aux) {
                        if (vetor[j] == vetor[i]) {
                            System.out.printf("\nO elemento %d ja está contido no vetor!\n\n", vetor[i]);
                            repetido = true;
                            break; // Pára o laço FOR, porque já encontrou UM repetido
                            // Decremento: para atribuir um elemento a posição do elemento repetido
                            // i--;  <- também não precisa, e não deve;
                            //          - o i ainda será usado e não deve ser alterado
                            //          
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
                    //} else if (vetor[i] > y) { // não pode ser else tem que ser IF
                    //                             Se o número não for o menor ele ainda
                    //                             pode NÃO SER o maior
                }
                if (vetor[i] > y) {
                    y = vetor[i];
                    posi2 = i;  // Salva a posição do maior
                }
            }
        }

        System.out.printf("\n");

        // Saida: Maior e Menor Elemento do vetor
        // for (int i = 0;
        //         i < 10; i++) {
        // 
        //    if (vetor[i] == x) {
        //        posi1 = i;
        //    }
        //   if (vetor[i] == y) {
        //        posi2 = i;
        //
        //    }
        //}
        // Saida: Menor Elemento 
        System.out.printf("O menor elemento do vetor é “%d”, e sua posição dentro do vetor é “%d”.\n", x, posi1);

        // Saida: Menor Elemento 
        System.out.printf("Já o maior elemento é “%d” e está na posição “%d”.\n", y, posi2);
        System.out.println("Vovolinux é gente boa.");
    }
}
