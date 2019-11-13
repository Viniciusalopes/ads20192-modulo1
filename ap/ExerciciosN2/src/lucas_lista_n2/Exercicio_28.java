/*
 Num frigorífico existem 5 bois. Cada boi traz em seu pescoço um cartão contendo seu
número de identificação e seu peso. Faça um programa que escreva o número e o peso
do boi mais gordo e do boi mais magro. Assuma que os dados são válidos.
 */

package lucas_lista_n2;

import java.util.Scanner;

public class Exercicio_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //variaveis
        int id , id_gordo , id_magro;
        double peso , peso_maior, peso_menor;
        //inicializando variaveis
        id = id_gordo = id_magro = 0 ;
        peso = peso_maior = peso_menor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println("   =======frigorífico=======  ");
            System.out.println("O numero do bovino e "+i);
            id = entrada.nextInt();
            System.out.println("Por favor insira o peso do bovino "+i);
            
            peso = entrada.nextDouble();
            if (i == 1) {
               id_gordo = id_magro = id;
               peso_maior = peso_menor = peso;
            }else{
                if (peso > peso_maior) {
                    id_gordo = id;
                    peso_maior = peso;
                    
                }if (peso < peso_menor) {
                    id_magro = id;
                    peso_menor = peso;
                }
            }
        }
          System.out.printf("O bovino numero %d e o mais gordo seu peso e de %.2f kg \n",id_gordo,peso_maior);
          System.out.printf("O bovino numero %d e o menoss gordo seu peso e de %.2f kg \n",id_magro,peso_menor);
    }
    
}
