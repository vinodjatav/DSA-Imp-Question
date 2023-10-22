package DSA_Revision.Stack;

public class CheckBalancedParenthesis {
    public static boolean checkBalancedParenthesis(String str) {
        Stack st = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
                continue;
            }
            if (st.isEmpty()) {
                return false;
            }
            char check;
            switch (ch) {
                case ')':
                    check = st.pop();
                    if (check == '[' || check == '{')
                        return false;
                    break;
                case ']':
                    check = st.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
                case '}':
                    check = st.pop();
                    if (check == '[' || check == '(')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Use stack to check for balanced parenthesis");
        String str = "[()]{}{[()()]()}";
        boolean result = CheckBalancedParenthesis.checkBalancedParenthesis(str);
        if (result) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
