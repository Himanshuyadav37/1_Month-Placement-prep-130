public class StackUsingLinkedList {

    // 1. Node class-------------------------------------
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // 2. Stack class------------------------------------
    static class MyStack {

        static Node head = null;


        // 1. IsEmpty------------------------------------
        public static boolean isEmpty() {
            return head == null;
        }


        // 2. Push---------------------------------------
        public static void push(int data) {

            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }


        // 3. Pop----------------------------------------
        public static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = head.data;

            head = head.next;

            return top;
        }


        // 4. Peek---------------------------------------
        public static int peek() {

            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }


    // 3. Main method------------------------------------
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