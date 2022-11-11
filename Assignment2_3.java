
import java.util.Scanner;


public class Assignment2_3 {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount=s.nextDouble();
        double taxAmount=0;
       
        if (amount>500000)
            taxAmount= (amount-500000)* 0.06 + 250000*0.05 + 150000*0.04 + 25000*0.03 + 25000*0.02 + 50000*0.01;
        else
            if (amount>250000)
                taxAmount= (amount-250000) *0.05 + 150000*0.04 + 25000*0.03 + 25000*0.02 + 50000*0.01;
        else
            if (amount>100000)
                taxAmount= (amount-100000) *0.04 + 25000*0.03 + 25000*0.02 + 50000*0.01;
        else
            if (amount>75000)
                taxAmount= (amount-75000) *0.03 + 25000*0.02 + 50000*0.01;
        else
            if (amount>50000)
                taxAmount= (amount-50000) *0.02 + 50000*0.01;
        else
            taxAmount= amount*0.01;        

        System.out.printf("The income tax for $%,.2f is: $%,.2f", amount,taxAmount);
    }
}
