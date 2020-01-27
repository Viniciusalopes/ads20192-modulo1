/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author vovomint
 */
public class Ex1010 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double codigo, quantidade, valor, pagar = 0.0;

        // Entrada 1
        codigo = sc.nextDouble();
        quantidade = sc.nextDouble();
        valor = sc.nextDouble();
        // Processamento 1
        pagar += quantidade * valor;
        
        // Entrada 2
        codigo = sc.nextDouble();
        quantidade = sc.nextDouble();
        valor = sc.nextDouble();
        // Processamento 2
        pagar += quantidade * valor;
        
        // Saída
        // VALOR A PAGAR: R$ 15.50
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", pagar);
    }
}
