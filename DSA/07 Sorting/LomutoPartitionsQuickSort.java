import java.util.*;
public class LomutoPartitionsQuickSort {
  // Java program to demonstrate the Lomuto partition
// in quick sort


    static int sort(int numbers[], int start, int last)
    {
        int pivot = numbers[last];
        int index = start - 1;
        int temp = 0;
      
        for (int i = start; i < last; ++i)
        {
            if (numbers[i] < pivot) {
                ++index;
              
                // swap the position
                temp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = temp;
            }
        }
      
        int pivotposition = ++index;
      
        temp = numbers[index];
        numbers[index] = pivot;
        numbers[last] = temp;
      
        return pivotposition;
    }
  
    static void quicksort(int numbers[], int start, int end)
    {
        if (start < end) 
        {
            int pivot_position = sort(numbers, start, end);
            quicksort(numbers, start, pivot_position - 1);
            quicksort(numbers, pivot_position + 1, end);
        }
    }
  
    static void print(int numbers[])
    {
        for (int a : numbers) {
            System.out.print(a + " ");
        }
    }
  
    public static void main(String[] args)
    {
        int numbers[] = { 4, 5, 1, 2, 4, 5, 6 };
        quicksort(numbers, 0, numbers.length - 1);
        print(numbers);
    }
}
  

