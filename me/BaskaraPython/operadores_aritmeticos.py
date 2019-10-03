# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 03/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em sala de aula
# Temas     : - Operadores aritméticos
#             - Precedência matemática
#             - Função input()
# ---------------------------------------------------------------------------------------

# Variáveis
n1 = 9
n2 = 4

# Adição
print('{} + {}  = {}'.format(n1, n2, (n1 + n2)))  # FORTEMENTE RECOMENDADO
#ou
print(n1, '+', n2, ' =', (n1 + n2)) # EVITAR, leitura mais difícil

# Subtração
print('{} - {}  = {}'.format(n1, n2, (n1 - n2)))

# Multiplicação
print('{} * {}  = {}'.format(n1, n2, (n1 * n2)))

# Divisão
print('{} / {}  = {}'.format(n1, n2, (n1 / n2)))

# Parte INTEIRA da Divisão
print('{} // {} = {}'.format(n1, n2, (n1 // n2)))

# Resto da divisão (mod)
print('{} % {}  = {}'.format(n1, n2, (n1 % n2)))

# Potenciação (ou Exponenciação)
print('{}^{}    = {}'.format(n1, n2, (n1 ** n2)))

# Radiciação
print('√{}     = {:.0f}'.format(n1, (n1 ** 0.5)))
# ou
print('√{}     = {:.0f}'.format(n2, (n2 ** (1 / 2))))

# Precedência matemática
# 0 -> () Parenteses
# 1 -> Potênciação (inclui Radiciação)
# 2 -> Multiplicação e Divisão
# 3 -> Soma e subtração

print('-' * 30)

# ---------------------------------------------------------------------------------------
# input() = Função para entrada de dados
# Declara a variável 'nome' e atribui à ela o TEXTO digitado pelo usuário
nome  = input()
idade = input()
peso  = input()

# Exibe uma mensagem para o usuário saber qual informação está digitando
nome  = input('Digite o seu nome: ')
idade = input('{}, quantos anos você tem? '.format(nome))
peso  = input('Qual o seu peso? ')

# QUALQUER ENTRADA com input() é recebida como 'str' (string)
print(type(nome))
print(type(idade))
print(type(peso))

print('-' * 30)

# Recebe a entrada de dados e salva com o tipo desejado (str, int, float)
nome  = input('Digite o seu nome: ')
idade = int(input('{}, quantos anos você tem? '.format(nome)))
peso  = float(input('Qual o seu peso? '))

# Agora, os dados armazenados estão convertidos para o tipo desejado
print(type(nome))
print(type(idade))
print(type(peso))


# Agora vai...
# Próximo arquivo: bhaskara_1.py
