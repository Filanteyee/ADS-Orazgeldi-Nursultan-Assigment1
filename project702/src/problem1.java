import java.util.Scanner;
public class problem1 {
    public static int minimum(int n, int[] arr) {
        return findmin(arr, n - 1, arr[0]);
    }

    public static int findmin(int[] arr,int indx,int min){
        if(indx==0){
            return min;
        }
        if (arr[indx]<min){
            min=arr[indx];
        }
        return findmin(arr,indx-1,min);
    }

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n ");
        int n=scanner.nextInt();

        int[] array=new int[n];
        System.out.println("Enter elements ");

        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        int minimumelement=minimum(n,array);
        System.out.println("Minimum element is "+ minimumelement);
    }
}
