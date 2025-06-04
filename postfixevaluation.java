import java.util.*;

public class postfixevaluation {
    public static int evaluate(String expr) {
        Stack<Integer> s = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                s.push(ch - '0');
            } else {
                int b = s.pop();
                int a = s.pop();
                switch (ch) {
                    case '+': s.push(a + b); break;
                    case '-': s.push(a - b); break;
                    case '*': s.push(a * b); break;
                    case '/': s.push(a / b); break;
                }
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("231*+9-")); // => 2 + 3*1 - 9 = -4
    }
}
