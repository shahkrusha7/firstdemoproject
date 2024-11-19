import java.util.Scanner;

/*
Write a C program to check whether a given number is positive or negative.
 */
public class cs_3
{
    public static void main(String[] args)
    {
        int no1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no1:");
        no1=input.nextInt();

        if(no1>=0)
        {
            System.out.println(no1+" is positive number");
        }
        else
        {
            System.out.println(no1+" is negative number");
        }
    }
}
