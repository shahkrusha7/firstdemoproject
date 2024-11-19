import java.util.Scanner;

/*
Write a C program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
 */
public class cs_5
{
    public static void main(String[] args)
    {
        int age;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age:");
        age=input.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}
