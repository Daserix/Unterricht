package ba.sem2.einheit1.modul1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Springer s1 = new Springer(5,4);
        System.out.println(s1.canMoveTo(4,6));
        System.out.println(s1.possibleMoves());

        ArrayList<int[]> test = new ArrayList<int[]>();
        test.add(new int[]{0,1});
        System.out.println(test);
        System.out.println(new int[]{0,1}[0]);
    }
}
