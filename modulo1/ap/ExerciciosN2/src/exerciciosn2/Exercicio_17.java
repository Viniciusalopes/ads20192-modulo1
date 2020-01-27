/*
 17. Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
 deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de
 validar se a nota informada é válida (0.0 ≤ nota ≥ 10), caso contrário o sistema deve
 informar ao usuário o erro e pedir para ler novamente. Usar um laço Do-While na
 leitura das notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:
 */
package exerciciosn2;

import java.util.Scanner;

public class Exercicio_17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Leia o Nome e duas notas de uma pessoa 
        //entrada de variaveis 
        double nota1, nota2, media, nota;
        String nome, opcao;
        //inicializando variaveis 
        media = 0;
        //processamento de dados 
        do {
            System.out.println();
            System.out.println("-------MEDIA--------");
            //entrada do nome do aluno 
            System.out.print("Insira o nomedo aluno ");
            nome = entrada.nextLine();
            //entrada da primeira nota  
            System.out.print("Entre com o grau A ");
            nota1 = entrada.nextDouble();
            //entrada da segunda nota
            System.out.print("Entee com o grau B ");
            nota2 = entrada.nextDouble();
            nota = nota1 ;
            nota = nota2 ;
            //processamento da nota 
            while (nota1 <= 0||nota2 <= 0) {
            System.out.printf("A segunda nota do aluno , %s esta omvalida favor fornecer uma nota valida",nome);
            }
            //validaoçao da nota
       
            //media
            media = (nota1+nota2)/2;
            //oopçao de saida 
            System.out.printf("O aluno %s tem uma media de %.2f ",nome,media);
            entrada.nextLine();
            System.out.print("\nDESEJA CONTINUAR ?(SIM/NAO)\n");
            opcao = entrada.nextLine();

        } while (opcao.equalsIgnoreCase("sim"));
        

    }

}
