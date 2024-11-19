import java.util.Scanner;

/*
Write a C program to check whether a given number is even or odd.
 */
public class cs_2
{
    public static void main(String[] args)
    {
        int no1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no1:");
        no1=input.nextInt();

        if(no1%2==0)
        {
            System.out.println(no1+" is even number");
        }
        else
        {
            System.out.println(no1+" is odd number");
        }
    }
}
