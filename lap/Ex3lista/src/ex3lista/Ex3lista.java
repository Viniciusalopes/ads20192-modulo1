/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3lista;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Ex3lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declrando o vetor no tamnho de 3 posiçoes
        int vetor[] = new int[3];
        //varivel que dara o valor x
        int x;
        //for que dará , sentido a pociçao do vetor
        for (int i = 0; i < vetor.length; i++) {
            //entrada do valor da pociçao dp vetor
            System.out.print("Digite o valor da posição " + i);
            vetor[i] = new Scanner(System.in).nextInt();
        }
        //entrada do valor de x 
        System.out.print("Digite um valor para x: ");
        x = new Scanner(System.in).nextInt();
        //saida 
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                System.out.println(x + "está no vetor");
            } else {
                System.out.println(x + "nao esta no vetor");
            }
        }
    }

}
