public class Delete {

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

    // ---------------- INSERT AFTER A NODE ----------------

    public static void insert(Node prevNode, int data) {

        if (prevNode == null) {
            return;
        }

        Node newNode = new Node(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;

        // Agar last mein insert hua hai,
        // tail ko bhi update karna hoga.
        if (prevNode == tail) {
            tail = newNode;
        }
    }


    // --------------------------------------DELETE A NODE --------------------------------------------
    public static void delete(Node prevNode) {

        if (prevNode == null || prevNode.next == null) {
            return;
        }

        if (prevNode.next == tail) {
            tail = prevNode;
        }

        prevNode.next = prevNode.next.next;
    }

    public static void main(String[] args) {

        addFirst(30);
        addFirst(10);
        addLast(50);

        // Current list:
        // 10 -> 20 -> 30 -> 50

        // 20 ke baad 40 insert
        insert(head.next, 40);

        delete(head.next.next);

        traverse();
    }
}