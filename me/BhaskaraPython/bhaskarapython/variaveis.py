# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 03/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em sala de aula
# Temas     : - Importância dos comentários no código
#             - Variáveis
#             - Função type()
#             - Função print()
#             - Função str.format()
# ---------------------------------------------------------------------------------------

# Diz a lenda que...
# Vai que, né...
print('Opa, mundo!')

# print() com multiplicação de caracteres
print('-' * 30)


# ---------------------------------------------------------------------------------------
# Atribuição de valores
nome  = 'Vinicius'
idade = '43'
peso  = '57.4'

# print() de variáveis
print(nome)
print(idade)
print(peso)

# print() de retorno de funções
# a função type() retorna o tipo do valor que está armazenado na variável
print(type(nome))
print(type(idade))
print(type(peso))

print('-' * 30)


# ---------------------------------------------------------------------------------------
# Atribuição de valores tipados
nome  = 'Vinicius'  # str
idade = 43          # int
peso  = 57.4        # float

print(nome)
print(idade)
print(peso)

print(type(nome))
print(type(idade))
print(type(peso))

print('-' * 30)


# ---------------------------------------------------------------------------------------
# Conversão de tipos de variáveis
nome  = 'Vinicius'       # str
idade = int('43')        # int
peso  = float('57.4')    # float

print(nome)
print(idade)
print(peso)

print(type(nome))
print(type(idade))
print(type(peso))

print('-' * 30)


# ---------------------------------------------------------------------------------------
# print() concatenado
# Strings e variáveis separadas por vírgula
# Já acrescenta espaço entre a string e a variável
print('Nome :', nome, '\nIdade:', idade, '\nPeso :', peso)

print() # o mesmo que print('\n')

# print() formatado
# VARIÁVEIS do Python são OBJETOS e, portanto, pentence à CLASSE 'str' que, por
# sua vez possuem métodos (ou funções), atributos, etc;
# Exemplo: 
#       CLASSE: Eletrodomésticos
#           OBJETO DA CLASSE Eletrodomésticos: FORNO DE MICROONDAS
#               -> Atributos: Pequeno, grande, silencioso, econômico. 
#               -> Funções  : Aquecer, descongelar, dourar alimentos,
#                             ou simplesmente apitar incessantemente enquanto
#                             tentamos preparar uma aula, só porque esquecemos
#                             aberto...
#
# str.format(): Substitui as chaves {} pelo conteúdo das variáveis
# format() é uma função de OBJETOS da classe STRING

print('Nome : {}\nIdade: {}\nPeso : {}'.format(nome, idade, peso))
print()
print('Nome : {}\nIdade: {}\nPeso : {:.2f}'.format(nome, idade, peso))


# str.isnumeric(): Testa se o conteúdo da variável pode ser convertido para um 
# tipo que armazene números (int, float, etc.)
#
# 'not' equivale ao operador lógico de negação '!' (Exclamação) de outras linguagens.

print('-' * 30)

if not nome.isnumeric():
    print('{} não pode ser convertido em um número.'.format(nome))
    print('Tipo do valor da variável nome: {}'.format(type(nome)))
    nome = '1234' # str
    print('{} pode ser convertido em número.'.format(nome))

nome = int(nome)
print(type(nome))

# Próximo arquivo: operadores_aritmeticos.py