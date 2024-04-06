import java.util.Scanner;

public class problem8 {
    public static boolean digits(String string,int index) {
        if (index == string.length()) {
            return true;

        } else {
            if (Character.isDigit(string.charAt(index))) {
                return digits(string, index + 1);
            } else {
                return false;
            }
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String string= scanner.nextLine();
            if(digits(string,0)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            scanner.close();
        }
    }