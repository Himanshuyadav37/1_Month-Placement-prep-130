public class IntersectionLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ------------------------- INTERSECTION -------------------------

    public static Node intersect(Node l1, Node l2) {

        if (l1 == null || l2 == null) {
            return null;
        }

        Node p1 = l1;
        Node p2 = l2;

        while (p1 != p2) {

            p1 = p1 == null ? l2 : p1.next;
            p2 = p2 == null ? l1 : p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {

        // Common part
        Node common1 = new Node(8);
        Node common2 = new Node(4);
        Node common3 = new Node(5);

        common1.next = common2;
        common2.next = common3;

        // List A: 4 -> 1 -> 8 -> 4 -> 5
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = common1;

        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = common1;

        Node intersection = intersect(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}
