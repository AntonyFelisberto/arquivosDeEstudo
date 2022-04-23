'''
A medida de eficiência de um carro é medida em km/l (quantos km o
carro anda com 1 litro de combustível). Faça um algoritmo que
calcule a eficiência de um carro tendo como entrada a distância
percorrida e a quantidade de combustível gasta em litros.

Exemplo:
distância percorrida = 300km
quantidade gasta = 20 litros
eficiência: 15km/l
'''
#distancia = float(input("Digite a distância percorrida: "))
#litros = float(input("Digite a quantidade de litros de combustível: "))
#print(f"A eficiência do veículo é de {distancia/litros} km/l")

'''
leia do teclado as dimensões de um retângulo (base e altura),
calcular e escrever a área do retângulo. (Valores inválidos: 0 e
números negativos).
'''
'''
base = 0
altura = 0

while base <= 0 or altura <= 0:
    base = float(input("Digite o valor da base: "))
    altura = float(input("Digite o valor da altura: "))
    if base <= 0: 
        print("A base deve ser maior que 0.")
    if altura <= 0:
        print("A altura deve ser maior que 0.")
    if base > 0 and altura > 0:
        print(f"A área do retângulo é de {base*altura}")
'''

'''Enquanto a1=0 for menor que 5, incrementando 1 a cada laço,
mostre na tela o seu número.'''
'''
a1 = 0
while a1 < 5:
    print(a1)
    a1 += 1
'''

'''Mostrar na tela todos os números pares 
de 0 à 1000'''
'''
#for i in range(0,1001,2):
for i in range(1001):
    if i % 2 == 0:
        print(i)
'''
'''
Crie um vetor de int a9 com tamanho 10 e mostre
 na tela os seus valores;
'''
'''
a9 = [1,2,3,4,5,6,7,8,9,0]
for x in a9:
    print(x)
'''
'''
Crie um vetor int k9 com 5 elementos inteiros. 
Crie um vetor k9_b e atribua o valor de forma que k9_b[i] =
k9[i]*k9[i]
'''
k9 = [3,4,5,6,7]
k9_b = []
for x in k9:
    k9_b.append(x*x)
for x in k9_b:
    print(x)
