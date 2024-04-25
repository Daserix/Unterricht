package ba.sem2.einheit2.modul_suchen;

import java.util.Random;

public class BetterSearch {
    static int ifsStandard = 0;
    static int ifsBetter = 0;
    static int steps = 0;
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i<100; i++) {
            numbers[i] = i+1;
        }
        Random rand = new Random();
        for (int i = 0; i<100000; i++) {
            int randInt = rand.nextInt(100)+1;
            int index = binarySearch(numbers, randInt);
            int index2 = betterBinarySearch(numbers, randInt);
            int index3 = binarySearchNormale(numbers, randInt);


        }
        System.out.println("Ifs (standard): " + ifsStandard + " Ifs (better): " + ifsBetter);
        System.out.println("Average Ifs (standard): " + ifsStandard /100000.0);
        System.out.println("Average Ifs (standard): " + ifsBetter /100000.0);
        System.out.println("Average steps: " + steps/100000.0);

    }

    static int binarySearchNormale(int[] numberList, int searchFor) {
        int u = 0;
        int o = numberList.length;
        while (u<=o) {
            int m = (u+o)/2;
            steps++;
            if (numberList[m]==searchFor) return m;
            else if (searchFor < numberList[m]) o = m-1;
            else u = m+1;
        }
        return -1;
    }

    static int binarySearch(int[] numberList, int searchFor) {
        int u = 0;
        int o = numberList.length;
        while (u <= o) {
            int m = (u+o)/2;
            ifsStandard++;
            if (numberList[m] == searchFor) return m;
            else {
                ifsStandard++;
                if ((searchFor < numberList[m])) o = m-1;
                else u = m+1;
            }
        }
        return -1;
    }

    static int betterBinarySearch(int[] numberList, int searchFor) {
        int u = 0;
        int o = numberList.length;
        while (u <= o) {
            int m = (u+o)/2;
            ifsBetter++;
            if (searchFor < numberList[m]) o = m-1;
            else {
                ifsBetter++;
                if (numberList[m] == searchFor) return m;
                else u = m+1;
            }
        }
        return -1;
    }
}
