public class TestBanca {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(1000);
        
        int numClienti = 5;
        Cliente[] clienti = new Cliente[numClienti];
        for (int i = 0; i < numClienti; i++) {
            clienti[i] = new Cliente("Cliente" + (i + 1), conto);
            clienti[i].start();
        }
        
        for (Cliente c : clienti) {
            try {
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Operazioni concluse. Saldo finale: " + conto.getSaldo());
    }
}
