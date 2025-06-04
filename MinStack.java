import java.util.*;

class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int x) {
        s.push(x);
        if (min.isEmpty() || x <= min.peek()) min.push(x);
    }

    public void pop() {
        if (s.pop().equals(min.peek())) min.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(5); m.push(3); m.push(7);
        System.out.println(m.getMin()); // 3
        m.pop();
        System.out.println(m.getMin()); // 3
    }
}
