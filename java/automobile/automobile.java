//RELAZIONE PER QUESTA CLASSE IN FONDO AL FILE//

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
/*
Costruttore:
    -inizializza un oggetto automobile con capacità del serbatoio, consumo, livello iniziale di carburante,
     chilometri totali e quelli percorsi a novembre.
Get:
    -getconsumo restituisce il consumo di carburante.
    -getlevel restituisce il livello attuale di carburante.
    -getgas restituisce la capacità massima del serbatoio.
    -getkm restituisce i chilometri totali.
    -getkmn restituisce i chilometri percorsi nel mese di novembre.
Addgas
    -aggiunge carburante nel serbatoio, inserita da input.
Guida
    -simula un percorso, riduce il livello di carburante in base ai chilometri percorsi e al consumo dell'auto.
    -aumeta in chilometri totali percorsi.
Media
    -calcola la media dei chilometri percorsi in un mese.
Kmtot
    -aggiunge i chilometri percorsi a novembre ai chilometri totali dell'auto.
*/