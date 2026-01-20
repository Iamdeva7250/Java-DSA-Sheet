public class SwapOddAndEven {
    public static int SwapBits(int n){
        int evenBits = n & 0xAAAAAAAA;
        int oddBits = n & 0x55555555;

        evenBits >>= 1;
        oddBits <<= 1;

        return (evenBits | oddBits);
    }

    public static void main(String[] args) {
        int n = 23;
        System.out.println("Before Swapping : " + n);
        System.out.println("After Swapping : " + SwapBits(n));
    }
}
