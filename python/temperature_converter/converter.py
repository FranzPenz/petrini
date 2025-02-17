temperature = float(input("Inserisci la temperatura: "))
unit = input("in che unità? (C per Celsius, K per Kelvin, F per Fahrenheit): ")

if unit.upper() == "C":
    unit2 = input("in quale unità di misura vuoi convertire? (K per Kelvin, F per Fahrenheit): ")
    if unit2.upper() == "K":
        temperature = temperature + 273.15
        unit = "°K"
        print(f"temperatura convertita: {temperature} {unit}")
    elif unit2.upper() == "F":
        temperature = (temperature * 9) / 5 + 32
        unit = "°F"
        print(f"temperatura convertita: {round(temperature, 3)} {unit}")
    else:
        print(f"{unit2} non è valida")
elif unit.upper() == "K":
    unit2 = input("in quale unità di misura vuoi convertire? (C per Celsius, F per Fahrenheit): ")
    if unit2.upper() == "C":
        temperature = temperature - 273.15
        unit = "°C"
        print(f"temperatura convertita: {round(temperature, 3)} {unit}")
    elif unit2.upper() == "F":
        temperature = (temperature - 273.15) * 9/5 + 32
        unit = "°F"
        print(f"temperatura convertita: {round(temperature, 3)} {unit}")
    else:
        print(f"{unit2} non è valida")
elif unit.upper() == "F":
    unit2 = input("in quale unità di misura vuoi convertire? (K per Kelvin, C per Celsius): ")
    if unit2.upper() == "K":
        temperature = (temperature - 32) * 5/9 + 273.15
        unit = "°K"
        print(f"temperatura convertita: {round(temperature, 3)} {unit}")
    elif unit2.upper() == "C":
        temperature = (temperature - 32) * 5/9
        unit = "°C"
        print(f"temperatura convertita: {round(temperature, 3)} {unit}")
    else:
        print(f"{unit2} non è valida")