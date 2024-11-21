import java.util.Scanner;

public class studentarray
{
    public static void main(String[] args)
    {
        int rollno,maths,science,english,total;
        String name;
        float avg;
        int passing_marks=35;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rollno:");
        rollno=sc.nextInt();
        System.out.print("Enter name:");
        name=sc.next();
        do
        {
            System.out.print("Enter maths:");
            maths=sc.nextInt();
        }while(maths<0 || maths>100);
        do
        {
            System.out.print("Enter science:");
            science=sc.nextInt();
        }while (science<0 || science>100);
        do
        {
            System.out.print("Enter english:");
            english=sc.nextInt();
        }while (english<0 || english>100);

        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Enter Maths:"+maths);
        System.out.println("Science:"+science);
        System.out.println("English:"+english);

        if(maths>=passing_marks && english>=passing_marks && science>=passing_marks)
        {
            total=maths+science+english;
            avg=total/3.0f;
            System.out.println("Total marks:"+total);
            System.out.println("Avg marks:"+avg);
        }
        else
        {
            System.out.println("You are fail");
        }
    }
}
