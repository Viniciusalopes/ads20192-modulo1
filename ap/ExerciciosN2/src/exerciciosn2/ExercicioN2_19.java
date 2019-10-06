/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 19. Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de um
 * número indeterminado de alunos. Calcule e mostre:
 */
/* 
    a. A média aritmética das 2 notas lidas; 
    b. Uma mensagem de acordo com as regras: 
        Até 3 * (Reprovado);
        Entre 3 e 7 (Exame);
        de 7 para cima (Aprovado);
    c. O total de alunos; 
    d. Quantidade de alunos Aprovados, Reprovados e de Exame. 
    e. A Média da classe.
 */
public class ExercicioN2_19 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        String continuar;
        int cont_alunos, aprovados, reprovados, exame;
        double n1, n2, media, soma_classe, media_classe;

        // Inicialização de variáveis
        continuar = "sim";
        cont_alunos = 0;
        aprovados = reprovados = exame = 0;
        soma_classe = media_classe = 0;

        do {    // } while (continuar.equalsIgnoreCase("s"));
            sc = new Scanner(System.in);
            cont_alunos++;
            // Entrada da primeira nota
            do {    // } while (!nota_valida(n1));
                System.out.printf("Entre com a 1ª nota do %dº aluno: ", cont_alunos);
                n1 = sc.nextDouble();

                if (!nota_valida(n1)) {
                    erro();
                }
            } while (!nota_valida(n1));

            // Entrada da segunda nota
            do {    // } while (!nota_valida(n2));
                System.out.printf("Entre com a 2ª nota do %dº aluno: ", cont_alunos);
                n2 = sc.nextDouble();

                if (!nota_valida(n2)) {
                    erro();
                }
            } while (!nota_valida(n2));

            // Processamento
            //  a. A média aritmética das 2 notas lidas;
            media = (n1 + n2) / 2;
            System.out.printf("Média do aluno: %.2f\n", media);

            /*
                b. Uma mensagem de acordo com as regras: 
                    Até 3 * (Reprovado);
                    Entre 3 e 7 (Exame);
                    de 7 para cima (Aprovado);
             */
            if (media < 3.0) {
                reprovados++;
                System.out.println("Situação: Reprovado.\n");
            } else if (media < 7.0) {
                exame++;
                System.out.println("Situação: em Exame.\n");
            } else {
                aprovados++;
                System.out.println("Situação: Aprovado.\n");
            }

            soma_classe += n1 + n2;

            // Continuar
            do {    // } while (!resposta_valida(continuar));
                System.out.print("Continuar [S,n]? ");
                continuar = sc.next();
                if (!resposta_valida(continuar)) {
                    System.out.println("Resposta inválida!");
                }
            } while (!resposta_valida(continuar));
            System.out.println(repete("-", 35));

        } while (continuar.equalsIgnoreCase("s"));

        // (cont_alunos * 2) porque cada aluno tem duas notas
        media_classe = soma_classe / (cont_alunos * 2);

        // Saída
        //  c. O total de alunos; 
        System.out.printf("Total de alunos  : %d\n", cont_alunos);

        //  d. Quantidade de alunos Aprovados, Reprovados e de Exame. 
        System.out.printf(
                "Alunos Aprovados : %d\n"
                + "Alunos Reprovados: %d\n"
                + "Alunos em Exame  : %d\n",
                aprovados, reprovados, exame
        );

        //  e. A Média da classe.
        System.out.printf("Média da classe  : %.2f\n", media_classe);
    }

    /**
     * Validação da nota
     *
     * @param nota
     * @return boolean
     */
    public static boolean nota_valida(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            return false;
        }
        return true;
    }

    /**
     * @ Valida resposta
     * @param resposta sim ou não
     * @return boolean
     */
    public static boolean resposta_valida(String resposta) {
        if (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n")) {
            return false;
        }
        return true;
    }

    /**
     * @ Imprime mensagem de erro no console
     */
    public static void erro() {
        System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
    }

    /**
     * Repetição de textos
     *
     * @param texto Texto a ser repetido
     * @param vezes Quantidade de repetições
     * @return String texto*vezes
     */
    public static String repete(String texto, int vezes) {
        String ret = "";
        for (int i = 0; i < vezes; i++) {
            ret += texto;
        }
        return ret;
    }
}
