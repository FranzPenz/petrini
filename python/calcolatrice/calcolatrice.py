operazione = input("Scegli l'operazione da eseguire: +; -; *; /: \n")
a = int(input("Inserisci il primo valore: \n"))
b = int(input("Inserisci il secondo valore: \n"))

if operazione == "+":
    result = a + b
elif operazione == "-":
    result = a - b
elif operazione == "*":
    result = a * b
elif operazione == "/":
    result = a / b

print(result)