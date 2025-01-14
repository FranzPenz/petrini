motos = []
prezzi = []
totale = 0

while True:
    moto = input("Inserisci i nomi delle moto da comprare (premi q per uscire): ")
    if moto.lower() == "q":
        break
    else:
        prezzo = float(input(f"Inserisci il prezzo di {moto}: € "))
        motos.append(moto)
        prezzi.append(prezzo)
print("----- CHECKOUT -----")

for moto in motos:
    print(moto)

for prezzo in prezzi:
    totale += prezzo

print(f"il totale è: € {totale}")