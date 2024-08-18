# 2A Explica con ejemplos cómo funcionan los operadores "is", "not", "in" en Python 3
def operatorsExample():
    # Operator 'is'
    x = [1,2]
    y = x
    z = [1,2]
    print('Operador "is"')
    print('Variable "x = [1,2]" Variable "y = x" Variable "z = [1,2]"')
    print("Usando el operador 'is' entre 'x' e 'y':", x is y)
    print("Usando el operador 'is' entre 'x' y 'z':", x is z)
    print("---------------------------------------------------------------------")
    # Operator 'not'
    x = 7
    print('Operador "not"')
    print('Variable "x = 7"')
    print("Usando el operador 'not' comprobando si 'x' es menor a 10")
    print(not(x < 10))
    print("---------------------------------------------------------------------")
    # Operator 'in'
    x = [2,5,7,9]
    print('Operador "in"')
    print('Variable "x = [2,5,7,9]"')
    print("Usando el operador 'in' comprobando si '7' existe en la lista")
    print(7 in x)

def main():
    print('2 - Explica con ejemplos cómo funcionan los operadores "is", "not", "in" en Python 3')
    operatorsExample()

if __name__ == '__main__':
    main()