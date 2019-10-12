/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional2;

import java.util.Scanner;

/**
 *
 * @author vovoubuntu
 */
public class Uri1047 {

    public static void main(String[] args) {
        // Declaracao de variaveis
        Scanner sc;
        int hora_inicial, min_inicial, hora_final, min_final,
                ti_min, tf_min, dh, dm, dif;

        // Inicializacao de variaveis
        sc = new Scanner(System.in);

        // Entrada
        hora_inicial = sc.nextInt();
        min_inicial = sc.nextInt();

        hora_final = sc.nextInt();
        min_final = sc.nextInt();

        // Processamento
        ti_min = hora_inicial * 60 + min_inicial;
        tf_min = hora_final * 60 + min_final;
        dif = tf_min - ti_min;

        if (tf_min <= ti_min) {
            dif = 1440 + dif;
        }
        dh = dif / 60;
        dm = dif % 60;

        // Saida
        System.out.printf(
                "O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dh, dm);
    }
}
