package ba.sem2.einheit2.modul_bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testListe = {7, 11, 7, 90, 16, 18, 49, 1};
        System.out.println("Originale Liste: " + Arrays.toString(testListe));
        bubbleSort(testListe);
        System.out.println("Sortierte Liste: " + Arrays.toString(testListe));
    }

    static void bubbleSort(int[] numberList) {
        boolean swapped = true;
        while (swapped) { // do while wäre auch sinnvoll (da swapped anfangs immer true ist, läuft es mind. einmal durch)
            swapped = false;
            for (int i = 0; i < numberList.length-1; i++) {
                if (numberList[i]>numberList[i+1]) {
                    int temp_num = numberList[i];
                    numberList[i] = numberList[i+1];
                    numberList[i+1] = temp_num;
                    swapped = true;
                }
            }
        }
    }
}
