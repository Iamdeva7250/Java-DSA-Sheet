class posOfRightMostDiff {
    public static int posOfRightMostDiffBit(int m, int n) {

        int xor = m ^ n;
        if (xor == 0) return -1;

        int position = 1;
        while ((xor & 1) == 0) {
            xor >>= 1;
            position++;
        }
        return position;
    }
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiff.posOfRightMostDiffBit(11, 9)); // Output: 2
        System.out.println(posOfRightMostDiff.posOfRightMostDiffBit(52, 4)); // Output: 5
        System.out.println(posOfRightMostDiff.posOfRightMostDiffBit(7, 7));  // Output: -1
    }
}

