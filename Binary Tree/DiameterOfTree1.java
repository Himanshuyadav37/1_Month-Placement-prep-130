public class DiameterOfTree1 {

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

        // Build tree
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

        // Height of tree
        public static int height(Node root) {

            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Diameter of tree
        public static int diameter(Node root) {

            if (root == null) {
                return 0;
            }

            // Diameter of left subtree
            int leftDiam = diameter(root.left);

            // Diameter of right subtree
            int rightDiam = diameter(root.right);

            // Height of left subtree
            int leftHeight = height(root.left);

            // Height of right subtree
            int rightHeight = height(root.right);

            // Diameter passing through current node
            int selfDiam = leftHeight + rightHeight + 1;

            // Maximum of all three
            return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
        }
    }

    public static void main(String[] args) {

        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, -1, 6, -1, -1
        };

        Node root = BinaryTree.buildTree(nodes);

        System.out.println("Diameter of Tree: " +
                BinaryTree.diameter(root));
    }
}