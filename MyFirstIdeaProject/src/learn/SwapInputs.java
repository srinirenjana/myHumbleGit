package learn;
import java.util.Scanner;
public class SwapInputs {
    public void swapnos()
    {
        int x,y;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First number");
        x= inp.nextInt();
        System.out.println("Enter Second number");
        y= inp.nextInt();

        System.out.println("Swapping in progress....");

        x = x+y;
        y= x-y;
        x=x-y;

        System.out.println("The value of x =" + x + " and y =" + y);
    }
    //swapping two numbers without using a third variable

}
