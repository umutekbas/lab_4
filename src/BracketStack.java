public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }


    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }


    public char pop() {
        if (isEmpty()) {
            return ' ';
        }

        char savedData = top.data;

        top = top.next;

        return savedData;
    }


    public char peek() {

        if (isEmpty()) {
            return ' ';
        }

        return top.data;
    }


    public boolean isEmpty() {

        if (top == null) {
            return true;
        } else {
            return false;
        }
    }
}