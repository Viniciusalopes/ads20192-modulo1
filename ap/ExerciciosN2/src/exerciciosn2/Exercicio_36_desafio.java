/*
 36. Foi feita uma pesquisa para saber o perfil dos alunos que cursam o ensino médio de uma
 determinada escola. Cada aluno fornecia a seu ano (primeiro - 1, segundo - 2, terceiro -
 3), quantos livros liam por mês e se gostavam de fazer redação (Sim-1 ou Não- 0). Fazer
 um programa que leia os dados, calcule e escreva:
  A quantidade de alunos que está no terceiro ano;
  A maior quantidade de livros lidos por um aluno que está na segunda série;
  A média de livros lidos pelos alunos (considerando todas as séries);
  A porcentagem de alunos que não gostam de fazer redação e que estão no primeiro ano.
 */
package exerciciosn2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio_36_desafio {

    public static void main(String[] args) {
        //Scanner
        Scanner entrada = new Scanner(System.in);
        //perfil do aluno
        String nome;
        int idade;
        //serie do aluno
        String serie, aluno2, primeiro, segundo, terceiro;
        //livros
        int livro, livro2 = 0, cont_livro2 = 0, cont_livro = 0, aluno_que_leu_mais = 0;
        //contador terceiro ano
        int cont_primeiro = 0, cont_segundo = 0, cont_terceiro = 0;
        //media livros das turmas
        double medialivro , soma;
        //saida do loop
        String opcao;
          
        do {
            //criando perfil do aluno
            System.out.println();
            System.out.print("Digite o nome do aluno ?\n");
            nome = entrada.nextLine();
            System.out.println();
            System.out.printf("Digite a idade do aluno %s :", nome);
            idade = entrada.nextInt();
            System.out.println();
            //entrada de escolha da serie
            System.out.printf("Digite a serie do aluno %s : "
                    + "(primeiro - 1, segundo - 2, terceiro - 3)\n", nome);
            serie = entrada.nextLine();

            if (serie.equalsIgnoreCase("1")) {
                cont_primeiro++;
            }
            if (serie.equalsIgnoreCase("2")) {
                cont_segundo++;
            }
            if (serie.equalsIgnoreCase("3")) {
                cont_terceiro++; //numero de alunos no terceiro
            }
            entrada.nextLine();
            System.out.printf("O aluno e do segundo (Sim-1 ou Nao-2)\n");
            aluno2 = entrada.nextLine();
            
        
            
            if (aluno2.equalsIgnoreCase("sim")) {
                System.out.printf("Quantos livros o aluno do segundo %s ler por mes \n",nome);
                livro2 = entrada.nextInt();
                
                cont_livro2++;
            } else if (aluno_que_leu_mais >= livro2) {
                aluno_que_leu_mais = livro2;

            } if (aluno2.equalsIgnoreCase("nao")){

                System.out.printf("Quantos livros o aluno %s le por mes ?\n", nome);
                livro = entrada.nextInt();
                cont_livro++;
            }
         soma = cont_livro + cont_livro2;
            //saida do loop
            System.out.println("Deseja sair do programa ?"
                    + "(sim - nao)");
            opcao = entrada.nextLine();
        entrada.nextLine();
        } while (opcao.equalsIgnoreCase("sim"));
        
        medialivro = soma/3;
        System.out.println();
        System.out.printf("A quantidade de alunos que está no terceiro ano %d;\n", cont_terceiro);
        System.out.printf("A maior quantidade de livros lidos por um aluno que está na segunda série %d ;\n",aluno_que_leu_mais);
        System.out.printf("A média de livros lidos pelos alunos (considerando todas as séries): %.2f \n ",medialivro);
    }

}