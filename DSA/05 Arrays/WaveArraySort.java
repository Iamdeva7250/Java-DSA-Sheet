public class WaveArraySort {
    public static void waveArray(int[] arr){
        int n = arr.length;

        for(int i =0; i<n; i+=2){
            // if the current element is smaller than previous
            if(i > 0 && arr[i - 1] > arr[i]){
                swap(arr, i -1, i);
            }
            // id the curent element is samller than nest
            if(i < n - 1 && arr[i] < arr[i + 1]){
                swap(arr, i , i+1);
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 7, 10, 22, 24};

        WaveArraySort sol = new WaveArraySort();

        sol.waveArray(arr);

        System.out.println("Array in wave Form : ");
        for(int num: arr){
            System.out.print(num + " ");

        }

    }
}
