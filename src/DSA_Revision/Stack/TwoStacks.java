package DSA_Revision.Stack;

public class TwoStacks {
    // Implement two stacks in an array
    int[] arr;
    int size;
    int top1, top2;

    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;

        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;

        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack UnderFlow");
            System.exit(1);
        }
        return 0;
    }

    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack UnderFlow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(10);
        ts.push2(20);
        ts.push2(30);
        ts.push1(40);
        ts.push2(50);
        System.out.println("Popped element from stack1 is "
                + ": " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is "
                + ": " + ts.pop2());
    }
}
