import java.util.ArrayList;

public class GetMinInHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last index
            arr.add(data);

            int x = arr.size() - 1;     // child index
            int par = (x - 1) / 2;      // parent index

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
    }

    public static void main(String[] args) {

        Heap h = new Heap();

        h.add(10);
        h.add(5);
        h.add(20);
        h.add(2);
        h.add(8);

        System.out.println("Minimum element: " + h.peek());
    }
}