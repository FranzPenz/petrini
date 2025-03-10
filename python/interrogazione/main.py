from abc import ABC, abstractmethod
class Animale(ABC):
    def __init__ (self, salute, nome):
        self.salute = salute
    @abstractmethod
    def mangia(self):
        pass
    def scappa(self):
        pass

class predatore (Animale):
    def __init__ (self, salute, nome):
        super().__init__(self.salute, self.nome)
    def caccia(self):
        print(f"{self.nome} sta cacciando")
    def mangia(self):
        print(f"{self.nome} sta mangiando")

class preda (Animale):
    def __init__ (self, salute, nome):
        super().__init__(self.salute, self.nome)
    def mangia(self):
        print(f"{self.nome} sta mangiando")
    def scappa(self):
        print(f"{self.nome} sta scappando")

class pesce (preda, predatore):
    def __init__ (self, salute, nome):
        super().__init__(self.salute, self.nome)
    def nuota(self):
        print(f"{self.nome} sta nuotando")
    def mangia(self):
        print(f"{self.nome} sta mangiando")


