def precioHora():
    hora = int(input('¿Cuántas horas ha trabajado?\n'))
    precio = int(input('¿A cuánto cobra la hora?\n'))
    total = float(hora*precio)
    print("El precio total es:",total,"€")

def main():
    precioHora()

if __name__ == '__main__':
    main()