# 9. Pon un ejemplo de cómo hacer "sobrecarga de funciones" (funciones que pueden recibir varios números de parámetros), 
# incluyendo el caso de que el número de parámetros no sea definido.

def undefined(*argv):
    print(argv)

def main():
    print('9. Pon un ejemplo de cómo hacer "sobrecarga de funciones" (funciones que pueden recibir varios números de parámetros), incluyendo el caso de que el número de parámetros no sea definido.')
    undefined("Llamada a la funcion con 1 parametro")
    print("---------------------------------------------------------------------")
    undefined("Llamada a la funcion con varios parametros", "otro parametro", "y otro")

if __name__ == '__main__':
    main()