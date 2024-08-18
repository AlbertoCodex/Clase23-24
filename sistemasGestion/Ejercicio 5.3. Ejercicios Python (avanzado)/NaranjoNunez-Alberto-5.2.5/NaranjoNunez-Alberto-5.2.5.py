from Escuela import Escuela
from Escuela import Alumno
from Escuela import Profesor

def colegio():
    # Añadimos instancias
    colegio = Escuela.addEscuela("Politecnico", "España", "Director")
    profesor = Profesor.addProfesor("Francisco", "Ciencia", colegio.nombre)
    tutor = Profesor.addProfesor("Carlos", "Ciencias", colegio.nombre)
    alumno = Alumno.addAlumno("Alberto", "DAM", tutor.nombre)
    # Modificamos los atributos de las instancias
    print(colegio, '\n', profesor, '\n', alumno, '\n')
    colegio.modResponsable("Cambiado")
    profesor.modName("Cambiado")
    print(colegio, '\n', profesor, '\n')
    # Borramos instancias
    if colegio is not None:
        print("Se ha borrado el atributo nombre de colegio")
        colegio.delName()


def main():
    colegio()

if __name__ == '__main__':
    main()