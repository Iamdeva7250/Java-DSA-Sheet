public class RopeCutting {
    public static int maxPices(int n, int a, int b, int c){
        if(n == 0) return 0;
        if(n < 0) return -1;

        int res = Math.max(maxPices(n-a, a, b, c),
                  Math.max(maxPices(n-b, a, b, c),
                           maxPices(n-c, a, b, c)));
        if(res == -1)
            return -1;
        return res+1;
    }

    public static void main(String[] args) {
        int n = 5 , a = 2, b = 5, c = 1;

        System.out.println(maxPices(n, a, b, c));
    }
}
