public class functionoverloading
{
    int total(int a, int b)
    {
        return a+b;
    }

    int total(int a, int b, int c)
    {
        return a+b+c;
    }

    double area(float radius)
    {
        return 3.14*radius*radius;
    }

    double area(double length, double width)
    {
        return length*width;
    }

    public static void main(String[] args)
    {
        functionoverloading obj=new functionoverloading();
        System.out.println("total:"+obj.total(55,8));
        System.out.println("Total:"+obj.total(11,55,8));
        System.out.println("Area of circle:"+obj.area(5.0f));
        System.out.println("Area of Rectangle:"+obj.area(4.0f,8.2f));
    }
}
