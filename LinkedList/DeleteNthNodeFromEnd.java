class DeleteNthNodeFromEnd {

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

    // ------------------------- REMOVE NTH NODE FROM END -------------------------

    public static Node removeNthFromEnd(Node head, int n) {

        Node slow = head;
        Node fast = head;

        // Move fast n steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // Edge case: head itself needs to be removed
        if (fast == null) {
            return head;
        }

        // Move both pointers
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next;
        }

        // Remove nth node
        slow.next = slow.next.next;

        return head;
    }

    public static void traverse(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        // 2nd node from end = 4
        head = removeNthFromEnd(head, 2);

        traverse(head);
    }
}