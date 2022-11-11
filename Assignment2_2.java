
import java.util.Scanner;



public class Assignment2_2 {
    
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the drive letter : ");
        char drive = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("\nEnter the path of the file : ");
        String path=sc.nextLine();
        System.out.print("\nEnter the name of the file : ");
        String name=sc.nextLine();
        System.out.print("\nEnter the extension of the file : ");
        String ext=sc.nextLine();
       
        System.out.println(drive+ ":" + path + "\\" + name + "." + ext);
    }
}
