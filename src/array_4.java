import java.util.Scanner;

/*
Write a program in C to copy the elements of one array into another array.
 */
public class array_4
{
    public static void main(String[] args)
    {
        int[] original=new int[5];
        int[] duplicate=new int[5];

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter no:");
            original[i]=sc.nextInt();
        }

        System.out.println("Display original array elements:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(original[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++)
        {
            duplicate[i]=original[i];
        }

        System.out.println("Display duplicate (copied) array elements:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(duplicate[i]+" ");
        }
    }
}
