/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import app.App;
import dao.*;
import java.util.Scanner;

/**
 *
 * @author vovomint
 */
public class Teste {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String numero = "10011011101";

        System.out.println(Bll.de8para2(numero));
        System.out.println(Bll.deNpara10(numero, 16));
        
        // Entrada
        System.out.println();
        // Processamento
        // Saída
        System.out.println();
        
     //1001010100101100111110100000011101
     //1001010100101100111110100000011101
    }
}
