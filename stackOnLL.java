public class stackOnLL{

    // Stack class with internal Node definition
    static class Stack {
        // Node class
        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head = null;

        // Check if stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Push an element onto the stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop the top element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek at the top element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return head.data;
        }
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
