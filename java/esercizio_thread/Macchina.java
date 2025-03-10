import java.util.Random;

public class Macchina extends Thread {
    private String nome;
    private int distanza;
    private int velocita;
    private int percorso;
    private Random random;

    public Macchina(String nome, int distanza) {
        this.nome = nome;
        this.distanza = distanza;
        this.velocita = new Random().nextInt(50) + 50; // Velocità casuale tra 50 e 100 m/s
        this.percorso = 0;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (percorso < distanza) {
            int avanzamento = velocita + random.nextInt(20) - 10; // Aggiunge una variazione casuale alla velocità
            percorso += avanzamento;
            if (percorso > distanza) {
                percorso = distanza; // Assicura che non superi la distanza
            }
            System.out.println(nome + ": " + percorso + " metri");
            try {
                Thread.sleep(1000); // Pausa di 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " ha tagliato il traguardo!");
    }
}
