/*
 19. Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de
 um número indeterminado de alunos. Calcule e mostre:
 a. A média aritmética das 2 notas lidas;
 b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
 (Exame); de 7 para cima (Aprovado);
 c. O total de alunos;
 d. Quantidade de alunos Aprovados, Reprovados e de Exame.
 e. A Média da classe.
 */
package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//entrada de dados e apresentaçao de variaveis 
        //insirindo variaveis
        double nota1, nota2, nota, media;
        String opcao;
        //iniciando variaveis 
        nota1 = nota2 = 0;
        //entrada das notas 
        //e a definiçao da sua determinada condiçao
        do {
            System.out.println();
            System.out.println("-----BEM-VINDO-AO-VALIDA-MEDIA-----");
            System.out.print("Digite a primeira nota do aluno ");
            nota1 = entrada.nextDouble();
            if (nota1 >= 0.0 || nota1 <= 10) {
                System.out.println("nota invalida porfavor tentar novamente");
            }
            System.out.print("Digite a segunda nota do aluno ");
            nota2 = entrada.nextDouble();
            if (nota2 > 0.0 || nota2 < 10.0) {
                System.out.println("nota invalida porfavor tentar novamente");
            }

            System.out.print("Deseja continuar (SIM/NAO)");
            opcao = entrada.nextLine();
        } while (opcao.equalsIgnoreCase("sim"));

    }

}
