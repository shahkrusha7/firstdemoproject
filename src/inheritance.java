import java.util.Scanner;

public class inheritance
{
    public static void main(String[] args)
    {
        employee emp=new employee();

       // emp.setsalary();
       // emp.getsalary();

        //dmart d=new dmart();
        //d.setpersonalinfo();
        //d.setsalary();
        //d.setlocation();

        //d.getpersonalinfo();
        //d.getsalary();
        //d.getlocation();

        emp.setsalary();

        customer cust=new customer();
        cust.setbillamt();

        emp.getsalary();
        cust.getbillamt();
    }
}

class personalinfo
{
    int id;
    String name,phono,address;

    void setpersonalinfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ID: ");
        id=sc.nextInt();
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter Phone Number: ");
        phono=sc.next();
        System.out.print("Enter Address: ");
        address=sc.next();
    }

    void getpersonalinfo()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phono);
        System.out.println("Address: "+address);
    }
}

class employee extends personalinfo
{
    int salary;

    void setsalary()
    {
        //setpersonalinfo();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary=sc.nextInt();
    }

    void getsalary()
    {
        //getpersonalinfo();
        System.out.println("Salary: "+salary);
    }
}

class dmart extends employee
{
    String location;
     void setlocation()
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter Location: ");
         location=sc.next();
     }

     void getlocation()
     {
         System.out.println("Location: "+location);
     }
}

class customer extends personalinfo
{
    int billamt;

    void setbillamt()
    {
        setpersonalinfo();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        billamt=sc.nextInt();
    }

    void getbillamt()
    {
        getpersonalinfo();
        System.out.println("Bill Amount: "+billamt);
    }
}