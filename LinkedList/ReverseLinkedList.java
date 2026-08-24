public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    public static void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {

        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void traverse() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // -------------------------------- REVERSE LINKED LIST --------------------------------

    public static void reverse() {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        tail = head;
        head = prev;
    }

    public static void main(String[] args) {

        addFirst(30);
        addFirst(10);
        addLast(50);

        // Before reverse:
        // 10 -> 30 -> 50 -> null

        reverse();

        // After reverse:
        // 50 -> 30 -> 10 -> null

        traverse();
    }
}