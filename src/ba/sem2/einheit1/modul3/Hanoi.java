package ba.sem2.einheit1.modul3;

public class Hanoi {
    static int count = 0;
    public static void main(String[] args) {
        int plates = 10;
        movePlate(plates, "A", "C", "B");
        System.out.println("Moves: " + count);
    }

    static void movePlate(int plateNum, String origin, String target, String temp_holder) {
        if (plateNum==1) {
            System.out.println("Move " + plateNum + " from " + origin + " to "+ target);
            count++;
            return;
        }
        movePlate(plateNum-1, origin, temp_holder, target);
        System.out.println("Move " + plateNum + " from " + origin + " to "+ target);
        count++;
        movePlate(plateNum-1, temp_holder, target, origin);
    }
}
