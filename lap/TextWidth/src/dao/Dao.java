/*
 * ---------------------------------------------------------------------------------------
 * Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
 * Criado em : 15/09/2019
 * Projeto   : TextWidth
 * Finalidade: Data Access Object
 * ---------------------------------------------------------------------------------------
 */
package dao;

public class Dao {

    private static String texto;

    public static void main(String[] args) {

    }

    public static String getTexto() {
        setTexto();
        return texto;
    }

    private static void setTexto() {
        texto = "EXERCÍCIOS DE ESTRUTURA SEQÜENCIAL\n"
                + "1)\n"
                + "Fazer um algoritmo para ler os valores dos coeficientes A,B e C de uma equação quadrática.\n"
                + "Calcular e imprimir o valor do discriminante (delta). Delta =B 2 −4∗A∗C\n"
                + "2)\n"
                + "Ler dois números inteiros quaisquer para as variáveis A e B. Efetuar a troca dos valores de forma\n"
                + "que A passe a armazenar o valor de B e que B passe armazenar o valor de A. Imprimir os valores\n"
                + "trocados.\n"
                + "3)\n"
                + "Escrever um algoritmo que lê o público total de futebol e forneça a renda do jogo, sabendo-se que\n"
                + "havia 4 tipos de ingressos assim distribuídos: popular - 10% a R$10,00, geral - 50% a R$15,00,\n"
                + "arquibancada - 30% a R$20,00 e cadeiras - 10% a R$30,00.\n"
                + "4)\n"
                + "Desenvolver um algoritmo para ler os comprimentos dos três lados de um triângulo (L 1 , L 2 e L 3 ) e\n"
                + "calcular a área do triângulo de acordo com a fórmula:\n"
                + "Área =\n"
                + " T ∗T − L 1 ∗T − L 2 ∗T − L 3  e T = L 1  L 2 L 3 /2\n"
                + "5)\n"
                + "Fazer um algoritmo que obtenha o raio e a altura de um cilindro e que calcule e escreva o seu\n"
                + "volume e sua área.\n"
                + "Á r e a=2∗∗rai o∗al t u r arai o e Vo l u m e=∗raio 2 ∗a l t u r a\n"
                + "6)\n"
                + "Escreva um algoritmo para calcular o consumo médio de um automóvel (medido em Km/l), dado\n"
                + "que são conhecidos a distância total percorrida e o volume de combustível consumido para percorrê-la\n"
                + "(medido em litros). Observação: a principal questão a ser levantada na elaboração do algoritmo pedido\n"
                + "consiste na formulação da expressão usada para calcular o consumo médio (CM), a partir da distância\n"
                + "total percorrida (distância) e do volume de combustível consumido (Volume), que é dada por:\n"
                + "C o n s u m o M é d i o=\n"
                + "Dist ância\n"
                + "Vo l u m e\n"
                + "7)\n"
                + "Escrever um algoritmo que lê o valor de uma compra em dólares, a taxa do dólar no dia da\n"
                + "compra, o percentual de ICMS e o percentual de lucro da empresa; e que calcule e escreva o valor a ser\n"
                + "pago em reais, sabendo-se que o percentual de lucro e o percentual de ICMS incidem sobre o valor em\n"
                + "reais.\n"
                + "8)\n"
                + "Uma pessoa resolveu fazer uma aplicação em uma poupança programada. Para calcular seu\n"
                + "rendimento, ela deverá fornecer o valor constante da aplicação mensal, a taxa e o número de meses. Sabe-\n"
                + "se que a formula usada par este cálculo é:\n"
                + "n\n"
                + "v al or a c u m u l a d o=\n"
                + "1 i  −1 \n"
                + "∗P onde i = taxa, P = aplicação mensal e n = número de meses.\n"
                + "i\n"
                + "9)\n"
                + "Fazer um algoritmo que calcule e escreva o valor de uma prestação em atraso, utilizando a\n"
                + "fórmula abaixo:\n"
                + "Prestação atualizada = valor da prestação + (valor da prestação*(taxa de juros/100)*tempo de atraso).\n"
                + "10)\n"
                + "O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do\n"
                + "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor\n"
                + "seja de 12% do preço de fábrica e os impostos de 30% do preço de fábrica, fazer um algoritmo para ler o\n"
                + "custo de fábrica de um carro e imprimir o custo ao consumidor.\n"
                + "11)\n"
                + "Dados os pontos A e B, cujas coordenadas A(x 1 ,y 1 ) e B (x 2 ,y 2 ) serão informadas via teclado,\n"
                + "desenvolver um algoritmo que calcule a distância entre A e B.\n"
                + "Di st â nc ia=   x 2 −x 1  2  y 2 − y 1  2\n"
                + "Onde:\n"
                + "Exercícios Seqüenciais\n"
                + "Pág.: 112)\n"
                + "Dada a base e a altura de uma pirâmide, fazer um algoritmo que calcule e escreva o seu volume.\n"
                + "1\n"
                + "Vo l u m e= ∗b a s e∗a l t u r a\n"
                + "3\n"
                + "13)\n"
                + "Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores recebe,\n"
                + "mensalmente, um salário fixo mais comissão. Essa comissão é calculada em relação ao número de\n"
                + "televisores vendidos por mês de cada um dos tipos de TV, obedecendo-se à tabela abaixo:\n"
                + "TV LCD R$ 50,00 de comissão por unidade vendida\n"
                + "TV LED R$ 60,00 de comissão por unidade vendida\n"
                + "TV Plasma R$ 55,00 de comissão por unidade vendida\n"
                + "Sabe-se que o salário total e o fixo mais as comissões. Escrever um algoritmo que calcule e escreva o\n"
                + "salário do empregado.\n"
                + "14)\n"
                + "Fazer um algoritmo que calcule e escreva a quantidade de dinheiro a ser gasto em uma viagem.\n"
                + "Sabe-se que o veículo a ser usado faz 12 Km por litro de gasolina e que o litro de gasolina custa R$ 2,90.\n"
                + "O usuário ira fornecer o tempo de viagem e a velocidade média do veículo.\n"
                + "▪ Distância = tempo de viagem * velocidade média.\n"
                + "▪ Quantidade de litros = distância / 12.\n"
                + "Exercícios Seqüenciais\n"
                + "Pág.: 2";
    }
}
