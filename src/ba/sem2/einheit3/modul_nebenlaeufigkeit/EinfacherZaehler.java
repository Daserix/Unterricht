package ba.sem2.einheit3.modul_nebenlaeufigkeit;

public class EinfacherZaehler implements Runnable {
    private String name;
    private int intervall;
    public EinfacherZaehler(String name, int intervall) {
        this.name = name;
        this.intervall = intervall;
    }

    @Override
    public void run() {
        for (int i = 0; i<100; i++) {
            System.out.println(name + " ist bei " + i);
            try {
                Thread.sleep(intervall);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
