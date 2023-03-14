package ex_4_is_Palindrom;

class palCheckRecursive {
    boolean isPal(String str) {
        int len = str.length();

        if(len <= 1) {
            return true;
        }

        if(str.charAt(0) != str.charAt(len-1))
            return false;

        String betweenStr = str.substring(1, len-1);
        return isPal(betweenStr);
    }
}

public class testPalin {
    public static void main(String[] args) {
        String str = "ПОТОП";
        int strLen = str.length();

        boolean isPal = true;
        for(int count = 0; strLen % 2 != 0 ? count < strLen/2 : count < (strLen/2 - 1); count++){
            if(str.charAt(count) != str.charAt(strLen - (count + 1)))
            {
                isPal = false;
                break;
            }
        }
        System.out.println("is palindrome = " + isPal);

        palCheckRecursive palin = new palCheckRecursive();
        System.out.println("palindrome check recursive = " + palin.isPal(str));
    }
}
