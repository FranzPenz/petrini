package informatica.java.employee_2;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
    String n="";
    String m="";
    double s=0;
    Dipendente2[] dipendenti = new Dipendente2[10];
    Scanner scanner = new Scanner (System.in);
    for(int i=0; i < dipendenti.length; i++){
        try{
            System.out.print ("Inserire nome: ");
            n = scanner.nextLine();
            System.out.print ("Inserire mestiere: ");
            m = scanner.nextLine();
            System.out.print ("Inserire stipendio: ");
            s = scanner.nextDouble();
        }catch(Exception e){
            System.out.println("Input errato");
        }
        dipendenti[i] = new Dipendente2(n, m, s);
    }
    for (int i=0; i < dipendenti.length; i++){
        switch (dipendenti[i].getmestiere()) {
            case "operaio":
                dipendenti[i].aumento(12.6);
                break;
            case "dirigente":
                dipendenti[i].aumento(10);
                break;
            case "impiegato":
                dipendenti[i].aumento(13.4);
                break;
            default:
                break;
        }
    }
    for(int i = 0; i < dipendenti.length; i++){
        System.out.printf("Dipndente %d: \n" , i+1);
        System.out.println(dipendenti[i].getnome());
        System.out.println(dipendenti[i].getstipendio());
        System.out.println(dipendenti[i].getmestiere());
    }
    }
}
