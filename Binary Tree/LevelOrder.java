import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    // ------------------------- NODE -------------------------

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

    // ------------------------- BINARY TREE -------------------------

    static class BinaryTree {

        static int index = -1;

        // Build tree from preorder array
        public static Node buildTree(int[] nodes) {

            index++;

            // -1 means no node
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            // Build left subtree
            newNode.left = buildTree(nodes);

            // Build right subtree
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // ------------------------- LEVEL ORDER -------------------------

        public static void levelOrder(Node root) {

            // Empty tree
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();

            // Add root to queue
            q.add(root);

            while (!q.isEmpty()) {

                // Remove front node
                Node current = q.remove();

                // Print current node
                System.out.print(current.data + " ");

                // Add left child
                if (current.left != null) {
                    q.add(current.left);
                }

                // Add right child
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }
    }

    // ------------------------- MAIN -------------------------

    public static void main(String[] args) {

        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, -1, 6, -1, -1
        };

        // Build tree
        Node root = BinaryTree.buildTree(nodes);

        // Level Order Traversal
        System.out.print("Level Order: ");
        BinaryTree.levelOrder(root);
    }
}