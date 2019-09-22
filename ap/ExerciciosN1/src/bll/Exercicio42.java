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
            System.out.print("CÓDIGO\t\tFÓRMULA\n"
                    + "   1\t\tY = (Ax² - Bx + C) / (Bx - C)\n"
                    + "   2\t\tY = Ax² + Bx + C\n"
                    + "   3\t\tY = (Ax + Cx³) / (4x)\n"
                    + "   4\t\tY = Bx⁴ - 1"
                    + "\n\nDigite o código da fórmula: ");
            opcao = sc.nextInt();

            if (opcao < 1 || opcao > 4) {
                throw new InputMismatchException("'" + opcao + "'não é uma opção.");
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
            // Processamento
            switch (opcao) {
                case 1:
                    // Fórmula 1     Y = (Ax² - Bx + C) / (Bx - C)
                    texto_saida += "Y = (Ax² - Bx + C) / (Bx - C)\n";

                    if (a != 0.0) {
                        // Valor de x com equacao de 2º grau
                        delta = Math.pow(b, 2) - 4 * a * c;
                        texto_saida += "\nΔ = " + parenteses(b) + "² - 4 * " + parenteses(a) + " * " + parenteses(c) + "\n";
                        texto_saida += "Δ = " + Math.pow(b, 2) + " - " + parenteses(4 * a * c) + "\n";
                        texto_saida += "Δ = " + delta + "\n";

                        if (delta < 0) {
                            erro = new InputMismatchException("Não é possível resolver esta equação.\n"
                                    + "Delta é negativo em (Ax² - Bx + C)");
                            throw new InputMismatchException(texto_saida);
                        }

                        texto_saida += "\nx' = (-" + parenteses(b) + " + √" + delta + ") / 2 * " + parenteses(a) + "\n";
                        texto_saida += "x' = (-" + parenteses(b) + " + " + parenteses(Math.sqrt(delta)) + ") / 2 * " + parenteses(a) + "\n";
                        texto_saida += "x' = (" + parenteses((Math.sqrt(delta) - b)) + ") / " + parenteses(2 * a) + "\n";

                        x = (Math.sqrt(delta) - b) / 2 * a;

                        texto_saida += "x' = " + x + "\n";

                        // Resolvendo a equação
                        texto_saida += "\nY =  (" + parenteses(a) + "x² - " + parenteses(b) + "x + " + parenteses(c) + ") / (" + parenteses(b) + "x - " + parenteses(c) + ")\n";

                        if ((b * x - c) == 0.0) {
                            erro = new InputMismatchException("Não é possível resolver esta equação.\n"
                                    + "(Bx - C) = 0, e não pode ser um divisor.");
                            throw new InputMismatchException(texto_saida);
                        }
                        y = (Math.pow(a * x, 2) - (b * x) + c) / (b * x - c);

                        texto_saida += "Y =  ((" + parenteses(a) + " * " + parenteses(x) + ")² - (" + parenteses(b) + " * " + parenteses(x) + ")+ " + parenteses(c) + ") / ((" + parenteses(b) + " * " + parenteses(x) + ") - " + parenteses(c) + ")\n";
                        texto_saida += "Y =  (" + Math.pow(a * x, 2) + " - (" + parenteses(b * x) + ")+ " + parenteses(c) + ") / (" + parenteses(b * x) + " - " + parenteses(c) + ")\n";
                        texto_saida += "Y =  " + (Math.pow(a * x, 2) - (b * x) + c) + " / " + parenteses((b * x) - c) + ")\n";
                        texto_saida += "Y = " + y;
                    }
                    break;
                case 2:
                    // Fórmula 2     Y = Ax² + Bx + C
                    break;
                case 3:
                    // Fórmula 3     Y = (Ax + Cx³)/(4x)
                    break;
                case 4:
                    // Fórmula 4     Y = Bx⁴ - 1
                    break;
                default:
                    break;
            }

            // Saída
            System.out.println(texto_saida);
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.print((e.getMessage() != null) ? e.getMessage() + "\n" : "\n");
            System.out.print(erro.getMessage() + "\n");
        }
    }

    public static String parenteses(double numero) {
        return (numero < 0) ? "(" + Double.toString(numero) + ")" : Double.toString(numero);
    }

}
