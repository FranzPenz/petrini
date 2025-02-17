weight = float(input("inserisci il peso: "))
unit = input("in che unità di misura è il peso? (K per kg e L per lbs): ")

if unit.upper() == "K":
    weight = weight * 2.205
    unit = "lbs"
    print(f"peso convertito: {round(weight, 3)} {unit}")
elif unit.upper() == "L":
    weight = weight / 2.205
    unit = "kg"
    print(f"peso convertito: {round(weight, 3)} {unit}")
else:
    print(f"l'unità {unit} non è valida!")