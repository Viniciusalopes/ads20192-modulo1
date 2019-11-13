/*
 51. Escreva um programa que leia dois vetores –
 V1 e V2 – cada um com N(N<=10)
 valores reais e um terceiro vetor –
 Op - com N valores do tipo caracter. Seu programa
 deve gerar um vetor – 
 Resul como sendo o resultado das operações de V1 com V2, onde
 o código da operação está no vetor Op nas respectivas posições.
 V1
 4 7 10 12 3
 V2
 8 13 10 18 30
 Op
 + - * + *
 Resul
 12 -6 100 30 90
 */
package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_51 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //vetor 1 em variavel real
        double vet1[] = new double[5];
        //vetor 1 em variavel real
        double vet2[] = new double[vet1.length];
        //vetor do operador e char
        char operador[] = new char[vet1.length];
        //vetor do resultado 
        double[] resul = new double[vet1.length];
        //variavel de saidada e vaçidaçao se a condiçao e verdadeira ou falsa -
        boolean sair = false;
        String OPERADORES = null;

        for (int i = 0; i < vet1.length; i++) {
            //entrada vetor 1
            System.out.println("===================================================");
            System.out.println("¨¨PRIMEIRO¨¨VETOR¨¨");
            System.out.println("INSIRA O PRIMEIRO VALOR NA POSIÇAO" + i);
            System.out.println("===================================================");
            vet1[i] = entrada.nextDouble();
            System.out.println();

            //entrada vetor 2          
            System.out.println("===================================================");
            System.out.println("¨¨SEGUNDOO¨¨VETOR¨¨");
            System.out.println("INSIRA O SEGUNDO VALOR NA POSIÇAO" + i);
            System.out.println("===================================================");
            vet2[i] = entrada.nextDouble();
            System.out.println();

            // Caso Elemeto vetor 2 seja 0 não pode entra na divisão
            if (vet2[i] == 0) {
                System.out.println("===================================================");
                OPERADORES = "\n[+] SOMA\n[-] SUBTRAÇÃO\n[*] MULTIPLICAÇÃO\n";
                System.out.println("===================================================");
            } else {
                System.out.println("===================================================");
                OPERADORES = "\n[+] SOMA\n[-] SUBTRAÇÃO\n[*] MULTIPLICAÇÃO\n[/] DIVISÃO\n";
                System.out.println("===================================================");
            }

            do {
                sair = false;
                System.out.printf(OPERADORES);
            //laço de repetiçao usado para dar a condiçao 
                //dos operadores

                //se o numero for 0 ele nao pode ser divido
                //entao nao vai entrar na primeira coondiçao
                operador[i] = entrada.next().charAt(0);
                if (vet2[i] == 0) {
                    if ((operador[i] == '+') || (operador[i] == '-') || (operador[i] == '*')) {
                        sair = true;
                    } else {
                        //se o operador for
                        //diferente vai ser dado uma respota de operador i nvalido
                        System.out.printf("Operador inválido!\n");
                    }

                } else {
                    //se o operador for
                    //diferente vai ser dado uma respota de operador i nvalido

                    if ((operador[i] == '+') || (operador[i] == '-') || (operador[i] == '*') || (operador[i] == '/')) {
                        sair = true;
                    } else {
                        System.out.printf("Operador inválido!\n");
                    }

                }

            } while (!sair);//para a escolha do operador

            switch (operador[i]) {
                case '+':
                    System.out.println("===================================================");
                    resul[i] = vet1[i] + vet2[i];
                    break;

                case '-':
                    System.out.println("===================================================");
                    resul[i] = vet1[i] - vet2[i];
                    break;

                case '*':
                    System.out.println("===================================================");
                    resul[i] = vet1[i] * vet2[i];
                    break;

                case '/':
                    System.out.println("===================================================");
                    resul[i] = vet1[i] / vet2[i];
                    break;

            }
            System.out.printf("%.2f\n", resul[i]);
            System.out.println("===================================================");
        }
        //saida do vetor 1
        System.out.println("===================================================");
        System.out.printf("vet1[]  = { ");
        for (int i = 0; i < vet1.length; i++) {
            if (i == vet1.length - 1) {
                System.out.printf("%.2f", vet1[i]);
                System.out.println("===================================================");
            } else {
                System.out.printf("%.2f\t", vet1[i]);
                System.out.println("===================================================");
            }
        }
        System.out.printf(" }\n");
        System.out.println("===================================================");
        //saida do vetor 2
        System.out.println("===================================================");
        System.out.printf("vet2[]  = { ");
        for (int i = 0; i < vet1.length; i++) {
            if (i == vet1.length - 1) {
                System.out.printf("%.2f", vet2[i]);
                System.out.println("===================================================");
            } else {
                System.out.printf("%.2f\t", vet2[i]);
                System.out.println("===================================================");
            }
        }
        System.out.printf(" }\n");
        System.out.println("===================================================");
        //saida do perador
        System.out.println("===================================================");
        System.out.printf("operadpr[]  = { ");
        for (int i = 0; i < vet1.length; i++) {
            if (i == vet1.length - 1) {
                System.out.printf(" %s ", operador[i]);
                System.out.println("===================================================");
            } else {
                System.out.printf(" %s ", operador[i]);
                System.out.println("===================================================");
            }
            System.out.printf(" ");
        }
        System.out.printf(" }\n");
        System.out.println("===================================================");
        //saida do resultadp
       System.out.println("===================================================");
        System.out.printf("resul[]  = { ");
        for (int i = 0; i < vet1.length; i++) {
            if (i == vet1.length - 1) {
                System.out.printf("%.2f", resul[i]);
                System.out.println("===================================================");
            } else {
                System.out.printf("%.2f\t", resul[i]);
                System.out.println("===================================================");
            }

        }
        System.out.printf(" }\n");
        System.out.println("===================================================");

    }

}
