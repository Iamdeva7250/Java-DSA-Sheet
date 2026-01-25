public class SelectionSort {
  static void selectionsort(int[] arr){
    int n = arr.length;

    for(int i = 0; i < n - 1; i++){
      int mini = i;
      for(int j = i + 1; j < n; j++){
        if(arr[j] < arr[mini]){
          mini = j;
        }
      }
      //Swap
      int temp = arr[mini];
      arr[mini] = arr[i];
      arr[i] = temp;
    }
  }
  public static void main(String[] args) {
    SelectionSort sol = new SelectionSort();
    int[] arr = {2, 5,1, 46, 41, 20, 10, 5, 9, 10};

    System.out.println("Before The Sorting : ");
    for(int num : arr){
      System.out.print(num + " ");
    }
    sol.selectionsort(arr);

    System.out.println("\n Afetr the Selection Sorting : ");
    for(int num : arr){
      System.out.print(num + " ");
    }
  }
}
