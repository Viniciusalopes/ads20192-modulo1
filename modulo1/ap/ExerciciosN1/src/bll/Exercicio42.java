/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 22/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 42. Escreva um algoritmo para ler os valores de A, B, C e X e calcular o
 * valor de Y usando uma das fórmulas abaixo. Seu algoritmo deve perguntar qual
 * o código da fórmula a ser usada e imprimir os resultados. Deve ser incluída
 * uma verificação para garantir que não ocorra divisão por zero e emitir
 * mensagem, caso ocorra.
 */
// CÓDIGO   FÓRMULA
//    1     Y = (Ax² - Bx + C) / (Bx - C)
//    2     Y = Ax² + Bx + C
//    3     Y = (Ax + Cx³) / (4x)
//    4     Y = Bx⁴ - 1
//
public class Exercicio42 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        InputMismatchException erro = new InputMismatchException("Valor inválido para o código da fórmula!");
        int opcao;
        double a, b, c, x, y, delta;
        String texto_saida = "";
        a = b = c = 0;

        try {
            // Entrada
            System.out.println();
            System.out.print("CÓDIGO\tFÓRMULA\n"
                    + "   1\tY = (Ax² - Bx + C) / (Bx - C)\n"
                    + "   2\tY = Ax² + Bx + C\n"
                    + "   3\tY = (Ax + Cx³) / (4x)\n"
                    + "   4\tY = Bx⁴ - 1"
                    + "\n\nDigite o código da fórmula: ");
            opcao = sc.nextInt();

            System.out.println();

            // Valida a opção
            if (opcao < 1 || opcao > 4) {
                throw new InputMismatchException("'" + opcao + "' não é uma opção.");
            }

            if (opcao != 4) {   // A fórmula 4 não utiliza A
                erro = new InputMismatchException("Valor inválido para A.");
                System.out.print("Valor de A: ");
                a = sc.nextDouble();
            }

            if (opcao != 3) {   // A fórmula 3 não utiliza B
                erro = new InputMismatchException("Valor inválido para B.");
                System.out.print("Valor de B: ");
                b = sc.nextDouble();
            }

            if (opcao != 4) {   // A fórmula 4 não utiliza C
                erro = new InputMismatchException("Valor inválido para C.");
                System.out.print("Valor de C: ");
                c = sc.nextDouble();
            }

            erro = new InputMismatchException("Valor inválido para X.");
            System.out.print("Valor de X: ");
            x = sc.nextDouble();

            if (opcao == 3 && x == 0.0) {
                erro = new InputMismatchException("Não é possível resolver esta equação.\n"
                        + "(4x) = 0, e não pode ser um divisor.");
                throw new InputMismatchException(texto_saida);
            }

            System.out.println();

            // Processamento
            switch (opcao) {
                case 1:
                    // Fórmula 1     Y = (Ax² - Bx + C) / (Bx - C)
                    texto_saida += "Y = (Ax² - Bx + C) / (Bx - C)\n";
                    texto_saida += "Y = ((A * x²) - (B * x) + C) / ((B * x) - C)\n";
                    texto_saida += "Y = ((" + decimais(a) + " * " + parenteses(x) + "²) - (" + decimais(b) + " * " + parenteses(x) + ") + " + parenteses(c) + ") / ((" + decimais(b) + " * " + parenteses(x) + ") - " + parenteses(c) + ")\n";
                    texto_saida += "Y = ((" + decimais(a) + " * " + parenteses(Math.pow(x, 2)) + ") - " + parenteses(b * x) + " + " + parenteses(c) + ") / (" + parenteses(b * x) + " - " + parenteses(c) + ")\n";
                    texto_saida += "Y = (" + decimais(a * Math.pow(x, 2)) + " - " + parenteses(b * x + c) + ") / " + parenteses((b * x - c)) + "\n";

                    if (b * x - c == 0.0) {
                        erro = new InputMismatchException("Não é possível resolver esta equação.\n"
                                + "(Bx - C) = 0, e não pode ser um divisor.");
                        throw new InputMismatchException();
                    }

                    texto_saida += "Y = " + decimais(a * Math.pow(x, 2) - (b * x + c)) + " / " + parenteses((b * x - c)) + "\n";
                    texto_saida += "Y = " + decimais((a * Math.pow(x, 2) - (b * x + c)) / (b * x - c)) + "\n";

                    break;
                case 2:
                    // Fórmula 2     Y = Ax² + Bx + C
                    texto_saida += "Y = Ax² - Bx + C\n";
                    texto_saida += "Y = (A * x²) - (B * x) + C\n";
                    texto_saida += "Y = (" + decimais(a) + " * " + parenteses(x) + "²) - (" + decimais(b) + " * " + parenteses(x) + ") + " + parenteses(c) + "\n";
                    texto_saida += "Y = (" + decimais(a) + " * " + parenteses(Math.pow(x, 2)) + ") - " + parenteses(b * x) + " + " + parenteses(c) + "\n";
                    texto_saida += "Y = " + decimais(a * Math.pow(x, 2)) + " - " + parenteses(b * x) + " + " + parenteses(c) + "\n";
                    texto_saida += "Y = " + decimais((a * Math.pow(x, 2)) - (b * x) + c) + "\n";
                    break;
                case 3:
                    // Fórmula 3     Y = (Ax + Cx³) / (4x)
                    texto_saida += "Y = (Ax + Cx³) / (4x)\n";
                    texto_saida += "Y = ((A * x) + (C * x³)) / (4 * x)\n";
                    texto_saida += "Y = ((" + decimais(a) + " * " + parenteses(x) + ") + (" + decimais(c) + " * " + parenteses(x) + "³)) / (4 * " + parenteses(x) + ")\n";
                    texto_saida += "Y = (" + decimais(a * x) + " + (" + decimais(c) + " * " + parenteses(Math.pow(x, 3)) + ")) / " + parenteses(4 * x) + "\n";
                    texto_saida += "Y = " + decimais(a * x) + " + " + parenteses(c * Math.pow(x, 3)) + " / " + parenteses(4 * x) + "\n";
                    texto_saida += "Y = " + decimais((a * x) + (c * Math.pow(x, 3)) / (4 * x)) + "\n";
                    break;
                case 4:
                    // Fórmula 4     Y = Bx⁴ - 1
                    texto_saida += "Y = Bx⁴ - 1\n";
                    texto_saida += "Y = B * x⁴ - 1\n";
                    texto_saida += "Y = " + decimais(b) + " * " + parenteses(x) + "⁴ - 1\n";
                    texto_saida += "Y = " + decimais(b) + " * " + parenteses(Math.pow(x, 4)) + " - 1\n";
                    texto_saida += "Y = " + decimais(b * Math.pow(x, 4)) + " - 1\n";
                    texto_saida += "Y = " + decimais((b * Math.pow(x, 4)) - 1) + "\n";
                    break;
                default:
                    break;
            }

            // Saída
            System.out.println(texto_saida);
            
        } catch (InputMismatchException e) { // Trata erros de input
            System.out.println();
            System.out.print((e.getMessage() != null) ? e.getMessage() + "\n" : "\n");
            System.out.print(erro.getMessage() + "\n");
        }
    }

    /**
     *
     * @param numero Número decimal
     * @return Retorna o número entre parenteses caso o número seja < 0
     */
    public static String parenteses(double numero) {
        return (numero < 0) ? "(" + decimais(numero) + ")" : decimais(numero);
    }

    /**
     *
     * @param numero Número decimal
     * @return Retorna sem casas decimais caso os decimais sejam == 0
     * @return Retorna com 2 casas decimais caso os decimais sejam > 0
     */
    public static String decimais(double numero) {
        return String.format((numero % 1 == 0) ? "%.0f" : "%.2f", numero);
    }

}
