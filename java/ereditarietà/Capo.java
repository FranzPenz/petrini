package java.ereditarietà;

public class Capo extends Lavoratore{
    public Capo (String nome, String cognome){
        super(nome, cognome);
    }

    @Override
    public double stipendio(int giorni){
        return super.stipendio(giorni) + (1000 * giorni);
    }
}