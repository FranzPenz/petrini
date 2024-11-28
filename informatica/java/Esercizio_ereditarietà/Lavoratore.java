public class Lavoratore{
    protected String nome;
    protected String cognome;
    protected int retribuzione=40;
    protected double stipendio;

    public Lavoratore (String n, String c, int r, double s){
        nome = n;
        cognome = c;
        retribuzione = r;
        stipendio = s;
    }
    public String getnome(){
        return nome;
    }
    public String getcognome(){
        return cognome;
    }
    public Double Stipendio(int giorni){
        stipendio=retribuzione*giorni;
        return stipendio;
    }
}