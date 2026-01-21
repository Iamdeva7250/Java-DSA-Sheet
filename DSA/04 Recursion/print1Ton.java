import java.util.Scanner;

public class print1Ton {
//    static void fun(int n){
//        if(n == 0)
//            return;
//        fun(n - 1);
//        System.out.print(n + " ");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int n = sc.nextInt();
//
//        fun(n);
//        sc.close();
//    }



    /*package whatever //do not write package name here */




        public static void main(String[] args)
        {
            printNos(1, 10);
        }
        public static void printNos(int initial, int last)
        {
            if (initial <= last) {
                System.out.print(initial + " ");
                printNos(initial + 1, last);
            }
        }
    }

