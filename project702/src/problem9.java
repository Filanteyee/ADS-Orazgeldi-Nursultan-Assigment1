import java.util.Scanner;

public class problem9 {
    public static int biomcef(int n,int k){
        if(k==0||k==n){
            return 1;
        }
        else{
            return biomcef(n-1,k-1)+biomcef(n-1,k);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n ");
        int n=scanner.nextInt();
        System.out.println("Enter k ");
        int k=scanner.nextInt();

        int res=biomcef(n,k);
        System.out.println(res);
        scanner.close();
    }
}

