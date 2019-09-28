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
public class Ex1038 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double preco, total;

        // Entrada
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        
        // Processamento
        switch (codigo) {
            case 1:
                preco = 4.0;
                break;
            case 2:
                preco = 4.5;
                break;
            case 3:
                preco = 5.0;
                break;
            case 4:
                preco = 2.0;
                break;
            case 5:
                preco = 1.5;

            default:
                preco = 0;
                break;
        }
        total = (double)(quantidade * preco);
        
        // Saída
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
