import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x;
        double g, kml, l = 0, k = 0, kmn = 0, refill, km, avg1, avg2;
        try{
            System.out.println("Inserire la quantità massima di carburante della prima macchina");
            g = sc.nextDouble();
            kml = 0.5;
            automobile auto1 = new automobile(g, kml, l, k, kmn);
            sc.nextLine();
            System.out.println("Inserire la quantità massima di carburante della seconda macchina");
            g = sc.nextDouble();
            kml = 0.25;
            automobile auto2 = new automobile(g, kml, l, k, kmn);
            System.out.println("Fare rifornimento prima di partire!");
            System.out.println();
            System.out.println("Quanti litri vuoi mettere nella prima macchina?");
            refill = sc.nextDouble();
            sc.nextLine();
            if (refill > g) {
                System.out.println("la quantità selezionata supera la capacità massima, il serbatoio è stato pienato");
                System.out.println();
                refill = g;
            }
            auto1.addgas(refill);
            sc.nextLine();
            System.out.println("Quanti litri vuoi mettere nella seconda macchina?");
            refill = sc.nextDouble();
            sc.nextLine();
            if (refill > g) {
                System.out.println("la quantità selezionata supera la capacità massima, il serbatoio è stato pienato");
                System.out.println();
                refill = g;
            }
            auto2.addgas(refill);
            sc.nextLine();
            System.out.println("Premere 1 per guidare, premere 2 per calcolare la media dei km percorsi a novembre");
            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    System.out.println("Quanti km percorri con la prima macchina?");
                    km = sc.nextDouble();
                    sc.nextLine();
                    auto1.guida(km);
                    System.out.println("La prima macchina ha percorso " + auto1.getkm() + "km, il livello di carburante rimantente e' " + auto1.getgas());
                    System.out.println();
                    System.out.println("Quanti km percorri con la seconda macchina?");
                    km = sc.nextDouble();
                    sc.nextLine();
                    auto2.guida(km);
                    System.out.println("La seconda macchina ha percorso " + auto2.getkm() + "km, il livello di carburante rimantente e' " + auto2.getgas());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Quanti km ha percorso la prima macchina a novembre?");
                    km = sc.nextDouble();
                    sc.nextLine();
                    avg1 = auto1.media(km);
                    auto1.kmtot();
                    System.out.print("la prima macchina ha una media di " + avg1 + " chilometri nel mese di novembre");
					System.out.println();
                    System.out.println("Quanti km ha percorso la seconda macchina a novembre?");
                    km = sc.nextDouble();
                    sc.nextLine();
                    avg2 = auto2.media(km);
                    auto2.kmtot();
                    System.out.print("la prima macchina ha una media di " + avg2 + " chilometri nel mese di novembre");
					System.out.println();
                    break;
                default:
                    System.out.println("Scegli una delle 2 opzioni");
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Input sbagliato, ricomincia");
        }
    }
}
