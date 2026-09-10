package Step01Arrays.Medium;
import java.util.*;


public class Arrangement{

    
    // Function to rearrange elements so that positives and negatives alternate
    public ArrayList<Integer> rearrangeBySign(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList<>(); // List to store positive numbers
        ArrayList<Integer> neg = new ArrayList<>(); // List to store negative numbers

        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0) {
                pos.add(A.get(i)); // Add positive to pos
            } else {
                neg.add(A.get(i)); // Add negative to neg
            }
        }

        // Step 2: Place positives at even indices and negatives at odd indices
        for (int i = 0; i < n / 2; i++) {
            A.set(2 * i, pos.get(i));     // Even index → positive
            A.set(2 * i + 1, neg.get(i)); // Odd index → negative
        }

        return A; // Return the rearranged array
    }
}

// Driver code
public class Main {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));

        // Create object of the class ArrayManipulator
        ArrayManipulator obj = new ArrayManipulator();

        // Call the function and get result
        ArrayList<Integer> ans = obj.rearrangeBySign(A, n);

        // Print the rearranged array
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

