def checkAge():
    edad = int(input('¿Cuál es su edad?\n'))
    for x in range(edad):
        print(x+1)

def main():
    checkAge()
if __name__ == '__main__':
    main()