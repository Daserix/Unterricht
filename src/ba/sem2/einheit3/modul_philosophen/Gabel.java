package ba.sem2.einheit3.modul_philosophen;

public class Gabel {
    private boolean pickedUp;
    private String name;
    public Gabel(String name) {
        this.pickedUp = false;
        this.name = name;
    }
    public void pickUp() {
        pickedUp = true;
    }
    public void setDown() {
        pickedUp = false;
    }
    public boolean isFree() {
        return !pickedUp;
    }
    public String getName() {
        return name;
    }
    public synchronized boolean checkAndPickUp() {
        if (!pickedUp) {
            pickUp();
            return true;
        } else return false;
    }
}
