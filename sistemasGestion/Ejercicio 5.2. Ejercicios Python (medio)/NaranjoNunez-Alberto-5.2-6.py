# 6A En Python 3 los tipos simples se pasan por valor y los compuestos por referencia.
# Crea un ejemplo con 3 funciones que:
#    Reciba 2 números y devuelva la suma.
#    Reciba una lista y modifique esa misma lista (referencia) doblando los valores de todos los elementos. No tiene que devolver nada.
#    Reciba una lista y devuelva una copia de la misma lista (referencia) doblando los valores de todos los elementos. La lista original no debe modificarse.

def sumNum(num1, num2):
    print("Reciba 2 números y devuelva la suma.")
    print("La suma de", num1 ,"y", num2, "=", num1+num2)
    print("---------------------------------------------------------------------")

def modList(lista):
    print("Reciba una lista y modifique esa misma lista (referencia) doblando los valores de todos los elementos. No tiene que devolver nada.")
    print("Valores iniciales:", lista)
    for i in range(len(lista)):
        lista[i] *= 2

def copyList(lista):
    print("Reciba una lista y devuelva una copia de la misma lista (referencia) doblando los valores de todos los elementos. La lista original no debe modificarse.")
    print("Valores iniciales:", lista)
    for i in range(len(lista)):
        lista[i] *= 2

def main():
    lista1 = [1,4,6,8,3]
    nl = [1,4,6,8,3]
    print("6. En Python 3 los tipos simples se pasan por valor y los compuestos por referencia.\nCrea un ejemplo con 3 funciones que:")
    sumNum(4,9)
    modList(lista1)
    print("Valores modificados", lista1)
    print("---------------------------------------------------------------------")
    copyList(nl[:])
    print("Los valores no se han modificado", nl)

if __name__ == '__main__':
    main()