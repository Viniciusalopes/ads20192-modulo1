# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 03/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em sala de aula
# Temas     : - Fórmula de Bhaskara
# ---------------------------------------------------------------------------------------
#
#   Fórmula de Bhaskara:
#             ___________
#   x = -b +-√ b² - 4.a.c
#       -----------------
#              2.a
#              
# Utilizando o que aprendemos até agora e,
# considerando a melhor hipótese de todos os tempos...

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

# Mas como nem tudo são flores...
# Próximo arquivo: estruturas.py