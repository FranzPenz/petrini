public class ContoBancario {
    private double saldo;
    
    public ContoBancario(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }
    
    public synchronized void deposita(double importo) {
        saldo += importo;
        System.out.println(Thread.currentThread().getName() + " ha depositato " + importo + ". Saldo attuale: " + saldo);
    }
    
    public synchronized void preleva(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
            System.out.println(Thread.currentThread().getName() + " ha prelevato " + importo + ". Saldo attuale: " + saldo);
        } else {
            System.out.println(Thread.currentThread().getName() + " tentativo di prelievo fallito: saldo insufficiente. Saldo attuale: " + saldo);
        }
    }
    
    public synchronized double getSaldo() {
        return saldo;
    }
}
