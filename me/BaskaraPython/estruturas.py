# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 03/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em sala de aula
# Temas     : - Bloco de código
#             - Estrutura condicional simples
#             - Estrutura condicional composta
#             - Estrutura condicional composta 'switch(case)'
#             - Estrutura condicional aninhada
#             - Estrutura de repetição 'while'
# ---------------------------------------------------------------------------------------

# Blocos de código

# Os blocos de código são iniciados com ':' (dois-pontos).
# Os comandos que pertencem ao bloco são identificados pela INDENTAÇÃO.
#
# A palavra INDENTAÇÃO é um neologismo que tem sua origem na palavra inglesa INDENTANTION,
# tendo um sentido de recuo. 
# 

# Exemplo: 
numero = 10 # Mudar o valor para testar o comportamento nas condições

# Estrutura condicional simples
if numero != 0:
    print('O número é diferente de 0.')
    print('Número: {}'.format(numero))

# Daqui em diante o código não pertence mais ao bloco do if.
print('-' * 30)


# ---------------------------------------------------------------------------------------
# Estrutura condicional composta (if, else)
if numero > 0:
    # Teste do if resulta em True (Verdadeiro)
    print('O número {} é maior que 0.'.format(numero))
else:
    # Teste do if resulta em False (Falso)
    print('O número {} NÃO É maior que 0.'.format(numero))

print('-' * 30)


# ---------------------------------------------------------------------------------------
# Estrutura condicional composta (if, elif, else)
if numero > 0:
    # Teste do if resulta em True (Verdadeiro)
    print('O número {} é maior que 0.'.format(numero))
elif numero < 0:
    # Teste do elif resulta em True (Verdadeiro)
    print('O número {} é MENOR que 0.'.format(numero))
else:
    # Caso não seja Verdadeiro nos testes anteriores, executa este bloco (else).
    print('O número {} é MENOR que 0.'.format(numero))

print('Esta mensagem está fora de todos os blocos anteriores.')

print('-' * 30)



# ---------------------------------------------------------------------------------------
# Estrutura condicional composta 'switch(case)'
#
# O Python não possui implementação da estrutura 'switch(case)' mas existem algumas
# formas de implementar, com listas, objetos, etc.
# A mais simples é a estrutura condicional composta 'if/elif/else', por ter sua
# lógica semelhante ao switch, com a vantagem de aceitar uma grande variedade de
# testes, já que ele é feito com 'if', 'elif' e 'else'.

if numero == 1:
    print(1)
    # Comandos do bloco 1...
elif numero == 2:
    print(2)
    # Comandos do bloco 2...
elif numero == 3:
    print(3)
    # Comandos do bloco 3...
elif numero == 4:
    print(1)
    # Comandos do bloco 4...
elif numero == 5:
    print(5)
    # Comandos do bloco 5...
else:
    print('Sabe-se lá que numero é esse... =/')
    # Comandos do bloco ...



# ---------------------------------------------------------------------------------------
# Estrutura condicional aninhada (if dentro de if)
#numero = -1

if numero > 1:
# -- INICIO DO BLOCO --------------------------------------------------------------------
    print('Não é 1...')
    print('-' * 30)
    if numero > 2:
        # -- INICIO DO BLOCO --------------------------------------------------------------------
        print('Podia ser 2... mas não é!')
        print('-' * 30)
        if numero > 3:
            # -- INICIO DO BLOCO --------------------------------------------------------------------
            print('3 também não...')
            print('Se você ficar testando um por um, o código vai ficar imenso e essa estrutura vai ficar parecendo um...\n Hadúúúúúúúúúúúúken!')

            print('''\nFalando nisso, essas três aspas no início e no fim da
string, servem para digitar textos enormes em um pequeno espaço.
Facilita\tmuito\ta\tleitura
e a manutenção do código.''')
            
            print('Sobre o número, enquanto a indentação do INÍCIO DO COMANDO estiver à frente do if,\n')
            print('os comandos de mesmo alinhamento pertencem ao mesmo bloco')
else:
    # -- INICIO DO BLOCO --------------------------------------------------------------------
    print('-' * 30)
    print('Este bloco pertence ao ELSE do PRIMEIRO IF.')
    print('O número {} não é maior que 1.'.format(numero))
print('\nMesmo estando logo abaixo do bloco do ELSE,')
print('Essas duas mensagens estão fora de todos os blocos anteriores')

print('-' * 30)

if(True):
    # -- INICIO DO BLOCO --------------------------------------------------------------------
    print('Que código horrível! Evite isso.')
print('-' * 30)



# ---------------------------------------------------------------------------------------
# Estrutura condicional aninhada (if dentro de if)
# Organizando a bagunça.
#
# O Python foi criado para ser de fácil leitura e de manutenção simples.
#
# Se NÃO TIVER OUTRA SOLUÇÃO (o que eu não acredito) e REALMENTE FOR TOTALMENTE
# INDISPENSÁVEL fazer uma lambança generalizada como essa, ao menos TENTE fazer
# uma BAGUNÇA ORGANIZADA.
# 
# SUGESTÃO: Declare o textao no início do programa em uma variável.



# ------------------------------  VARIÁVEIS  -----------------------------------
# TEXTÕES DO ZAPZAP XD

textao = ''''3 também não...'
Se você ficar testando um por um, o código vai ficar imenso e essa estrutura
vai ficar parecendo um...\n Hadúúúúúúúúúúúúken!
Falando nisso, essas três aspas no início e no fim da
string, servem para digitar textos enormes em um pequeno espaço.
Facilita\tmuito\ta\tleitura
e a manutenção do código.
Sobre o número, enquanto a indentação do INÍCIO DO COMANDO estiver à frente do 
if,\n os comandos de mesmo alinhamento pertencem ao mesmo bloco'''

textao_else = '''Este bloco pertence ao ELSE do PRIMEIRO IF.
O número {} não é maior que 1.'''.format(numero)

textao_fim = '''\nMesmo estando logo abaixo do bloco do ELSE,
Essas duas mensagens estão fora de todos os blocos anteriores'''

agradecimento = 'Agora sim! A comunidade Python agradece sua clareza no código'

# ----------------------------  FIM VARIÁVEIS  ---------------------------------
#numero = -1

if numero > 1:
# -- INICIO DO BLOCO -----------------------------------------------------------
    print('Não é 1...')
    print('-' * 30)
    if numero > 2:
        # -- INICIO DO BLOCO ---------------------------------------------------
        print('Podia ser 2... mas não é!')
        print('-' * 30)
        if numero > 3:
            # -- INICIO DO BLOCO -----------------------------------------------
            print(textao)
else:
    # -- INICIO DO BLOCO -------------------------------------------------------
    print('-' * 30)
    print(textao_else)

print(textao_fim)

print('-' * len(agradecimento))

if(True):
    # -- INICIO DO BLOCO -------------------------------------------------------
    print(agradecimento)

print('-' * len(agradecimento))



# ---------------------------------------------------------------------------------------
# Estrutura de repetição 'while'
# Seguindo a mesma regra, o bloco do while é iniciado por ':' (dois-pontos) e
# delimitado pela indentação.

cont = 20
while numero < 25:
    numero += 1
    print('O número foi incrementado em 1.')
    print('O numero agora vale: {}'.format(numero))
    
    if cont < 0:
        break # Interrompe o laço while
    else:
        cont -= 2
        print('O contador foi decrementado em 2')

print('Encerrado o laço de repetição, o cont vale {} e o número vale {}.'.format(cont, numero))

numero = 85
# Outro exemplo de organização dos BLOCOS DE CÓDIGO
if numero != 0:
    while numero < 100:
        numero +=1
        if numero >= 100:
            print('Número: {}\nOpa! Chegou a 100...'.format(numero))
        else:
            print('Vai que vai... Eitalalá')
            print('\tNúmero: {}'.format(numero))

    print('Saída do laço do while.')

print('Fim do programa')

# Agora que temos essas ferramentas, vamos melhorar o código da Fórmula de Bhaskara.
# Próximo arquivo: bhaskara_2.py