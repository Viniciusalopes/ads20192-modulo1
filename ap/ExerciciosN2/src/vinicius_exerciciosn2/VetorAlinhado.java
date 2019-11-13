/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 16/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * ---------------------------------------------------------------------------------------
 */
package vinicius_exerciciosn2;

/**
 *
 * @author vovoubuntu
 */
public class VetorAlinhado {

    public static void main(String[] args) {
        // Declaração dos vetores
        double banana[] = {100.0, 9.0, 22.5, 100.0, 9.0, 22.5, 100.0, 9.0, 22.5};
        double eitalala[] = {9.0, 22.5, 100.0, 9.0, 22.5, 200.0, 19.0, 2.5, 2.5};

        // Impressão
        System.out.println();

        imprime_vetor(banana);
        System.out.println();

        imprime_vetor(eitalala);
        System.out.println();
    }

    /**
     * Imprime um vetor passado por parâmetro
     *
     * @param vetor Vetor que é passado por parâmetro
     */
    public static void imprime_vetor(double[] vetor) {
        // Número em texto
        String numero = "";

        // Tamanho do maior número em texto
        int maior = 0;

        // acha o double que vai ter o maior tamanho em string
        for (int i = 0; i < vetor.length; i++) {
            // Converte o double para texto 
            numero = Double.toString(vetor[i]);

            // Verifica se o valor do vetor[i] é o maior texto
            if (i == 0) {
                // Se for a primeira posição, então é o maior, porque ainda não viu outros
                maior = numero.length(); // numero.length() = tamanho da string do numero
            } else {
                // Se não for o primeiro, verifica se vetor[i], convertido para string, é o maior tamanho
                if (numero.length() > maior) {
                    maior = numero.length();
                }
            }
        }

        // Imprimir
        System.out.print("{ ");
        for (int i = 0; i < vetor.length; i++) {

            // tamanho da string do numero em vetor[i]
            numero = Double.toString(vetor[i]);

            while (numero.length() < maior) {
                // Enquanto o tamanho da string vetor[i] for menor que a maior string
                //      encontrada no laço anterior
                numero = " " + numero; // acrescenta espaços antes da string
            }
            System.out.print(numero + " | "); // imprime o numero, com o tamanho da maior string
        }
        System.out.print(" }");
    }
}
