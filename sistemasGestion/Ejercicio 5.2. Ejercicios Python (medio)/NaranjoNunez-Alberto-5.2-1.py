import copy
# 1A
# Si hay algun cambio en la lista base, con shallowcopy(copy) tambien se modifica esa lista 
# y con deepcopy se mantiene independiente
def cloneList():
    print("1.1 - Clonar una lista.")
    lista1 = [1,2,3,[4,5]]
    listaDeep = copy.deepcopy(lista1)
    listaCopia = copy.copy(lista1)

    print("Lista antes del cambio")
    print("Lista base:", lista1)
    print("Lista con deep copy:", listaDeep)
    print("Lista con copy:", listaCopia)
    lista1[3][0] = 8
    print('\n'"Lista despues del cambio (Lista interna -> 1º elemento)"'\n')
    print("Lista base:", lista1)
    print("Lista con deep copy:", listaDeep)
    print("Lista con copy:", listaCopia)
    print("---------------------------------------------------------------------")

# 1B
def addList():
    print("1.2 - Añadir un elemento a una lista.")
    lista = [1,2,3]
    print("Lista antes del cambio")
    print("Lista base:", lista)
    print('\n'"Lista despues del cambio (Añadir último elemento)")
    lista.append(4)
    print("Lista utilizando append():", lista)
    print("---------------------------------------------------------------------")

# 1C
def deleteList():
    print("1.3 - Eliminar un elemento de la lista.")
    lista = [1,2,3]
    print("Lista antes del cambio")
    print("Lista base:", lista)
    print('\n'"Lista despues del cambio (Eliminar último elemento)")
    lista.remove(2)
    print("Lista utilizando remove():", lista)
    print("---------------------------------------------------------------------")

# 1D
def lastElementList():
    print("1.4 - Crear una nueva lista con los 4 últimos elementos de una lista.")
    lista = [1,2,3,4,5,6,7,8]
    print("Lista antes del cambio")
    print("Lista base:", lista)
    print('\n'"Lista despues del cambio (Nueva lista con los 4 últimos elementos de una lista.)")
    newList = lista[-4:]
    print("Lista utilizando slicing operator:", newList)
    print("---------------------------------------------------------------------")

# 1E
def stringToList():
    print("1.5 - Convertir las palabras de una cadena (separadas por espacio) a una lista.")
    cadena = "Esto se convierte a una lista"
    print("String antes del cambio")
    print("String:",cadena)
    print('\n'"Lista despues del cambio (Palabras convertidas a lista)")
    newList = list(cadena.split(" "))
    print("Lista utilizando list.split():", newList)
    print("---------------------------------------------------------------------")

# 1F
def commentLine():
    print("1.6 - Comentarios con una línea.")
    # Esto es un ejemplo.
    print("Para crear comentarios de una sola línea se utiliza '#'")
    print("---------------------------------------------------------------------")

# 1G
def commentMultipleLine():
    print("1.7 - Comentarios multilínea.")
    '''
    Esto es un ejemplo
    de múltiples líneas comentadas. 
    '''
    print("Para crear comentarios de varias líneas se utilizan 3 comillas ''' ")
    print("---------------------------------------------------------------------")

def main():
    print("1. Prepara con un ejemplo donde explicas cómo hacer en Python 3:")
    cloneList()
    addList()
    deleteList()
    lastElementList()
    stringToList()
    commentLine()
    commentMultipleLine()

if __name__ == '__main__':
    main()