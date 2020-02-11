/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 18/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Random;
import java.util.Scanner;

/**
 * 60. Faça um programa que leia 4 notas de 5 alunos (identificados por um número entre 0
 * e 4), utilize uma matriz double 4x5 para armazenar as notas. A média das 4 notas dos 5
 * alunos deverá ser armazenado em um vetor (VA) de 5 posições. Crie também um vetor (VN)
 * de 4 posições que armazene a média de notas de cada bimestre. Escreva a matriz e os
 * vetores criados.
 */
/* 
    Nome    N1      N2      N3      N4      VA
    Aluno1  6,5     8,4     10,0    7,5     8,1
    Aluno2  4,5     2,1     8,6     6,0     5,3
    Aluno3  8,6     5,5     7,5     7,5     7,3
    Aluno4  9,5     10,0    8,0     9,0     9,1
    Aluno5  5,5     7,2     7,7     2,0     5,6
        VN  6,9     6,6     8,4     6,4
 */
public class ExercicioN2_60 {
// Declaração de variáveis

    static Scanner sc;
    static int qtd_notas = 4;
    static int qtd_alunos = 5;

    static int[] largura = new int[qtd_notas + 2];
    static char[] alinhamento = new char[qtd_notas + 2];

    static double notas[][] = new double[qtd_alunos][qtd_notas];
    static String tabela[][] = new String[qtd_alunos + 2][qtd_notas + 2]; // Matriz para mostrar o resultado
    static String entrada;
    static boolean invalido;
    static String[] opcoes = {"d", "a"}; // Opções de preenchimento da matriz

    static double va[] = new double[qtd_alunos];
    static double vn[] = new double[qtd_notas];

    public static void main(String[] args) {
        inicializa_variaveis();

        // Entrada
        entrada_de_notas();

        // Processamento
        medias_bimestres();
        popula_tabela_saida();

        // Saída
        imprime_matriz_string("\nNotas:", tabela, largura, alinhamento);
    }

    private static void inicializa_variaveis() {
        // Inicialização de variáveis
        sc = new Scanner(System.in);
        entrada = "";
        invalido = true;

        // Label das Colunas
        tabela[0][0] = "Nome";
        largura[0] = 9;
        alinhamento[0] = 'e';

        for (int i = 0; i < qtd_notas; i++) {
            tabela[0][i + 1] = "N" + (i + 1);
            largura[i + 1] = 6;
            alinhamento[i + 1] = 'd';
        }
        tabela[0][qtd_notas + 1] = "VA";
        largura[qtd_notas + 1] = 6;
        alinhamento[qtd_notas + 1] = 'd';

        // Label das Linhas
        for (int i = 0; i < qtd_alunos; i++) {
            tabela[i + 1][0] = "Aluno " + i;
        }
        tabela[qtd_alunos + 1][0] = "VN";
        tabela[qtd_alunos + 1][qtd_notas + 1] = ""; //ultima célula não tem nada mesmo
    }

    private static void entrada_de_notas() {

        do {
            invalido = true;
            System.out.print("\nInforme 'D' para digitar as notas e 'A' para preenchimento automáGico > ");
            entrada = sc.nextLine();

            if (ValidaInput.string_opcao_valida(entrada, 1, 1, opcoes, false)) {
                invalido = false;
                if (entrada.charAt(0) == 'd') {
                    digita_notas();
                } else {
                    automagicamente();
                }
            } else {
                System.out.printf("Opa! '%s' não é uma opção! Tente outra vez...\n", entrada);
            }
        } while (invalido);

    }

    private static void digita_notas() {
        // Entrada
        for (int i = 0; i < qtd_alunos; i++) {
            System.out.printf("\nAluno %d\n", i);
            for (int j = 0; j < qtd_notas; j++) {

                // Entrada das notas com validação
                do {
                    invalido = true;
                    System.out.printf("  Nota N%d: ", j + 1);
                    entrada = sc.nextLine();
                    if (ValidaInput.double_valido(entrada)) {
                        if (ValidaInput.double_no_intervalo(entrada, 0.0, 10.0)) {
                            notas[i][j] = Double.parseDouble(entrada);
                            invalido = false;
                            // Acumula as notas do aluno e do bimestre, para as médias
                            va[i] += notas[i][j]; // Acumula a nota do aluno na posição correspondente
                            vn[j] += notas[i][j]; // Acumula a nota do bimestre na posição correspondente
                        }
                    }

                    if (invalido) {
                        System.out.println("Nota inválida! Tente outra vez...");
                    }

                } while (invalido);
            } // Fim das notas do alunoN
            va[i] /= qtd_notas; // Média pela quantidade de notas do aluno
        }// Fim das notas de todos os alunos        
    }

    private static void automagicamente() {
        // Entrada
        for (int i = 0; i < qtd_alunos; i++) {
            for (int j = 0; j < qtd_notas; j++) {
                // Entrada das notas, automaGicamente
                notas[i][j] = sorteia_double(0.0, 10.0);
                va[i] += notas[i][j]; // Acumula a nota do aluno na posição correspondente
                vn[j] += notas[i][j]; // Acumula a nota do bimestre na posição correspondente
            } // Fim das notas do alunoN
            va[i] /= qtd_notas; // Média pela quantidade de notas do aluno
        }// Fim das notas de todos os alunos    
    }

    private static void medias_bimestres() {
        for (int i = 0; i < qtd_notas; i++) {
            vn[i] /= qtd_alunos; // Média do bimestre pela quantidade de alunos
        }
    }

    private static void popula_tabela_saida() {
        // Popula a tabela com a matriz de notas
        for (int i = 0; i < qtd_alunos; i++) {
            for (int j = 0; j < qtd_notas; j++) {
                tabela[i + 1][j + 1] = String.format(
                        ((notas[i][j] < 10.0) ? " %.1f" : "%.1f"), // Acrescenta espaço para nota < 10
                        notas[i][j]);
            }
        }
        // Popula a coluna de médias dos alunos com o vetor va
        for (int i = 0; i < qtd_alunos; i++) {
            tabela[i + 1][qtd_notas + 1] = String.format(
                    ((va[i] < 10.0) ? " %.1f" : "%.1f"), // Acrescenta espaço para nota < 10
                    va[i]);
        }

        // Popula a coluna de médias dos bimestres com o vetor vn
        for (int i = 0; i < qtd_notas; i++) {
            tabela[qtd_alunos + 1][i + 1] = String.format(
                    ((vn[i] < 10.0) ? " %.1f" : "%.1f"), // Acrescenta espaço para nota < 10
                    vn[i]);
        }
    }

    public static void imprime_matriz_string(String label, String[][] matriz, int[] largura, char[] alinhamento) {

        System.out.println(label);
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%s", StringUtils.alinha_texto(matriz[i][j], ' ', largura[j], alinhamento[j]));
            }
            System.out.print(" |\n");
        }
    }

    /**
     * Gera um número double aleatório
     *
     * @param limiteInferior Limite inferior para o número aleatório
     * @param limiteSuperior Limite superior para o número aleatório
     * @return Decimal randômico
     */
    public static double sorteia_double(double limiteInferior, double limiteSuperior) {
        Random rd = new Random();
        double ret = limiteInferior + rd.nextDouble() * (limiteSuperior - limiteInferior);

        return (ret > limiteSuperior) ? limiteSuperior : ret;
    }
}
