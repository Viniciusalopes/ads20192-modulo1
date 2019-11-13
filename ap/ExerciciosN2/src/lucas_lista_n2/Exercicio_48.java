/*
 48. Faça um programa que leia um primeiro vetor com dez números inteiros e um segundo
 vetor com cinco números inteiros. Mostre uma lista dos números do primeiro vetor com
 seus respectivos divisores armazenados no segundo vetor, bem como suas posições.
 Ex.: Num [ 5 12 4 7 10 3 2 6 23 16 ]
 Divis [ 3 11 5 8 2]
 Saída:
 Número 5:
 Divisível por 5 na posição 2
 Número 12:
 Divisível por 3 na posição 0
 Divisível por 2 na posição 4
 Número 4:
 Divisível por 2 na posição 4
 */
package lucas_lista_n2;

import java.util.Random;

/**
 *
 */
public class Exercicio_48 {

    public static void main(String[] args) {
        //vetor numero 
        int[] numero = new int[10];
        //vetor do divisor do numero
        int[] divisor = new int[5];
        //numero que ve mde um metodo , chamado de sorteia pois sorteia um 
        //numero açeatorio entre 1 e 50
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sorteia(1, 50);
        }
        //mostrando o numero do vetor 
        System.out.println();
        System.out.println("Vetor numero ");
        //imprime o numero sorteado e quebra a linha a cada 2 numero
        imprimeVetor(numero);
        //indice do divisor 
        for (int i = 0; i < divisor.length; i++) {
            divisor[i] = sorteia(1, 10);
        }
        System.out.println();
        System.out.println("========================================================");
        System.out.println("\n\nVetor divisor : ");
        //expondo os numeros divisores
        imprimeVetor(divisor);

        System.out.println("\n");
        for (int i = 0; i < numero.length; i++) {

            System.out.println("========================================================");
            System.out.println("numero: " + numero[i]);
            for (int j = 0; j < divisor.length; j++) {
               //saida
                if (numero[i] % divisor[j] == 0) {

                    System.out.println("Divisivel por " + divisor[j] + ", que está na posição " + j);
                    System.out.println("========================================================");
                    System.out.println();

                }

            }
        }

    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }

    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                //quando completar 2 posiçoes o 
                //resultado ira quebrar em 25
                System.out.println("\n");
            }
            System.out.print(vetor[i] + "   ");
        }
    }
}
