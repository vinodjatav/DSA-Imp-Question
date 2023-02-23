package Easy;

public class BinarySearchTree {
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

    private BinarySearchTree createBinarySearchTree() {
        BinarySearchTree bt = new BinarySearchTree();
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

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        } else if (value > current.value) {
            current.right = deleteRecursive(current.right, value);
            return current;
        } else {
            if(current.left == null){
                return current.right;
            }
            else if(current.right == null){
                return current.left;
            }
            current.value = minValue(current.right);
            // Delete the inorder successor
            current.right = deleteRecursive(current.right, current.value);
   
        }
        return current;
    }

    int minValue(Node root){
        int minV = root.value;
        while(root.left != null){
            minV = root.left.value;
            root = root.left;
        }
        return minV;
    }

    public void deleteNode(int value){
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public void inorder(){
        traverseInOrder(root);
    }
    public static void main(String[] args) {
        System.out.println("Binary search tree implementation.");

        BinarySearchTree tree = new BinarySearchTree();
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);
 
        System.out.println(
            "Inorder traversal of the given tree");
        tree.inorder();
 
        System.out.println("\nDelete 20");
        tree.deleteNode(20);
        System.out.println(
            "Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 30");
        tree.deleteNode(30);
        System.out.println(
            "Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 50");
        tree.deleteNode(50);
        System.out.println(
            "Inorder traversal of the modified tree");
        tree.inorder();
    }
}
