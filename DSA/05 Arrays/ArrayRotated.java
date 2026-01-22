public class ArrayRotated {
  
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++; end--;
        }
    }


       
     

    // Optional main method for VS Code testing
    public static void main(String[] args) {
        ArrayRotated sol = new ArrayRotated();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        sol.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
    }
  }

  

