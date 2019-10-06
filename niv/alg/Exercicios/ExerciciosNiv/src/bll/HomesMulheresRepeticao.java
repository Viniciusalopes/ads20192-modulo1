/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosNiv
 * Finalidade: Exercícios de Nivelamento de Algorítimos e Lógica
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/*
 * Faça um programa para ler o sexo (1-masculino, 2-feminino) e a altura de um grupo
 * pessoas. O programa deverá calcular: 
    A altura média das mulheres e a altura média dos homens; 
    A maior e a menor altura do grupo, dizendo se a altura é de um homem ou de uma mulher. 
    O programa deverá finalizar quando o usuário informar que o grupo de pessoas terminou
 */
public class HomesMulheresRepeticao {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);

        // Declaração
        int cont, continuar, sexo,
                homens, mulheres,
                soma_altura_homens, soma_altura_mulheres,
                sexo_maior, sexo_menor;

        double altura, media_homens, media_mulheres, maior, menor;

        // Atribuição
        continuar = 1;
        cont = 1;

        homens = mulheres
                = soma_altura_homens = soma_altura_mulheres
                = sexo_maior = sexo_menor = 0;

        maior = menor = 0;

        while (continuar != 2) {
            // Entrada
            do {
                System.out.print("\nDigite o sexo (1-masc ou 2-fem): ");
                sexo = sc.nextInt();

                if (sexo != 1 && sexo != 2) {
                    System.out.println("Sexo inválido!\n");
                }
            } while (sexo != 1 && sexo != 2);

            System.out.print("Informe a altura: ");
            altura = sc.nextDouble();

            // Processamento
            if (sexo == 1) {
                homens++;
                soma_altura_homens += altura;
            } else {
                mulheres++;
                soma_altura_mulheres += altura;
            }

            if (cont == 1) {
                maior = altura;
                menor = altura;
                sexo_maior = sexo;
                sexo_menor = sexo;
            }

            if (altura > maior) {
                maior = altura;
                sexo_maior = sexo;
            }

            if (altura < menor) {
                menor = altura;
                sexo_menor = sexo;
            }

            do {
                // Continuar o laço?
                System.out.print("Deseja continuar ('1-Sim, 2-Não)? ");
                continuar = sc.nextInt();

                if (continuar < 1 || continuar > 2) {
                    System.out.println("Resposta inválida!\n");
                }
            } while (continuar < 1 || continuar > 2);

            cont++;
        } // while (continuar != 2) 

        // Médias
        // A altura média das mulheres e a altura média dos homens; 
        media_homens = soma_altura_homens / homens;
        media_mulheres = soma_altura_mulheres / mulheres;

        // Saída
        /*
        A altura média das mulheres e a altura média dos homens; 
        A maior e a menor altura do grupo, dizendo se a altura é de um homem ou de uma mulher. 
        O programa deverá finalizar quando o usuário informar que o grupo de pessoas terminou
         */
        System.out.println();
        System.out.printf("Altura média dos homens: %.2f\n", media_homens);
        System.out.printf("Altura média das mulheres: %.2f\n", media_mulheres);
        System.out.printf("A maior altura (%.2f) é de um%s.\n", maior, (sexo_maior == 1) ? " homem" : "a mulher");
        System.out.printf("A menor altura (%.2f) é de um%s.\n", menor, (sexo_menor == 1) ? " homem" : "a mulher");
    }
}
