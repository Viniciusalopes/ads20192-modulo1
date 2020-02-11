/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosn1;

import bll.*;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        String[] numeros = new String[45];
        String opcao;

        // Popula numero
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.toString(i + 1);
        }

        opcao = "";
        do {
            System.out.print("   E X E R C Í C I O S   N 1 \n"
                    + "--------------------------------\n"
                    + "Digite o número do exercício: ");
            opcao = sc.nextLine();

            if (exercicio_valido(numeros, opcao)) {
                System.out.println();
                executa(Integer.parseInt(opcao));
                //executa(opcao);

            } else {
                System.out.println("Número do exercicio inválido!");
            }
            
        } while (opcao.toLowerCase() != "s");

        opcao = "";
        do {
            System.out.println();
            System.out.print("   E X E R C Í C I O S   N 1 \n"
                    + "--------------------------------\n"
                    + "Digite o número do exercício ou s para Sair: ");
            opcao = sc.nextLine();

            if (exercicio_valido(numeros, opcao)) {
                try {
                    System.out.println();
                    executa(Integer.parseInt(opcao));
                    //executa(opcao);
                } catch (Exception e) {
                    System.out.println("Alguma coisa errada não está certa!...");
                    System.out.println(e);
                }

            } else if (!opcao.toLowerCase().equals("s")) {
                System.out.println("Número do exercicio inválido!");
            }
        } while (!opcao.toLowerCase().equals("s"));
    }

    /**
     *
     * @param numeros Array de opções válidas
     * @param numero Opção a ser pesquisada
     * @return Verdadeiro, caso exista a opção no array, ou Falso caso não
     * exista
     */
    public static boolean exercicio_valido(String[] numeros, String numero) {
        for (String n : numeros) {
            if (numero.equals(n)) {
                return true;
            }
        }
        return false;
    }

    public static void executa(String numero) {
        /*
        Pesquisando...
        ExercicioGenerico exercicio = Class.forName("bll.Exercicio"+numero).newInstance();
        exercicio.vai();
         */
    }

    public static void executa(int numero) {
        switch (numero) {
            case 1:
                Exercicio1.vai();
                break;
            case 2:
                Exercicio2.vai();
                break;
            case 3:
                Exercicio3.vai();
                break;
            case 4:
                Exercicio4.vai();
                break;
            case 5:
                Exercicio5.vai();
                break;
            case 6:
                Exercicio6.vai();
                break;
            case 7:
                Exercicio7.vai();
                break;
            case 8:
                Exercicio8.vai();
                break;
            case 9:
                Exercicio9.vai();
                break;
            case 10:
                Exercicio10.vai();
                break;
            case 11:
                Exercicio11.vai();
                break;
            case 12:
                Exercicio12.vai();
                break;
            case 13:
                Exercicio13.vai();
                break;
            case 14:
                Exercicio14.vai();
                break;
            case 15:
                Exercicio15.vai();
                break;
            case 16:
                Exercicio16.vai();
                break;
            case 17:
                Exercicio17.vai();
                break;
            case 18:
                Exercicio18.vai();
                break;
            case 19:
                Exercicio19.vai();
                break;
            case 20:
                Exercicio20.vai();
                break;
            case 21:
                Exercicio21.vai();
                break;
            case 22:
                Exercicio22.vai();
                break;
            case 23:
                Exercicio23.vai();
                break;
            case 24:
                Exercicio24.vai();
                break;
            case 25:
                Exercicio25.vai();
                break;
            case 26:
                Exercicio26.vai();
                break;
            case 27:
                Exercicio27.vai();
                break;
            case 28:
                Exercicio28.vai();
                break;
            case 29:
                Exercicio29.vai();
                break;
            case 30:
                Exercicio30.vai();
                break;
            case 31:
                Exercicio31.vai();
                break;
            case 32:
                Exercicio32.vai();
                break;
            case 33:
                Exercicio33.vai();
                break;
            case 34:
                Exercicio34.vai();
                break;
            case 35:
                Exercicio35.vai();
                break;
            case 36:
                Exercicio36.vai();
                break;
            case 37:
                Exercicio37.vai();
                break;
            case 38:
                Exercicio38.vai();
                break;
            case 39:
                Exercicio39.vai();
                break;
            case 40:
                Exercicio40.vai();
                break;
            case 41:
                Exercicio41.vai();
                break;
            case 42:
                Exercicio42.vai();
                break;
            case 43:
                Exercicio43.vai();
                break;
            case 44:
                Exercicio44.vai();
                break;
            case 45:
                Exercicio45.vai();
                break;
            default:
                break;
        }
    }
}
