import java.util.Scanner;

public class problem6 {
    public static int power(int a,int n){
        if(n==0){
        return 1;
        }
        else{
            return a*power(a,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int res=power(a,n);
        System.out.println(res);
        scanner.close();
    }
}