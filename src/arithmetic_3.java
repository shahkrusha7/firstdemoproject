import java.util.Scanner;

/*
 Write a C program that prints the perimeter of a rectangle using its height and width as inputs
 */
public class arithmetic_3
{
    public static void main(String[] args)
    {
        int height,width,perimeter;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter heigth:");
        height=input.nextInt();
        System.out.print("Enter width:");
        width=input.nextInt();

        perimeter=2*(height+width);

        System.out.println("Perimeter of the Rectangle is :"+perimeter);
    }
}
