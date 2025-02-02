import java.util.Scanner;

public class MagicPotionIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long power = scanner.nextLong();
        long cubeRoot = Math.round(Math.cbrt(power));
        if (Math.pow(cubeRoot, 3) == power) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}