import java.util.Scanner;

/*
Write a program that converts Centigrade to Fahrenheit.
 */
public class arithmetic_1
{
    public static void main(String[] args)
    {
        float celsius,fahrenheit;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter celsius :");
        celsius=input.nextInt();
        fahrenheit=((celsius*9)/5)+32;
        System.out.println(fahrenheit+" degree fahrenheit");
    }
}
