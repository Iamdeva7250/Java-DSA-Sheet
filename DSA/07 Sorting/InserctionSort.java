import java.util.*;
public class InserctionSort {
  static void inserctionsort(int[] arr){
    int n = arr.length;

    for(int i = 1; i< n; i++){
      int key = arr[i];
      int j = i - 1;
      while(j >= 0 && arr[j] > key){
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
  public static void main(String[] args) {
    InserctionSort sol = new InserctionSort();

    int[] arr = {13, 46, 24, 52, 20, 9};

    System.out.println("Before The Inserction Sort : .. ");
    for(int num : arr){
      System.out.print(num + " ");
    }

    sol.inserctionsort(arr);

    System.out.println("\nAfter the Inserction Sort : ... ");
    for(int num : arr){
      System.out.print(num + " ");
    }
    
  }
}
