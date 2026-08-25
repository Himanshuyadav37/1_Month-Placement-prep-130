import java.util.ArrayList;

public class StackUsingArrayList {

    // 1. Stack class------------------------------------
    static class MyStack {

        static ArrayList<Integer> list = new ArrayList<>();


        // 1. IsEmpty------------------------------------
        public static boolean isEmpty() {
            return list.size() == 0;
        }


        // 2. Push---------------------------------------
        public static void push(int data) {

            list.add(data);
        }


        // 3. Pop----------------------------------------
        public static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);

            list.remove(list.size() - 1);

            return top;
        }


        // 4. Peek---------------------------------------
        public static int peek() {

            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }


    // 2. Main method------------------------------------
    public static void main(String[] args) {

        MyStack s = new MyStack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        // Stack se elements remove karna
        while (!s.isEmpty()) {

            System.out.println(s.peek());

            s.pop();
        }
    }
}