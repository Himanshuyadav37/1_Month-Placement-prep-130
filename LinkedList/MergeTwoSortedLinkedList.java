 class MergeTwoSortedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ------------------------- ADD LAST -------------------------

    public static Node addLast(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    // ------------------------- MERGE -------------------------

    public static Node merge(Node h1, Node h2) {

        // Tum yahan recursion ka logic complete karo

        if (h1 == null) {
            return h2;
        }

        if (h2 == null) {
            return h1;
        }


        if(h1.data <= h2.data){
            h1.next = merge(h1.next, h2);
            return h1;
        }else{
            h2.next = merge(h1, h2.next);
            return h2;
        }

    }

    // ------------------------- TRAVERSE -------------------------

    public static void traverse(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // ------------------------- MAIN -------------------------

    public static void main(String[] args) {

        Node head1 = null;
        Node head2 = null;

        // List 1:
        // 1 -> 3 -> 5
        head1 = addLast(head1, 1);
        head1 = addLast(head1, 3);
        head1 = addLast(head1, 5);

        // List 2:
        // 2 -> 4 -> 6
        head2 = addLast(head2, 2);
        head2 = addLast(head2, 4);
        head2 = addLast(head2, 6);

        Node mergedHead = merge(head1, head2);

        traverse(mergedHead);
    }
}