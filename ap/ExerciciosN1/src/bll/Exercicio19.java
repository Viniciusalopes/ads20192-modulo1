/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 20/09/2019
 * Projeto   : ExerciciosN1
 * Finalidade: N1
 * ---------------------------------------------------------------------------------------
 */
package bll;

import java.util.Scanner;

/**
 * 19. Faça um algoritmo que calcule a quantidade de litros de combustível gasta
 * em uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o
 * cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média
 * durante ela. Desta forma, será possível obter a distância percorrida com a
 * fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta
 * calcular a quantidade de litros de combustível utilizada na viagem com a
 * fórmula: LITROS_USADOS = DISTANCIA / AUTONOMIA. O programa deve apresentar os
 * valores da velocidade média, tempo gasto na viagem, a distância percorrida e
 * a quantidade de litros utilizada na viagem.
 */
public class Exercicio19 {

    public static void main(String[] args) {
        vai();
    }

    public static void vai() {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int horas, minutos;
        double autonomia, velocidade, distancia, litros;

        autonomia = 12.0;

        // Entrada
        System.out.println();

        System.out.print("Informe o tempo da viagem em HORAS, sem os minutos....: ");
        horas = sc.nextInt();

        System.out.printf("Além das %d horas, a viagem teve mais quantos minutos? : ", horas);
        minutos = sc.nextInt();

        System.out.print("Qual foi a velocidade média (Km/h) durante a viagem?..: ");
        velocidade = sc.nextDouble();

        // Processamento
        distancia = ((horas * 60) + minutos) * (velocidade / 60);
        litros = distancia / autonomia;

        // Saída
        System.out.println();
        System.out.printf(
                  "Velocidade média.......: %.2f km/h\n"
                + "Tempo gasto na viagem..: %d hora(s) e %d minuto(s)\n"
                + "Distância percorrida...: %.2f km\n"
                + "Combustível utilizado..: %.2f litro(s).\n",
                velocidade,
                horas,
                minutos,
                distancia,
                litros
        );
    }
}
