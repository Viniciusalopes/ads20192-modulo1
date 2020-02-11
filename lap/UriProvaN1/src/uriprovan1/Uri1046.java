/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriprovan1;

import java.util.Scanner;

/**
 *
 * @author vovoneon
 */
public class Uri1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora_inicial, hora_final, ti_min, tf_min, duracao, diferenca;

        hora_inicial = sc.nextInt();
        hora_final = sc.nextInt();

        ti_min = hora_inicial * 60;
        tf_min = hora_final * 60;
        diferenca = tf_min - ti_min;

        if (tf_min <= ti_min) {
            diferenca = 1440 + diferenca;
        }
        duracao = diferenca / 60;

        // Saida
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
}
