/*
 O IBOPE encomendou-lhe um programa para registrar as pesquisas das eleições entre
 os candidatos 1, 2 e 3. Faça um programa que dado o candidato escolhido (1, 2 ou 3), a
 idade e o sexo do eleitor(a) (1-mulher, 2-homem), para um número indeterminado de
 eleitores, calcule e escreva:
 a) Qual o candidato mais votado
 b) Qual a média de idade entre os eleitores do candidato mais votado
 c) Qual o candidato preferido dos homens
 */
package exerciciosn2;

/**
 *
 * @author Computador
 */
import java.util.Scanner;

/**
 * e la vamos nos mais uma vez
 */
public class Exercicio_33_desafio {

    public static void main(String[] args) {
        Scanner desafio = new Scanner(System.in);
        //varivel candidato
        int candidato_1 = 0, candidato_2 = 0, candidato_3 = 0;
        String candidato = null;
        //idade 
        int idade, soma_idade = 0;
        //votos 
        int numero_votos;
        //cantidato com maior numero de votos 
        int maior = 0;
        //verificaçao de candidatos prefridos pelos homens
        int homen1 = 0, homen2 = 0, homen3 = 0, candidato_preferido_homens = 0;
        //media de idade
        double media_idade = 0;
        //opcao de saida
        String opcao, sexo;
        //=================
        do {
            System.out.println();
            System.out.println("===================================================");
            System.out.println("=======================IBOPE=======================");
            //entrada de escolha do candidato
            System.out.println("Escolha um dos candidatos a seguir (1 , 2 , 3");
            candidato = desafio.nextLine();
            //empregando opçoes
            if (candidato.equalsIgnoreCase("1")) {
                candidato_1++;
                homen1++;
            }
            if (candidato.equalsIgnoreCase("2")) {
                candidato_2++;
                homen2++;
            }
            if (candidato.equalsIgnoreCase("3")) {
                candidato_3++;
                homen3++;
            }
            //verificaçao da preferencia dos homens
            if (homen1 > candidato_preferido_homens) {
                candidato_preferido_homens = homen1;
            }
            if (homen2 > candidato_preferido_homens) {
                candidato_preferido_homens = homen2;
            }
            if (homen3 > candidato_preferido_homens) {
                candidato_preferido_homens = homen3;
            }
            //pegando imformaçoes de idade
            System.out.println("Qual a idade do eleitor");
            idade = desafio.nextInt();
            //soma das idades para se ter a media
            soma_idade = soma_idade + idade;
            //lixo 
            desafio.nextLine();
            //verificaçao de sexo do usuario
            System.out.println("Qual o sexo do usuario (1-mulher, 2-homem)");
            sexo = desafio.nextLine();

            if (sexo.equalsIgnoreCase("2")) {

            }
            //media das idades
            media_idade = ((soma_idade) / (candidato_1 + candidato_2 + candidato_3));
            //verificaçao do numeros de votos , do maiot candidato
            if (candidato_1 > maior) {
                maior = candidato_1;
            }
            if (candidato_2 > maior) {
                maior = candidato_2;
            }
            if (candidato_3 > maior) {
                maior = candidato_3;
            }
            //saida do programa 
            System.out.println("Deseja sair do programa ? (sim/nao)");
            opcao = desafio.nextLine();
            System.out.println("===================================================");

        } while (opcao.equalsIgnoreCase("nao"));
        numero_votos = candidato_1 + candidato_2 + candidato_3;
        //saida de dados pos fim do programa
        System.out.println();
        System.out.println("===================================================");

        System.out.printf("O mais vototado e %d \n", maior);

        System.out.printf("O numero de votos e %d \n", numero_votos);

        System.out.printf("A media de idades dos eleitores é %.2f \n", media_idade);

        System.out.printf("O candidato preferido dos homens é %d \n", candidato_preferido_homens);

        System.out.println("===================================================");
        System.out.println();
    }

}
