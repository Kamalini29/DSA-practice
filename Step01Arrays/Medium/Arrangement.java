package Step01Arrays.Medium;
import java.util.*;

public class Arrangement {

    // Function to rearrange elements so that positives and negatives alternate
    public ArrayList<Integer> rearrangeBySign(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0) {
                pos.add(A.get(i));
            } else if (A.get(i) < 0) {
                neg.add(A.get(i));
            }
        }

        // Step 2: Place positives at even indices and negatives at odd indices
        for (int i = 0; i < Math.max(pos.size(), neg.size()); i++) {
            if (i < pos.size()) {
                A.set(2 * i, pos.get(i));
            }
            if (i < neg.size()) {
                A.set(2 * i + 1, neg.get(i));
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));

        Arrangement obj = new Arrangement();
        ArrayList<Integer> ans = obj.rearrangeBySign(A, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

