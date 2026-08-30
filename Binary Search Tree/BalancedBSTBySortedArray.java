public class BalancedBSTBySortedArray {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node sortedArrayToBST(int[] arr, int start, int end) {

        // Base case
        if (start > end) {
            return null;
        }

        // Middle element becomes root
        int mid = start + (end - start) / 2;

        Node root = new Node(arr[mid]);

        // Left half → left subtree
        root.left = sortedArrayToBST(arr, start, mid - 1);

        // Right half → right subtree
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Node root = sortedArrayToBST(arr, 0, arr.length - 1);
    }
}