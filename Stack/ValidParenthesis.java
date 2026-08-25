import java.util.Stack;

public class ValidParentheses {

    // 1. isValid method--------------------------------
    public static boolean isValid(String s) {

        // Stack mein opening brackets store honge
        Stack<Character> stack = new Stack<>();


        // String ko left to right traverse karna
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);


            // 1. Agar opening bracket hai
            //    to Stack mein push karo
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            }


            // 2. Agar closing bracket hai
            else {

                // Agar Stack empty hai,
                // to matching opening bracket available nahi hai
                if (stack.isEmpty()) {
                    return false;
                }


                // Stack ke TOP ko check karna
                char top = stack.peek();


                // Matching bracket check karna
                if ((top == '(' && ch == ')') ||
                        (top == '{' && ch == '}') ||
                        (top == '[' && ch == ']')) {

                    // Match ho gaya to TOP ko remove karo
                    stack.pop();
                }

                // Agar closing bracket match nahi hua
                else {
                    return false;
                }
            }
        }


        // Agar Stack empty hai,
        // to saare brackets properly match ho gaye
        return stack.isEmpty();
    }


    // 2. Main method-----------------------------------
    public static void main(String[] args) {

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("]"));
        System.out.println(isValid("((("));
    }
}