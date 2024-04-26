package ba.sem2.einheit3.modul_philosophen;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        ArrayList<Gabel> gabelList = new ArrayList<>();
        ArrayList<Philosoph> philosophList = new ArrayList<>();
        final int amount = 5;
        for (int i = 0; i < amount; i++) {
            gabelList.add(new Gabel("Gabel" + i));
        }
        for (int i = 0; i < amount; i++) {
            if (i == amount-1) philosophList.add(new Philosoph("Philosoph"+i,gabelList.get(i), gabelList.get(0)));
            else philosophList.add(new Philosoph("Philosoph"+i, gabelList.get(i), gabelList.get(i+1)));
        }
        ArrayList<Thread> threadList = new ArrayList<>();
        for (int i = 0; i<amount; i++) {
            Thread thread = new Thread(philosophList.get(i));
            threadList.add(thread);
            thread.start();
        }
    }
}
