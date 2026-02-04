import java.util.*;

public class ImplementTwoStacksInAnArray {

    int[] arr;
    int cap, top1, top2;

    ImplementTwoStacksInAnArray(int n) {
        cap = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    // Push in stack 1
    boolean push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
            return true;
        }
        return false;
    }

    // Push in stack 2
    boolean push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
            return true;
        }
        return false;
    }

    // Pop from stack 1
    Integer pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        }
        return null;
    }

    // Pop from stack 2
    Integer pop2() {
        if (top2 < cap) {
            return arr[top2++];
        }
        return null;
    }

    // Size of stack 1
    int size1() {
        return top1 + 1;
    }

    // Size of stack 2
    int size2() {
        return cap - top2;
    }

    public static void main(String[] args) {

        ImplementTwoStacksInAnArray ts = new ImplementTwoStacksInAnArray(5);

        ts.push1(10);
        ts.push1(20);

        ts.push2(30);
        ts.push2(40);

        System.out.println(ts.pop1()); 
        System.out.println(ts.pop2()); 
        System.out.println(ts.size1()); 
        System.out.println(ts.size2()); 
    }
}
