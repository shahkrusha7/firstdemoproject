import java.util.Scanner;

/*
Write a C program to determine eligibility for admission to a professional course based on the following criteria:
Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190
or Total in Maths and Physics >=140
 */
public class cs_10
{
    public static void main(String[] args)
    {
        int maths,phy,chem,total_mp,total;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks");
        System.out.print("Maths:");
        maths=input.nextInt();
        System.out.print("Chemistry:");
        chem=input.nextInt();
        System.out.print("Physics:");
        phy=input.nextInt();
        total_mp=maths+phy;
        total=maths+phy+chem;

        if(maths>=65 && phy>=55 && chem>=50 && (total>=190 || total_mp>=140))
        {
            System.out.println("The candidate is eligible for admission");
        }
        else
        {
            System.out.println("The candidate is not eligible for admission");
        }
    }
}
