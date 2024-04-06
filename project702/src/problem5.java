import java.util.Scanner;

public class problem5 {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fibonacci_num=Fibonacci(n);
        System.out.println(fibonacci_num);
        scanner.close();
    }
}



