import java.util.Scanner;

/*
Write a C program to check whether a triangle can be formed with the given values for the angles.
 */
public class cs_15
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value of a:");
        a=input.nextInt();
        System.out.print("Enter value of b:");
        b=input.nextInt();
        System.out.print("Enter value of c:");
        c=input.nextInt();
        if(a!=0 && b!=0 && c!=0)
        {
            if(a+b+c == 180)
            {
                System.out.println("The triangle is valid");
            }
            else
            {
                System.out.println("The triangle is not valid");
            }
        }
    }
}
