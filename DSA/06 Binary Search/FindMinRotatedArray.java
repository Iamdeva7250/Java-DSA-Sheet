public class FindMinRotatedArray {

        public int findMin(int[] nums) {
            int low = 0, high = nums.length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] > nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            return nums[low];
        }

        // main method to test
        public static void main(String[] args) {
            FindMinRotatedArray sol = new FindMinRotatedArray();
            int[] nums = {4, 5, 6, 7, 0, 0, 0, 1, -1,  1, 2};
            System.out.println("Minimum element is: " + sol.findMin(nums));
        }
    }


