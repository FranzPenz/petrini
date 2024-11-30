package java.employee_2;

public class Dipendente2 {
    private String nome;
    private String mestiere;
    private double stipendio;
    public Dipendente2 (String n, String m, double s){
        nome = n;
        mestiere = m;
    }
    public String getnome(){
        return nome;
    }
    public String getmestiere(){
        return mestiere;
    }
    public double getstipendio(){
        return stipendio;
    }
    public void  setmestiere(String m){
        mestiere = m;
    }
    public void setnome(String n){
        nome = n;
    }
    public void setstipendio(double s){
        stipendio = s;
    }
    public void aumento (double percentuale){
        double x;
        x = stipendio / 100 * percentuale;
        stipendio = stipendio + x;
    }
}
