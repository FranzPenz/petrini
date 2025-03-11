public class implementezioneThread {
    public static void main (String[] args) {
        EsempioThread s = new EsempioThread(1);
        Thread nuovoThread = new Thread (s);
        nuovoThread.start();
    }
}