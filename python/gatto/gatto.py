class gatto:
    def __init__(self, nome, sonno, fame):
        self.nome = nome
        self.sonno = sonno
        self.fame = fame
    def mangia(self):
        ciotola = input(f"la ciotola è piena? (si o no)")
        if ciotola.upper() == "SI" and self.fame == True:
            print(f"{self.nome} sta mangiando...")
        elif ciotola.upper() == "NO" and self.fame == True:
            print(f"{self.nome} non può mangiare, la ciotola è vuota")
        elif self.fame == False:
            print(f"{self.nome} non ha fame")
    def dorme(self):
        divano = input(f"il divano è occupato? (si o no)")
        if divano.upper() == "SI" and self.sonno == True:
            print(f"{self.nome} ha sonno, va a dormire")
        elif divano.upper() == "NO" and self.sonno == True:
            print(f"Il divano è occupato, {self.nome} dorme per terra")
        elif divano.upper() == "SI" or divano.upper() == "NO" and self.sonno == False:
            print(f"{self.nome} non ha sonno")

gatto1 = gatto("Silvestro", False, True)
print(gatto1.mangia())
print(gatto1.dorme())