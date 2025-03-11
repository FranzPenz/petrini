

import java.util.Random;

public class Corsacavalli extends Thread{
    private String nome;
    private int distanza;
    private int velocita;
    private int percorso;
    private Random random;

    public Corsacavalli(String nome, int distanza) {
        this.nome = nome;
        this.distanza = distanza;
        this.velocita = new Random().nextInt(50) + 50;
        this.percorso = 0;
        this.random = new Random();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        while (percorso < distanza) {
            int avanzamento = velocita + random.nextInt(20) - 10;
            percorso += avanzamento;
            if (percorso > distanza) {
                percorso = distanza;
            }
            System.out.println(nome + ": " + percorso + " metri");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " ha tagliato il traguardo!");
    }
}
