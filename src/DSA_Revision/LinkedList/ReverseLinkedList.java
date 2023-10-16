package DSA_Revision.LinkedList;

import DSA_Revision.LinkedList.LinkedList.Node;

public class ReverseLinkedList {
    // Reverse a linked list by Iterative Method:
    public static Node reverse(Node node) {
        Node prevNode = null;
        Node currNode = node;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        node = prevNode;
        return node;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.insert(list, 10);
        LinkedList.insert(list, 20);
        LinkedList.insert(list, 30);
        LinkedList.insert(list, 40);
        LinkedList.insert(list, 50);
        System.out.println("Before: ");
        LinkedList.printList(list);
        Node reverseNode = reverse(list.head);
        LinkedList reversedLinkedList = new LinkedList();
        reversedLinkedList.head = reverseNode;
        System.out.println("After: ");
        LinkedList.printList(reversedLinkedList);
    }
}
