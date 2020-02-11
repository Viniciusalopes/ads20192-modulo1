/**
 * 44. Faça um programa que leia um vetor de inteiros, de 10 posições. A seguir,
 * encontre o menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma
 * mensagem mostrando: “O menor elemento do vetor é”, X, “e sua posição dentro
 * do vetor é: V[x]. Já o maior elemento é “, Y,” e está na posição V[y]”.
 * Assuma que os elementos informados no vetor são todos diferentes entre si.
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * e la vamos nos de novo
 *
 */
public class Exercicio_44 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variavel do vetor de inteiros
        int vetor_int[];
        //o menor eçemento (X) 
        int x;
        //o maior elemento (Y)
        int y;
        //posiçao x
        int posicao_x;
        //posiçao y
        int posicao_y;
        //inicializanod variaveis
        vetor_int = new int[11];
        x = y = posicao_x = posicao_y = 0;

        //entrada de dados 
        for (int i = 0; i < 11; i++) { 
            //for de posiçao
            //mostrando a posiçao do elemento
            System.out.println();
            System.out.printf("Valor do elemento na posiçao [%d] ", i);
            vetor_int[i] = entrada.nextInt();

            //Processando dados e dando suas determinadas condiçoes 
            if (i == 0) {
                x = y = vetor_int[i];
                posicao_x = posicao_y = i;
            } else {
                //menor elemento
                if (vetor_int[i] < x) {
                    x = vetor_int[i];
                    posicao_x = i;
                }
                //maior elemento 
                if (vetor_int[i] > y) {
                    y = vetor_int[i];
                    posicao_y = i;

                }
            }
        }//saida de resultados
        System.out.println();
        System.out.printf("O menor elemento do vetor é %d,"
                + "\n e sua posição dentro do vetor é:"
                + " V[%d]\n Já o maior elemento é %d,\n"
                + " e está na posição V[%d]\n"
                + "",x , y , posicao_x , posicao_y);
    }

}
