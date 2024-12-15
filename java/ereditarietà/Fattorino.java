package java.ereditarietà;

public class Fattorino extends Lavoratore{
    public Fattorino (String nome, String cognome){
        super(nome, cognome);
    }

    public double stipendio(int giorni){
        return super.stipendio(giorni) / 2;
    }
}
