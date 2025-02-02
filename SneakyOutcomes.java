import java.util.HashSet;
import java.util.ArrayList;

public class SneakyOutcomes {
    public static void main(String[] args) {
        int[] outcomes = { 123456, 234567, 123347, 456789, 567890, 678901, 789012, 890123, 901234, 112233, 223344,
                334455, 789012, 222234, 123347 };

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int outcome : outcomes) {
            if (!set.add(outcome)) {
                duplicates.add(outcome);
            }
        }

        System.out.println(duplicates);
    }
}
