package ba.sem2.einheit3.modul_nebenlaeufigkeit;

public class StoppbarerThread extends Thread{
    int i = 0;

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(i++);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                interrupt();
            }
        }
    }
}
