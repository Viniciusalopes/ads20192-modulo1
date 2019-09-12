/*
 * Licença    : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em  : 11/09/2019
 * Projeto    : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade : 4. Implemente um programa que desenhe um "pinheiro" na tela, similar ao abaixo.
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
package aula_ads1;

public class Exercicio4 {

    public static void main(String[] args) {
        vai_com_tudo();
    }

    public static void vai_com_tudo() {

        // Saída
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
