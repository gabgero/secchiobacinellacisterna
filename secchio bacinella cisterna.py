print("Ciao!")
print("cosa vuoi fare? secchio da 1 litro, bacinella da 0,2 litri o cisterna da 1000 litri?")
scelta = input()
if scelta == "secchio":
    litritot = 0
    capacità = 1000
    print("ok riempi il secchio fino a 1 litro (1000 ml)")
    while litritot < capacità:
        print("Inserisci litri")
        print(litritot)
        litri = float(input())
        litritot = litri + litritot
    if litri == capacità:
        print("hai riempito al 100%!")
    else:
        print("hai riempito troppo")
        print(litritot)
else:
    if scelta == "bacinella":
        litritot = 0
        capacità = 200
        print("ok riempi la bacinella fino a 0,2 litri (200 ml)")
        while litritot < capacità:
            print("Inserisci litri")
            print(litritot)
            litri = float(input())
            litritot = litri + litritot
        if litri == capacità:
            print("hai riempito al 100%!")
        else:
            print("hai riempito troppo")
            print(litritot)
    else:
        litritot = 0
        capacità = 1000000
        print("ok riempi cisterna fino a 1000 litri (1000000 ml)")
        while litritot < capacità:
            print("Inserisci litri")
            print(litritot)
            litri = float(input())
            litritot = litri + litritot
        if litri == capacità:
            print("hai riempito al 100%!")
        else:
            print("hai riempito troppo")
            print(litritot)
print("digita fine")
fine = input()
