/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 05/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 8. Escrever um programa que calcule todos os números inteiros divisíveis por um certo
 * valor indicado pelo usuário, e compreendidos em um intervalo também especificado pelo
 * usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após
 * ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
 * Usar o comando While. Exemplo: Valor do divisor: 3; Inicio do Intervalo: 17; Fim do
 * Intervalo: 29; Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24,
 * 27.
 */
public class ExercicioN2_8 {

    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int divisor, valor_inicial, valor_final, cont;
        divisor = valor_inicial = valor_final = cont = 0;
        String divisiveis = "";
        boolean invalido = true;

        // Entrada do divisor
        System.out.println();
        while (invalido) {
            System.out.print("Informe valor para o divisor: ");
            divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Valor inválido!\n");
            } else {
                invalido = false;
            }
        }
        // Inicia a composição da saída
        divisiveis += String.format("Números_divisíveis_por_%d_no_intervalo_", divisor);

        // Entrada do valor_inicial
        System.out.print("Informe um valor para o início do intervalo: ");
        valor_inicial = sc.nextInt();

        // Inclui valor_inicial no texto de saída
        divisiveis += String.format("de_%d_", valor_inicial);

        // Entrada do valor_final
        invalido = true;
        while (invalido) {
            System.out.print("Informe um valor para o final do intervalo : ");
            valor_final = sc.nextInt();

            if (valor_final <= valor_inicial) {
                System.out.println("Valor inválido!\n");
            } else {
                invalido = false;
            }
        }

        // Inclui valor_final no texto de saída
        divisiveis += String.format("a_%d:_", valor_final);

        // Processamento
        while (valor_inicial <= valor_final) {
            if (valor_inicial % divisor == 0) {
                divisiveis += String.format("%s ", valor_inicial);
                cont++;
            }
            valor_inicial++;
        }

        // Finaliza o texto de saída
        if (cont == 0) {
            divisiveis += "Nenhum.";
        } else {
            divisiveis = divisiveis.trim().replace(" ", ", ") + '.';
        }

        divisiveis = divisiveis.replace('_', ' ');
        // Saída
        System.out.println();
        System.out.println(divisiveis);
    }
}
