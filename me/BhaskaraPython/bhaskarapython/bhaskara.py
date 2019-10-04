# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 02/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em sala de aula
#                           |                               |
#   Fórmula de Bhaskara:    |   Restrições de entrada       |   Restrições de saída
#             ___________   |       a != 0                  |   Δ < 0 : {}
#   x = -b +-√ b² - 4.a.c   | Não é uma equação de 2º grau  |   Δ = 0 : {X'= X"}
#       -----------------   |                               |   Δ > 0 : {X',X"}
#              2.a          |                               |
#              
# ---------------------------------------------------------------------------------------

# FONTES DE PESQUISA: 
# https://python.org
# https://python.org.br
# https://www.w3schools.com/python/

# Entrada de A
a = input('Informe um valor para A: ')

# Validação de A
while True:
    if a.replace('-','').isnumeric():   # Testa possível conversão da 'str' para um número
        # Converte o dado armazenado na variável 'a'
        a = int(a)
        if a == 0:
            print('\nO valor de A não pode ser 0 (zero).')
        else:
            break

    print('Valor inválido para A.\n')
    a = input('Informe um valor para A: ')
        
# Entrada de B
b = int(input('Informe um valor para B: '))

# Entrada de C
c = int(input('Informe um valor para C: '))

# Delta
delta = b ** 2 - 4 * a * c

print('Δ = {}'.format(delta))

# Possibilidades de x
if delta < 0:
    print('A equação não possui raízes reais.')
else:   
    # delta >= 0
    x1 = (-b + delta ** 0.5) / (2 * a)
    if delta == 0:
        print("X' = X\" = ", x1)
    else:
        # x > 0
        x2 = (-b - delta ** 0.5) / (2 * a)
        print("X' = {:.2f}\nX\" = {:.2f}".format(x1, x2))

# Finalizando
print('-' * 8, '\nThe fim.')


