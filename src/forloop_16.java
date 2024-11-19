import java.util.Scanner;

/*
Write a C program to display the sum of n terms of even natural numbers.
 */
public class forloop_16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number:");
        int start=sc.nextInt();
        System.out.print("Enter ending number:");
        int end=sc.nextInt();
        int sum=0;

        for (int i = start; i <=end ; i++)
        {
            System.out.println(i);
            int evennumber=2*i;
            sum+=evennumber;
        }
        System.out.println("Sum of even numbers from above numbers is : "+ sum);
    }
}
