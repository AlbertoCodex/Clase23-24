import functools 
import operator 

# Funcion lambda que reciba un parametro y junto a "tripleV" imprima el triple de su valor.
def lambdaFunc(n):
    return lambda a : a * n

def tripleV():
    n = input("Introduce un valor a triplicar\n")
    mytripler = lambdaFunc(3)
    print("El valor triplicado es:", mytripler(int(n)))

# Leer de teclado una cadena de texto formada por números separados con espacio y transformarla en una lista formada por números enteros. 
def transformToIntList():
    lista = list(input("Introduce una cadena de texto forma por números separados con espacio\n").split(" "))
    for i in range(0, len(lista)):
        lista[i] = int(lista[i])
    print("Cadena de texto transformada a lista de Integers:", lista)
    listaFiltrada = filter(filtroDiez, lista)
    listaFiltrada = list(listaFiltrada)
    print("Lista eliminando números menores a 10:", listaFiltrada)
# Con la cadena resultante y utilizando "reduce()", devuelve la multiplicación de los elementos de la lista.
    print("La multiplicación de los elementos de la lista es:", functools.reduce(operator.mul, listaFiltrada)) 

# Utilizando "filter()", elimina de la cadena anterior los números menores que 10.
def filtroDiez(x):
    if x < 10:
        return False
    else:
        return True

def main():
    tripleV()
    transformToIntList()

if __name__ == '__main__':
    main()