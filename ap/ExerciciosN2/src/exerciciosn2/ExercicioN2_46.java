/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 13/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import static exerciciosn2.ExercicioN2_20.repete;

/**
 * 46. Escreva um programa que armazene os 100 primeiros números ímpares em um vetor, e os
 * 200 primeiros números ímpares em outro vetor. Imprima os dois vetores em seguida.
 */
public class ExercicioN2_46 {

    public static void main(String[] args) {
        // Declaração de variáveis
        int impares[], ii, pares[], ip, quebra, maior_vetor; //ii = indice impar | ip = indice par
        String saida;

        // Inicialização de variáveis
        impares = new int[100];
        pares = new int[200];
        ii = ip = 0;
        quebra = 25;

        // Processamento
        maior_vetor = (impares.length > pares.length) ? impares.length : pares.length;

        for (int i = 0; i < maior_vetor * 2; i++) {
            if (i >= maior_vetor) {
                break;
            }

            if (i % 2 == 0) {
                // Par
                if (ip < pares.length) {
                    pares[ip] = i;
                    ip++;
                }
            } else {
                // Impar
                if (ii < impares.length) {
                    impares[ii] = i;
                    ii++;
                }
            }
        }

        // Saída
        System.out.println();

        // Saída ímpares
        System.out.printf(" %d primeiros números ÍMPARES:\n\n", impares.length);
        for (int i = 0; i < impares.length; i++) {
            System.out.print(pad_left(Integer.toString(impares[i]), ' ', 4));

            if ((i + 1) % quebra == 0) {    // Quebra a cada n posições
                System.out.print("\n");
            }
        }

        // Linha divisória
        System.out.println(repete("-", 100));
        System.out.println();

        // Saída pares
        System.out.printf(" %d primeiros números PARES:\n\n", pares.length);
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pad_left(Integer.toString(pares[i]), ' ', 4));
            if ((i + 1) % quebra == 0) {    // Quebra a cada n posições
                System.out.print("\n");
            }
        }
        System.out.println();
    }

    /**
     * Formata a string com caracteres à esquerda
     *
     * @param texto String a ser formatada
     * @param caractere char de preenchimento à esquerda
     * @param tamanho Tamanho final da String de retorno
     * @return String
     */
    public static String pad_left(String texto, char caractere, int tamanho) {
        return repete(Character.toString(caractere), tamanho - (texto.length())) + texto;
    }
}
