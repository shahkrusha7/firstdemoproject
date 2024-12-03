public class constructor
{
    public static void main(String[] args)
    {
        product p1=new product();
        product p2=new product(20);

        System.out.println(p1.id);
        System.out.println(p1.discount);
        System.out.println(p2.discount);
    }
}
class product
{
    int id;
    String name;
    float discount=0f;

    //non perameter contructor or default contructor
    product()
    {
        id=109;
        name="";
        discount=0;
        System.out.println("product() is called ");
    }

    //parameterize constructor
    product(float userdiscount)
    {
        discount=userdiscount;
    }
}