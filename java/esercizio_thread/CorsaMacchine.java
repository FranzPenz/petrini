public class CorsaMacchine {

    public static void main(String[] args) {
        int distanza = 1000; // Distanza in metri
        Macchina[] macchine = new Macchina[4];

        for (int i = 0; i < 4; i++) {
            macchine[i] = new Macchina("Macchina " + (i + 1), distanza);
            macchine[i].start();
        }
    }
}