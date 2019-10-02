# ---------------------------------------------------------------------------------------
# Licença   : MIT - Copyright 2019 Viniciusalopes (Vovolinux) <suporte@vovolinux.com.br>
# Criado em : 02/10/2019
# Projeto   : Báskara em Python - Matemática e Estatística
# Finalidade: Apresentação em aula
# ---------------------------------------------------------------------------------------

# FONTE DE PESUISA: https://python.org.br

# Entrada
a = int(input('Informe um valor para A: '))

while a == 0:
    print('O valor de A precisa ser diferente de 0 (zero).\n')
    a = int(input('Informe um valor para A: '))
    
b = int(input('Informe um valor para B: '))
c = int(input('Informe um valor para C: '))

delta = b ** 2 - 4 * a * c
print('Δ = {}'.format(delta))

if delta < 0:
    print('não possui raízes reais.')
else:
    x1 = (-b + delta ** 0.5) / (2 * a)
    if delta == 0:
        print('X\" = ', x1)
    else:
        x2 = (-b - delta ** 0.5) / (2 * a)
        print("X' = {:.2f}\nX\" = {:.2f}".format(x1, x2))