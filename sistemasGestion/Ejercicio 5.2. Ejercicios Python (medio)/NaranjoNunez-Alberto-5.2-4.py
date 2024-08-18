import math
# 4A Escribir una función que reciba un número entero positivo y devuelva su factorial.
def factorialNum(num):
    print("Desde la función una vez recibido el parametro: ")
    print("El factorial de 7 es:", math.factorial(num))

def main():
    print("4. Escribir una función que reciba un número entero positivo y devuelva su factorial.")
    factorialNum(7)

if __name__ == '__main__':
    main()