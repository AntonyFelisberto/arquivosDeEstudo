'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
print ('Lists, tuples, sets, dictionaries')

lista = ["Batman", "A volta dos que não foram",\
        "Fogo na caixa d´água"]

#lista.clear()
#lista.append("Homem-aranha")
#lista.push("Homem-aranha") não existe push
lista.extend(["Homem-aranha", "Dark souls", "Donnie Darko",
"Batman Cavaleiro das Trevas", "Batman"])

lista.insert(1, "Shang Chi")
print(lista)
print(lista[1])
print(len(lista))
print(lista.count("Batman"))
print(lista.pop())
print(lista)
lista.remove("Shang Chi")
print(lista)
lista.reverse()
print(lista)
lista2 = lista.copy()
#print(lista2)
lista.sort()
print(lista)
print(type(lista))
#print(max(lista))
#print(min(lista))
lista.remove(lista[0])
lista = lista[1:]
lista = lista[:len(lista)-1]
print(lista)
print(lista[1:3])

lista_numeros = [3,6,4,8,7,1]
print(max(lista_numeros))
print(min(lista_numeros))
print(lista_numeros.index(8))
lista_numeros += [1,2,3,4,5,6]
print(lista_numeros)
lista_numeros *= 2
print(lista_numeros)
print(sum(lista_numeros))
