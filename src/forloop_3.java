import java.util.Scanner;

/*
Write a program in C to display n terms of natural numbers and their sum.
 */
public class forloop_3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting number:");
        int n= sc.nextInt();
        int sum=0;

        for (int i = n; i < 50; i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println();
        System.out.println("The sum of n natural numbers is:"+sum);
    }
}
