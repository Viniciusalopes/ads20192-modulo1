/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas_lista_n2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome,nome_menor,nome_maior;
        int opc, idade, cont = 0, soma_idades = 0 , idade_menor = 0,  idade_maior = 999 ;
        //entrada / processamento de execuçao do progrma 

        do {
            System.out.println();
            System.out.println("==================================================");
            System.out.printf("\nPor favor digite o nome do usuario\n");
            nome = entrada.next();

            System.out.printf("\nDigite a idade do usuario \n");
            idade = entrada.nextInt();

            if (idade == 0) {
                System.out.println("fim da coleta de idades");
            } else if (idade < 0) {
                System.out.println("idade invalida");
            } else {
               
                System.out.println("O usuário , " + nome + " tem " + idade + " anos de vida");
                System.out.println("==================================================");
                System.out.println(); 

                //acumlamdo as idades
                 cont++;
                 soma_idades = idade + soma_idades;
                if (idade > idade_maior) {
                    idade_maior = idade;
                    nome_maior = nome;
                }
                if (idade > idade_maior) {
                    idade_menor = idade;
                    nome_menor = nome;
                }
                System.out.println();
                System.out.println("=====Etatisticas======");
                System.out.println("o nome do usuario e ");
                System.out.println("a quantidade de pessoas entrevistadas e "+ cont);
                System.out.println("a media das idades e "+soma_idades);
                System.out.println("a idade maior e "+idade_maior);
                System.out.println("a idade menor e" +idade_menor);
                
                
            }

            //envia para o coletor de lixo do java
            entrada.nextLine();

        } while (idade != 0);

        //saida
       
    }

}
