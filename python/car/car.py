class car:
    def __init__(self, brand, year, color):
        self.brand = brand
        self.year = year
        self.color = color

    def guida(self):
        print(f"Stai guidando la {self.brand} del {self.year} colore {self.color}")
        km = input(f"Quanti km hai percorso con questa macchina? ")

    def rifornimento(self):
        print(f"hai esaurito il carburante, fai il pieno")
        lt = input(f"inserisci la capacità massima del serbatoio")
        lit = input(f"quanti litri vuoi inserire? ")

car1 = car("Ford Fiesta", 2012, "rosso")
print(car1.brand)
print(car1.year)
print(car1.color)
print(car1.guida())
print(car1.rifornimento())