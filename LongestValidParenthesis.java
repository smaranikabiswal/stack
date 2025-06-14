import java.util.Stack;

public class LongestValidParenthesis {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else max = Math.max(max, i - stack.peek());
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())")); // Output: 4
    }
}
