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
public class Uri1052 {

    public static void main(String[] args) {
        // Declaração de variaveis + Inicialização + Entrada
        int mes = new Scanner(System.in).nextInt();
        String mes_extenso = "";

        // Processamento
        switch (mes) {
            case 1:
                mes_extenso = "January";
                break;
            case 2:
                mes_extenso = "February";
                break;
            case 3:
                mes_extenso = "March";
                break;
            case 4:
                mes_extenso = "April";
                break;
            case 5:
                mes_extenso = "May";
                break;
            case 6:
                mes_extenso = "June";
                break;
            case 7:
                mes_extenso = "July";
                break;
            case 8:
                mes_extenso = "August";
                break;
            case 9:
                mes_extenso = "September";
                break;
            case 10:
                mes_extenso = "October";
                break;
            case 11:
                mes_extenso = "November";
                break;
            case 12:
                mes_extenso = "December";
                break;
        }

        // Saída
        System.out.println(mes_extenso);
    }
}
