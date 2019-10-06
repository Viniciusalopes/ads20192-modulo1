/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import static exerciciosn2.ExercicioN2_19.erro;
import static exerciciosn2.ExercicioN2_19.nota_valida;
import static exerciciosn2.ExercicioN2_20.repete;
import java.util.Scanner;

/**
 * 26. Faça um programa que receba duas notas de cada um dos 5 alunos de uma turma,
 * calcule e imprima a média aritmética de cada aluno e imprima uma mensagem
 */
public class ExercicioN2_26 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        double n1, n2, media;

        // Inicialização de variáveis
        sc = new Scanner(System.in);

        System.out.println();
        for (int i = 0; i < 5; i++) {
            media = 0;
            do {    // } while (!nota_valida(n1));
                System.out.printf("Entre com a 1ª nota do %dº aluno: ", i + 1);
                n1 = sc.nextDouble();

                if (!nota_valida(n1)) {
                    erro();
                }
            } while (!nota_valida(n1));

            // Entrada da segunda nota
            do {    // } while (!nota_valida(n2));
                System.out.printf("Entre com a 2ª nota do %dº aluno: ", i + 1);
                n2 = sc.nextDouble();

                if (!nota_valida(n2)) {
                    erro();
                }
            } while (!nota_valida(n2));

            // Processamento
            media = (n1 + n2) / 2;

            // Saída
            System.out.printf("Média do aluno: %.2f\n", media);
            System.out.println(repete("-", 45));
        }
    }
}
