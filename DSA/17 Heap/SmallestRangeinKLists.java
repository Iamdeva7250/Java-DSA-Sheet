import java.util.*;
import java.io.*;

public class SmallestRangeinKLists {
    

    static class Element{
        int val, row, col;
        Element(int val, int row, int col){
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
    static int[] findSmallestRange(int[][] KSortedArray, int n, int k) {
        // add your code here
        PriorityQueue<Element> minHeap = new PriorityQueue<Element>(new Comparator<Element>(){
            public int compare(Element a, Element b){
                return Integer.compare(a.val, b.val);
            }
        } );
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < k; i++){
            minHeap.add(new Element(KSortedArray[i][0], i, 0));
            max = Math.max(max, KSortedArray[i][0]);
        }
        
        int start = 0; 
        int end = Integer.MAX_VALUE;
        
        while(true){
            Element curr = minHeap.poll();
            int min = curr.val;
            
            if(max - min < end - start || (max - min == end - start && min < start)){
                start = min;
                end = max;
            }
            
            if(curr.col + 1 < n){
                int nextVal = KSortedArray[curr.row][curr.col + 1];
                minHeap.add(new Element(nextVal, curr.row, curr.col + 1));
                max = Math.max(max, nextVal);
            }else{
                break;
            }
        }
        
        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[][] KSortedArray = {{4, 7, 9, 12, 15}, {0, 8, 10, 14, 20}, {6, 12, 16, 30, 50}};
        int n = 5; // number of elements in each list
        int k = 3; // number of lists

        int[] result = findSmallestRange(KSortedArray, n, k);
        System.out.println("Smallest range is: [" + result[0] + ", " + result[1] + "]");
    }
}
    
