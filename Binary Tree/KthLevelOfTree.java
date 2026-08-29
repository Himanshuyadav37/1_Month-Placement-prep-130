import java.util.*;

public class KthLevelOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int index = -1;

        // Build Tree
        public static Node buildTree(int[] nodes) {

            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // ---------------- KTH LEVEL ----------------

        public static void kthLevel(Node root, int level, int k) {

            // Tree empty hai
            if (root == null) {
                return;
            }

            // Kth level mil gaya
            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }

            // Next level par jao
            kthLevel(root.left, level + 1, k);
            kthLevel(root.right, level + 1, k);
        }
    }

    public static void main(String[] args) {

        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, -1, 6, -1, -1
        };

        Node root = BinaryTree.buildTree(nodes);

        // Level 3
        System.out.print("Kth Level: ");
        BinaryTree.kthLevel(root, 3);
    }
}