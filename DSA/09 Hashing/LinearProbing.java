import java.util.*;
public class LinearProbing {
  public ArrayList<Integer> linearProbing(int[] arr, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            result.add(-1);
        }
        
        for(int key : arr){
            int index = key % m;
            int originalindex = index;
            
            while(result.get(index) != -1 && result.get(index) != key){
                index = (index + 1) % m;
                
                
                
                if(index == originalindex){
                    break;
                }
            }
            if(result.get(index) == -1){
                result.set(index, key);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing();
        int[] arr = {10, 22, 31, 4, 15, 28, 17, 88, 59};
        int m = 11;
        ArrayList<Integer> hashedTable = lp.linearProbing(arr, m);
        System.out.println("Hash Table using Linear Probing:");
        for (int i = 0; i < hashedTable.size(); i++) {
            System.out.println(i + " -> " + hashedTable.get(i));
        }
    }
}