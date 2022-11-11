
import java.util.Scanner;


public class Assignment2_4 {
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a month : ");
        int month=sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            System.out.println("\n 31 days ");
        else if(month==4||month==6||month==9||month==11)
            System.out.println("\n 30 days");
        else
            System.out.println("\n 28 days");
    }
}
