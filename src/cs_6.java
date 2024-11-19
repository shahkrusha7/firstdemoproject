import java.util.Scanner;

/*
Write a C program to read the value of an integer m and display the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.
 */
public class cs_6
{
    public static void main(String[] args)
    {
        int m;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a value:");
        m=input.nextInt();

        if(m>0)
        {
            System.out.println("The value of n = 1");
        }
        else if(m==0)
        {
            System.out.println("The value of n = 0");
        }
        else if(m<0)
        {
            System.out.println("The value of n = -1");
        }
    }
}
