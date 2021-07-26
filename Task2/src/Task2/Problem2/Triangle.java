package Task2.Problem2;

public class Triangle implements Shape{
    private double breadth;
    private double height;

    public Triangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }
    @Override
    public void area() {
        double area = 1 / 2 * (breadth * height);
    System.out.println("Area of Triangle is : " + area);
    }
}
