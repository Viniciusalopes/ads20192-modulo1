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
public class Uri1050 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int ddd;
        String saida;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        // Entrada
        ddd = sc.nextInt();

        switch (ddd) {
            case 11:
                saida = "Sao Paulo";
                break;
            case 19:
                saida = "Campinas";
                break;
            case 21:
                saida = "Rio de Janeiro";
                break;
            case 27:
                saida = "Vitoria";
                break;
            case 31:
                saida = "Belo Horizonte";
                break;
            case 32:
                saida = "Juiz de Fora";
                break;
            case 61:
                saida = "Brasilia";
                break;
            case 71:
                saida = "Salvador";
                break;

            default:
                saida = "DDD nao cadastrado";
                break;
        }

        // Saída
        System.out.println(saida);
    }
}
