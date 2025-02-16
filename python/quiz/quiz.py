questions = ("Qual è videogioco ha vinto il titolo di 'Game of the year' nel 2023?: ",
           "Qual è il personaggio principale della serie di videogiochi Super Mario?",
           "In quale videogioco devi distruggere blocchi in un mondo a cubetti?",
           "Qual è la console creata da Sony?",
           "Qual è il nome completo del protagonista della serie The Legend of Zelda?")

options = (("A. Baldur's Gate III","B. The Legend of Zelda: Tears of the Kingdom","C. Alan Wake 2","D. Resident Evil 4"),
           ("A. Crash Bandicoot","B. Wario","C. Spyro","D. Nessuna di quelle elencate"),
           ("A. Minecraft","B. Terraria","C. League of legends","D. F1 2024"),
           ("A. Playstation","B. Xbox","C. Wii","D. Dreamcast"),
           ("A. Link","B. Gennaro","C. Pino","D. Paoletto"))

answers = ("A", "D", "A", "A", "A")
guesses = []
score = 0
question_num = 0

for question in questions:
    print("-----------------------------")
    print(question)
    for option in options[question_num]:
        print(option)

    guess = input("Risposta (A, B, C, D): ").upper()
    guesses.append(guess)
    if guess == answers[question_num]:
        score += 1
        print("Corretto!")
    else:
        print("Sbagliato!")
        print(f"La risposta corretta è: {answers[question_num]}")
    question_num += 1
print("-----------------------------")
print("Risultati:")
print("-----------------------------")
print(f"Risposte corrette: {score} / {question_num}")
