abstract class Shape
{
    abstract void draw();
    {

    }
}
class Line extends Shape
{
    public void draw()
    {
        System.out.println("Draw a Line");
    }

}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Draw a Rectangle");
    }
}
    class  Circle extends Shape
    {
        public void draw()
        {
              System.out.println("Draw a Circle");
        }

    }

class  Cube extends Shape
{
    public void draw()
    {
        System.out.println("Draw a Cube");
    }

}
class ShapeOf 
{
    public static void main(String[] args) 
    {
        Line obj=new Line();
        obj.draw();
        Rectangle obj1=new Rectangle();
        obj1.draw();
        Circle obj2=new Circle();
        obj2.draw();
        Cube obj3=new Cube();
        obj3.draw();
    }

}

