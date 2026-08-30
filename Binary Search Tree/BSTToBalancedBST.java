import java.util.ArrayList;

public class BSTToBalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Step 1: BST → Sorted ArrayList
    static void inorder(Node root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        inorder(root.left, list);

        list.add(root.data);

        inorder(root.right, list);
    }

    // Step 2: Sorted ArrayList → Balanced BST
    static Node buildBalancedBST(ArrayList<Integer> list, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        Node root = new Node(list.get(mid));

        root.left = buildBalancedBST(list, start, mid - 1);

        root.right = buildBalancedBST(list, mid + 1, end);

        return root;
    }

    // Main function
    static Node balanceBST(Node root) {

        ArrayList<Integer> list = new ArrayList<>();

        // BST → sorted list
        inorder(root, list);

        // Sorted list → balanced BST
        return buildBalancedBST(list, 0, list.size() - 1);
    }

    public static void main(String[] args) {

        /*
                10
               /
              8
             /
            6
           /
          4
         /
        2

        Unbalanced BST
        */

        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(6);
        root.left.left.left = new Node(4);
        root.left.left.left.left = new Node(2);

        root = balanceBST(root);

        /*
                  6
                /   \
               4     8
              /       \
             2         10
        */
    }
}