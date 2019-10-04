# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 03/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em sala de aula
# Temas     : - Fórmula de Bhaskara
# ---------------------------------------------------------------------------------------
#                           |                               |
#   Fórmula de Bhaskara:    |   Restrições de entrada       |   Restrições de saída
#             ___________   |       a != 0                  |   Δ < 0 : {}
#   x = -b +-√ b² - 4.a.c   | Não é uma equação de 2º grau. |   Δ = 0 : {X} onde X' = X"
#       -----------------   |                               |   Δ > 0 : {X',X"}
#              2.a          |                               |
#              
# IMPLEMENTE EM PYTHON O ALGORITMO PARA CALCULAR O VALOR DE X COM BHASKARA:
#
#   INICIO-ALGORITMO
#   |   DECLARE a, b, c, x1, x2, delta
#   |
#   |   LEIA(b)
#   |   ESCREVA("Informe um valor para A: ")
#   |   LEIA(a)
#   |
#   |   ENQUANTO (Verdadeiro)
#   |   |   LEIA(a)
#   |   |   SE(a.pode_ser_número) ENTÃO:
#   |   |   |   a <- tipo_numérico(a)
#   |   |   |   SE (a = 0) ENTÃO:
#   |   |   |   |   ESCREVA("O valor de A não pode ser 0 (zero).")
#   |   |   |   SENÃO:
#   |   |   |   |   Falso // Pare o laço while
#   |   |   |   FIM-SE
#   |   |   FIM-SE
#   |   |
#   |   |   ESCREVA("Valor inválido para A.")
#   |   |   ESCREVA("Informe um valor para A: ")
#   |   |   LEIA(a)
#   |   FIM-ENQUANTO
#   |
#   |   ESCREVA("Informe um valor para B: ")
#   |   LEIA(b)
#   |
#   |   ESCREVA("Informe um valor para C: ")
#   |   LEIA(c)
#   |
#   |   delta <- b²-4*a*c
#   |
#   |   ESCREVA("delta", delta)
#   |
#   |   SE(delta < 0) ENTÃO:
#   |   |   ESCREVA("A equação não possui raízes reais.")
#   |   SENÃO:           ___________
#   |   |   x1 <- -b + (√ b² - 4.a.c) / (2.a)
#   |   |   SE(delta = 0) ENTÃO:
#   |   |   |   ESCREVA("X' = X" = ", x1)
#   |   |   SENÃO:           __________
#   |   |   |   x1 <- -b - (√b² - 4.a.c) / (2.a)
#   |   |   |   ESCREVA("X' = ", x1)
#   |   |   |   ESCREVA("X" = ", x2)
#   |   |   FIM-SE
#   |   FIM-SE
#   FIM-ALGORITMO
#
#

# Entrada
a = int(input('Informe um valor para A: '))
b = int(input('Informe um valor para B: '))
c = int(input('Informe um valor para C: '))

# Processamento
delta = b ** 2 - 4 * a * c
x1 = (-b + delta ** 0.5) / (2 * a)
x2 = (-b - delta ** 0.5) / (2 * a)

# Saída
print('delta=', delta)
print('x1=', x1)
print('x2= {}'.format(x2))

# Boa Sorte!
# Próximo arquivo: estruturas.py