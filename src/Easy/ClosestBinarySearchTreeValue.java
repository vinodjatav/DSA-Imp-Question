package Easy;

public class ClosestBinarySearchTreeValue {

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Inserting value into BST
    // Average: o(log(n)) time | o(1) space
    // Worst: o(n) time | o(1) space
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private ClosestBinarySearchTreeValue createBinarySearchTree() {
        ClosestBinarySearchTreeValue bt = new ClosestBinarySearchTreeValue();
        bt.add(10);
        bt.add(8);
        bt.add(6);
        bt.add(7);
        bt.add(4);
        bt.add(3);
        bt.add(1);

        return bt;
    }

    // Finding an Element
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public static void main(String[] args) {
        System.out.println("Closest binary search tree value.");
    }
}
