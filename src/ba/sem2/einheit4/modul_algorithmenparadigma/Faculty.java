package ba.sem2.einheit4.modul_algorithmenparadigma;

public class Faculty {
    public static void main(String[] args) {
        System.out.println(FAC(6));
    }

    public static int FAC(int x) {
        int y = 1;
        while (x>1) {
            y *= x;
            x--;
        }
        return y;
    }
}
