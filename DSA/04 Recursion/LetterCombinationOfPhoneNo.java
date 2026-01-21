import java.util.*;

public class LetterCombinationOfPhoneNo {
    Map<Integer, List<String>> map = new HashMap<>();

    public ArrayList<String> possibleWords(int[] arr) {
        map.put(2, List.of("a", "b", "c"));
        map.put(3, List.of("d", "e", "f"));
        map.put(4, List.of("g", "h", "i"));
        map.put(5, List.of("j", "k", "l"));
        map.put(6, List.of("m", "n", "o"));
        map.put(7, List.of("p", "q", "r", "s"));
        map.put(8, List.of("t", "u", "v"));
        map.put(9, List.of("w", "x", "y", "z"));

        ArrayList<String> result = new ArrayList<>();
        generateWord(arr, 0, "", result);
        return result;
    }

    private void generateWord(int[] arr, int index, String current, ArrayList<String> result) {
        if (index == arr.length) {
            result.add(current);
            return;
        }
        for (String s : map.get(arr[index])) {
            generateWord(arr, index + 1, current + s, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits (2-9): ");
        String input = sc.nextLine();

        int[] arr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }

        LetterCombinationOfPhoneNo sol = new LetterCombinationOfPhoneNo();
        ArrayList<String> result = sol.possibleWords(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) System.out.print(" ");
        }
        System.out.println();
    }
}

