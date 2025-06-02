import java.util.Stack;

public class BrowserHistory {
    Stack<String> back = new Stack<>();
    Stack<String> forward = new Stack<>();
    String current;

    public BrowserHistory(String homepage) {
        current = homepage;
    }

    public void visit(String url) {
        back.push(current);
        current = url;
        forward.clear();
    }

    public String back() {
        if (!back.isEmpty()) {
            forward.push(current);
            current = back.pop();
        }
        return current;
    }

    public String forward() {
        if (!forward.isEmpty()) {
            back.push(current);
            current = forward.pop();
        }
        return current;
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("google.com");
        bh.visit("leetcode.com");
        bh.visit("github.com");
        System.out.println(bh.back());      // leetcode.com
        System.out.println(bh.back());      // google.com
        System.out.println(bh.forward());   // leetcode.com
    }
}
