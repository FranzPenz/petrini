import time

my_time = int(input("Inserisci la durata del timer: "))

for x in range(my_time, 0, -1):
    seconds = x % 60
    minutes = int(x / 60) % 60
    hours = int (x / 3600) % 24
    print(f"{hours:2}:{minutes:02}:{seconds:02}")
    

    time.sleep(1)



print("TEMPO SCADUTO")