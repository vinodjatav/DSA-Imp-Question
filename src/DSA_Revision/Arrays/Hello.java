package DSA_Revision.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class Hello {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        // int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(20);
        System.out.println(arrList);
        System.out.println(Arrays.toString(arr));
        // for(int element: arr){
        //     System.out.println(element+ " ");
        // }
        // Iterating ArrayList using Iterator
        Iterator<Integer> it = arrList.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println("Traverse using lambda function: ");
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        arrList.forEach(number->System.out.println(number));
        System.out.println("Using Enumeration: ");
        Enumeration<Integer> e = Collections.enumeration(arrList);
        while(e.hasMoreElements()){
            System.out.println(e.nextElement() + " ");
        }
        // for(int i=0;i<arrList.size(); i++){
        //     System.out.println("Hello: "+  arrList.get(i));
        // }
    }
}
