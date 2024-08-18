# 8. Pon un ejemplo de cómo pasar varios parámetros desde consola a un programa Python 3.
import sys

def arguments():
    print(f"En el fichero '{sys.argv[0]}' se ha pasado como argumento/s lo siguiente: ")
    for x in range(1,len(sys.argv)):
        print(sys.argv[x])

def main():
    print("8. Pon un ejemplo de cómo pasar varios parámetros desde consola a un programa Python 3.")
    arguments()

if __name__ == '__main__':
    main()