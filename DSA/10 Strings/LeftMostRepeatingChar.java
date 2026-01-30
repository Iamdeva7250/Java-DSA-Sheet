public class LeftMostRepeatingChar {
    static final int CHAR = 256;

    public static int leftmostRepeatingChar(String str) {

        boolean[] visited = new boolean[CHAR];
        int result = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (visited[ch]) {
                result = i;  // update result if character is already seen
            } else {
                visited[ch] = true; // mark character as seen
            }
        }

        return result; // return the index
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = leftmostRepeatingChar(str);

        if (index == -1) {
            System.out.println("No repeating character");
        } else {
            System.out.println("Leftmost repeating character is at index: " + index);
            System.out.println("Character: " + str.charAt(index));
        }
    }
}
