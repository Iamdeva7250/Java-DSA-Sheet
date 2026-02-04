import java.util.*;

public class ImplementKStacksinanArray {

    int[] arr;     // stores actual elements
    int[] top;     // top index of each stack
    int[] next;    // next free / next element
    int free;      // beginning index of free list
    int k, cap;

    // Constructor
    ImplementKStacksinanArray(int k, int n) {
        this.k = k;
        cap = n;

        arr = new int[n];
        top = new int[k];
        next = new int[n];

        // Initialize all stacks as empty
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }

        // Initialize free list
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;

        free = 0;
    }

    // Push x into stack number sn (0-based index)
    boolean push(int sn, int x) {
        if (free == -1) {
            System.out.println("Stack Overflow");
            return false;
        }

        int i = free;          // get free index
        free = next[i];        // update free list

        next[i] = top[sn];     // link previous top
        top[sn] = i;           // update top
        arr[i] = x;

        return true;
    }

    // Pop from stack number sn
    int pop(int sn) {
        if (top[sn] == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int i = top[sn];
        top[sn] = next[i];

        next[i] = free;        // add index to free list
        free = i;

        return arr[i];
    }

    boolean isEmpty(int sn) {
        return top[sn] == -1;
    }

    // Driver code
    public static void main(String[] args) {

        ImplementKStacksinanArray ks = new ImplementKStacksinanArray(3, 10);

        ks.push(0, 10);
        ks.push(0, 20);
        ks.push(1, 30);
        ks.push(2, 40);
        ks.push(1, 50);

        System.out.println(ks.pop(0)); 
        System.out.println(ks.pop(1)); 
        System.out.println(ks.pop(2)); 
    }
}
