import java.util.*;
import java.io.*;


class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        next = null;
    }
}

public class IntersectionofTwoLinkedLists {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

      if(headA == null || headB == null ) return null;

      ListNode ptr1 = headA;
      ListNode ptr2 = headB;

      while(ptr1 != ptr2){

          ptr1 = (ptr1 == null) ? headB : ptr1.next;
          ptr2 = (ptr2 == null) ? headA : ptr2.next;
      }
      return ptr1;

    }

    public static void main(String[] args) {
      IntersectionofTwoLinkedLists solution  = new IntersectionofTwoLinkedLists();

      // Creating first linked list: 1 -> 2 -> 3
      ListNode headA = new ListNode(5);
      headA.next = new ListNode(6);
      headA.next.next = new ListNode(7);
      // Creating second linked list: 9 -> 10
      ListNode headB = new ListNode(1);
      headB.next = new ListNode(2);
      // Creating intersection at node with value 8
      ListNode intersection = new ListNode(8);
      headA.next.next.next = intersection;
      headB.next.next = intersection;
      intersection.next = new ListNode(9);
      ListNode result = solution.getIntersectionNode(headA, headB);
      if(result != null){
          System.out.println("Intersection at node with value: " + result.data);
      } else {
          System.out.println("No intersection.");
      } 
      

    }
}