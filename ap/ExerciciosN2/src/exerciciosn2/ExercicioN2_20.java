/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 06/10/2019
 * Projeto   : ExerciciosN2
 * Finalidade: N2
 * Alunos    : Lucas Araujo da Silva e Vinicius Araujo Lopes
 * ---------------------------------------------------------------------------------------
 */
package exerciciosn2;

import java.util.Scanner;

/**
 * 20. Faça um programa para realização do login em um sistema. O algoritmo deverá receber
 * um login (cadeia de caracteres) e uma senha baseada em números inteiros. Em seguida o
 * algoritmo deverá verificar a senha digitada, caso ela esteja correta o sistema deverá
 * mostrar a seguinte mensagem: “BEM-VINDO AO SISTEMA, login”. Caso a senha esteja
 * incorreta a seguinte mensagem deverá ser apresentada: “SENHA INCORRETA, TENTE
 * NOVAMENTE”. Foi estipulado um limite de 3 tentativas para digitação da senha, caso o
 * usuário ultrapasse esse limite, o sistema deverá bloquear o acesso com a seguinte
 * mensagem: “ACESSO BLOQUEADO, PROCURE UM MODERADOR!”.
 */
public class ExercicioN2_20 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner sc;
        String login;
        int senha1, senha2, tentativas;

        // Inicialização de variáveis
        sc = new Scanner(System.in);
        tentativas = 0;

        // Cadastro do login
        System.out.print(
                " CADASTRO DE USUÁRIO\n"
                + repete("-", 21) + "\n"
                + " Login: "
        );
        login = sc.nextLine();

        // Cadastro da senha
        System.out.print(" Senha: ");
        senha1 = sc.nextInt();

        do {    // } while (senha1 != senha2 && tentativas < 3);
            // Entrada da senha2
            System.out.print(" Digite a senha novamente: ");
            senha2 = sc.nextInt();
            if (senha1 != senha2) {
                // Senha incorreta
                System.out.println(" SENHA INCORRETA, TENTE NOVAMENTE.");
                tentativas++;
            } else {
                // Saída senha correta
                System.out.printf(" BEM-VINDO AO SISTEMA, %s.\n", login);
            }

            if (tentativas == 3) {
                System.out.println(" ACESSO BLOQUEADO, PROCURE UM MODERADOR!");
            }
        } while (senha1 != senha2 && tentativas < 3);
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
