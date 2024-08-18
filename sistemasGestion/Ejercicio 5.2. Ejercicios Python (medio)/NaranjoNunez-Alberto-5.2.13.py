# 13. Define la clase Car en Python 3. La clase tendrá como atributos "matrícula" (numérica) y "color". 
# Crea un método imprimir, y además dos métodos que quieras.
# En segundo lugar, haz que el programa pida un número "n" por teclado y se cree "n" instancias de la clase, donde cada instancia:
#    Cada "matricula" tendrá un número consecutivo desde 1 hasta "n".
#    El "color" será para cada instancia un color aleatorio obtenido de este listado ["red", "white", "black", "pink", "blue"]
#    Finalmente, el programa deberá imprimir los valores de las 10 primeras instancias. En caso de que "n" sea menor que 10, sólo imprimirá "n" instancias
import random
class Car:
    def __init__(self, matricula, color):
        self.matricula = matricula
        self.color = color
    
    def __str__(self):
        return f"{self.matricula}, {self.color})" 
    
def createCar():
    x = 0
    colores = ["red", "white", "black", "pink", "blue"]
    n = int(input("¿Cuántas instancias quiere crear?\n"))
    while(x < n and x < 10):
        car = Car(x, random.choice(colores))
        print(car)
        x += 1

def main():
    print('13. El programa deberá imprimir los valores de las 10 primeras instancias.')
    createCar()

if __name__ == '__main__':
    main()