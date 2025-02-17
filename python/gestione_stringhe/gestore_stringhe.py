email = input("inserisci la mail: ")

index = email.index("@")

username = email[:email.index("@")]
domain = email[email.index("@") + 1:]

print(f"il tuo username è {username} e il dominio è {domain}")