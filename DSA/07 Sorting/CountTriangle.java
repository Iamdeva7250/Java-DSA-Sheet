  import java.util.Arrays;
public class CountTriangle {

    public int countTriangles(int arr[]) {
        int n = arr.length;
        if (n < 3) return 0;

        Arrays.sort(arr);
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);  // ✅ Corrected here
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CountTriangle ct = new CountTriangle();
        int arr[] = {4, 6, 3, 7};
        System.out.println("Number of triangles: " + ct.countTriangles(arr));  
    }


}

  

