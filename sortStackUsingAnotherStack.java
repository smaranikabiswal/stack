import java.util.Stack;

public class sortStackUsingAnotherStack {
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();

        while (!input.isEmpty()) {
            int temp = input.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        Stack<Integer> sorted = sortStack(stack);
        while (!sorted.isEmpty()) {
            System.out.print(sorted.pop() + " "); // 3 23 31 34 92 98
        }
    }
}
