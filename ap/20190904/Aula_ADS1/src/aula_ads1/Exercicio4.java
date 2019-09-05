/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_ads1;

/**
 *
 * @author vovostudio
 */
public class Exercicio4 {

    /*
    4. Implemente um programa que desenhe um "pinheiro" na tela, similar ao abaixo.
       Enriqueça o desenho com outros caracteres, simulando enfeites.
    
           X
          XXX
         XXXXX
        XXXXXXX
       XXXXXXXXX
      XXXXXXXXXXX
     XXXXXXXXXXXXX
    XXXXXXXXXXXXXXX
           XX
           XX
          XXXX
     */
    public static void main(String[] args) {
        vai_com_tudo();
    }
    
    public static void vai_com_tudo(){
        System.out.println(""
                + "       *\n"
                + "       X\n"
                + "      X*X\n"
                + "     X*X*X\n"
                + "    X*X*X*X\n"
                + "   X*X*X*X*X\n"
                + "  X*X*X*X*X*X\n"
                + " X*X*X*X*X*X*X\n"
                + "X*X*X*X*X*X*X*X\n"
                + "*     XXX     *\n"
                + "      XXX\n"
                + "     XXXXX"
        );
    }
}
