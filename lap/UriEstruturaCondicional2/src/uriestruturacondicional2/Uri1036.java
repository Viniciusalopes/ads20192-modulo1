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
public class Uri1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, r1, r2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (2 * a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            r1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
            r2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}
