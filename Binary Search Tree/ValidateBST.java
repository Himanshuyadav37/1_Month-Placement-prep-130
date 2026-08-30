public class ValidateBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max) {

        // Base case
        if (root == null) {
            return true;
        }

        // Root should be greater than min
        if (min != null && root.data <= min.data) {
            return false;
        }

        // Root should be smaller than max
        if (max != null && root.data >= max.data) {
            return false;
        }

        // Left subtree:
        // min remains same, max becomes root
        //
        // Right subtree:
        // min becomes root, max remains same
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {

        /*
                  5
                /   \
               3     7
              / \   / \
             2   4 6   8
        */

        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(isValidBST(root, null, null));
    }
}