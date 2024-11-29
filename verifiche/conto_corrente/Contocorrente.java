public class Contocorrente{
    protected int cc;
    protected int saldo;
    protected int[] movimenti;
    protected int countermovimenti;

    public Contocorrente (int cc, int saldoiniziale){
        this.cc = cc;
        this.saldo = saldoiniziale;
        this.movimenti = new int[20];
        this.countermovimenti = 0;
    }

    public void Prelievo (int importo1){
        if (importo1 > saldo) {
            System.out.println("Soldi insufficienti per il prelievo!");
        } else if (importo1 <= saldo){
            saldo -= importo1;
            movimenti[countermovimenti++] = -importo1;
        } 
    }

    public void Versamento (int importo2){
        saldo += importo2;
        movimenti[countermovimenti++] = importo2;
    }

    public int getsaldo(){
        return saldo;
    }

    public void printmovimenti(){
        System.out.println("Ecco i movimenti sul conto numero:" + cc + ":");
        for (int i = 0; i < countermovimenti; i++){
            System.out.println(movimenti[i]);
        }
    }
}