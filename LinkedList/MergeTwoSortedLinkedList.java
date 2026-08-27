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

        Node dummy = new Node(-1);
        Node curr = dummy;

      while(h1.val != null && h2.val != null){
       if(h1.val <= h2.val){
        curr.next = h1;
         h1 = h1.next;
       }else{
        curr.next = h2;
        h2= h2.next;
       }

        curr = curr.next;

        // Jo list bach gayi usko attach kar do
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
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
