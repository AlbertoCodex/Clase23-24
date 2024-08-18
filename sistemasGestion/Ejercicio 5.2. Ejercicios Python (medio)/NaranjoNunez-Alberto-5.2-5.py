# 5A Depuración. Corregir los errores sintácticos del siguiente programa.
# pwd= input('Introduce la contraseña: ")
# if pwd in ['curso2324'):
#   print('Inicio de sesión realizado')
# else
#   print('Error en inicio de sesión')

def depurarCodigo():
    pwd= input('Introduce la contraseña: ')
    if pwd in ('curso2324'):
        print('Inicio de sesión realizado')
    else:
        print('Error en inicio de sesión')

def main():
    print("5. Depuración. Corregir los errores sintácticos del siguiente programa:")
    depurarCodigo()

if __name__ == '__main__':
    main()