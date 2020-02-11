/*
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 11/09/2019
 * Projeto   : Aula_ADS1: Atividade 1 - Exercícios de Introdução
 * Finalidade: DAO - Data Access Object
 */
package dao;

import java.util.ArrayList;
import model.Exercicio;

public class Dao {

    // Lista de exercícios
    private static ArrayList<Exercicio> lista = new ArrayList<Exercicio>();

    // Cria objeto da classe Exercício
    private static Exercicio ex = new Exercicio();

    /**
     * Popula ArrayList<Exercicio>
     */
    public static ArrayList<Exercicio> get_lista() {
        // Limpa a lista para uma nova exibição
        lista = new ArrayList<Exercicio>();
        ex.setNumero(1);
        ex.setTitulo("Primeiro programa");
        ex.setEnunciado("Faça um programa que exiba a seguinte mensagem: \"Este é meu primeiro programa!\".");
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(2);
        ex.setTitulo("Nome, idade e salário");
        ex.setEnunciado(
                "Faça um programa que exiba a seguinte mensagem na tela: \n"
                + "    \n"
                + "    Nome        Idade   Salário\n"
                + "    Pessoa1     18      1500,00\n"
                + "    Outro       20      1200,00\n"
                + "    Alguem      18      2100,00"
        );
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(3);
        ex.setTitulo("Nome, CEP, endereço e telefone");
        ex.setEnunciado(
                "Elabore um programa que crie as variáveis nome, endereço, CEP e telfone.\n"
                + "Em seguida dê valor a essa variável e ao final, ele deve imprimir seu nome\n"
                + "completo na primeira linha, seu endereço na segunda, e o CEP e telefone na terceira."
        );
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(4);
        ex.setTitulo("Pinheiro");
        ex.setEnunciado(
                "Implemente um programa que desenhe um \"pinheiro\" na tela, similar ao abaixo. "
                + "Enriqueça o desenho com outros caracteres, simulando enfeites."
                + "\n"
                + "           X\n"
                + "          XXX\n"
                + "         XXXXX\n"
                + "        XXXXXXX\n"
                + "       XXXXXXXXX\n"
                + "      XXXXXXXXXXX\n"
                + "     XXXXXXXXXXXXX\n"
                + "    XXXXXXXXXXXXXXX\n"
                + "           XX\n"
                + "           XX\n"
                + "          XXXX"
        );
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(5);
        ex.setTitulo("Soma e subtração de dois números");
        ex.setEnunciado(
                "Escreva um programa que leia dois números e apresente a soma e a subtração\n"
                + "entre eles para o usuario."
        );
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(6);
        ex.setTitulo("Dias de vida");
        ex.setEnunciado(
                "Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima "
                + "(aproximadamente) quantos dias de vida ele possui. Considere que o ano tem 365 dias."
        );
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(7);
        ex.setTitulo("Converter Celsius para Fahrenheit");
        ex.setEnunciado(
                "Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.\n"
                + "A fórmula de conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit\n"
                + "e C a temperatura em Celsius"
        );
        lista.add(ex);

        ex = new Exercicio();
        ex.setNumero(8);
        ex.setTitulo("Converter Fahrenheit para Celsius");
        ex.setEnunciado(
                "Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.\n"
                + "A fórmula de conversão é: C = 5.0 * (F - 32.0)/9.0, sendo C a temperatura em Celsius\n"
                + "e F a temperatura em Fahrenheit."
        );
        lista.add(ex);

        return lista;
    }

    public static boolean exercicio_valido(String opcao) {
        for (Exercicio obj : lista) {
            if (opcao.intern() == Integer.toString(obj.getNumero()).intern()) {
                return true;
            }
        }
        return false;
    }

    public static Exercicio get_exercicio(int numero) {
        for (Exercicio obj : lista) {
            if (obj.getNumero() == numero) {
                ex = obj;
                break;
            }
        }
        return ex;
    }
}
