package ba.sem2.einheit2.modul_suchen;

public class Search {
    public static void main(String[] args) {
        int[] zahlen = {54, 21, 421, 6253, 64, 88, 43, 3};
        System.out.println(getIndex(zahlen, 65));
    }
    static int getIndex(int[] numberList, int searchFor) {
        for (int i = 0; i<numberList.length; i++) {
            if (numberList[i] == searchFor) {
                return(i);
            }
        }
        return -1;
    }
}
