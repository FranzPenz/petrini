public class automobile {
    private double gas;
    private double consumo;
    private double level;
    private double chilometri;
    private double chilometriNov;
    public automobile (double g, double kml, double l, double k, double kmn){
        this.gas = g;
        this.consumo = kml;
        this.level = l;
        this.chilometri = k;
        this.chilometriNov = kmn;
    }

    public double getconsumo(){
        return consumo;
    }

    public double getlevel(){
        return level;
    }

    public double getgas(){
        return gas;
    }

    public double getkm(){
        return chilometri;
    }

    public double getkmn(){
        return chilometriNov;
    }

    public void addgas(double refill){
        level += refill;
    }

    public void guida(double km){
        double a;
        a = km / consumo;
        level -= a;
        chilometri += km;
    }

    public double media(double km){
        double avg;
        avg = km / 31;
        return avg;
    }

    public void kmtot(){
        chilometri += chilometriNov;
    }
}
