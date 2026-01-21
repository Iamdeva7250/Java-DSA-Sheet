class CountDigits {
//    public static int countDigits(int n) {
//        int count = 0;
//
//        // Handle 0 separately
//        if (n == 0) return 1;
//
//        while (n != 0) {
//            count++;
//            n /= 10;
//        }
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int n = 12345;
//        System.out.println("Number of digits: " + countDigits(n)); // Output: 5
//  }
//    }



       ///  USing Recursive
        public static int countDigits(int n) {
            if (n == 0) return 0;
            return 1 + countDigits(n / 10);
        }

        public static void main(String[] args) {
            int n = 12345;
            System.out.println("Number of digits: " + countDigits(n)); // Output: 5
        }
    }


