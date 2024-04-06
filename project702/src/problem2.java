import java.util.Scanner;
public class problem2 {
    public static float avg(int [] arr,int n){
      if(n==0){
          return 0;
      }
      else{
          float sum= arr[n-1]+avg(arr,n-1);
          return sum;
      }
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
        float average=avg(array,n)/n;
        System.out.println(average);
    }
}

