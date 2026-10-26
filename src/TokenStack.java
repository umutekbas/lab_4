public class TokenStack {

    private class Node {

        String data;


        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    private Node top;

    public TokenStack() {

        top = null;
    }

    public void push(String value) {

        Node newNode = new Node(value);

        newNode.next = top;

        top = newNode;
    }

    public String pop() {

        if (isEmpty()) {
            return "";
        }

        String storedValue = top.data;

        top = top.next;

        return storedValue;
    }

    public boolean isEmpty() {

        if (top == null) {
            return true;
        } else {
            return false;
        }
    }
}