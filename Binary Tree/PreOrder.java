public class PreOrder {

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

            // -1 means there is no node here
            if (nodes[index] == -1) {
                return null;
            }

            // Create current node
            Node newNode = new Node(nodes[index]);

            // Build left subtree
            newNode.left = buildTree(nodes);

            // Build right subtree
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // ------------------------- PREORDER -------------------------

        public static void preOrder(Node root) {

            // If node is null, return
            if (root == null) {
                return;
            }

            // Root
            System.out.print(root.data + " ");

            // Left subtree
            preOrder(root.left);

            // Right subtree
            preOrder(root.right);
        }
    }

    // ------------------------- MAIN -------------------------

    public static void main(String[] args) {

        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, -1, 6, -1, -1
        };

        // Build the binary tree
        Node root = BinaryTree.buildTree(nodes);

        // Print preorder traversal
        System.out.print("Preorder: ");
        BinaryTree.preOrder(root);
    }
}