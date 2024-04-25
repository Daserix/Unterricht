package ba.sem2.einheit3.modul_nebenlaeufigkeit;

public class ProgrammStoppbar {
    public static void main(String[] args) throws InterruptedException {
        StoppbarerThread t = new StoppbarerThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
