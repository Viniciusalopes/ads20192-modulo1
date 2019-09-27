/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uriestruturacondicional;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Ex1044 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int a, b;

        // Entrada
        a = sc.nextInt();
        b = sc.nextInt();

        // Processamento e Saída
        if (b % a != 0) {
            System.out.print("Nao sao Multiplos");
        } else {
            System.out.print("Sao Multiplos");
        }
    }
}
