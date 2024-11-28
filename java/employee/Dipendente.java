public class Dipendente{
    private String nome;
    private double stipendio;
    public Dipendente (String n, double s){
        nome = n;
        stipendio = s;
    }
    public String getnome(){
        return nome;
    }
    public double getstipendio(){
        return stipendio;
    }
    public void setstipendio(double s){
        stipendio = s;
    }
    public void setnome(String n){
        nome = n;
    }
    public void aumento (double percentuale){
        double x;
        x = stipendio / 100 * percentuale;
        stipendio = stipendio + x;
    }
}