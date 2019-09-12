/*
 * Licença    : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em  : 11/09/2019
 * Projeto    : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade : 3. Elabore um program que crie as variáveis nome, endereço, CEP e telfone. Em seguida
                dê valor a essa variável e ao final, ele deve imprimir seu nome completo na primeira linha,
                seu endereço na segunda, e o CEP e telefone na terceira.
 */
package aula_ads1;

public class Exercicio3 {

    public static void main(String[] args) {
        foi();
    }

    public static void foi() {
        // Cria as variáveis
        String nome, endereco, cep, telefone;

        // Dá valores às variáveis
        nome = "Vinicius Araujo Lopes";
        endereco = "Rua Principal, nº 10, Jd. Mirabel, Goiânia - GO";
        cep = "74485-000";
        telefone = "(62) 9123-4567";

        // Imprime os valores
        System.out.println(
                "NOME....: " + nome + "\n"
                + "ENDEREÇO: " + endereco + "\n"
                + "CEP.....: " + cep + "\tTELEFONE:" + telefone
        );
    }
}
