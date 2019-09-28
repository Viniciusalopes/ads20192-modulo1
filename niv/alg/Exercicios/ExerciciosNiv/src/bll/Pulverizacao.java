/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 28/09/2019
 * Projeto   : ExerciciosNiv
 * Finalidade: Exercícios de Nivelamento de Algorítimos e Lógica
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * A Companhia de Pulverização Faz Tudo Ltda utiliza aviões para pulverizar
 * lavouras. Os custos de pulverização dependem do tipo de praga e da área
 * contratada conforme o esquema:
 */
//  Tipo 1: Pulverização contra ervas daninhas; R$  5,00
//  Tipo 2: Pulverização contra ervas daninhas; R$ 10,00
//  Tipo 3: Pulverização contra ervas daninhas; R$ 15,00
//  Tipo 4: Pulverização contra ervas daninhas; R$ 25,00
/*
    Se a área a ser pulverizada é maior que 300 acres, o fazendeiro recebe um desconto de 5%.
    Em adição, qualquer fazendeiro cujo custo total, sem desconto, ultrapasse R$ 1.750,00 recebe
    um desconto de 10% sobre o valor que ultrapassar os R$ 1.750,00.
    Se ambos os descontos se aplicam, aquele relacionado a área é calculado em primeiro lugar.
    
    Preparar um programa que leia as seguintes informações:
    - Nome do fazendeiro;
    - Tipo de pulverização (de 1 a 4);
    - Área a ser pulverizada.

    O programa ainda deve calcular o custo final da pulverização e escrever:
    "O fazendeiro, _(nome do fazendeiro)_, pagará pelo serviço de pulverização de R$ ____,__."
 */
public class Pulverizacao {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variaveis
        Scanner sc = new Scanner(System.in);
        String nome;
        int tipo;
        double area, preco, custo, desconto_area, desconto_custo, custo_final;

        // Entrada
        System.out.println();

        // Nome
        System.out.print("Nome do fazendeiro: ");
        nome = sc.nextLine();

        // Tipo
        System.out.println();
        System.out.print(" TIPOS DE PULVERIZAÇÃO:\n"
                + "      ---------------------------"
                + " 1: Pulverização contra ervas daninhas (R$  5,00)\n"
                + " 2: Pulverização contra ervas daninhas (R$ 10,00)\n"
                + " 3: Pulverização contra ervas daninhas (R$ 15,00)\n"
                + " 4: Pulverização contra ervas daninhas (R$ 25,00)\n\n"
                + "Informe o tipo de pulverização: ");
        tipo = sc.nextInt();

        // Área
        System.out.print("Área a ser pulverizada (em acres): ");
        area = sc.nextDouble();

        // Processamento
        preco = 0.0;

        switch (tipo) {
            case 1:
                preco = 5.0;
                break;
            case 2:
                preco = 10.0;
                break;
            case 3:
                preco = 15.0;
                break;
            case 4:
                preco = 25.0;
                break;
        }

        custo = preco * area;

        if(custo > 1750.0){
            
        }
        
        if (area > 300.0) {
            custo_final = custo * 0.95;
        }

        // Saída
        System.out.println();
    }
}
