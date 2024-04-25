package ba.sem2.einheit2.modul_suchen;

public class Search {
    public static void main(String[] args) {
        int[] numbers = {54, 21, 421, 6253, 64, 88, 43, 3};
        int[] numbersSorted = {3, 21, 43, 54, 64, 88, 421, 6253};
        System.out.println(getIndex(numbers, 64));
        System.out.println(getIndexSorted(numbersSorted, 2));
        System.out.println(binarySearch(numbersSorted, 13));
    }
    static int getIndex(int[] numberList, int searchFor) {
        for (int i = 0; i<numberList.length; i++) {
            if (numberList[i] == searchFor) return i;
        }
        return -1;
    }

    static int getIndexSorted(int[] sortedNumberList, int searchFor) {
        for (int i=0; i<sortedNumberList.length; i++) {
            if (sortedNumberList[i] == searchFor) return i;
            if (sortedNumberList[i]>searchFor) break;
        }
        return -1;
    }

    static int binarySearch(int[] numberList, int searchFor) {
        int u = 0;
        int o = numberList.length-1;
        while (u <= o) {
            int m = (u+o)/2;
            if (numberList[m] == searchFor) return m;
            else if (searchFor < numberList[m]) o = m-1;
            else u = m+1;
        }
        return -1;
    }
}
