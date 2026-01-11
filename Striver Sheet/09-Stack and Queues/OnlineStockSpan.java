import java.util.*;

public class OnlineStockSpan {

    Deque<int[]> stack;

    public OnlineStockSpan() {
        stack = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan oss = new OnlineStockSpan();
        System.out.println(oss.next(100)); 
        System.out.println(oss.next(80));  
        System.out.println(oss.next(60));  
        System.out.println(oss.next(70));  
        System.out.println(oss.next(60));  
        System.out.println(oss.next(75));  
        System.out.println(oss.next(85)); 
    }
}
