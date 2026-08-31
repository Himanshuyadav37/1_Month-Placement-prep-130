import java.util.*;

public class DuplicateBrackets {

    public static boolean isDuplicate(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening bracket aur characters stack mein push karo
            if (ch != ')') {
                stack.push(ch);
            }

            // Closing bracket mila
            else {

                // Yahan check karo ki ')' se pehle
                // koi operator/operand hai ya directly '(' hai
                boolean hasContent = false;

                while(stack.peek() != '('){
                    stack.pop();
                    hasContent = true;
                }


                // Yahan duplicate bracket ka logic likho
                stack.pop();

                if(!hasContent){
                    return true;
                }


            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "((a+b))";

        System.out.println(isDuplicate(str));
    }
}