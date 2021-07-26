package Task2.Problem2;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        double area = 3.14 * (radius * radius);
        System.out.println("Area of Circle is : " + area);
    }
}
