/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 17/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import static exerciciosn2.ExercicioN2_47.imprime_vetor;
import static exerciciosn2.ExercicioN2_47.intercala_vetores;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 53. Crie 2 vetores de inteiros A e B de tamanho 10 preenchidos aleatoriamente. Para
 * tal, utilize método: int sorteia (int limitInf, int limitSup) descrito abaixo que
 * recebe porparâmetro os limites inferior e superior dos valores gerados, tais limites
 * deverão ser informados pelo usuário (valide para que o limitInf seja menor que o
 * limitSup), e retorne um número neste intervalo. Em seguida crie vetores auxiliares que
 * sejam preenchidos pelos:
 *
 * a. O vetor Soma deverá ser preenchido pela soma dos elementos de A e B. Ex. A{1, 5}
 * B{3, 4} Soma {4, 9}.
 *
 * b. O vetor Intersecção deverá ser preenchido com os valores que estão em A e B ao mesmo
 * tempo. Ex. A{1, 5}, B{3, 5}, Interseccao{5}.
 *
 * c. O vetor Diferença deverá ser preenchido com valores que estão em A mas não estão em
 * B. Ex. A{1, 5}, B{3, 5}, Diferenca{1}.
 *
 * d. O vetor Intercalação deverá ser preenchido com a intercalação dos vetores A e B. Ex.
 * A {1, 5} e B {3, 4} Intercalacao {1, 3, 5, 4}.
 */
public class ExercicioN2_53 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        int a[], b[], limitInf, limitSup, intercalacao[], aux[], interseccao[];
        ArrayList soma, diferenca;
        String lb_superior;
        boolean existe_em_b;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        //Crie 2 vetores de inteiros A e B de tamanho 10
        a = new int[10];
        b = new int[a.length];
        soma = new ArrayList();
        diferenca = new ArrayList();
        lb_superior = "Limite superior: ";

        // Entrada
        System.out.print("Limite inferior: ");
        limitInf = sc.nextInt();

        do {
            // (valide para que o limitInf seja menor que o limitSup)
            System.out.print(lb_superior);
            limitSup = sc.nextInt();

            if (limitInf >= limitSup) {
                lb_superior = String.format("Limite superior inválido!\n"
                        + "Digite um valor maior que %d: ", limitInf);
            }
        } while (limitInf >= limitSup);

        // Processamento
        // 2 vetores de inteiros A e B de tamanho 10 preenchidos aleatoriamente
        a = preenche_vetor(a.length, limitInf, limitSup);
        b = preenche_vetor(b.length, limitInf, limitSup);

        interseccao = new int[0];
        for (int i = 0; i < a.length; i++) {
            /*
                a. O vetor Soma deverá ser preenchido pela soma dos elementos de A e B.
                Ex. A{1, 5} B{3, 4} Soma {4, 9}.
             */
            soma.add(a[i] + b[i]);

            // Procura o valor de a em b
            existe_em_b = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    existe_em_b = true;
                }
            }

            /*
                b. O vetor Intersecção deverá ser preenchido com os valores que estão 
                em A e B ao  mesmo tempo. Ex. A{1, 5}, B{3, 5}, Interseccao{5}.
                
                c. O vetor Diferença deverá ser preenchido com valores que estão em A mas 
                não estão em B.   Ex. A{1, 5}, B{3, 5}, Diferenca{1}.
             */
            if (existe_em_b) {
                interseccao = adiciona_ao_vetor(interseccao, a[i]);
            } else {
                diferenca.add(a[i]);
            }
        }

        /*
            d. O vetor Intercalação deverá ser preenchido com a intercalação dos vetores A e B. 
            Ex. A {1, 5} e B {3, 4} Intercalacao {1, 3, 5, 4}.
         */
        intercalacao = intercala_vetores(a, b);

        // Saída
        imprime_vetor("Elementos em a = ", a);
        imprime_vetor("Elementos em b = ", b);
        imprime_array_list("  soma (a + b) = ", soma);
        imprime_vetor("interseccao    = ", interseccao);
        imprime_array_list("diferenca      = ", diferenca);
        imprime_vetor("intercalacao   = ", intercalacao);
        System.out.println();

    }

    /**
     * Gera um número aleatório
     *
     * @param limiteInferior Limite inferior para o número aleatório
     * @param limiteSuperior Limite superior para o número aleatório
     * @return Inteiro randômico
     */
    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }

    /**
     * Preenche um vetor de inteiros com números aleatórios.
     *
     * @param posicoes Inteiro com a quantidade de posições do vetor a ser preenchido
     * @param limiteInferior Limite inferior para o número aleatório
     * @param limiteSuperior Limite superior para o número aleatório
     * @return Vetor de inteiros[posicoes]
     */
    public static int[] preenche_vetor(int posicoes, int limiteInferior, int limiteSuperior) {
        int ret[] = new int[posicoes];
        for (int i = 0; i < posicoes; i++) {
            ret[i] = sorteia(limiteInferior, limiteSuperior);
        }
        return ret;
    }

    /**
     * Soma dois vetores de MESMO tamanho.
     *
     * @param v1 Vetor com valores inteiros
     * @param v2 Vetor com valores inteiros
     * @return Vetor de inteiros com a soma de cada elemento de mesma posição em v1 e v2
     */
    public static int[] soma_vetores(int[] v1, int[] v2) {
        int ret[] = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            ret[i] = v1[i] + v2[i];
        }
        return ret;
    }

    public static void imprime_array_list(String label, ArrayList arrayList) {
        String saida = label + "[ ";

        for (Object n : arrayList) {
            saida += n + " ";
        }
        saida += "]";

        System.out.println(saida);
    }

    public static int[] adiciona_ao_vetor(int[] vetor, int valor) {
        int aux[] = new int[vetor.length];
        aux = vetor;  // Salva os valores de vetor em aux
        vetor = new int[aux.length + 1];  // Redimensiona vetor

        for (int j = 0; j < aux.length; j++) {
            vetor[j] = aux[j];    // refaz vetor com os valores de aux
        }
        vetor[vetor.length - 1] = valor; // adiciona o novo valor encontrado
        return vetor;
    }
}
