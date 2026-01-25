import java.util.Arrays;
public class mergeWithoutExtraSpace {
  
    public static void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int i = n - 1;
        int j = 0;

        while (i >= 0 && j < m) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        // <-- NO printing here
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4, 5, 7, 7, 8};
        int[] b = {6, 7, 9, 9, 9};

        mergeArrays(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}


  

