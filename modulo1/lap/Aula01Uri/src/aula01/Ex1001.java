/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Ex1001 {

    public static void main(String[] args) {
        int A, B, X;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextInt();
        B = entrada.nextInt();
        X = A + B;
        System.out.printf("X = %d\n", X);
    }
}
