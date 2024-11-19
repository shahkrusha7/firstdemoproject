import java.util.Scanner;

/*
 Write a program in C that takes minutes as input, and display the total number of hours and minutes.
 */
public class arithmetic_6
{
    public static void main(String[] args)
    {
        int min,minutes,hours;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter minutes:");
        min=input.nextInt();

        hours=min/60;
        minutes=min%60;

        System.out.println("Total time is "+ hours+" hours :" + minutes+" minutes");
    }
}
