def modName():
    nombre = input('¿Cuál es su nombre?\n')
    print(nombre.lower(),'\n',
          nombre.upper(),'\n',
          nombre.title())

def main():
    modName()
if __name__ == '__main__':
    main()