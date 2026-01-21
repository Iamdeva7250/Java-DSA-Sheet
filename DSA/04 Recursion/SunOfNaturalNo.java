import java.util.Scanner;

public class SunOfNaturalNo {
    public static int sumOfNaturalNo1(int n){
        if(n <= 1)
            return n;
        return n + sumOfNaturalNo1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        int result = sumOfNaturalNo1(n);
        System.out.println("Sum of all Number is : " + result);

    }
}
