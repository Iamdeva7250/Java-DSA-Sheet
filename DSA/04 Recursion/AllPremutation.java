 class AllPermutation {
    // Function to swap characters in a char array
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive function to generate permutations
    static void permutation(char[] arr, int i) {
        if (i == arr.length - 1) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            permutation(arr, i + 1);
            swap(arr, i, j); // backtrack
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        permutation(arr, 0);
    }
}
