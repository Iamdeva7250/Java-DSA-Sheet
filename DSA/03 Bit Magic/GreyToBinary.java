import org.w3c.dom.ls.LSOutput;

public class GreyToBinary {
        public static int grayToBinary(int n) {
            int res = n;
            while ((n >>= 1) > 0) {
                res ^= n;
            }
            return res;
        }

    public static void main(String[] args) {
        System.out.println(grayToBinary(4));  // Gray(100) → Binary(111) = 7
        System.out.println(grayToBinary(15)); // Gray(1111) → Binary(1010) = 10
        System.out.println(grayToBinary(0));
    }
    }



