def checkDivisas():
    x = 1
    divisas =	{
        'Euro': '€',
        'Dollar': '$',
        'Yen': '¥'
    }
    while(x != 0):
        busqueda = input('¿Qué divisa quiere usar? (Euro, Dollar o Yen)\n')
        if(busqueda in divisas):
            print("La divisa a utilizar es:", divisas[busqueda])
            x = 0
        else:
            print("Introduce una divisa entre las opciones")
def main():
    checkDivisas()
if __name__ == '__main__':
    main()