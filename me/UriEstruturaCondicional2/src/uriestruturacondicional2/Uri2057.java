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
public class Uri2057 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int s, t, f, h, c;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        s = sc.nextInt();
        t = sc.nextInt();
        f = sc.nextInt();

        // Processamento
        h = s + t + f;
        if (h == 24) {
            c = 0;
        } else {
            if (h < 0) {
                c = h + 24;
            } else {
                c = h % 24;
            }
        }
        
        // Saída
        System.out.println(c);
    }
}
