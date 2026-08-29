import java.util.*;

public class TopViewOfTree {

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

        // ------------------------- TOP VIEW -------------------------

        static class Info {
            Node node;
            int hd;

            Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {

            if (root == null) {
                return;
            }

            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            // Root has horizontal distance 0
            q.add(new Info(root, 0));

            int min = 0;
            int max = 0;

            while (!q.isEmpty()) {

                Info current = q.remove();

                // First node at this horizontal distance
                if (!map.containsKey(current.hd)) {
                    map.put(current.hd, current.node);
                }

                // Left child → HD - 1
                if (current.node.left != null) {
                    q.add(new Info(current.node.left, current.hd - 1));
                    min = Math.min(min, current.hd - 1);
                }

                // Right child → HD + 1
                if (current.node.right != null) {
                    q.add(new Info(current.node.right, current.hd + 1));
                    max = Math.max(max, current.hd + 1);
                }
            }

            // Print from leftmost HD to rightmost HD
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }

    // ------------------------- MAIN -------------------------

    public static void main(String[] args) {

        int[] nodes = {
                1, 2, 4, -1, -1, 5, -1, -1,
                3, -1, 6, -1, -1
        };

        Node root = BinaryTree.buildTree(nodes);

        System.out.print("Top View: ");
        BinaryTree.topView(root);
    }
}