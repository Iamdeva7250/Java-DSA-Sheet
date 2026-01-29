
import java.util.*;

public class FrequencyArray {

  public static void main(String[] args) {

    HashMap<Integer, Integer> frequencyMap = new HashMap<>();

    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

    for (int num : arr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
    }

  }
}
