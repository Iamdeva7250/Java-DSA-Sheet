import java.util.Scanner;

public class SumOfDigits {
//    public static int Sum_Of_Digits(int n){
//        if( n == 0)
//            return 0;
//        return (n % 10 + Sum_Of_Digits(n / 10));
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number : ");
//        int n = sc.nextInt();
//
//        int result = Sum_Of_Digits(n);
//
//        System.out.println("Sum of Digits is : " + result);
//    }


    // Using Iterative Method
    public static int getSum(int n){
        int res = 0;
        while(n > 0){
            res = res + n % 10;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber For Sum of All Digits : ");
        int n = sc.nextInt();

        int result = getSum(n);
        System.out.println("Sum of all Number is : " + result);
    }

}
