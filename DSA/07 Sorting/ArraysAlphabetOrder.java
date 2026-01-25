
import java.util.Arrays;
import java.util.Collections;
public class ArraysAlphabetOrder {



        public static void main(String[] args)
        {
            String arr[] = {"practice.geeksforgeeks.org",
                    "quiz.geeksforgeeks.org",
                    "code.geeksforgeeks.org"
            };

            // Sorts arr[] in ascending order
            Arrays.sort(arr);
            System.out.printf("Modified arr[] : \n%s\n\n", Arrays.toString(arr));

            // Sorts arr[] in descending order
            Arrays.sort(arr, Collections.reverseOrder());

            System.out.printf("Modified arr[] : \n%s\n\n", Arrays.toString(arr));
        }
    }

