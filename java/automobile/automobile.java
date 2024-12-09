package java.automobile;

public class automobile {
    private double gas;
    private double resa;
    private double livello;
    private double chilometri;
    private double chilometrinov;

    public automobile(double g, double r, double l, double kmg, double kmn){
        this.gas = g;
        this.resa = r;
        this.livello = l;
        this.chilometri = kmg;
        this.chilometrinov = kmn;
    }

    public double getgas(){
        return gas;
    }
    
    public double getresa(){
        return resa;
    }

    public double getlivello(){
        return livello;
    }

    public double getchilometri(){
        return chilometri;
    }

    public double getchilometrinov(){
        return chilometrinov;
    }

    public void addgas(double rifornimento){
        livello += rifornimento;
    }

    public void drive(double km){
        double a;
        a = km / resa;
        livello -= a;
        chilometri += km;
    }

    public double mediakm(double km){
        double avg;
        avg = km / 31;
        return avg;
    }

    public void kmtot(){
        chilometri += chilometrinov;
    }
}
