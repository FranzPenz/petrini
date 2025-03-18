public class Cliente extends Thread {
    private ContoBancario conto;
    
    public Cliente(String nome, ContoBancario conto) {
        super(nome);
        this.conto = conto;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            double importo = Math.random() * 100;
            if (Math.random() > 0.5) {
                conto.deposita(importo);
            } else {
                conto.preleva(importo);
            }
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrotto");
            }
        }
    }
}
