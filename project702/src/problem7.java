import java.util.Scanner;

public class problem7{

    public static void permutations(String prefix, String string) {
        int n = string.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            // Recursively generate permutations by fixing each character in the prefix
            for (int i = 0; i < n; i++) {
                permutations(prefix + string.charAt(i), string.substring(0, i) + string.substring(i + 1, n));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string= scanner.nextLine();
        permutations("", string);
        scanner.close();
    }
}
