import java.util.*;

public class Separatechaining {
   public ArrayList<ArrayList<Integer>> separateChaining(int hashSize, int[] arr) {
        // code here
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
       
        
        for(int i = 0; i < hashSize; i++){
            result.add(new ArrayList<>());
        }
        
        for(int num : arr){
            int index = num % hashSize;
            result.get(index).add(num);
        }
        return result;
        
    }
    public static void main(String[] args) {
        Separatechaining sc = new Separatechaining();

        int[] arr = {10, 22, 31, 4, 15, 28, 17, 88, 59};
        int hashSize = 11;
        ArrayList<ArrayList<Integer>> hashedTable = sc.separateChaining(hashSize, arr);
        System.out.println("Hash Table using Separate Chaining:");
        for (int i = 0; i < hashedTable.size(); i++) {
            System.out.print(i + " -> ");
            for (int num : hashedTable.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
      }
    }
