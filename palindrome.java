import java.util.*;

class Node {
    int data;
    Node ptr;

    Node(int data) {
        this.data = data;
        this.ptr = null;
    }
}

class palindrome {
    public static void main(String args[]) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;

        boolean condition = isPalindrome(one);
        System.out.println("Palindrome: " + condition);
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        Stack<Integer> stack = new Stack<>();

        // Push all elements into stack
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        // Traverse again and compare with stack
        while (head != null) {
            int top = stack.pop();
            if (head.data != top) {
                return false;
            }
            head = head.ptr;
        }

        return true;
    }
}
