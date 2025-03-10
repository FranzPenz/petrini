public class EsempioThread implements Runnable {
    private int numeroThread;
    public EsempioThread(int n) {
        setNumeroThread(n);

    }

    public void setNumeroThread(int n) {
        numeroThread=n;
    }
    
    public int getNumerothread() {
        return numeroThread;
    }
    public void run() {
        int n;
        for (n=0;n<6;n++) {
            System.out.println("*** thread numero"+ getNumerothread() + " In esecuzione");
            System.out.println("l'indice n vale:" + n);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException exc) {
                System.out.println("Errore");
            }
        }
    }
}