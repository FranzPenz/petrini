
import random


def spin_row():
    symbols = ['🍒', '🍉', '🍋', '🔔', '⭐']

    results = []
    for symbol in range(3):
        results.append(random.choice(symbols))
    return results


def print_row(row):
    print(" | ".join(row))

def get_payout(row, bet):
    if row[0] == row[1] == row[2]:
        if row[0] == '🍒':
            payout = bet * 10
        elif row[0] == '🍉':
            payout = bet * 5
        elif row[0] == '🍋':
            payout = bet * 3
        elif row[0] == '🔔':
            payout = bet * 20
        elif row[0] == '⭐':
            payout = bet * 100
    return 0

def main():
    balance = 100
    
    print("*********************************")
    print("Welcome to the gambling machine!")
    print("")
    print("Symbols: 🍒   🍉   🍋   🔔   ⭐")
    print("*********************************")

    while balance > 0:
        print(f"your balance is €{balance}")
        bet = input("Place your bet: ")

        if not bet.isdigit():
            print("please enter a valid number")
            continue

        bet = int(bet)
        if bet > balance:
            print("you don't have enough money")
            continue
        
        if bet <= 0:
            print("you must bet more than 0")
            continue

        balance -= bet

        row = spin_row()
        print("Spinning... \n")
        print_row(row)

        payout = get_payout(row, bet)
        if payout > 0:
            print(f"you won €{payout}")
        else:
            print("you lost")
        
        balance += payout
        
if __name__ == "__main__":
    main()