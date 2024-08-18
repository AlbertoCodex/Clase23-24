def checkAge():
    edad = int(input('¿Cuál es su edad?\n'))
    if(edad >= 18):
        print("Es mayor de edad")
    else:
        print("No es mayor de edad")

def main():
    checkAge()
if __name__ == '__main__':
    main()