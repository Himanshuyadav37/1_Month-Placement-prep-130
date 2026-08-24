public class FindMiddle {

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

    public static void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // ------------------------- FIND MIDDLE -------------------------

    public static Node findMiddle() {

        Node slow = head;
        Node fast = head;

        while (head != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow ;
    }

    public static void main(String[] args) {

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        Node middle = findMiddle();

        System.out.println("Middle Node: " + middle.data);
    }
}