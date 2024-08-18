# El programa debe decir cuántas veces ocurre cada uno de estos patrones sin distinguir mayúsculas y minúsculas: "00" "101", "ABC", "HO". 
def numeroPatrones(texto):
    numPatrones = 0
    for x in range(len(texto)):
        palabra = ""
        i = 0
        j = x
        while (i < 3 and j != len(texto)):
            palabra += texto[j]
            if (palabra == '00' or palabra == '101' or palabra == 'abc' or palabra == 'ho'):
                numPatrones += 1
            j += 1
            i += 1
    print("El número de patrones encontrados es:", numPatrones)

def main():
    numeroPatrones(input("Introduce un texto en el que buscar patrones").lower())

if __name__ == '__main__':
    main()