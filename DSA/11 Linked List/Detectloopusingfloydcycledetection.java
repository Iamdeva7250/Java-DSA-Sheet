import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Detectloopusingfloydcycledetection {

    Node head;

    // Insert node at beginning
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Detect loop using Floyd’s Cycle Detection
    public void detectLoop() {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Loop Found");
                return;
            }
        }
        System.out.println("No Loop");
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Detectloopusingfloydcycledetection list =
                new Detectloopusingfloydcycledetection();

        list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);

        // Creating loop: last node → head
        list.head.next.next.next.next = list.head;

        list.detectLoop();
    }
}
