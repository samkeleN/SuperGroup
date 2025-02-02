import java.util.HashMap;
import java.util.Map;

public class BookShelf {
    public static void main(String[] args) {
        int[] shelf = { 1234567, 1234567, 2345678, 2345678, 3456789, 3456789, 1234567,
                2345678, 3456789, 4567890, 4567890, 5678901, 5678901, 6789012,
                6789012, 1234567, 2345678, 3456789, 4567890, 5678901, 4567890,
                5678901 };

        System.out.println(isOrganizable(shelf));
    }

    public static String isOrganizable(int[] shelf) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int count : shelf) {
            frequencyMap.put(count, frequencyMap.getOrDefault(count, 0) + 1);
        }

        int gcd = -1;
        for (int freq : frequencyMap.values()) {
            if (gcd == -1) {
                gcd = freq;
            } else {
                gcd = findGCD(gcd, freq);
            }
        }

        return (gcd > 1) ? "YES" : "NO";
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
