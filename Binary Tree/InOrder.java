public class InOrder {

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

            // Create current node
            Node newNode = new Node(nodes[index]);

            // Build left subtree
            newNode.left = buildTree(nodes);

            // Build right subtree
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // ------------------------- INORDER -------------------------

        public static void inOrder(Node root) {

            // If node is null, return
            if (root == null) {
                return;
            }

            // Left subtree
            inOrder(root.left);

            // Root
            System.out.print(root.data + " ");

            // Right subtree
            inOrder(root.right);
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

        // Inorder traversal
        System.out.print("Inorder: ");
        BinaryTree.inOrder(root);
    }
}