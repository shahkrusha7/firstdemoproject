import java.util.Scanner;

/*
Write a program in C to read n number of values in an array and display them in reverse order.
 */
public class array_2_3
{
    public static void main(String[] args)
    {
        int[] number=new int[5];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter no:");
            number[i]=sc.nextInt();
        }

        System.out.println("Display array elements:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();

        System.out.println("Display array elements in reverse order:");
        for (int i = 5-1; i >=0 ; i--)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();

        int sum=0;
        for (int i = 0; i < 5; i++)
        {
            sum+=number[i];
        }
        System.out.println("Sum of all elements in array :"+sum);
    }
}
