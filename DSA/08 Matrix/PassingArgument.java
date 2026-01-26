public class PassingArgument {
  public static void print(int arr[][] ){
    for (int i = 0; i < arr.length; i++)

      for (int j = 0; j < arr[i].length; j++)

        System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);   
  }
  public static void main(String[] args) {
    int[][] arr = { { 1, 2 }, { 3, 4 } };

    print(arr);
  }
  
}
