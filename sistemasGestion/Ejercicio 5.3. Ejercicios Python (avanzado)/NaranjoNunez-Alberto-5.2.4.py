import random
def buscaminas():
    n = int (input("Indica el tamaño de la matriz (Ejemplo: '5' para un 5x5)"))
    arr = []
    minas = [0, -1]
    for x in range(n):
        values = []
        for y in range(n):
            values.append(random.choice(minas))
        arr.append(values)

    print("Valores de minas")
    for i in range(len(arr)) :  
        for j in range(len(arr[i])):  
            print(arr[i][j], end=" ")
        print()
    contandoMinas(arr)

def contandoMinas(arr):
    print("Cantidad de minas")
    for i in range(len(arr)):  
        for j in range(len(arr[i])):
            # Comprueba la derecha
            if (arr[i][j] != -1 and j+1 < len(arr[i])):
                if(arr[i][j+1] == -1):
                   arr[i][j] +=1
            # Comprueba la izquierda
            if (arr[i][j] != -1 and j > 0):
                if(arr[i][j-1] == -1):
                   arr[i][j] +=1
            # Comprueba arriba
            if (arr[i][j] != -1 and i != 0):
                if(arr[i-1][j] == -1):
                   arr[i][j] +=1
                # Arriba Izquierda
                if (arr[i-1][j-1] == -1 and j > 0):
                    arr[i][j] +=1
                # Arriba Derecha
                if (j+1 < len(arr[i]) and arr[i-1][j+1] == -1):
                    if(arr[i-1][j+1] == -1):
                        arr[i][j] +=1
            # Comprueba abajo
            if (arr[i][j] != -1 and i+1 < len(arr)):
                if(arr[i+1][j] == -1):
                   arr[i][j] +=1
                # Abajo Izquierda
                if (arr[i+1][j-1] == -1 and j > 0):
                    arr[i][j] +=1
                # Abajo Derecha
                if (j+1 < len(arr[i]) and arr[i+1][j+1] == -1):
                    arr[i][j] +=1
    
    for i in range(len(arr)) :  
        for j in range(len(arr[i])):  
            print(arr[i][j], end=" ")
        print()

def main():
    buscaminas()

if __name__ == '__main__':
    main()