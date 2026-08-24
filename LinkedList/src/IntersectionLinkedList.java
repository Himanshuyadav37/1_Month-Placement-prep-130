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

    public static Node getIntersectionNode(Node headA, Node headB) {

        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
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

        Node intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}