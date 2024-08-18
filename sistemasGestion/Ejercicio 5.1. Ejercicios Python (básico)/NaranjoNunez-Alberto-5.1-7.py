def mostrarDatos():
    persona = {
     'nombre': input('¿Cuál es su nombre?\n'),
     'edad': int (input('¿Cuál es su edad?\n')),
     'direccion': input('¿Cuál es su dirección?\n'),
     'telefono': int (input('¿Cuál es su teléfono?\n'))         
    }
    print(persona['nombre'] , ' tiene' , persona['edad'] , 'años, vive en' , persona['direccion'] ,
           'y su número de teléfono es' , persona['telefono'])

def main():
    mostrarDatos()
if __name__ == '__main__':
    main()