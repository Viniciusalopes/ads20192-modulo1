# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 03/10/2019
# Projeto   : Bhaskara em Python - Matemática e Estatística
# Finalidade: Apresentação em aula
# Temas     : - Bloco de código
#             - Estrutura condicional simples
#             - Estrutura condicional composta
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
