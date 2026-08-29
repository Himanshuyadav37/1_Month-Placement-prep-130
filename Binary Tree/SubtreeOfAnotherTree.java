public class SubtreeOfAnotherTree {

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

    // Check whether two trees are identical
    public static boolean isIdentical(Node root, Node subRoot) {

        // Both are empty
        if (root == null && subRoot == null) {
            return true;
        }

        // One is empty and other is not
        if (root == null || subRoot == null) {
            return false;
        }

        // Values must be same
        if (root.data != subRoot.data) {
            return false;
        }

        // Check left and right subtree
        return isIdentical(root.left, subRoot.left)
                && isIdentical(root.right, subRoot.right);
    }

    // Check if subRoot is a subtree of root
    public static boolean isSubtree(Node root, Node subRoot) {

        // Empty main tree
        if(root == null){
            return false;
        }

        // If values match, check whether both trees are identical
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
        }
    }

        // Search in left and right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) ;
    }

    public static void main(String[] args) {

        // Main Tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // SubTree
        Node subRoot = new Node(2);

        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}