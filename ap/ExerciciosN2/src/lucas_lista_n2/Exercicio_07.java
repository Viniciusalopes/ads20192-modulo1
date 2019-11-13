/*
Uma empresa de pesquisa resolveu entrevistar os torcedores do estado de Goiás para
saber qual a maior torcida. Faça um programa que calcule a quantidade de torcedores de
cada time que torce: G – Goiás, V – Vila Nova, ou O - outros. O programa deve
encerrar quando for digitado F - fim. Escrever ao final o total de torcedores
entrevistados, a quantidade de torcedores do Goiás, a quantidade do Vila Nova, a
quantidade total de torcedores de Outros times.
 */

package lucas_lista_n2;
import java.util.Scanner;
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int goias = 0 , vila = 0, outros = 0, times = 1 , torcedores ;
        String resposta ;
        goias = vila = outros = 0;
        boolean continuar = true;
        while (continuar){
        System.out.println();
        System.out.println("======================================");
        System.out.println("=======SELECIONE UMAS DAS OPÇOES======");
        System.out.println("G – Goiás");
        System.out.println("V – Vila Nova");
        System.out.println("O - outros");
        System.out.println("F - fim");
        System.out.println("======================================");
        resposta = entrada.next();            
        System.out.println();
        
        
        switch (resposta.toUpperCase()) {
            case "G":
            case "g":
               goias++;
               break ;
            case "V":
            case "v":
               vila++;
                break;
            case "O":
            case "o":
               outros++;
                break;
            case "F":
            case "f":
                continuar = false ;
                break;
        
        default :
            System.out.println();
            System.out.println("insira uma opçao valida");
            System.out.println("======================================");
        }
            torcedores = goias + vila + outros;
            System.out.println();
            System.out.println("torcedores entrevistados "+ torcedores);
            System.out.println("torcedores do goias " + goias);
            System.out.println("torcedores do vila " + vila);
            System.out.println("torcedores de outros times " + outros);
            System.out.println("======================================");
            System.out.println();
    }
    }
    }
