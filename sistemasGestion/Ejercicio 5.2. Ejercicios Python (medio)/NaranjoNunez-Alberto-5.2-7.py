# 7 Partiendo de un contexto donde queremos almacenar un usuario y su contraseña.  Haz un ejemplo que explique cómo se haría:
#    Utilizando una lista.
#    Utilizando un diccionario.
import hashlib
import random

def userList():
    print("Utilizando una lista.")
    user = []
    for x in range(5):
        password = hashlib.sha1(bytes(random.randint(100000, 99999999)))
        user.append([[f"user{x}", password]])
    print(user[1])
    print(user[3])
    print("---------------------------------------------------------------------")

def userDict():
    print("Utilizando un diccionario.")
    user = {}
    for x in range(5):
        password = hashlib.sha1(bytes(random.randint(100000, 99999999)))
        user[f"user{x}"] = password
    print("user1", user["user1"])
    print("user3", user["user3"])

def main():
    print("7 Partiendo de un contexto donde queremos almacenar un usuario y su contraseña.  Haz un ejemplo que explique cómo se haría:")
    userList()
    userDict()

if __name__ == '__main__':
    main()