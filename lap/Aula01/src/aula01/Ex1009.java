/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author vinicius
 */
public class Ex1009 {

    public static void main(String[] args) {
        // Variáveis

        Scanner sc = new Scanner(System.in);
        double salario, vendas, total;

        String nome = sc.next();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();

        total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
