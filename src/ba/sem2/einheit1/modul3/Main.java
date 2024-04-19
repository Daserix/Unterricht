package ba.sem2.einheit1.modul3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> places = new HashMap<>(3);
        places.put("A", A);
        places.put("B", B);
        places.put("C", C);
        for (int i=10;i>0;i--) {
            places.get("A").add(i);
        }
        System.out.println(places);
        movePlate(places, 10, "A", "C", "B");
    }

    private static void movePlate(HashMap<String, ArrayList<Integer>> places, int plateNum, String origin, String target, String temp_holder) {
        if (!places.get(origin).contains(plateNum)) {
            System.out.println("Plate not in origin");
            return;
        }
        if (places.get(target).getLast() < plateNum) {
            System.out.println("Can't put bigger plate on smaller plate");
            return;
        }
        places.get(origin).indexOf(plateNum);
        if (places.get(origin).getLast() != plateNum) {
            int plateAbove = places.get(origin).get(places.get(origin).indexOf(plateNum)+1);
            movePlate(places, plateAbove, origin, temp_holder, target);
            places.get(origin).removeLast();
            places.get(target).add(plateNum);
            System.out.println("Moved " + plateNum + " from " + origin + " to " + target);
            movePlate(places, plateAbove, temp_holder, target, origin);
        } else {
            places.get(origin).removeLast();
            places.get(target).add(plateNum);
            System.out.println("Moved " + plateNum + " from " + origin + " to " + target);
        }
    }
}
