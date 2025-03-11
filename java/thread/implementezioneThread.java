public class implementezioneThread {
    public static void main (String[] args) {
        EsempioThread s = new EsempioThread();
        Thread nuovoThread = new Thread (s);
        nuovoThread.start();
    }
}