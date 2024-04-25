package ba.sem2.einheit3.modul_nebenlaeufigkeit;

public class EinfachesProgramm {
    public static void main(String[] args) {
        EinfacherZaehler zaehler1 = new EinfacherZaehler("Erster Zaehler", 100);
        EinfacherZaehler zaehler2 = new EinfacherZaehler("Zweiter Zaehler", 50);

        Thread thread1 = new Thread(zaehler1);
        Thread thread2 = new Thread(zaehler2);

        thread1.start();
        thread2.start();
    }
}
