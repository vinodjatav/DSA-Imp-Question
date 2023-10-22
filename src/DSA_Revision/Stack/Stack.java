package DSA_Revision.Stack;

public class Stack {
    static final int MAX = 1000;
    int top;
    char a[] = new char[MAX]; // Max size of stack

    boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(char x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }

    char peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            char x = a[top];
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Basic implementation of a stack: ");

        Stack st = new Stack();
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');
        st.push('e');
        System.out.println(st.pop() + " Popped from stack");
        System.out.println(st.peek() + " Peek from stack");
    }
}
