
/*
 * Licença    : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em  : 11/09/2019
 * Projeto    : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade : 2. Faça um programa que exiba a seguinte mensagem na tela: "
    
                Nome        Idade   Salário
                Pessoa1     18      1500,00
                Outro       20      1200,00
                Alguem      18      2100,00
 */
package aula_ads1;

public class Exercicio2 {

    public static void main(String[] args) {
        vamo();
    }

    public static void vamo() {

        // Saída
        System.out.println(
                "Nome\tIdade\tSalário\n"
                + "Pessoa1\t18\t1500,00\n"
                + "Outro\t20\t1200,00\n"
                + "Alguém\t25\t2100,00\n"
        );
    }
}
