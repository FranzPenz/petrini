

import java.util.Scanner;

public class Corsacavalli_exe {
    public static void main(String[] args){
        int distanza = 1000;
        Corsacavalli[] cavalli = new Corsacavalli[8];
        String[] nome ={"Fratello Coltello", "Amante Fulmineo", "Agile Corridore", "Harry er piotta", "Pio Ottavo", "Nipote Ribelle", "Pensatore Istantaneo", "Duca Scattante"};
        for (int i = 0; i < 8; i++) {
            cavalli[i] = new Corsacavalli(nome[i], distanza);
            cavalli[i].start();
        }
    }
}
