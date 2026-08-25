import java.util.Stack;

public class MinStack {

    // Main Stack mein saare elements store honge
    static Stack<Integer> stack = new Stack<>();

    // Min Stack mein har level ka current minimum store hoga
    static Stack<Integer> minStack = new Stack<>();


    // 1. Push------------------------------------------
    public static void push(int data) {

        // Main Stack mein element push karo
        stack.push(data);


        // Agar Min Stack empty hai,
        // to current element hi minimum hoga
        if (minStack.isEmpty()) {

            minStack.push(data);
        }

        // Agar current element existing minimum se chhota
        // ya equal hai, to ise Min Stack mein push karo
        else if (data <= minStack.peek()) {

            minStack.push(data);
        }
    }


    // 2. Pop-------------------------------------------
    public static int pop() {

        // Agar Stack empty hai
        if (stack.isEmpty()) {
            return -1;
        }

        // Main Stack ka top element
        int top = stack.pop();


        // Agar popped element current minimum tha,
        // to Min Stack se bhi remove karo
        if (top == minStack.peek()) {

            minStack.pop();
        }

        return top;
    }


    // 3. Top-------------------------------------------
    public static int top() {

        // Agar Stack empty hai
        if (stack.isEmpty()) {
            return -1;
        }

        // Main Stack ka top return karo
        return stack.peek();
    }


    // 4. Get Minimum-----------------------------------
    public static int getMin() {

        // Agar Stack empty hai
        if (minStack.isEmpty()) {
            return -1;
        }

        // Min Stack ka top current minimum hai
        return minStack.peek();
    }


    // 5. Main method-----------------------------------
    public static void main(String[] args) {

        push(5);
        push(2);
        push(8);
        push(1);

        System.out.println("Top: " + top());
        System.out.println("Minimum: " + getMin());

        System.out.println("Popped: " + pop());

        System.out.println("Top: " + top());
        System.out.println("Minimum: " + getMin());

        System.out.println("Popped: " + pop());

        System.out.println("Top: " + top());
        System.out.println("Minimum: " + getMin());
    }
}