import java.util.*;

public class MaximumAndValue {
    public int maxAnd(List<Integer> arr){
        int res = 0;
        for(int i = 31; i >= 0; i--){
            int candidate = res | (1 << i);

            int count = 0;
            for(int num : arr){
                if((num & candidate) == candidate){
                    count++;
                }
            }

            if(count >= 2){
                res = candidate;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumAndValue obj  = new MaximumAndValue();
        List<Integer> arr = Arrays.asList(4, 8, 6, 2);

        // ✅ Pass arr to the method
        System.out.println(obj.maxAnd(arr)); // Output: 4
    }
}
