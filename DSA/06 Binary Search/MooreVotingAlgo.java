public class MooreVotingAlgo {

        int majorityElement(int arr[]) {
            int n = arr.length;
            int candidate = arr[0], count = 1;

            // Step 1: Find candidate
            for(int i = 1; i < n; i++){
                if(arr[i] == candidate) count++;
                else count--;
                if(count == 0){
                    candidate = arr[i];
                    count = 1;
                }
            }

            // Step 2: Verify candidate
            count = 0;
            for(int num : arr){
                if(num == candidate) count++;
            }

            if(count > n / 2) return candidate;
            return -1; // No majority element
        }

        public static void main(String[] args){
            MooreVotingAlgo sol = new MooreVotingAlgo();
            int arr[] = {999, 1000, 1000, 999, 1000, 1000, 999, 1000, 999, 1000};
            System.out.println("Majority element: " + sol.majorityElement(arr));
        }
    }


