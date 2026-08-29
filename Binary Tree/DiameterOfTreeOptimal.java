public class DiameterOfTreeOptimal {

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

        // Stores both diameter and height
        static class Info {
            int diam;
            int ht;

            Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        // Optimal Diameter
        public static Info diameter(Node root) {

            // Empty tree
            if (root == null) {
                return new Info(0, 0);
            }

            // Get diameter and height of left subtree
            Info leftInfo = diameter(root.left);

            // Get diameter and height of right subtree
            Info rightInfo = diameter(root.right);

            // Diameter passing through current node
            int selfDiam = leftInfo.ht + rightInfo.ht + 1;

            // Maximum diameter
            int finalDiam = Math.max(
                    selfDiam,
                    Math.max(leftInfo.diam, rightInfo.diam)
            );

            // Height of current tree
            int finalHt = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(finalDiam, finalHt);
        }
    }

    public static void main(String[] args) {

        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, -1, 6, -1, -1
        };

        Node root = BinaryTree.buildTree(nodes);

        Info result = BinaryTree.diameter(root);

        System.out.println("Diameter: " + result.diam);
        System.out.println("Height: " + result.ht);
    }
}