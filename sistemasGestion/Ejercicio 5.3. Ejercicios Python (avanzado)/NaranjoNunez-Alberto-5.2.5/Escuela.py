class Escuela:
    def __init__(self,nombre, localidad, responsable):
        self.nombre = nombre
        self.localidad = localidad
        self.responsable = responsable
    
    def __str__(self):
        return f"El nombre del colegio es {self.nombre}, está en {self.localidad} y el responsable es {self.responsable}"
    
    def addEscuela(nombre, localidad, responsable):
        escuela = Escuela(nombre,localidad, responsable)
        return escuela
    
    def delete(self):
        del self

    def modName(self, valor):
        self.nombre = valor
    def modLocalidad(self, valor):
        self.localidad = valor
    def modResponsable(self, valor):
        self.responsable = valor

    def delName(self):
        del self.nombre
    def delLocalidad(self):
        del self.localidad
    def delResponsable(self):
        del self.responsable


class Profesor:
    def __init__(self,nombre, tipo, colegio):
        self.nombre = nombre
        self.tipo = tipo
        self.colegio = colegio
    
    def __str__(self):
        return f"El nombre del profesor es {self.nombre}, es de {self.tipo} y trabaja en {self.colegio}"

    def addProfesor(nombre, tipo, colegio):
        profesor = Profesor(nombre, tipo, colegio)
        return profesor
    
    def delete(self):
        del self
    def delName(self):
        del self.nombre
    def delTipo(self):
        del self.tipo
    def delColegio(self):
        del self.colegio

    def modName(self, valor):
        self.nombre = valor
    def modTipo(self, valor):
        self.tipo = valor
    def modColegio(self, valor):
        self.colegio = valor

class Alumno:
    def __init__(self,nombre, curso, profesorResponsable):
        self.nombre = nombre
        self.curso = curso
        self.profesorResponsable = profesorResponsable

    def __str__(self):
        return f"El nombre del alumno es {self.nombre}, es de {self.curso} y el tutor es {self.profesorResponsable}"

    def addAlumno(nombre, curso, profesorResponsable):
        alumno = Alumno(nombre, curso, profesorResponsable)
        return alumno

    def delete(self):
        del self
    def delName(self):
        del self.nombre
    def delCurso(self):
        del self.curso
    def delProfesorResponsable(self):
        del self.profesorResponsable

    def modName(self, valor):
        self.nombre = valor
    def modCurso(self, valor):
        self.curso = valor
    def modProfesorResponsable(self, valor):
        self.profesorResponsable = valor
    