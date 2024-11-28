import java.util.Scanner;
public static void main(String [] args){
    String n="";
    double s=0;
    Scanner scanner = new Scanner (System.in);
    try{
        System.out.print ("Inserire nome: ");
        n = scanner.nextLine();
        System.out.print ("Inserisci stipendio: ");
        s = scanner.nextDouble();
        scanner.nextLine();
    }catch(Exception e){
        System.out.println("Input errato!");
    }
    Dipendente d1 = new Dipendente(n, s);
    d1.aumento(10);
    try{
        System.out.print ("Inserire nome: ");
        n = scanner.nextLine();
        System.out.print ("Inserisci stipendio: ");
        s = scanner.nextDouble();
    }catch(Exception e){
        System.out.println("Input errato!");
    }
    Dipendente d2 = new Dipendente(n, s);
    d2.aumento(20);
    scanner.close();
    System.out.println(d1.getnome());
    System.out.println(d1.getstipendio());
    System.out.println(d2.getnome());
    System.out.println(d2.getstipendio());
}
