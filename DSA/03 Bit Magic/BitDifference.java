import java.util.Scanner;



public class BitDifference {
    public static int countBitsFlip(int a, int b) {

        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            count += (xor & 1); // check last bit
            xor >>= 1;          // shift right
        }
        return count;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();

        int result = countBitsFlip(a, b);
        System.out.println("The no of Bits : " + result);

        sc.close();



//        System.out.println(countBitsFlip(5, 9));
//        System.out.println(countBitsFlip(9, 12));
//        System.out.println(countBitsFlip(10, 20));
    }
}
