import java.util.*;
public class PairWithSum {
  public static void main(String[] args) {
    int arr[] = {8, 7, 2, 5, 3, 1};
    int targetSum = 10;

    HashSet<Integer> numSet = new HashSet<>();
    System.out.println("Pairs with sum " + targetSum + " are: ");
    for (int num : arr) {
      int complement = targetSum - num;
      
      if (numSet.contains(complement)) {

        System.out.println("(" + complement + ", " + num + ")");
      }
      numSet.add(num);
    }
  }
  
}
