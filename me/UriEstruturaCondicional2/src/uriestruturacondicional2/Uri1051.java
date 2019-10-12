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
public class Uri1051 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        double salario, imposto, i8, i18, i28;
        String saida;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        imposto = i18 = i28 = 0;
        i8 = 80;
        saida = "Isento";

        // Entrada
        salario = sc.nextDouble();

        // Processamento
        if (salario <= 2000.0) {
            saida = "Isento";
        } else {
            if (salario <= 3000) {
                i8 = (salario - 2000) * 8 / 100;
            } else if (salario <= 4500) {
                i18 = (salario - 3000) * 18 / 100;
            } else { // > 4500
                i18 = 270;
                i28 = (salario - 4500) * 28 / 100;
            }

            imposto = i8 + i18 + i28;
            saida = String.format("R$ %.2f", imposto);
        }
        // Saida
        System.out.println(saida);
    }
}
