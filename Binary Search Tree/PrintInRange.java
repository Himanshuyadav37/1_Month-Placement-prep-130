public class PrintInRange {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void printInRange(Node root, int X, int Y) {

        if (root == null) {
            return;
        }

        // Case 1: Root X se chhota hai
        // Left subtree mein X se bhi chhote elements honge
        if (root.data < X) {
            printInRange(root.right, X, Y);
        }

        // Case 2: Root range ke andar hai
        if (root.data >= X && root.data <= Y) {
            System.out.print(root.data + " ");
        }

        // Case 3: Root Y se bada hai
        // Right subtree mein Y se bhi bade elements honge
        if (root.data > Y) {
            printInRange(root.left, X, Y);
        }

        // Agar root range ke beech mein hai,
        // dono subtrees explore karne hain
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {

        /*
                  8
                /   \
               5     10
              / \      \
             3   6      11
            / \
           1   4
        */

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(11);

        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        int X = 4;
        int Y = 10;

        printInRange(root, X, Y);
    }
}