import java.util.*;

public class IntersectionOfTwoUnsorted {
  public static void main(String[] args) {
     HashSet <Integer> findIntersection = new HashSet<>();

     int arr1[] = {7, 5, 8, 9, 1, 2, 12, 15, 10};
     int arr2[] = {4, 3, 2, 1, 15, 10, 8, 7};

      for (int num : arr1) {
        findIntersection.add(num);
      }
      System.out.println("Intersection elements are: ");
      for (int num : arr2) {
        if (findIntersection.contains(num)) {
          System.out.print(num + " ");
          findIntersection.remove(num); 
        }
      }
    
  }  
}
