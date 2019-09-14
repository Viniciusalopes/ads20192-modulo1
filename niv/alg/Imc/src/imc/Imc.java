/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author vovostudio
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso, altura;
        Scanner sc = new Scanner(System.in);

        //int peso, altura, imc;
        System.out.println("Informe o seu peso:");
        peso = sc.nextDouble();
        System.out.println("Informe a sua altura:");
        altura = sc.nextDouble();
        System.out.printf("O seu IMC é %s", (altura * altura) * peso);
        System.out.println("O seu IMC é " + (altura * altura) * peso);

    }

}
