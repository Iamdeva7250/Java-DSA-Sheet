public class BinaryToGrey {
    public static int BinaryToGreyCode(int n){
        return n ^ (n >> 1);
    }

    public static void main(String[] args) {
        System.out.println(BinaryToGreyCode(10));
    }
}
