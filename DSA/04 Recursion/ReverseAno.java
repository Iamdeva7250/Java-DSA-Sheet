import java.util.Scanner;

public class ReverseAno {
    public static void fun(int n){
        if(n <= 0){
            return ;
        }else{
            System.out.print(n + " ");
        }
        fun(n -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        fun(n);
        sc.close();
    }
}
