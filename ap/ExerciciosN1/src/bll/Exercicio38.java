/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 38. Desenvolva um programa para calcular e imprimir o preço final de um
 * carro. O valor do preço inicial de fábrica é informado pelo usuário, porém o
 * usuário ainda poderá acrescentar novos recursos cujo os preços estão
 * descritos. O valor total do carro deverá ser o preço inicial de fábrica mais
 * o valor de cada recurso adicionado.
 */
// i.   Ar condicionado      – R$ 1750,00 
// ii.  Pintura metálica     – R$  800,00
// iii. Vidro Elétrico       – R$ 1200,00
// iv.  Direção Hidráulica   – R$ 2000,00
//
public class Exercicio38 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        char acrescentar;
        double preco;

        // Entrada
        System.out.println();
        System.out.print("Digite o valor de fábrica do veículo: ");
        preco = sc.nextDouble();

        // Processamento com novas entradas
        // Ar condicionado
        System.out.print("Deseja acrescentar AR CONDICIONADO?    [S/n]: ");
        acrescentar = sc.next().charAt(0);
        if (acrescentar == 's' || acrescentar == 'S') {
            preco += 1750.0;
        }
        // Pintura metálica
        System.out.print("Deseja acrescentar PINTURA METÁLICA?   [S/n]: ");
        acrescentar = sc.next().charAt(0);
        if (acrescentar == 's' || acrescentar == 'S') {
            preco += 800.0;
        }
        // Vidro Elétrico
        System.out.print("Deseja acrescentar VIDROS ELÉTRICOS?   [S/n]: ");
        acrescentar = sc.next().charAt(0);
        if (acrescentar == 's' || acrescentar == 'S') {
            preco += 1200.0;
        }
        // Direção Hidráulica
        System.out.print("Deseja acrescentar DIREÇÃO HIDRÁULICA? [S/n]: ");
        acrescentar = sc.next().charAt(0);
        if (acrescentar == 's' || acrescentar == 'S') {
            preco += 2000.0;
        }

        // Saída
        System.out.println();
        System.out.printf("Preço final do veículo: R$ %.2f\n", preco);
    }
}
