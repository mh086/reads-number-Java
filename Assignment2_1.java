
  import java.util.Scanner;

public class Assignment2_1 {
    
 
    public static void main(String[] args) {
        
         Scanner input =new Scanner(System.in);
        System.out.print("Enter a number from 1,000 to 999,999: ");
        String number = input.nextLine();
        int length = number.length();
        System.out.println(number.substring (0, length-4) + number.substring (length- 3, length));
   }
}
