package DSA_Revision.LinkedList;

import DSA_Revision.LinkedList.LinkedList.Node;

public class RemoveLoopInLinkedList {
    public static int detectAndRemoveLoop(Node node) {
        Node slow_ptr = node, fast_ptr = node;
        while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;

            if (slow_ptr == fast_ptr) {
                // Loop detected
                removeLoop(slow_ptr, node);
                return 1;
            }

        }
        return 0;
    }

    public static void removeLoop(Node loop, Node head) {
        Node ptr1 = loop, ptr2 = loop;
        Node prevNode = ptr1;
        while (ptr1.next != ptr2) {
            prevNode = ptr1;
            ptr1 = ptr1.next;
        }
        prevNode.next = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next.next;
        RemoveLoopInLinkedList.detectAndRemoveLoop(list.head);
        System.out.println("Linked List after removing loop : ");
        LinkedList.printList(list);
    }
}
