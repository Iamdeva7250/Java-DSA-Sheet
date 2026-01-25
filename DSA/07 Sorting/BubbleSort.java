import java.util.*;

public class BubbleSort {
  static void bubblesort(int[] arr){
    int n = arr.length;

    for(int i = 0; i< n -1; i++){
      for(int j = 0 ; j < n - i - 1; j++){
        if(arr[j] > arr[j + 1]){
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }


  }
  public static void main(String[] args) {
    BubbleSort sol = new BubbleSort();
  
    int[] arr = { 20, 10, 12, 5, 6, 7, 9, 45, 15, 20};

    System.out.println("Before The Bubble Sort : ");
    for(int num : arr){
      System.out.print(num + " ");
    }

    sol.bubblesort(arr);

    System.out.println("\n After The Bubble Sort : ");
    for(int num : arr){
      System.out.print(num + " ");
    }

  }
  
}
