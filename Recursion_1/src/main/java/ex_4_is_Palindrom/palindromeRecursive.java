package ex_4_is_Palindrom;

public class palindromeRecursive {
    public boolean isPal(String str) {
        int len = str.length();

        if(len <= 1) {
            return true;
        }

        if(str.charAt(0) != str.charAt(len-1))
            return false;

        return isPal(str.substring(1, len-1));
    }
}
