interface Shape
{
    void input();
    void area();
}
class Triangle implements Shape
{
    int a=0,b=0;
    double tri;
   
    public void input()
    {
        a=4;
        b=2;
    }
    
    public void area()
    {
        tri = 0.5*a*b;
        System.out.println("Area of triangle:"+tri);
    }
}
class Rectangle extends Triangle 
{
    int l = 0, b = 0;
    double ar;
    public void input()
    {
        super.input();
        l = 6;
        b = 4;
    }
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }
}
class Square extends Rectangle 
{
    int a=0;
    double sq;
    public void input()
    {
        super.input();
        a = 4;
        a = 4;
    }
    public void area()
    {
        super.area();
        sq = a^a;
        System.out.println("Area of square:"+sq);
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.input();
        obj.area();
    }
}