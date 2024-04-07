package ba.einheit8.modul4;

public class Main {
    public static void main(String[] args) {
        String integerAsString = "1,2";
        int integer;
        try {
            integer = Integer.parseInt(integerAsString);
        } catch (NumberFormatException nfe) {
            Class classOfTheException = nfe.getClass();
            System.out.println("Klasse der Exception war: " + classOfTheException);

            String message = nfe.getMessage();
            System.out.println("Nachricht der Exception war: " + message);

            nfe.printStackTrace();
        }
        try {
            int result = divide(4,0);
            System.out.println(result);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

    public static int divide(int a, int b) throws NumberFormatException {
        if (b==0) {
            throw new NumberFormatException("Can not divide by 0");
        } else {
            return a/b;
        }
    }
}