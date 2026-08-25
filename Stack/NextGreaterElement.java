import java.util.Stack;

public class NextGreaterElement {

    // Method to find Next Greater Element
    public static int[] nextGreaterElement(int[] arr) {

        int n = arr.length;

        // Answer array
        int[] result = new int[n];

        // Stack mein elements ke indices store karenge
        Stack<Integer> stack = new Stack<>();


        // Array ko right se left traverse karenge
        for (int i = n - 1; i >= 0; i--) {

            // Stack ke top par jo elements
            // current element se chhote ya equal hain,
            // unhe remove kar do
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }


            // Agar stack empty hai,
            // to koi greater element nahi mila
            if (stack.isEmpty()) {
                result[i] = -1;
            }

            // Stack ka top Next Greater Element hai
            else {
                result[i] = arr[stack.peek()];
            }


            // Current element ko stack mein push karo
            stack.push(i);
        }

        return result;
    }


    // Main method
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 3, 4};

        int[] result = nextGreaterElement(arr);


        // Result print karna
        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
        }
    }
}