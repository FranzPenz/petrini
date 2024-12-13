package java.automobile;

public class automobile {
    private double gas;
    private double kml;
    private double level;
    private double chilometri;
    private double chilometriNov;
    public automobile(double g, double k, double l, double km, double kmn){
        this.gas = g;
        this.kml = k;
        this.level = l;
        this.chilometri = km;
        this.chilometriNov = kmn;
    }
    public double getkml(){
        return kml;
    }
    public double getlevel(){
        return level;
    }
    public double getgas(){
        return gas;
    }
    public double getchilometri(){
        return chilometri;
    }
    public double getchilometriNov(){
        return chilometriNov;
    }
    public void benzinaio(double refill){
        level += refill;
    }
    public void drive(double km){
        double newlevel;
        newlevel = km / kml;
        level -= newlevel;
        chilometri += km;
    }
    public double avg(double km){
        double avg;
        avg = km / 31;
        return avg;
    }
    public void kmtot(){
        chilometriNov += chilometri;
    }
}