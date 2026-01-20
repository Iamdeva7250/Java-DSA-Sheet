class LongCons1s {
    public static int maxConsecutiveOnes(int n) {
        int count = 0;   // stores current streak of 1s
        int maxCount = 0; // stores maximum streak

        while (n > 0) {
            if ((n & 1) == 1) {  // check last bit
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; // reset when a 0 is found
            }
            n >>= 1;  // right shift to check next bit
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(14)); // binary: 1110 → output: 3
        System.out.println(maxConsecutiveOnes(222)); // binary: 11011110 → output: 4
    }
}
