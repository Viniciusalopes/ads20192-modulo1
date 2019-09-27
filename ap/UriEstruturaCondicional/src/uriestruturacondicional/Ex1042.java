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
public class Ex1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, aa, b, bb, c, cc, x;

        a = aa = sc.nextInt();
        b = bb = sc.nextInt();
        c = cc = sc.nextInt();

        // menor
        if (b < a || c < a) {
            if (b < c) {
                x = a;
                a = b;
                b = x;
            } else {
                x = a;
                a = c;
                c = x;
            }
        }

        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
}
