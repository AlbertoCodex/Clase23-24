# 11. Utilizando https://docs.python.org/3/howto/sorting.html y las "key functions", 
# hacer que esta lista se ordene por mayor altura y en caso de igualdad, por menor peso.
from operator import itemgetter, attrgetter

def listValues():
    lista = []
    lista.append([176, 67.5])
    lista.append([176, 70])
    lista.append([180, 83.7])
    print('Valores iniciales: ', lista)
    return lista

def sortList():
    lista = listValues()
    print('Ordenado por mayor altura y en caso de igualdad, por menor peso: ')
    sortL = sorted(lista, key=itemgetter(0), reverse=True)
    sorted(sortL, key=itemgetter(1))
    print(sortL)

def main():
    print('11. Utilizando https://docs.python.org/3/howto/sorting.html y las "key functions", hacer que esta lista se ordene por mayor altura y en caso de igualdad, por menor peso.')
    sortList()

if __name__ == '__main__':
    main()