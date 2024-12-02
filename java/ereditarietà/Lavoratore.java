package java.ereditarietà;

public class Lavoratore {
    private String nome;
    private String cognome;
    private double retribuzioneGiorni = 40;

    public Lavoratore(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getnome(){
        return nome;
    }

    public String getcognome(){
        return cognome;
    }

    public double stipendio(int giorni){
        return retribuzioneGiorni * giorni;
    }

}