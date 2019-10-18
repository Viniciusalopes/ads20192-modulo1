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
public class Uri1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, aux, maior;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        aux = (a + b + Math.abs(a - b)) / 2;
        maior = (aux + c + Math.abs(aux - c)) / 2;
        System.out.printf("%d eh o maior\n", maior);

    }

}
