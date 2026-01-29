import java.util.*;
public class unionTwoArray {
  public  int unionArray(int arr1[], int arr2[]){
    HashSet <Integer> unionSet = new HashSet<>();
    for(int num : arr1){
      unionSet.add(num);
    }
    for(int num : arr2){
      unionSet.add(num);
    }
    return unionSet.size();
  }  

  public static void main(String[] args) {
    unionTwoArray obj = new unionTwoArray();
    int arr1[] = {7, 5, 8, 9, 1, 2, 12, 15, 10};
    int arr2[] = {4, 3, 2, 1, 15, 10, 8, 7};
    int unionCount = obj.unionArray(arr1, arr2);
    System.out.println("The count of union elements is: " + unionCount);
  }
}
