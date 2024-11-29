import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contocorrente[] conti = new Contocorrente[3]; 
        conti[0] = new Contocorrente(1, 1000); 
        conti[1] = new Contocorrente(2, 2000); 
        conti[2] = new Contocorrente(3, 3000);

        boolean exit = false;
        while (!exit) {
            System.out.println("Seleziona un conto corrente: (0, 1, 2), -1 per uscire");
            int i = scanner.nextInt();
            if (i == -1) {
                exit = true;
                break;
            }

            if (i < 0 || i > conti.length) {
                System.out.println("Conto corrente inesistente");
                continue;
            }

            System.out.println("Seleziona un operazione: 1 per eseguire un versamento, 2 per eseguire un prelievo");
            int op = scanner.nextInt();

            if (op == 1) {
                System.out.println("inserisci l'importo");
                int ip = scanner.nextInt();
                conti[i].Versamento(ip);
            }else if (op == 2) {
                System.out.println("inserisci l'importo");
                int ip = scanner.nextInt();
                conti[i].Prelievo(ip);
            }else if (op < 1 || op > 2){
                System.out.println("operazione non valida");
            }

            conti[i].printmovimenti();
            System.out.println("Saldo attuale: " + conti[i].getsaldo());
            System.out.println();
        }
        scanner.close();
    }
}
