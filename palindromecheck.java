import java.util.*;

public class palindromecheck {
    public static boolean isPalindrome(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()) s.push(ch);
        for (char ch : str.toCharArray()) {
            if (ch != s.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
    }
}
