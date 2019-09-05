/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_ads1;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*        
        String linha = "------------------------------------------------------------";
        
        System.out.println(linha);
        
        System.out.print("Opa, mundo!");
        System.out.println("\n" + linha);
        System.out.println("Bem vindos\nalunos de \n\nADS-1");
        System.out.println(linha);
        System.out.println("Bem vindos\n\talunos de \n\nADS-1");
        System.out.println(linha);
        System.out.println("Bem vindos\n\t\t\\alunos de \n\nADS-1");
        String nome = "Vovolinux";
        int idade = (2019 - 1976);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
         */
        menu();
    }

    private static void menu() { // menu principal

        // Fonte: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        Scanner sc = new Scanner(System.in);

        String opcao = "";
        do {
            System.out.println(repete("-", 80));
            System.out.println(
                    repete(" ", 25) + 
                    "Aula_ADS1 - Exercícios 20190904"
            );
            System.out.println(repete("-", 80));
            opcao = sc.nextLine();
            System.out.print("\n");
            switch (opcao) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    Exercicio4.vai_com_tudo();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != "Sair");
    }

    private static String repete(String caracter, int tamanho) {
        String ret = "";
        for (int i = 0; i < tamanho; i++) {
            ret += caracter;
        }
        return ret;
    }
}
