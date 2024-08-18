def printUser():
    usuario = input('Nombre de usuario\n')
    num = int(input('¿Cuántas veces se va a repetir?\n'))
    for x in range(num):
        print(usuario)

def main():
    printUser()
if __name__ == '__main__':
    main()