/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_ads1;

/**
 *
 * @author vinicius
 */
public class Exercicio3 {

    /*
    3. Elabore um program que crie as variáveis nome, endereço, CEP e telfone. Em seguida
    dê valor a essa variável e ao final, ele deve imprimir seu nome completo na primeira linha,
    seu endereço na segunda, e o CEP e telefone na terceira.

     */
    public static void main(String[] args) {
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
