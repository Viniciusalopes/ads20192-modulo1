package lucas_lista_n2;

import java.util.Scanner;

/**
 * 15. Leia um número indeterminado de números e conte a quantidade de números
 * pares e números ímpares. Caso o usuário digite um número inválido (negativo)
 * deve-se exibir uma mensagem e repetir a leitura. O sistema deverá ser
 * encerrado quando for digitado o número 0 (zero).
 */
public class Exercicio_15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares = 0, impar = 0, invalidos = 0;
        do {
            System.out.println("Favor insira o numero ,\n para a verificaçao entre 'par' ou 'inpar' :\n");
            numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("nao e parmitido , numeros negativos");
                invalidos++;
            } else if (numero > 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impar++;
                }
            }
        } while (numero != 0);
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.printf("A quantidade de numeros pares e : %d\n", pares);
        System.out.printf("A quantidade de numeros impares e : %d\n", impar);
        System.out.printf("A quatidade de numeros invalidos e : %d\n", invalidos);
        System.out.println("---------------------------------------------------------");

    }
}
