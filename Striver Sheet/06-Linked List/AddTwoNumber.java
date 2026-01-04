import java.util.*;
import java.io.*;

class ListNode{
  int data;
  ListNode next;

  ListNode(int data){
    this.data = data;
    this.next = null;
  }
}

public class AddTwoNumber {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
      AddTwoNumber solver = new AddTwoNumber();

      // Creating first number: 342 (represented as 2 -> 4 -> 3)
      ListNode l1 = new ListNode(2);
      l1.next = new ListNode(4);
      l1.next.next = new ListNode(3);

      // Creating second number: 465 (represented as 5 -> 6 -> 4)
      ListNode l2 = new ListNode(5);
      l2.next = new ListNode(6);
      l2.next.next = new ListNode(4);

      ListNode result = solver.addTwoNumbers(l1, l2);

      // Printing the result: should represent 807 (7 -> 0 -> 8)
      while (result != null) {
          System.out.print(result.data + " ");
          result = result.next;
      }
    }
}
