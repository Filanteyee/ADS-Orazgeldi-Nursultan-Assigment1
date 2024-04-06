import java.util.Scanner;

public class problem10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ");
        int a = scanner.nextInt();
        System.out.println("Enter b ");
        int b = scanner.nextInt();

        int res = gcd(a, b);
        System.out.println(res);
        scanner.close();
    }
}
