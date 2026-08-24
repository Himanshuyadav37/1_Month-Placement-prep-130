public class CycleDetecting {

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

    // ------------------------- CYCLE DETECTION -------------------------

    public static boolean detectCycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // slow moves 1 step
            fast = fast.next.next;     // fast moves 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        addLast(10);
        addLast(20);
        addLast(30);
        addLast(40);

        // Creating a cycle:
        // 40 -> 20
        tail.next = head.next;

        if (detectCycle()) {
            System.out.println("Cycle exists");
        } else {
            System.out.println("No cycle");
        }
    }
}