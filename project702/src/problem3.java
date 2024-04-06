import java.util.Scanner;

public class problem3 {
    public static boolean recursion_prime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if(divisor*divisor>n){
            return true;
        }
        if (n%divisor==0){
            return false;
        }
        return recursion_prime(n,divisor+1);
    }

    public static void prime(int n){
        if (recursion_prime(n,2)){
            System.out.println("prime");
        }
        else{
            System.out.println("composite");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        prime(n);
        scanner.close();
    }
}