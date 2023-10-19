package DSA_Revision.Stack;

public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Max size of stack

    boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Basic implementation of a stack: ");

        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop() + " Popped from stack");
        System.out.println(st.peek() + " Peek from stack");
    }
}
