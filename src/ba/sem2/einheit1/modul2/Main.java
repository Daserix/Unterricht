package ba.sem2.einheit1.modul2;

public class Main {
    public static void main(String[] args) {
        System.out.println(woE("Kissen"));
    }

    private static int woE(String wort) {
        for (int i=0; i<wort.length(); i++) {
            if(wort.charAt(i)=='e') return i;
        }
        return -1;
    }
}
