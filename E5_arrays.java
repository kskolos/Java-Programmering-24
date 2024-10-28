import java.util.Arrays;
import java.util.Scanner;

public class E5_arrays {

   static int inputValues[] = {13,6,23,8};
   
        public static void swap() {
            Scanner userInput = new Scanner(System.in);
            int a = userInput.nextInt(); 
            int b = userInput.nextInt(); 
            int x = inputValues[a];
            inputValues[a] = inputValues[b];
            inputValues[b] = x;
        }

        public static void multiply() {
            Scanner userInput2 = new Scanner(System.in);
            int a = userInput2.nextInt(); 
            int x = inputValues[a];
            inputValues[a] = x*x;

        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(inputValues));
            multiply();
            System.out.println(Arrays.toString(inputValues));

        }
      }

