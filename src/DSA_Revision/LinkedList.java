package DSA_Revision;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next = null;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        // Create new node
        Node new_node = new Node(data);
        new_node.next = null;
        // If linked list is empty then make new_node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till end and insert new_node at the end
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("Linked list: ");
        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.insert(list, 5);
        LinkedList.insert(list, 10);
        LinkedList.insert(list, 15);
        LinkedList.insert(list, 20);
        LinkedList.insert(list, 25);
        LinkedList.insert(list, 30);
        LinkedList.insert(list, 35);

        // Print linked list
        printList(list);
    }

}
