import java.util.ArrayList;
import java.util.Scanner;

public class arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> rollno=new ArrayList<Integer>();
        ArrayList<Integer> maths=new ArrayList<Integer>();
        ArrayList<Integer> science=new ArrayList<Integer>();
        ArrayList<Integer> english=new ArrayList<Integer>();
        ArrayList<String> name=new ArrayList<String>();
        int total,marks;
        float avg;
        int passing_marks=35;
        int option=0;
        int i=0;

        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("\n\n\t\t\t Student Info ");
            System.out.println("\t\t 1.Entry");
            System.out.println("\t\t 2.View");
            System.out.println("\t\t 3.Exit");

            System.out.print("Enter Your Option :");
            option = sc.nextInt();

            switch (option)
            {
                case 1:
                    String option2="";
                    do
                    {
                        System.out.print("Enter rollno: ");
                        rollno.add(sc.nextInt());
                        System.out.print("Enter Name: ");
                        name.add(sc.next());
                        boolean iscorrect=false;
                        do
                        {
                            System.out.print("Enter maths: ");
                            marks=sc.nextInt();
                            if(marks<0 || marks>100)
                            {
                                iscorrect=true;
                            } else
                            {
                                maths.add(marks);
                                iscorrect=false;
                            }
                        }while (iscorrect);
                        do
                        {
                            System.out.print("Enter science: ");
                            marks=sc.nextInt();
                            if(marks<0 || marks>100)
                            {
                                iscorrect=true;
                            } else
                            {
                                science.add(marks);
                                iscorrect=false;
                            }
                        }while (iscorrect);
                        do
                        {
                            System.out.print("Enter english: ");
                            marks=sc.nextInt();
                            if(marks<0 || marks>100)
                            {
                                iscorrect=true;
                            } else
                            {
                                english.add(marks);
                                iscorrect=false;
                            }
                        }while (iscorrect);

                        System.out.print("Do you want to add another student? (y/n)");
                        option2=sc.next();
                        i++;
                    }while (option2.equalsIgnoreCase("y"));
                    break;

                case 2:
                    for (int j = 0; j < maths.size(); j++)
                    {
                        System.out.println("Rollno: "+rollno.get(j));
                        System.out.println("Name: "+name.get(j));
                        System.out.println("Maths:" + maths.get(j));
                        System.out.println("Science:" + science.get(j));
                        System.out.println("English:" + english.get(j));

                        if(maths.get(j)>=passing_marks && science.get(j)>=passing_marks && english.get(j)>=passing_marks)
                        {
                            total=maths.get(j)+science.get(j)+english.get(j);
                            avg=total/3.0f;
                            System.out.println("Total marks: "+total);
                            System.out.println("Avg marks: "+avg);
                        }
                        else
                        {
                            System.out.println("you are fail");
                        }
                    }
                    break;

                case 3:
                    System.out.println("you are exited");
                    break;

                default:
                    System.out.println("Invalid option try again");
                    break;
            }
        }while (option!=3);
    }
}
