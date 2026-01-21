public class GeneratedSubsets {
    public static void GenSubsets(String str, int index, String current ){

        int n = str.length();

        if(index == n){
            System.out.println(current);
            return;
        }
        GenSubsets(str, index + 1, current + str.charAt(index));
        GenSubsets(str, index + 1, current);

    }

    public static void main(String[] args) {
        String str = "abc";
        int index = 0;
        String current = "";

        GenSubsets(str, index, current);
    }
}
