public class SecondLargestNo {
    static int GetSecondLargestNo(int[] arr) {
        int n = arr.length;
        int largest = 0;
        int res = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res; // returns index of second largest
    }

    public static void main(String[] args) {
        int[] arr = {20, 12, 23, 40, 30, 50, 60, 100, 5, 6};

        System.out.println("The SecondLargest index is : " + GetSecondLargestNo(arr));
        System.out.println("THe SecondLargest Element is : " + arr[GetSecondLargestNo(arr)]);
    }
}
