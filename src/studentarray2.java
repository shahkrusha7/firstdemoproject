import java.util.Scanner;

public class studentarray2
{
    public static void main(String[] args)
    {
        int rollno[]=new int[5];
        int maths[]=new int[5];
        int science[]=new int[5];
        int english[]=new int[5];
        int total;
        String name[]=new String[5];
        float avg;
        int passing_marks=35;

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            System.out.print("Enter rollno:");
            rollno[i]=sc.nextInt();
            System.out.print("Enter name:");
            name[i]=sc.next();
            do
            {
                System.out.print("Enter maths:");
                maths[i]=sc.nextInt();
            }while(maths[i]<0 || maths[i]>100);
            do
            {
                System.out.print("Enter science:");
                science[i]=sc.nextInt();
            }while (science[i]<0 || science[i]>100);
            do
            {
                System.out.print("Enter english:");
                english[i]=sc.nextInt();
            }while (english[i]<0 || english[i]>100);
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Rollno:" + rollno[i]);
            System.out.println("Name:" + name[i]);
            System.out.println("Enter Maths:" + maths[i]);
            System.out.println("Science:" + science[i]);
            System.out.println("English:" + english[i]);

            if (maths[i]>= passing_marks && english[i]>= passing_marks && science[i]>= passing_marks)
            {
                total = maths[i] + science[i] + english[i];
                avg = total / 3.0f;
                System.out.println("Total marks:" + total);
                System.out.println("Avg marks:" + avg);
            } else
            {
                System.out.println("You are fail");
            }
        }
    }
}
