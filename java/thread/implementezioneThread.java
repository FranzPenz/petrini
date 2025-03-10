public class implementezioneThread {
    public static void main (String[] args) {
        EsempioThread r = new EsempioThread();
        Thread nuovoThread = new Thread (r);
        nuovoThread.start();
    }
}