package ba.sem2.einheit3.modul_philosophen;

import java.util.Random;

public class Philosoph implements Runnable{
    private Gabel gabelRechts;
    private Gabel gabelLinks;
    private String name;
    public Philosoph(String name, Gabel gabelRechts, Gabel gabelLinks) {
        this.gabelRechts = gabelRechts;
        this.gabelLinks = gabelLinks;
        this.name = name;
    }
    private void denke() {
        try {
            Thread.sleep((new Random().nextInt(10) + 1) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void esse() {
        if (gabelRechts.checkAndPickUp()) System.out.println(name + " nimmt " + gabelRechts.getName() + " in die rechte Hand.");
        else return;
        if (gabelLinks.checkAndPickUp()) System.out.println(name + " nimmt " + gabelLinks.getName() + " in die linke Hand.");
        else {
            gabelRechts.setDown();
            System.out.println(name + " legt " + gabelRechts.getName() + " aus der rechten Hand ab.");
            return;
        }
/*
        if (gabelRechts.isFree()) {
            gabelRechts.pickUp();
            System.out.println(name + " nimmt " + gabelRechts.getName() + " in die rechte Hand.");
        }
        else return;
        if (gabelLinks.isFree()) {
            gabelLinks.pickUp();
            System.out.println(name + " nimmt " + gabelLinks.getName() + " in die linke Hand.");
        }
        else {
            gabelRechts.setDown();
            System.out.println(name + " legt " + gabelRechts.getName() + " aus der rechten Hand ab.");
            return;
        }*/
        try {
            Thread.sleep((new Random().nextInt(10)+1)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gabelLinks.setDown();
        gabelRechts.setDown();
        System.out.println(name + " legt " + gabelRechts.getName() + " aus der rechten Hand und " + gabelLinks.getName() + " aus der linken Hand ab.");
    }
    @Override
    public void run() {
        while (true) {
            denke();
            esse();
        }
    }
}
