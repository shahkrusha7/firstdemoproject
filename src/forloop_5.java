import java.util.Scanner;

public class forloop_5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting number:");
        int n= sc.nextInt();
        System.out.print("Enter ending number:");
        int end=sc.nextInt();

        for (int i = n; i < end; i++)
        {
            System.out.println("Number: "+i+" and cube of "+i+" is : "+(i*i*i));
        }
        System.out.println();
    }
}
