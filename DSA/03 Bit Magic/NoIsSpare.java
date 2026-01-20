public class NoIsSpare {
    public static boolean isSpare(int n){
        return (n & (n >> 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isSpare(5));
        System.out.println(isSpare(10));
        System.out.println(isSpare(25));
    }
}
