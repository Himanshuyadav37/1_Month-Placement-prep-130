import java.util.*;
public class RootToLeafPath {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("NULL");
    }

    static void rootToLeaf(Node root, ArrayList<Integer> path) {

        // Base case
        if (root == null) {
            return;
        }

        // Current node ko path mein add karo
        path.add(root.data);

        // Agar leaf node hai
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        // Left subtree
        rootToLeaf(root.left, path);

        // Right subtree
        rootToLeaf(root.right, path);

        // Backtracking
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> path = new ArrayList<>();

        rootToLeaf(root, path);
    }
}