
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // Right shift (k-1) and check the last bit
//        return((n >> k) & 1) == 1;
        if (((n >> k) & 1) == 1 ){
            System.out.println("SET");
            return true;
        } else {
            System.out.println("NOT SET");
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 5; // binary: 101
        int k = 1;   // check 1st bit (from right)
        checkKthBit(num, k); 
    }
}
