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
public class Uri1048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, novo_salario, reajuste, percentual;
        novo_salario = reajuste = percentual = 0.0;

        salario = sc.nextDouble();

        if (salario > 0 && salario <= 400.0) {
            percentual = 0.15;
        } else if (salario <= 800.0) {
            percentual = 0.12;
        } else if (salario <= 1200.0) {
            percentual = 0.10;
        } else if (salario <= 2000.0) {
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }

        reajuste = salario * percentual;
        novo_salario = salario + reajuste;
        percentual *= 100;

        System.out.printf("Novo salario: %.2f\n"
                + "Reajuste ganho: %.2f\n"
                + "Em percentual: %.0f ",
                novo_salario,
                reajuste,
                percentual
        );
        System.out.println("%");
    }
}
