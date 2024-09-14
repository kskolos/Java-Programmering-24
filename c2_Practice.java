import java.util.Scanner;

public class c2_Practice {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int scanned = scanner.nextInt();
         if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            // Use num
        } 
        else 
        {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
