import java.util.Scanner;

/*
Write a program in C to display the multiplication table for a given integer.
 */
public class forloop_6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
