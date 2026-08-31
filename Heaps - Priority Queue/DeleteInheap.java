import java.util.ArrayList;

public class DeleteInheap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {

            // Add at last index
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (x > 0 && arr.get(x) < arr.get(par)) {

                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Move upward
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minIdx = i;

            if (left < arr.size() &&
                    arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() &&
                    arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {

                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // Heapify down
                heapify(minIdx);
            }
        }

        public int remove() {

            // Store minimum element
            int data = arr.get(0);

            // Step 1: Move last element to root
            int last = arr.remove(arr.size() - 1);

            // Step 2: If heap is not empty
            if (!arr.isEmpty()) {
                arr.set(0, last);

                // Step 3: Heapify
                heapify(0);
            }

            return data;
        }
    }

    public static void main(String[] args) {

        Heap h = new Heap();

        h.add(10);
        h.add(5);
        h.add(20);
        h.add(2);
        h.add(8);

        System.out.println("Heap: " + h.arr);

        System.out.println("Deleted: " + h.remove());

        System.out.println("Heap after deletion: " + h.arr);

        System.out.println("Minimum: " + h.peek());
    }
}