package ex_4_is_Palindrom;

public class checkRec {
    public static void main(String[] args) {
        String str = "TENET";

        palindromeRecursive palin = new palindromeRecursive();
        System.out.println("is pal = " + palin.isPal(str));
    }
}
