import java.util.Scanner;

/*
Write a C program to accept a coordinate point in an XY coordinate system and determine in which quadrant the coordinate point lies.
 */
public class cs_9
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter x:");
        x=input.nextInt();
        System.out.print("Enter y:");
        y=input.nextInt();

        if(x>0 && y>0)
        {
            System.out.println("x and y lies in First Quadrant ");
        }
        else if(x<0 && y>0)
        {
            System.out.println("x and y lies in Second Quadrant ");
        }
        else if(x<0 && y<0)
        {
            System.out.println("x and y lies in Third Quadrant ");
        }
        else if(x>0 && y<0)
        {
            System.out.println("x and y lies in Fourth Quadrant ");
        }
        else if(x==0 && y==0)
        {
            System.out.println("x and y lies on Origin ");
        }
    }
}
