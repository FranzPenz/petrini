import time

my_time = int(input("Inserisci la durata del timer: "))

for x in range(my_time, 0, -1):
    seconds = x % 60
    print(f"00:00:{seconds:02}")
    

    time.sleep(1)



print("TEMPO SCADUTO")