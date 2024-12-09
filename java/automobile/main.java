package java.automobile;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x;
        double g, r, l=0, kmg=0, kmn=0, rifornimento, km, med1, med2;
        try{
            System.out.println("Inserire la capacità massima di carburante nel serbatoio della prima macchina");
            g = sc.nextDouble();
            r = 0.5;
            automobile auto1 = new automobile (g,r,l,kmg,kmn);
            sc.nextLine();
            System.out.println("Inserire la capacità massima di carburante nel serbatoio della seconda macchina");
            g = sc.nextDouble();
            r = 0.25;
            automobile auto2 = new automobile (g,r,l,kmg,kmn);
            System.out.println("Fare rifornimento prima di partire!");
            System.out.println();
            System.out.println("quanti litri vuoi mettere nel primo serbatoio?");
            rifornimento = sc.nextDouble();
            sc.nextLine();
            if (rifornimento > g) {
                System.out.println("I litri che vuoi aggiungere superano la capacità massima del serbatoio, é stato fatto il pieno");
                System.out.println();
                rifornimento = g;
            }
            auto1.addgas(rifornimento);
            sc.nextLine();
            System.out.println("Quanti litri vuoi mettere nel secondo serbatoio?");
            rifornimento = sc.nextDouble();
            sc.nextLine();
            if (rifornimento > g) {
                System.out.println("I litri che vuoi aggiungere superano la capacità massima del serbatoio, é stato fatto il pieno");
                System.out.println();
                rifornimento = g;
            }
            auto2.addgas(rifornimento);
            sc.nextLine();
            System.out.println("Premere 1 per usare la macchina, premi 2 per calcolare la media dei km percorsi a novembre");
            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    System.out.println("Quanti km vuoi percorrere con la prima macchina?");
                    km = sc.nextDouble();
                    sc.nextLine();
                    auto1.drive(km);
                    System.out.println("Quanti km vuoi percorrere con la seconda macchina?");
                    km = sc.nextDouble();
                    sc.nextLine();
                    auto2.drive(km);
                    System.out.println("la prima macchina ha percorso " + auto1.getchilometri() + "km, il livello di carburante è " + auto1.getlivello());
                    System.out.println();
                    System.out.println("la seconda macchina ha percorso " + auto2.getchilometri() + "km, il livello di carburante è " + auto2.getlivello());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("quanti km ha percorso la prima macchina nel mese di novembre? ");
                    km=sc.nextDouble();
                    sc.nextLine();
                    med1=auto1.mediakm(km);
                    auto1.kmtot();
                    System.out.print("quanti km ha percorso la seconda macchina nel mese di novembre? ");
                    km=sc.nextDouble();
                    sc.nextLine();
                    med2=auto1.mediakm(km);
                    auto2.kmtot();
                    System.out.print("la prima macchina ha una media di " + med1 + " chilometri nel mese di novembre");
                    System.out.println();
                    System.out.print("la seconda macchina ha una media di " + med2 + " chilometri nel mese di novembre");
                    System.out.println();
                    break;
            
                default:
                    System.out.println("Scegli una delle 2 opzioni!");
                    break;
            }
            auto1.kmtot();
            auto2.kmtot();
            System.out.println("resoconto auto numero 1");
            System.out.println("resa: " + auto1.getresa());
            System.out.println("livello: " + auto1.getlivello());
            System.out.println("chilometri percorsi: " + auto1.getchilometri());
            System.out.println();
            System.out.println();
            System.out.println("resoconto auto numero 2");
            System.out.println("resa: " + auto2.getresa());
            System.out.println("livello: " + auto2.getlivello());
            System.out.println("chilometri percorsi: " + auto2.getchilometri());
        }
        catch(Exception e){
            System.out.println("input sbagliato");
        }
    }
}
