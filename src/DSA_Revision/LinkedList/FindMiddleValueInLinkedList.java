package DSA_Revision.LinkedList;

import java.util.ArrayList;

import DSA_Revision.LinkedList.LinkedList.Node;

public class FindMiddleValueInLinkedList {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        LinkedList.insert(list, 10);
        LinkedList.insert(list, 20);
        LinkedList.insert(list, 30);
        LinkedList.insert(list, 40);
        LinkedList.insert(list, 50);
        LinkedList.insert(list, 60);
        LinkedList.printList(list);
        Node head = list.head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(head != null){
            arrayList.add(head.data);
            head = head.next;
        }
        System.out.println("Middle value in a linked list: ");
        System.out.println(arrayList.get(arrayList.size()/2));
    }
}
