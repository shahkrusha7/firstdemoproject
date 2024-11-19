import java.util.Scanner;

/*
1.Write a C program to accept two integers and check whether they are equal or not.
 */
public class cs_1
{
    public static void main(String[] args)
    {
        int no1,no2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no1:");
        no1=input.nextInt();
        System.out.print("Enter no2:");
        no2=input.nextInt();

        if(no1==no2)
        {
            System.out.println("Integers are equal");
        }
        else
        {
            System.out.println("Integers are not equal");
        }
    }

}
